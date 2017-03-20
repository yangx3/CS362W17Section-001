package cs362.dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;






import java.util.Random;

import cs362.dominion.Card.CardName;
import cs362.dominion.Card.Type;


public class Player {
	List<Card> hand = new ArrayList<Card>();
	LinkedList<Card> deck = new LinkedList<Card>();
	List<Card> discard = new ArrayList<Card>(); 
	List<Card> playedCards = new ArrayList<Card>();

	String player_username;

	int numActions;
	int numBuys;
	int coins;

	final GameState gameState;


	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState = gameState;
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
			List<Card> actionCards = Card.filter(hand, Type.ACTION);

			if (actionCards.size() == 0)
				return;

			Card c = (Card)actionCards.get(0);
			if (c == null)
				return;
			System.out.println("Player.actionPhase Card:" + c.toString());

			playedCards.add(c);
			numActions -= 1;

			c.play(this, gameState);
			discard(c);
		}
	}
	final int scoreFor() { 
		int score = 0;
		
		List <Card> Combined = new ArrayList<Card>();
		
		Combined.addAll(hand);
		Combined.addAll(deck);
		Combined.addAll(discard);
		
		for (Card c : Combined) {
			if (c.getCardName() == Card.CardName.Gardens) {
				score += (Combined.size()/10);
			}
			else {
				score += c.score(this);
			}
		}

		return score;
	}    

	public void playTtreasureCard() {
		List<Card> treasureCards = Card.filter(hand, Type.TREASURE);
		
		if (treasureCards.size() == 0)
			return;
		
		for (Card c : treasureCards) {
			System.out.println("Player.TreasurePhase Card:" + c.toString());
			coins += c.getTreasureValue();
			discard(c);
		}
		System.out.println("Coins: " + coins + "\n");
		
		
	}
	/*****************************************
	 * Function Def: Allows the player to buy a card with ease, adds to discard
	 *****************************************/
	public void buy(Card c) {
		int supply_value;
		discard.add(c);
		supply_value = gameState.gameBoard.get(c);
		gameState.gameBoard.put(c, supply_value-1);
	}
	
	/*****************************************
	 * Function Def: Allows the player to buy a card with ease, adds to hand
	 *****************************************/
	public void buy_hand(Card c) {
		int supply_value;
		hand.add(c);
		supply_value = gameState.gameBoard.get(c);
		gameState.gameBoard.put(c, supply_value-1);
	}
	
	public void buyCard() {
		while(numBuys >= 1) {	
			if (coins >= 8) {
				System.out.println("Gold: " + coins);
				System.out.println("Buying province");
				buy(Card.getCard(gameState.cards, CardName.Province));
				numBuys--;
				coins -= Card.getCard(gameState.cards, CardName.Province).getTreasureValue();
			}
			else if (coins >= 6) {
				System.out.println("Gold: " + coins);
				System.out.println("Buying Gold");
				if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Gold))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Gold)))== 0)) {
					buy(Card.getCard(gameState.cards, CardName.Gold));
					numBuys--;
					coins -= Card.getCard(gameState.cards, CardName.Gold).getTreasureValue();
				}
				else {
					coins--;
				} 
			}
			else if (coins == 5) {
				System.out.println("Gold: " + coins);
				System.out.println("Buying Duchy");
				if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Duchy))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Duchy)))== 0)) {
					buy(Card.getCard(gameState.cards, CardName.Duchy));
					numBuys --;
					coins -= Card.getCard(gameState.cards, CardName.Duchy).getTreasureValue();
				}
				else {
					coins--;
				} 
			}
			else if (coins == 4) {
				System.out.println("Gold: " + coins);
				System.out.println("Buying Smithy");
				if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Smithy))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Smithy))== 0))) {
					buy(Card.getCard(gameState.cards, CardName.Smithy));
					numBuys --;
					coins -= Card.getCard(gameState.cards, CardName.Smithy).getTreasureValue();
				}
				else {
					coins--;
				} 
			}
			else if (coins == 3) {
				System.out.println("Gold: " + coins);
				System.out.println("Buying Village");
				if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Village))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Village))== 0))) {
					buy(Card.getCard(gameState.cards, CardName.Village));
					numBuys --;
					coins -= Card.getCard(gameState.cards, CardName.Village).getTreasureValue();
				}
				else {
					coins--;
				} 
			}
			else if (coins == 2) {
				System.out.println("Gold: " + coins);
				System.out.println("Buying Coper");
				if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Cooper))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Cooper))== 0))) {
					buy(Card.getCard(gameState.cards, CardName.Cooper));
					numBuys --;
					coins -= Card.getCard(gameState.cards, CardName.Cooper).getTreasureValue();
				}
				else {
					coins--;
				} 
			}
			else if (coins <= 1) {
				break;
			}
		}
		 
	}
	public void buyRandCard() {
		Random rand = new Random();
		while(numBuys >= 1) {	
			if (coins >= 8) {
				System.out.println("Gold: " + coins);
				System.out.println("Buying province");
				buy(Card.getCard(gameState.cards, CardName.Province));
				numBuys--;
				coins -= Card.getCard(gameState.cards, CardName.Province).getTreasureValue();
			}
			else if (coins >= 6) {
				System.out.println("Gold: " + coins);
				System.out.println("Buying Gold");
				if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Gold))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Gold)))== 0)) {
					buy(Card.getCard(gameState.cards, CardName.Gold));
					numBuys--;
					coins -= Card.getCard(gameState.cards, CardName.Gold).getTreasureValue();
				}
				else {
					coins--;
				} 
			}
			else if (coins == 5) {
				int n = rand.nextInt(2) + 1;
				System.out.println("Gold: " + coins);
				if(n==1) {
					System.out.println("Buying Duchy");
					if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Duchy))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Duchy)))== 0)) {
						buy(Card.getCard(gameState.cards, CardName.Duchy));
						numBuys --;
						coins -= Card.getCard(gameState.cards, CardName.Duchy).getTreasureValue();
					}
					else {
						coins--;
					} 
				}
				else {
					System.out.println("Buying Council room");
					if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Council_room))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Council_room)))== 0)) {
						buy(Card.getCard(gameState.cards, CardName.Council_room));
						numBuys --;
						coins -= Card.getCard(gameState.cards, CardName.Council_room).getTreasureValue();
					}
					else {
						coins--;
					} 
				}
			}
			else if (coins == 4) {
				int n = rand.nextInt(4) + 1;
				System.out.println("Gold: " + coins);
				if(n == 1){	
					System.out.println("Buying Baron");
					if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Baron))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Baron))== 0))) {
						buy(Card.getCard(gameState.cards, CardName.Baron));
						numBuys --;
						coins -= Card.getCard(gameState.cards, CardName.Baron).getTreasureValue();
					}
					else {
						coins--;
					} 
				}
				else if(n == 2){	
					System.out.println("Buying Smithy");
					if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Smithy))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Smithy))== 0))) {
						buy(Card.getCard(gameState.cards, CardName.Smithy));
						numBuys --;
						coins -= Card.getCard(gameState.cards, CardName.Smithy).getTreasureValue();
					}
					else {
						coins--;
					} 
				}
				else if(n == 3){	
					System.out.println("Buying Gardens");
					if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Gardens))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Gardens))== 0))) {
						buy(Card.getCard(gameState.cards, CardName.Gardens));
						numBuys --;
						coins -= Card.getCard(gameState.cards, CardName.Gardens).getTreasureValue();
					}
					else {
						coins--;
					} 
				}
				else {
					System.out.println("Buying Feast");
					if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Feast))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Feast))== 0))) {
						buy(Card.getCard(gameState.cards, CardName.Feast));
						numBuys --;
						coins -= Card.getCard(gameState.cards, CardName.Feast).getTreasureValue();
					}
					else {
						coins--;
					}
				}
			}
			else if (coins == 3) {
				int n = rand.nextInt(3) + 1;
				System.out.println("Gold: " + coins);
				
				if(n == 1){
					System.out.println("Buying Steward");
					if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Steward))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Steward))== 0))) {
						buy(Card.getCard(gameState.cards, CardName.Steward));
						numBuys --;
						coins -= Card.getCard(gameState.cards, CardName.Steward).getTreasureValue();
					}
					else {
						coins--;
					} 
				}	
				else if(n == 2){
					System.out.println("Buying Great_Hall");
					if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Great_Hall))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Great_Hall))== 0))) {
						buy(Card.getCard(gameState.cards, CardName.Great_Hall));
						numBuys --;
						coins -= Card.getCard(gameState.cards, CardName.Great_Hall).getTreasureValue();
					}
					else {
						coins--;
					} 
				}	
			}
			else if (coins == 2) {
				System.out.println("Gold: " + coins);
				System.out.println("Buying Coper");
				if(!((gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Cooper))==null)||(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Cooper))== 0))) {
					buy(Card.getCard(gameState.cards, CardName.Cooper));
					numBuys --;
					coins -= Card.getCard(gameState.cards, CardName.Cooper).getTreasureValue();
				}
				else {
					coins--;
				} 
			}
			else if (coins <= 1) {
				break;
			}
		}
		 
	}
	final void endTurn() {
		while(hand.size() > 0) {
			discard(hand.get(0));
		}
		this.initializePlayerTurn();
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
		sb.append("coins: " + this.coins);
		sb.append("numBuys: " + this.numBuys);
		sb.append("\n");     

		return sb.toString();

	}

}