package org.cs362.dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
/**
 * This is the card object that contains the rules for the victory, action and treasure cards
 */

public final class Card implements Comparable<Card>{
	//defines all the types
	public enum Type {
		ACTION, TREASURE, VICTORY;
	}

	//Declares the name of all the cards
	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Cooper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse,
		/** The Kingdom cards */
		Adventurer, Smithy, Village, Ambassador, Baron, CouncilRoom, cutpurse, embargo, feast, gardens, greathall, mine, salvager
	}
	/**
	 * @param enum CardName the name of the card (GOLD, SILVER, COPPER, 
	 * @param enum Type the type of the card (Victory, Treasure, or Kingdom
	 * @param int cost the cost of the card
	 * @param int score the score of the card, when the game is finished
	 * @param treasureValue  the treasure value of the treasure cards (cooper, silver, and gold cards)
	 */
	private final Type realType;
	private final CardName cardName;
	private final int cost, score, treasureValue;

	Card(CardName cardName, Type type, int cost, int score, int treasureValue) {
		this.cost = cost;
		this.score = score;
		this.treasureValue = treasureValue;
		this.realType = type;
		this.cardName = cardName;
	}

	/**
	 * Returns the type
	 */
	public Type getType() {
		return realType;
	}

	/**
	 * Returns the cardName
	 */
	public CardName getCardName() {
		return cardName;
	}

	public int getCost() {
		return cost;
	}

	public int getScore() {
		return score;
	}

	public int getTreasureValue() { return treasureValue; }
	public int score(Player player) { return score; }

	//initializer that takes the names that were given above and initializes (using the card creator), it then puts them in a static card list, idk why on that part, but i think it is used in playdominion class
	static List<Card> createCards() {
		List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards  */
		Card o = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.Cooper, Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards  */ 
		o = new Card(CardName.Province,Type.VICTORY, 	8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy,Type.VICTORY,		5, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY,		2, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY,		0, -1, 0);
		ret.add(o);				
		/** The Kingdom cards , it should more than 10 cards*/ 	
		
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);
		ret.add(o);
		o = new Card(CardName.salvager,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.CouncilRoom,Type.ACTION,5,0,0);
		ret.add(o);
		//  cutpurse, embargo, feast, gardens, greathall, mine,
		o = new Card(CardName.Ambassador,Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Baron,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.cutpurse,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.embargo,Type.ACTION,2,0,0);
		ret.add(o);
		o = new Card(CardName.feast,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.gardens,Type.ACTION,4,0,0);
		ret.add(o);
		//this is also a victory type fuck this card selection
		o = new Card(CardName.greathall,Type.ACTION,3,1,0);
		ret.add(o);
		o = new Card(CardName.mine,Type.ACTION,5,0,0);
		ret.add(o);

		return ret;
	}

	//this is where the rules of the action cards are and what interacts with the game, it takes the player and the gamestate
	public void play(Player player, GameState state) {
		
		switch(this.cardName) {

			//POTENTIAL BUG: THERE ARE NOT ENOUGH TREASURE IN THE DECK THEN THEN THIS WILL RUN FOREVER
			case Adventurer:
				System.out.println("IN ADVENTURER******************************************");
	    		  //Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
				//hopefully this iterates through and finds two treasure cards
				int count = 0;
				while(count!=2){
					Card temp = player.drawCard();
					System.out.println("TYPE: " + temp.getType());

					if(temp.getType() == Type.TREASURE){
						System.out.println(temp);
						count+=1;
					}
					else{
						player.discard(temp);
						System.out.println("DISCARDING");
					}
				}

				System.out.println("TODO Adventurer Code******************************************");
				System.out.println("Reveal cards from the player deck until player reveal 2 Treasure cards. " +
		    	  		"Put those Treasure cards into player hand and discard the other revealed cards.");
				player.discard(this);
				return;

			case Smithy:
				System.out.println("SMITHY******************************************");
				//draw 3
				//JK THIS IS BUG YOU ONLY GET TWO LOL BUG1
	        	 player.drawCard();
	        	 player.drawCard();
	        	 player.discard(this);
				return;

			//ME CODE
			case Village:
				System.out.println("Village Code******************************************");
				System.out.println("The player draw +1 Card.");
	    	  	System.out.println("The player gets +2 play Actions.");
	    	  	//this should hopefully work
				//BUG THEY GET 1 ACTION NOT 2 BUG2
	    	  	player.numActions+=1;
	    	  	player.drawCard();
	    	  	player.discard(this);
				return;
			//CARDS THAT I ADDED ------------------------------------------------
			// Ambassador, Baron, CouncilRoom, cutpurse, embargo, feast, gardens, greathall, mine, Laboratory, Festival, Market
			case salvager:
				System.out.println("Salvager******************************************");
				//+1 buy, Trash a card from your hand +Coin equal to its cost.
				//most likely find the most expensive card and trash it.
				//BUG THEY DONT GET ANY BUYS WOW SUCH A BUG3
				player.numBuys += 0;

				//this is dumb bot that is playing so it will take the first value that it finds that is over
				//2 and trash it for coins
				for(int i = 0; i < player.hand.size(); i++) {
					//BUG OPTION GET RID OF 'AND' the salvager will get rid of itself sometimes
					if (player.hand.get(i).cost >= 2 && player.hand.get(i) != this) {
						System.out.println("FOUND A CARD: \n" + player.hand.get(i));
						player.Trash.add(player.hand.get(i));
						System.out.println("TRASH: \n" + player.Trash);
						player.coins += player.hand.get(i).cost;
						System.out.println("NUM COINS: \n" + player.coins);
						System.out.println("Hand before discard: \n" + player.hand);
						player.hand.remove(i);
						System.out.println("Hand After Discard\n" + player.hand);
						return;
					}
				}
				//if there is no card that you can find to dsicard
				player.discard(this);
				return;
			case Ambassador:
				System.out.println("Ambassador******************************************\n");
				//Reveal a card from your hand. Return up to 2 copies of it from your hand to the Supply. Then each other player gains a copy of it.

				Card Aegis = null;

				//if the player has copper then they will return one back into the supply (this is a pretty bad strat for the beginning but for the late game it is helpful-ish) I think this card kinda sucks
				for(int i = 0; i < player.hand.size(); i++){
					if(player.hand.get(i).cardName == CardName.Cooper){
						Aegis = player.hand.get(i);
						System.out.println(state.gameBoard.get(Aegis));
						state.gameBoard.put(Aegis, state.gameBoard.get(Aegis) + 1);
						System.out.println(state.gameBoard.get(Aegis));
						player.hand.remove(i);
						break;
					}
				}
				//if we didn't find any copper;
				if(Aegis == null){
					player.discard(this);
					return;
				}

				//look for other players and make them take a cooper
				for(int i = 0; i < state.players.size(); i++){
					//if the player we are looking at is not the main player than that player will draw a card
					if(state.players.get(i).player_username != player.player_username) {
						System.out.println("PLAYERS: " + state.players.get(i) + "\n");
						state.players.get(i).gain(Aegis);

						state.gameBoard.put(Aegis, state.gameBoard.get(Aegis) - 1);
						System.out.println(state.gameBoard.get(Aegis));
					}
					}
				//good luck future me
				player.discard(this);
				return;
			case Baron:
				//+1 Buy
				//You may discard an Estate card. If you do, +4 to coin. Otherwise, gain an Estate card.
				//basically if you have an estate card then do it, otherwise gain an estate
				System.out.println("BARON CARD******************************************\n");
				player.numBuys += 1;
				Card dog = null;
				//iterate through hand to see if there is an estate
				for(int i = 0; i < player.hand.size(); i++){
					if(player.hand.get(i).getCardName() == CardName.Estate){
						//BUG PLAYER DOESN"T GET 4 COINS THEY GET 3 LMAO AM I RIGHT BUG4
						player.coins +=3;
						System.out.println("FOUND ESTATE BEFORE DISCARD\n" + player.hand);
						player.discard(player.hand.get(i));
						System.out.println("FOUND ESTATE AFTER DISCARD\n" + player.hand);
						//we are done with iteration
						player.discard(this);
						return;
					}
				}

				//if the player does not have an estate card then they will draw one.
				System.out.println(state.cards);
				for(int i = 0; i < state.cards.size(); i++) {
					if (state.cards.get(i).getCardName() == CardName.Estate) {
						dog = state.cards.get(i);
						System.out.println("FOUND THAT DOG ESTAT\n\n\n" + dog);
						break;
					}
				}
				//if there are even any  estates left
				if(state.gameBoard.get(dog) > 0) {
					System.out.println(state.gameBoard.get(this));
					System.out.println(state.gameBoard.get(dog));
					//decrement estates by one.
					state.gameBoard.put(dog, state.gameBoard.get(dog) - 1);
					System.out.println(state.gameBoard.get(dog));
					player.gain(dog);
					System.out.println("DISCARD PILE \n\n\n\n\n" + player.discard);
				}
				player.discard(this);
				return;
			case cutpurse:
				//+2 coins
				System.out.println("CUTPURSE******************************************\n");
				//AW JEEZ IT IS ANOTHER COIN BUG WHO WOULD HAVE GUESS BUG5 IS A COIN BUG. I DID CAUSE I WROTE IT BUG5
				player.coins+=1;
				System.out.println("COINS: " + player.coins + "\n");

				//Each other player discards a Copper card (or reveals a hand with no Copper).
				//revealing hands is useless to a dumb bot so if there is no copper in the other players hand don't do anything
				//iterate through players
				for(int i = 0; i < state.players.size(); i++){
					//if the player we are looking at is not the main player than that player will draw a card
					if(state.players.get(i).player_username != player.player_username){
						//iterate through hand until be find a copper piece
						for(int x = 0; x < state.players.get(i).hand.size(); x++){
							System.out.println("COPPER CHECK IN LOOP: " + state.players.get(i).hand.get(x).getCardName() + "\n");
							//if the other players have a copper
							if(state.players.get(i).hand.get(x).getCardName() == CardName.Cooper){
								System.out.println("WE FOUND COPPER!\n");
								System.out.println(state.players.get(i).hand);
								state.players.get(i).discard(state.players.get(i).hand.get(x));
								System.out.println(state.players.get(i).hand);
								break;
							}
						}
						System.out.println(state.players.get(i).player_username + "\n");
						System.out.println("OUTSIDE LOOP \n");
					}
				}
				player.discard(this);
				return;
			case embargo:
				System.out.println("EMBARGO******************************************\n");
				//+2 coins
				player.coins += 2;
				player.Trash.add(this);
				player.hand.remove(this);
				//see player method buycards to see more of the effects of embargo
				state.embargo = 1;
				//Trash this card. Put an Embargo token on top of a Supply pile.
				//When a player buys a card, he gains a Curse card per Embargo token on that pile.
				return;
			case feast:
				//Trash this card. Gain a card costing up to $5.
				//TRASH MEANS IT CANT BE USED AGAIN
				System.out.println("FEAST******************************************\n");
				Card Temp = null;
				System.out.println(player.hand);
				player.Trash.add(this);
				player.hand.remove(this);
				System.out.println(player.hand);
				//find the most expensive none victory card.
				for(int i = 0; i < state.cards.size(); i++){
					if(state.cards.get(i).cost == 5 && state.cards.get(i).getType() != Type.VICTORY){
						Temp = state.cards.get(i);
						//if there are any cards left in that hashmap location
						System.out.println("CARDS LEFT : " + state.gameBoard.get(Temp));
						if(state.gameBoard.get(Temp) > 0) {
							System.out.println(Temp);
							player.gain(Temp);
							System.out.println(state.gameBoard.get(Temp));
							state.gameBoard.put(Temp, state.gameBoard.get(Temp) - 1);
							System.out.println(state.gameBoard.get(Temp));
							return;
						}
					}
				}
				return;
			case gardens:
				//Worth 1 victory point per 10 cards you have (round down).
				//see the player method 'scorefor' to see the effects of this card
				player.discard(this);
				return;
			case greathall:
				//+1 card, +1 Action
				//+1 victory point at the end, another one to check for at the end.
				System.out.println("GREAT HALL******************************************\n");
				player.drawCard();
				player.numActions+=1;
				//it has a score value
				player.discard(this);
				return;
			case mine:
				System.out.println("MINE******************************************\n");
				//You may trash a Treasure from your hand. Gain a Treasure to your hand costing up to 3 more than it.
				//AKA find the most expensive treasure card and trash it.
				//TRASH MEANS IT CANT BE USED AGAIN

				List<Card> TreasureCards = Card.filter(player.hand, Type.TREASURE);

				Card temp = null;

				if(TreasureCards.size() != 0) {
					for (int i = 0; i < TreasureCards.size(); i++) {
						//if the card is silver then add a gold to your hand decrementing the gameboard
						//then trash the silver
						if (TreasureCards.get(i).getTreasureValue() == 2) {
							//have to iterate through to find the silver card..
							for(int x = 0; x < state.cards.size(); x++) {
								if (state.cards.get(x).cardName == CardName.Gold) {
									temp = state.cards.get(x);
									break;
								}
							}
							//if there are silver cards left
							if(state.gameBoard.get(temp) > 0) {
								System.out.println(temp);
								System.out.println(state.gameBoard.get(temp));
								//decrement gold by one by one.
								state.gameBoard.put(temp, state.gameBoard.get(temp) - 1);
								System.out.println(state.gameBoard.get(temp));
								player.gain(temp);
								//have to iterate through hand to find what card to trash (dumb I know)
								for (int x = 0; x < player.hand.size(); x++) {
									if (player.hand.get(x).cardName == CardName.Silver) {
										player.Trash.add(player.hand.get(x));
										player.hand.remove(x);
										System.out.println(player.hand.size());
										System.out.println(player.Trash);
										break;
									}
								}
								return;
							}
						}
						//if the card is a cooper then add a silver ....
						if (TreasureCards.get(i).getTreasureValue() == 1) {
							//have to iterate through to find the silver card..
							for(int x = 0; x < state.cards.size(); x++) {
								if (state.cards.get(x).cardName == CardName.Silver) {
									temp = state.cards.get(x);
									break;
								}
							}
							if(state.gameBoard.get(temp) > 0) {
								System.out.println(temp);
								System.out.println(state.gameBoard.get(temp));
								//decrement silver by one by one.
								state.gameBoard.put(temp, state.gameBoard.get(temp) - 1);
								System.out.println(state.gameBoard.get(temp));
								player.gain(temp);
								//have to iterate through hand to find what card to trash (dumb I know)
								for (int x = 0; x < player.hand.size(); x++) {
									if (player.hand.get(x).cardName == CardName.Cooper) {
										System.out.println("PLAYER HAND BEFORE" + player.hand.size());
										player.Trash.add(player.hand.get(x));
										player.hand.remove(x);
										System.out.println(player.hand.size());
										System.out.println(player.Trash);
										break;
									}
								}
								return;
							}
						}
					}
				}
				player.discard(this);
				return;

			case CouncilRoom:
				System.out.println("COUNCIL ROOM \n");
				//+4 Cards, +1 Buy, Each other player draws a card.
				player.drawCard();
				player.drawCard();
				player.drawCard();
				player.drawCard();
				player.numBuys+=1;

				System.out.println("Number of buys: "+ player.numBuys + "\n");
				System.out.println(player.hand);

				System.out.println("PLAYER WHO IS USING CARD: " + player.player_username + "\n");
				for(int i = 0; i < state.players.size(); i++){
					System.out.println("LOOP USERNAME: "+ state.players.get(i).player_username + "\n");
					//if the player we are looking at is not the main player than that player will draw a card
					if(state.players.get(i).player_username != player.player_username){
						state.players.get(i).drawCard();
						System.out.println(state.players.get(i).player_username + "\n");
						System.out.println(state.players.get(i).hand);
					}
				}
				player.discard(this);
				return;
			
		default: return;
		}
	}

	//no idea
	public static Card getCard(List<Card> cards,CardName cardName) {
		for(int i=0; i<cards.size();i++){
			if(cards.get(i).cardName.equals(cardName))
					return 	cards.get(i);
		}
		return null;
	}

	//also no idea
	public static List<Card> filter(Iterable<Card> cards, Type target) {
		List<Card> out = new ArrayList<Card>();
		for (Card c : cards)
			if (c.getType() == target)
				out.add(c);
			return out;
		}
	// this method will print out all the constant cards ENUM
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" \t" + this.getCardName());
		sb.append("-" + this.getType() + " ");
		sb.append("\t\t Cost: " + this.cost + " ");
		sb.append("\t\t Score: " + this.score + " ");
		sb.append("\tTreasure Value: " + this.treasureValue);

		return sb.toString();

	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!super.equals(obj)) return false;
		if(!(obj instanceof Card)) return false;

		return cardName.equals(((Card) obj).cardName);
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}


}
