package org.cs362.dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


import org.cs362.dominion.Card.Type;


public class Player {
	List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int
													// deck[MAX_PLAYERS][MAX_DECK];
	List<Card> discard = new ArrayList<Card>(); // int
												// discard[MAX_PLAYERS][MAX_DECK];
	List<Card> playedCards = new ArrayList<Card>();

	//array of trash cards
	List<Card> Trash = new ArrayList<Card>();

	String player_username;

	int numActions;
	int numBuys;
	int coins;

	final GameState gameState;

	
	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState=gameState;
	}

	final Card drawCard() {
		if (deck.isEmpty()) {// Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			System.out.println("reshuffle the deck of the player "
					+ player_username + " to draw FIVE cards");
			while (discard.size() > 0) {
				int ndx = (int) Randomness.nextRandomInt(discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
		}

		Card toDraw = deck.poll();
		hand.add(toDraw);// Add card to hand and hand count automatically will
							// be incremented since we use List
		System.out.println("draw " + toDraw);
		Collections.sort(hand);
		return toDraw;
	}
	
	   /*final void initializePlayerTurn() {
		   //initialize first player's turn
//		   state->numnumActions = 1;
//		   state->numnumBuys = 1;
		      numActions = 1;
		      coins = 0;
		      numBuys = 1;
		      //Shuffle your starting 10 cards (7 Coppers & 3 Estates) and place them face-down as your Deck. Draw the top
		      //5 cards as your starting hand
		      for (int i = 0; i < 5; i++) {
		    	  drawCard();
		      }
		   }*/

	 //card goes in discard,
	   final boolean gain(Card card) {
		      discard.add(card);
		      System.out.println("Player: "+this.player_username+" gains "+card);
		      return true;
		   }		   
		 //Discard hand - no, this discards a card
	   public void discard(Card card) {
		     hand.remove(card);
		      discard.add(card);
		      System.out.println("Player:  "+player_username+" discards "+card);
		   }

	   //filters out the cards and decides which ones are of type action then calls on card method play to run the action card
	   //it doesn't seem like the cards will iterate through the list, it will only go through once
	   //UPDATE: IT DOESNT I FIXED IT
	   public void playKingdomCard() {
		   System.out.println("PLAYING Kingdom CARDS******************************************");

		   while (numActions > 0) {
		         List<Card> actionCards = Card.filter(hand, Type.ACTION);

		         if (actionCards.size() == 0)
		            return;

		         Card c = actionCards.get(0);
		         if (c == null)
			           return;
		         System.out.println("Player.actionPhase Card:" + c.toString());

			      playedCards.add(c);
			      numActions -= 1;

			      System.out.println("PLAYED CARDS: " + this.playedCards + "\n");

			      c.play(this, gameState);

			      //you have to discard the card from your hand every time it is used otherwise it will go on forever.
			      System.out.println(hand + "\n");
			      //have to discard after every card because of those dang trash cards
			      //discard(c);
			      System.out.println("DISCARD: \n" + discard + "\n");

		   }
		   }
	   final int scoreFor() { 
		   int score = 0;
		   //if there was a garden card in the deck then we can do this
		   boolean gardenisalive = false;
		   //totals for the amount of gardens and for the cards in all the decks
		   int amount_gardens = 0;
		   int total_cards = 0;
		   //score from hand
		      for (Card c : hand) {
				  if (c.getCardName() == Card.CardName.gardens) {
				  	gardenisalive = true;
				  	amount_gardens += 1;
				  }

				  score += c.score(this);
				  total_cards += 1;
			  }
		      //score from discard
		      for (Card c : discard) {
				  if (c.getCardName() == Card.CardName.gardens) {
					  gardenisalive = true;
					  amount_gardens += 1;
				  }

				  score += c.score(this);
				  total_cards += 1;
			  }
		      //score from deck
		      for (Card c : deck) {
				  if (c.getCardName() == Card.CardName.gardens) {
					  gardenisalive = true;
					  amount_gardens += 1;
				  }
				  score += c.score(this);
				  total_cards += 1;
			  }
		      System.out.println("gardenisalive : " + gardenisalive + "\n");
		      //if there were gardens in the deck then we have to check for that
			  if(gardenisalive){
				  System.out.println("amount of gardens: " + amount_gardens);
				  System.out.println("total card before: " + total_cards);
				  //java division always rounds down
				  total_cards = total_cards/10;
				  System.out.println("total card afters: " + total_cards);
				  amount_gardens = amount_gardens * total_cards;
				  System.out.println("score to be added: " + amount_gardens);
				  score += amount_gardens;
			  }

		      return score;
	   }    


	   public void playTtreasureCard() {
		   System.out.println("PLAYING TREASURE CARDS******************************************");
		   //list of all the treasure cards
		   List<Card> TreasureCards = Card.filter(hand, Type.TREASURE);
		   System.out.println(TreasureCards.size());
		   System.out.println("Player coins before add: " + this.coins);

		   //if there are no treasure cards.
		   if (TreasureCards.size() == 0)
			   return;

		   //iterate through the players treasure cards and get the total value of them
		   //then put that value into the coins value
		   for(int i = 0; i < TreasureCards.size(); i++){
			   Card temptreasure = TreasureCards.get(i);
			   System.out.println(temptreasure);
			   this.coins += temptreasure.getTreasureValue();
			   System.out.println("Player coins after add: " + this.coins);
		   }
    		System.out.println(" --- --------------------------- --- ");
	   }

	/**
	 * This is where the players buy the cards, since the players
	 * are pretty dumb in terms of AI we can assume that they will buy
	 * the most expensive thing everytime and if there is still buys and they have
	 * no coins left they will buy copper.
	 */
	public void buyCard() {
		System.out.println("BUYING CARDS CARDS******************************************");
		System.out.println("EMBARGO IS ACTIVE: " + gameState.embargo);
		Card Temp = null;
		System.out.println(gameState.cards);
		System.out.println(gameState.cards.size());
		System.out.println(gameState.cards.get(0).getCost());
		System.out.println(coins);
		//while we can still buy items
		while(numBuys > 0){
			int fakecoins = coins;
			boolean bought = false;
			//this is a dumb bot that just buys the first most expensive thing that it finds(in this case it is usually money)
			for(int i = 0; i < gameState.cards.size();i++){
				if(gameState.cards.get(i).getCost() == coins){
					Temp = gameState.cards.get(i);
					//if the card we want to draw from is not zero
					if(gameState.gameBoard.get(Temp) > 0) {
						if(gameState.embargo == 1 && gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Curse)) > 0){
							gain(Card.getCard(gameState.cards, Card.CardName.Curse));
							gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Curse), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Curse)) - 1);
							gameState.embargo =0;
						}
						bought = true;
						gain(Temp);
						System.out.println(gameState.gameBoard.get(Temp));
						gameState.gameBoard.put(Temp, gameState.gameBoard.get(Temp) - 1);
						System.out.println("After" + gameState.gameBoard.get(Temp));
						numBuys-=1;
						coins-=gameState.cards.get(i).getCost();
						break;
					}
				}
			}
			//if we didn't buy anything
			if(!bought){
				if(coins > 0){
					//if we have more than 0 coins and didn't buy anything then we need to loop to find the right stuff
					while(!bought){
						for(int i = 0; i < gameState.cards.size();i++){
							if(gameState.cards.get(i).getCost() == fakecoins){
								Temp = gameState.cards.get(i);
								//if the card we want to draw from is not zero
								if(gameState.gameBoard.get(Temp) > 0) {
									if(gameState.embargo == 1 && gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Curse)) > 0){
										gain(Card.getCard(gameState.cards, Card.CardName.Curse));
										gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Curse), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Curse)) - 1);
										gameState.embargo =0;
									}
									bought = true;
									gain(Temp);
									System.out.println(gameState.gameBoard.get(Temp));
									gameState.gameBoard.put(Temp, gameState.gameBoard.get(Temp) - 1);
									System.out.println("After" + gameState.gameBoard.get(Temp));
									numBuys-=1;
									coins-=gameState.cards.get(i).getCost();
									break;
								}
							}
						}
						//if we still didn't buy anything decrement and try again until we find something
						fakecoins-=1;
					//end of while loop
					}
				}
			}
			//end of while loop
			}


		   System.out.println(" --- --------------------------- --- ");
   			System.out.println("TO-DO buyCard "); 
   			System.out.println(" --- --------------------------- --- ");   
	   }

	   //have to empty the players hand, and clear coins and actions;
	   final void endTurn() {
		   System.out.println("END TURN CLEAN UP******************************************");
		   //discard hand
		   if(this.hand.size() != 0){
			   System.out.println("HAND: " + this.hand.size() + "\n" + this.hand);
			   System.out.println("ENTERING LOOP\n");

			   //while the hand is not empty then discard the first entry in the hand
			   while(!this.hand.isEmpty()) {
				   System.out.println("HAND TO REMOVE " + this.hand.get(0));
				   discard(this.hand.get(0));
			   }
		   }
		   //draw 5 new cards and put it in to the players hand
		   for(int i = 0; i < 5; i++){
		   		this.drawCard();
		   }

		   //reset values
		   this.numActions = 1;
		   this.coins = 0;
		   this.numBuys = 1;

		   System.out.println(" --- --------------------------- --- ");
	   }
	   
	   
	   /*public void printStateGame(){
		   System.out.println(" --- " + this.player_username + " --- ");
		   System.out.println(" --- --------------------------- --- ");
     		System.out.println(this.gameState.toString()); 
     		System.out.println(" --- --------------------------- --- ");
	   }*/
	   @Override
		public String toString() {
		     StringBuilder sb = new StringBuilder();
		     
       	 sb.append(" --- " + this.player_username + " --- ");
       	 sb.append(" --- --------------------------- --- ");

       	 sb.append("Hand: " + this.hand);
       	 sb.append("Discard: " + this.discard);
       	 sb.append("Deck: " + this.deck);
       	 sb.append("Played Cards: " + this.playedCards);
       	 sb.append("numActions: " + this.numActions);
       	 sb.append("coinss: " + this.coins);
       	 sb.append("numBuys: " + this.numBuys);
       	 sb.append("\n");     

		     return sb.toString();

		}
	   
}
