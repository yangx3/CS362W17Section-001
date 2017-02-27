package org.cs362.dominion;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.Test;

public class RandomTestDominion {

	@Test
	public void test() {
		Randomness.reset(10);
		Card[] kCard = new Card[10];
		ArrayList<Card> cards = new ArrayList<Card>(Arrays.asList(Card.values()));
		cards.remove(Card.COPPER);
		cards.remove(Card.SILVER);
		cards.remove(Card.GOLD);
		cards.remove(Card.ESTATE);
		cards.remove(Card.DUCHY);
		cards.remove(Card.PROVINCE);
		cards.remove(Card.CURSE);
		for (int i = 0; i < 10; i++) {
			int j = Randomness.nextRandomInt(cards.size());
			kCard[i] = cards.remove(j);
		}
		Game game = new Game(kCard);
		int pl = Randomness.nextRandomInt(3);
		ArrayList<Player> players = new ArrayList<Player>();
		for (int i = 0; i < 2 + pl; i++) {
			players.add(new Player(game));
		}
		
		
		game.start();
		
		while (!game.ended()){
			while (game.getCurrentPlayer().hasActions()){
				int preBuys;
				
				Card hCard = game.getCurrentPlayer().hand.get(Randomness.nextRandomInt(game.getCurrentPlayer().hand.size()));
				switch (hCard) {
				case ADVENTURER:
					int preCount = game.getCurrentPlayer().hand.size();
					
					game.getCurrentPlayer().play(hCard);
					
					assertEquals(preCount - game.getCurrentPlayer().hand.size() <= 2, true);
					break;
				case BARON:
					preBuys = game.getCurrentPlayer().buys();
					int preGold = game.getCurrentPlayer().gold();
					if(game.getCurrentPlayer().hand.contains(Card.ESTATE)) {
						game.getCurrentPlayer().play(hCard);
						assertEquals(true, game.getCurrentPlayer().discard.contains(Card.ESTATE));
						assertEquals(preGold + 4, game.getCurrentPlayer().gold());
					} else {
						game.getCurrentPlayer().play(hCard);
						assertEquals(true, game.getCurrentPlayer().hand.contains(Card.ESTATE));
						assertEquals(preGold, game.getCurrentPlayer().gold());
					}
					assertEquals(preBuys+1, game.getCurrentPlayer().buys());
					break;
				case COPPER:
					game.getCurrentPlayer().play(hCard);
					break;
				case COUNCIL_ROOM:
					int preHand = game.getCurrentPlayer().hand.size();
					preBuys = game.getCurrentPlayer().buys();
					game.getCurrentPlayer().play(hCard);
					assertEquals(preHand + 3, game.getCurrentPlayer().hand.size());
					assertEquals(preBuys + 1, game.getCurrentPlayer().buys());
					break;
				case CURSE:
					//game.getCurrentPlayer().play(hCard);
					break;
				case CUTPURSE:
					int [] cutPurseCoppers = new int[players.size()];
					preGold = game.getCurrentPlayer().gold();
					for (int i = 0; i < players.size(); i++) {
						if (players.get(i) != game.getCurrentPlayer()) {
							cutPurseCoppers[i] = Collections.frequency(players.get(i).hand, Card.COPPER);
						} else {
							cutPurseCoppers[i] = 0;
						}
					}
					game.getCurrentPlayer().play(hCard);
					assertEquals(preGold + 2, game.getCurrentPlayer().gold());
					for (int i = 0; i < players.size(); i++) {
						if (players.get(i) != game.getCurrentPlayer()) {
							assertEquals(Math.max(0, cutPurseCoppers[i] - 1), Collections.frequency(players.get(i).hand, Card.COPPER));
						} 
					}
					
					break;
				case DUCHY:
					//game.getCurrentPlayer().play(hCard);
					break;
				case EMBARGO:
					preGold = game.getCurrentPlayer().gold();
					int preEmbargo = game.kingdomCards.get(0).embargo();
					game.getCurrentPlayer().play(hCard);
					assertEquals(preGold+2, game.getCurrentPlayer());
					assertEquals(false, game.getCurrentPlayer().discard.contains(Card.EMBARGO));
					assertEquals(preEmbargo + 1, game.kingdomCards.get(0).embargo());
					break;
				case ESTATE:
					//game.getCurrentPlayer().play(hCard);
					break;
				case FEAST:
					//p2.hand.add(Card.SALVAGER);
					//game.getCurrentPlayer().play(Card.SALVAGER);
					ArrayList<Card> discardCopy = new ArrayList<>(game.getCurrentPlayer().discard);
					game.getCurrentPlayer().play(hCard);
					for (Card c : game.getCurrentPlayer().discard){
						discardCopy.remove(c);
					}
					assertEquals(1, discardCopy.size());
					assertEquals(true, discardCopy.get(0).cost() <= 5);
					assertEquals(false, game.getCurrentPlayer().discard.contains(Card.FEAST));
					
					break;
				case GARDENS:
					//game.getCurrentPlayer().play(hCard);
					break;
				case GOLD:
					//game.getCurrentPlayer().play(hCard);
					break;
				case GREAT_HALL:
					int preActions = game.getCurrentPlayer().actions();
					preHand = game.getCurrentPlayer().hand.size();
					game.getCurrentPlayer().play(hCard);
					assertEquals(preActions, game.getCurrentPlayer().actions());
					assertEquals(preHand, game.getCurrentPlayer().hand.size());
					break;
				case MINE:
					if(game.getCurrentPlayer().hand.contains(Card.COPPER));
					game.getCurrentPlayer().play(hCard);
					
					break;
				case MINION:
					game.getCurrentPlayer().play(hCard);
					break;
				case PROVINCE:
					game.getCurrentPlayer().play(hCard);
					break;
				case REMODEL:
					game.getCurrentPlayer().play(hCard);
					break;
				case SALVAGER:
					game.getCurrentPlayer().play(hCard);
					break;
				case SEA_HAG:
					game.getCurrentPlayer().play(hCard);
					break;
				case SILVER:
					game.getCurrentPlayer().play(hCard);
					break;
				case SMITHY:
					game.getCurrentPlayer().play(hCard);
					break;
				case STEWARD:
					game.getCurrentPlayer().play(hCard);
					break;
				case TREASURE_MAP:
					game.getCurrentPlayer().play(hCard);
					break;
				case VILLAGE:
					game.getCurrentPlayer().play(hCard);
					break;
				default:
					break;
				
				}

			}
			
			while (game.getCurrentPlayer().buys() > 0){
				game.getCurrentPlayer().spendGold();
/*				if (game.getCurrentPlayer().buy(Card.PROVINCE)) {
					
				} else if (game.getCurrentPlayer().buy(Card.ADVENTURER)){
					
				}
				else if (game.getCurrentPlayer().buy(Card.MINE)){
				
				}
				else if (game.getCurrentPlayer().buy(Card.GOLD)){
					
				}
				else if (game.getCurrentPlayer().buy(Card.SILVER)){
					
				}
		else  {*/

					Card c;
					do {
					c = game.supply.get(Randomness.nextRandomInt(game.supply.size())).peek();
					}
					while (c == null);
					game.getCurrentPlayer().buy(c);
//				}
			}
			System.out.println("Cleanup");
			game.getCurrentPlayer().cleanup();
			game.nextTurn();
	}

	}
}
