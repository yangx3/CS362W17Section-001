package cs362.dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import cs362.dominion.Card.CardName;
import cs362.dominion.Card.Type;


public class Player {
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
		if (deck.isEmpty()) {// Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			System.out.println("RESHUFFLING the deck of the player "
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
		System.out.println("DRAW " + toDraw);
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
		//TODO Shuffle cards
		for (int i = 0; i < 5; i++) {
			drawCard();
		}
	}

	//card goes in discard,
	final boolean gain(Card card, boolean mute) {
		discard.add(card);
		if(!mute){
			System.out.println("Player: "+this.player_username+" gains "+card);
		}
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
			
			numActions -= 1;
			c.play(this, gameState);

			playedCards.add(c);
			

			hand.remove(c);
			this.discard.add(c);
		}
	}
	final int scoreFor() { 
		int score = 0;
		//score from hand
		for (Card c : hand)
			score += c.score(this);
		//score from discard
		for (Card c : discard)
			score += c.score(this);
		//score from deck
		for (Card c : deck)
			score += c.score(this);

		//COUNT # OF GARDENS
		//COUNT TOTAL OF CARDS
		int count_gardens = Card.countCardName(hand, CardName.Garden) + 
				Card.countCardName(discard, CardName.Garden) +
				Card.countCardName(deck, CardName.Garden);

		if(count_gardens > 0){
			int score_per_garden = Math.floorDiv((hand.size() + discard.size() + deck.size()), 10);
			score += (score_per_garden * count_gardens);
		}
		return score;
	}    

	public void playTtreasureCard() {
		int precoins = coins;
		List<Card> tcards = Card.filter(hand, Card.Type.TREASURE);
		for(Card C : tcards){
			coins += C.getTreasureValue();
			discard(C);
		}
		System.out.println(player_username + " just played "+ (coins - precoins)+ " coins worth of treasure cards.");

	}
	public void buyCard() {
		//TODO IMPL AI Strategy here

		while(numBuys > 0){
			if(coins >= 8 && tryBuy(Card.CardName.Province)){

			}else if(coins >= 4 && tryBuy(Card.CardName.Smithy)){
				
			}else if(coins >= 3 && tryBuy(Card.CardName.Gold)){
				
			}else if(coins >= 2 && tryBuy(Card.CardName.Silver)){
			}else if(coins >= 1){
				tryBuy(Card.CardName.Estate);
			}else{
				tryBuy(Card.CardName.Cooper);
			}
		}
	}
	private boolean tryBuy(CardName cn) {
		//Returns boolean if the player ends up buying the card.
		if(canBuy(cn)){
			buyThatCard(cn);	
			return true;
		}
		return false;
	}

	private boolean canBuy(CardName cn) {
		Integer n_cns = gameState.gameBoard.get(Card.getCard(gameState.cards, cn));
		return (n_cns != null && n_cns > 0);
	}

	private void buyThatCard(CardName cn) {
		//Buys specified card for the player.
		//This method is for the buyCard() method.
		//TODO Add assertion that the pile is never less than 1.
		//TODO Add assertion that the player has the money for the card.
		Card c = Card.getCard(gameState.cards, cn);
		
		int putback = gameState.gameBoard.get(c) - 1;
		deck.add(c);
		gameState.gameBoard.put(c, putback);
		coins -= c.getCost();
		numBuys--;
		
		//Embargo impl
		//TODO Test this code
		final Card CurseCard = Card.getCard(gameState.cards, Card.CardName.Curse);
		Integer curses_avalible = gameState.gameBoard.get(CurseCard);
		Integer embargoTokens = gameState.embargoTokens.get(CurseCard);
		
		if(curses_avalible != null && curses_avalible > 0){
			if(embargoTokens != null){
				if(embargoTokens > 0){
					int curse_pulls = curses_avalible < embargoTokens ? curses_avalible : embargoTokens;
					
					for(int i = 0; i < curse_pulls; i++){
						putback = gameState.gameBoard.get(CurseCard) - 1;
						deck.add(c);
						gameState.gameBoard.put(c, putback);
					}
					
				}
			}
		}
	}

	final void endTurn() {
		System.out.println(" --- --------------------------- --- ");
		System.out.println("Ending " + this.player_username +"'s turn."); 
		System.out.println(" --- --------------------------- --- ");
		
		//Discard whole hand then init next turn.
		while(!hand.isEmpty()){
			discard(hand.get(0));
		}
		initializePlayerTurn();
		System.out.println("New turn initialized after ending turn.");
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
		sb.append(" --- --------------------------- --- \n");

		sb.append("Hand: " + this.hand);
		sb.append("Discard: " + this.discard);
		sb.append("Deck: " + this.deck);
		sb.append("Played Cards: " + this.playedCards);
		sb.append("numActions: " + this.numActions);
		sb.append("coinss: " + this.coins);
		sb.append("numBuys: " + this.numBuys);
		sb.append("\n");     
		sb.append(" --- --------------------------- --- \n");
		
		return sb.toString();

	}
	
	public void revealHand() {
		System.out.println(player_username + " reveals hand. "+ hand);
	}

}