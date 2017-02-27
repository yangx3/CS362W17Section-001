package dominion;

import java.util.*;

public class Player{
	private Random gen;
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

	private final GameState gameState;

	
	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState=gameState;
		gen = new Random();
	}



	final Card drawCard() {
		if (deck.isEmpty()) {// Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			System.out.println("reshuffle the deck of the player "
					+ player_username + " to draw FIVE cards");
			while (discard.size() > 0) {
				int ndx = gen.nextInt(discard.size());
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
	
	   final void initializePlayerTurn() {
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
		      while (numActions > 0) {
		         List<Card> actionCards = Card.filter(hand, Card.Type.ACTION);
		   
		         if (actionCards.size() == 0)
		            return;
		         
		         Card c = (Card)actionCards.get(0);
		         if (c == null)
			           return;
		         System.out.println("Player.actionPhase Card:" + c.toString());

			      playedCards.add(c);
			      hand.remove(c);
			      numActions -= 1;

			      c.play(this, gameState);
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
		      for (Card c : deck)
		    	  score += c.score();

		      
		    
		      return score;
	   }    
	   
	   public void playTtreasureCard() {
		  List<Card> treasures = Card.filter(hand, Card.Type.TREASURE);
		  if(treasures.size() == 0){
			  return;
		  }
		  System.out.println("Autoplayed Treasure Cards:");;
		  for(Card c: treasures){
			  coins += c.getTreasureValue();
			  System.out.println(c.toString());
			  playedCards.add(c);
			  hand.remove(c);
		  }
		  System.out.println(player_username + "'s Coins: " + coins + "\n");
	   }
	   
	   public void buyCard(GameState state){
		   while(numBuys > 0){
			   if(coins == 0){
				   numBuys--;
			   }
			   else if(coins == 1){
				   numBuys--;
			   }
			   else if(coins == 2){
				   numBuys--;
			   }
			   else if(coins == 3){
				   int rand = gen.nextInt(8);
				   if(rand == 0 && state.gameBoard.containsKey(Card.getCard(state.cards,  Card.CardName.Village)) && state.gameBoard.get(Card.getCard(state.cards,  Card.CardName.Village)) > 0){
					   gain(Card.getCard(state.cards,  Card.CardName.Village));
					   state.gameBoard.put(Card.getCard(state.cards,  Card.CardName.Village), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Village)) - 1);
					   coins = coins - 3;
				   }
				   else if(rand == 1 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.GreatHall)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.GreatHall)) > 0){
					   gain(Card.getCard(state.cards,  Card.CardName.GreatHall));
					   state.gameBoard.put(Card.getCard(state.cards,  Card.CardName.GreatHall), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.GreatHall)) - 1);
					   coins = coins - 3;
				   }
				   else if(rand == 2 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Ambassador)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Ambassador)) > 0){
					   gain(Card.getCard(state.cards,  Card.CardName.Ambassador));
					   state.gameBoard.put(Card.getCard(state.cards,  Card.CardName.Ambassador), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Ambassador)) - 1);
					   coins = coins - 3;
				   }
				   else if(rand >= 3 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Silver)) && state.gameBoard.get(Card.getCard(state.cards,  Card.CardName.Silver)) > 0){
					   gain(Card.getCard(state.cards,  Card.CardName.Silver));
					   state.gameBoard.put(Card.getCard(state.cards,  Card.CardName.Silver), state.gameBoard.get(Card.getCard(state.cards,  Card.CardName.Silver)) -1);
					   coins = coins - 3;
				   }else{
					   coins = 2;
					   continue;
				   }
			   }
			   else if(coins == 4){
				   int rand = gen.nextInt(6);
				   if(rand == 0 && state.gameBoard.containsKey(Card.getCard(state.cards,  Card.CardName.Smithy)) && state.gameBoard.get(Card.getCard(state.cards,  Card.CardName.Smithy)) > 0){
					   gain(Card.getCard(state.cards,  Card.CardName.Smithy));
					   state.gameBoard.put(Card.getCard(state.cards,  Card.CardName.Smithy), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) - 1);
					   coins = coins - 4;
				   }
				   if(rand == 1 && state.gameBoard.containsKey(Card.getCard(state.cards,  Card.CardName.Baron)) && state.gameBoard.get(Card.getCard(state.cards,  Card.CardName.Baron)) > 0){
					   gain(Card.getCard(state.cards,  Card.CardName.Baron));
					   state.gameBoard.put(Card.getCard(state.cards,  Card.CardName.Baron), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Baron)) - 1);
					   coins = coins - 4;
				   }
				   if(rand == 2 && state.gameBoard.containsKey(Card.getCard(state.cards,  Card.CardName.Feast)) && state.gameBoard.get(Card.getCard(state.cards,  Card.CardName.Feast)) > 0){
					   gain(Card.getCard(state.cards,  Card.CardName.Feast));
					   state.gameBoard.put(Card.getCard(state.cards,  Card.CardName.Feast), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Feast)) - 1);
					   coins = coins - 4;
				   }
				   if(rand == 3 && state.gameBoard.containsKey(Card.getCard(state.cards,  Card.CardName.Cutpurse)) && state.gameBoard.get(Card.getCard(state.cards,  Card.CardName.Cutpurse)) > 0){
					   gain(Card.getCard(state.cards,  Card.CardName.Cutpurse));
					   state.gameBoard.put(Card.getCard(state.cards,  Card.CardName.Cutpurse), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Cutpurse)) - 1);
					   coins = coins - 4;
				   }
				   if(rand == 4 && state.gameBoard.containsKey(Card.getCard(state.cards,  Card.CardName.Remodel)) && state.gameBoard.get(Card.getCard(state.cards,  Card.CardName.Remodel)) > 0){
					   gain(Card.getCard(state.cards,  Card.CardName.Remodel));
					   state.gameBoard.put(Card.getCard(state.cards,  Card.CardName.Remodel), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Remodel)) - 1);
					   coins = coins - 4;
				   }
				   if(rand == 5 && state.gameBoard.containsKey(Card.getCard(state.cards,  Card.CardName.Salvager)) && state.gameBoard.get(Card.getCard(state.cards,  Card.CardName.Salvager)) > 0){
					   gain(Card.getCard(state.cards,  Card.CardName.Salvager));
					   state.gameBoard.put(Card.getCard(state.cards,  Card.CardName.Salvager), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Salvager)) - 1);
					   coins = coins - 4;
				   }else{
					   coins = 3;
					   continue;
				   }	   
			   }
			   else if(coins == 5){
				   int rand = gen.nextInt(3);
					if (rand == 0 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Mine)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Mine)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Mine));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Mine), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Mine)) - 1);
						coins = coins - 5;
					} else if (rand == 1 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.CouncilRoom)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.CouncilRoom)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.CouncilRoom));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.CouncilRoom), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.CouncilRoom)) - 1);
	                    coins = coins - 5;
	                } else if (rand == 2 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Duchy)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Duchy)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.Duchy));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Duchy), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Duchy)) - 1);
	                    coins = coins - 5;
	                }else{
						   coins = 4;
						   continue;
					}
			   }
			   else if(coins == 6){
				   int rand = gen.nextInt(2);
					if (rand == 0 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gold)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Gold));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) - 1);
						coins = coins - 6;
					} else if (rand == 1 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Adventurer)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.Adventurer));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Adventurer), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) - 1);
	                    coins = coins - 6;
					}else{
						   coins = 5;
						   continue;
					}
			   }
			   else if(coins == 7){
				   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gold)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.Gold));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) - 1);
	                    coins = coins - 6;
	                }
				   else{
					   coins = 6;
					   continue;
				   }
			   }
			   else if(coins >= 8){
				   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Province)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Province));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Province), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) - 1);
						coins = coins - 8;
				   }
				   else{
					   coins = 7;
					   continue;
				   }
			   }
		   }
	   }
	   final void endTurn() {
		   for(Card c: hand){
			   discard.add(c);
		   }
		   for(Card c: playedCards){
			   discard.add(c);
		   }
		   hand.clear();
		   playedCards.clear();
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
