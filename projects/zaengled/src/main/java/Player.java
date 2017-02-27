import java.util.*;
//import org.cs362.dominion.Card.Type;

public class Player implements Cloneable{
	List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int
													// deck[MAX_PLAYERS][MAX_DECK];
	List<Card> discard = new ArrayList<Card>(); // int
												// discard[MAX_PLAYERS][MAX_DECK];
	List<Card> playedCards = new ArrayList<Card>();

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
        if(deck.size() <= 1 && discard.size() <= 1){
            this.numActions = 0;
            return null;
        }
		if (deck.isEmpty()) {// Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			System.out.println("reshuffle the deck of the player "
					+ player_username + " to draw FIVE cards");
			while (discard.size() > 0) {
				int ndx = (int) Randomness.nextRandomInt(discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
			Collections.shuffle(deck);
		}

		Card toDraw = deck.poll();
		hand.add(toDraw);// Add card to hand and hand count automatically will
							// be incremented since we use List
		System.out.println("draw " + toDraw);
		Collections.sort(hand);

		return toDraw;
	}
	
	   final void initializePlayerTurn() {
		   //initialize first player's turn
//		   state->numnumActions = 1;
//		   state->numnumBuys = 1;
		      this.numActions = 1;
		      this.coins = 0;
		      this.numBuys = 1;
		      //Shuffle your starting 10 cards (7 Coppers & 3 Estates) and place them face-down as your Deck. Draw the top
		      //5 cards as your starting hand
		      for (int i = 0; i < 5; i++) {
		    	  drawCard();
		      }
		   }

	 //card goes in discard,
	   final boolean gain(Card card) {
		      discard.add(card);
		      System.out.println("Player: "+this.player_username+" gains "+card);
		      return true;
		   }		   
		 //Discard hand
	   public void discard(Card card) {
		     hand.remove(card);
		      discard.add(card);
		      System.out.println("Player:  "+player_username+" discards "+card);
		   }
	   public void playKingdomCard() {
	        int rand = Randomness.nextRandomInt(2);
	        int overkill = 0; // break us out of the loop if the computer plays one card too much
	        if(rand == 1){// this should break the loop where cards are just played forever.
	            return;
            }
		      while (numActions > 0) {
		         List<Card> actionCards = Card.filter(hand, Card.Type.ACTION);
		         if(overkill > 3){
		         	return;
				 }
		         if (actionCards.size() == 0)
		            return;
		         
		         Card c = (Card)actionCards.get(0);
		         if (c == null)
			           return;
		         System.out.println("Player.actionPhase Card:" + c.toString());

			      playedCards.add(c);
			      numActions -= 1;

			      c.play(this, gameState);
			      overkill ++;
		      }
		   }
	   final int scoreFor() { 
		   int score = 0;
		   //score from hand
		      for (Card c : hand)
		    	  score += c.score();
		      //score from discard
		      for (Card c : discard)
		    	  score += c.score();
		      //score from deck
		      for (Card c : deck) {
		      	//Gardens code should be here, leaving it as one of my intended bugs for now.
				  score += c.score();
			  }
		      
		    
		      return score;
	   }    
	   
	   public void playTtreasureCard() {
			List<Card> cards = Card.filter(hand, Card.Type.TREASURE);
			if(cards.size() == 0){
				System.out.println("no treasure cards to play.");
				return;
			}//if we have no treasure cards to play
			else{
				for(Card c: cards){
                    coins = coins + c.getTreasureValue();
					playedCards.add(c);
					hand.remove(c);
				}
			}
		    System.out.println(" --- --------------------------- --- ");
    		System.out.println("Doing: playTtreasureCard ");
    		System.out.println(" --- --------------------------- --- ");
	   }
	   public void buyCard() {
		   System.out.println(" --- --------------------------- --- ");
		   System.out.println("Doing: buyCard ");
		   System.out.println(" --- --------------------------- --- ");
		   int rand;
		   while(numBuys > 0) {
               if (coins >= 8) {
				   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Province), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Province)) - 1);
                   gain(Card.getCard(gameState.cards, Card.CardName.Province));
               } else if (coins >= 7) {
				   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Gold), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Gold)) - 1);
                   gain(Card.getCard(gameState.cards, Card.CardName.Gold));
                   coins -= 6;
               } else if (coins >= 6) {
				   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Gold), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Gold)) - 1);
                   gain(Card.getCard(gameState.cards, Card.CardName.Gold));
                   coins -= 6;
               } else if (coins >= 5){
				   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Duchy), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Duchy)) - 1);
                    gain(Card.getCard(gameState.cards, Card.CardName.Duchy));
                    coins -= 5;
               } else if(coins >= 4){
                   rand = Randomness.nextRandomInt(7);
                   if(Card.getCard(gameState.cards, Card.CardName.Smithy) != null && rand == 1){
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Smithy), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Smithy)) - 1);
                       gain(Card.getCard(gameState.cards, Card.CardName.Smithy));
                       coins -= 4;
                   } else if(Card.getCard(gameState.cards, Card.CardName.Baron) != null && rand == 2){
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Baron), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Baron)) - 1);
                       gain(Card.getCard(gameState.cards, Card.CardName.Baron));
                       coins -= 4;
                   } else if (Card.getCard(gameState.cards, Card.CardName.Cutpurse) != null && rand == 3) {
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Cutpurse), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Cutpurse)) - 1);
                       gain(Card.getCard(gameState.cards, Card.CardName.Cutpurse));
                       coins -= 4;
                   } else if (Card.getCard(gameState.cards, Card.CardName.Feast) != null && rand == 4){
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Feast), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Feast)) - 1);
                       gain(Card.getCard(gameState.cards, Card.CardName.Feast));
                       coins -= 4;
                   } else if (Card.getCard(gameState.cards, Card.CardName.Gardens) != null && rand == 5){
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Gardens), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Gardens)) - 1);
                       gain(Card.getCard(gameState.cards, Card.CardName.Gardens));
                       coins -= 4;
                   } else if (Card.getCard(gameState.cards, Card.CardName.Sea_Hag) != null && rand == 6){
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Sea_Hag), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Sea_Hag)) - 1);
                       gain(Card.getCard(gameState.cards, Card.CardName.Sea_Hag));
                       coins -= 4;
                   } else{
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Silver), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Silver)) - 1);
                       gain(Card.getCard(gameState.cards, Card.CardName.Silver));
                       coins -= 3;
                   }
               } else if(coins >= 3){
                   rand = Randomness.nextRandomInt(4);
                   if(Card.getCard(gameState.cards, Card.CardName.Village) != null && rand == 1){
                       gain(Card.getCard(gameState.cards, Card.CardName.Village));
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Village), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Village)) - 1);
                       coins -= 3;
                   }else if(Card.getCard(gameState.cards, Card.CardName.Ambassador) != null && rand == 2){
                       gain(Card.getCard(gameState.cards, Card.CardName.Ambassador));
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Ambassador), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Ambassador)) - 1);
                       coins -= 3;
                   }else if(Card.getCard(gameState.cards, Card.CardName.Great_Hall) != null && rand == 3){
                       gain(Card.getCard(gameState.cards, Card.CardName.Great_Hall));
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Great_Hall), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Great_Hall)) - 1);
                       coins -= 3;
                   }else {
                       gain(Card.getCard(gameState.cards, Card.CardName.Silver));
                       coins -= 3;
                   }
               } else if(coins >= 2) {
                   rand = Randomness.nextRandomInt(3);
                   if (Card.getCard(gameState.cards, Card.CardName.Estate) != null && rand == 1) {
                       gain(Card.getCard(gameState.cards, Card.CardName.Estate));
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Estate), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Estate)) - 1);
                       coins -= 2;
                   } else if (Card.getCard(gameState.cards, Card.CardName.Embargo) != null && rand == 2) {
                       gain(Card.getCard(gameState.cards, Card.CardName.Embargo));
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Embargo), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Embargo)) - 1);
                       coins -= 2;
                   } else {
                       gain(Card.getCard(gameState.cards, Card.CardName.Copper));
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Copper), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Copper)) - 1);
                   }
               }else if(coins >= 0){
                   gain(Card.getCard(gameState.cards, Card.CardName.Copper));
				   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Copper), gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Copper)) - 1);
               }
               numBuys -= 1;
           }
	   }
	   final void endTurn() {
		   //System.out.println(" --- --------------------------- --- ");
  			//System.out.println("TO-DO endTurn ");
  			//System.out.println(" --- --------------------------- --- ");
           coins = 0;
           numBuys = 1;
           numActions = 1;
           for(Card n: hand){
               discard.add(n);
           }
           hand.clear();
           for(Card n: playedCards){
               discard.add(n);
           }
           playedCards.clear();
           for(int i = 0; i < 5; i++){
           	   drawCard();
		   }
	   }
	   
	   
	   public void printStateGame(){
		   System.out.println(" --- " + this.player_username + " --- ");
		   System.out.println(" --- --------------------------- --- ");
     		System.out.println(this.gameState.toString()); 
     		System.out.println(" --- --------------------------- --- ");
	   }
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
	   
	    protected Player clone() throws CloneNotSupportedException {
	    	Player clonePlayer=(Player) super.clone();
	    	clonePlayer.hand = new ArrayList<Card>(hand);// int hand[MAX_PLAYERS][MAX_HAND];
			clonePlayer.deck = new LinkedList<Card>(deck);// int
															// deck[MAX_PLAYERS][MAX_DECK];
			clonePlayer.discard = new ArrayList<Card>(discard); // int
														// discard[MAX_PLAYERS][MAX_DECK];
			clonePlayer.playedCards = new ArrayList<Card>(playedCards);
			return clonePlayer;
	    } 	   
}
