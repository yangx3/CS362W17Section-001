package org.cs362.dominion;
import java.util.*;
import java.util.Random;
import java.util.List;

public class PlayGame {

	public static void main(String[] args, int arg1) {
		Scanner input = new Scanner(System.in);
		int turn = 0, players, cardnum, loopCtrl = 0, randomInt;
		long seed = System.nanoTime();
		Random rand = new Random();
		Card temp;
		System.out.print("Welcome to Dominion!\nThis will be a 2-player game.");

		DominionBoard board = new DominionBoard();
		board.initialize();
		players = arg1;
		if(!(players>=2 && players<=4)){
			System.out.print("\nNumber must be between 2-4\n");
			System.exit(1);
		}
		List<Player> numPlayers = new ArrayList<Player>();
		Player player = new Player("PLAYER1", 1, 1, 0);
		Player player2 = new Player("PLAYER2", 1, 1, 0);
		Player player3 = new Player("PLAYER3", 1, 1, 0);
		Player player4 = new Player("PLAYER4", 1, 1, 0);
		player.buildDeck();
		player2.buildDeck();
		player3.buildDeck();
		player4.buildDeck();

		numPlayers.add(player);
		numPlayers.add(player2);
		numPlayers.add(player3);
		numPlayers.add(player4);
		/*
		for(int i = 0; i < 5; i++) {
			player.drawCard();
			player2.drawCard();
		}
		*/
		for (int i = 0; i < players; i++) {
			for (int j = 0; j < 5; j++) {
				numPlayers.get(i).drawCard();
			}
		}
			/*
			if (player.deck.isEmpty()) {
				Collections.shuffle(player.discard, new Random(seed));
				for (Card card : player.discard) {
					player.deck.add(card);
				}
				player.discard.clear();
			}
			if (player2.deck.isEmpty()) {
				Collections.shuffle(player2.discard, new Random(seed));
				for (Card card : player2.discard) {
					player2.deck.add(card);
				}
				player2.discard.clear();
			}*/
		while (true) {
			//while (turn == 0) {
			System.out.print("\n" + numPlayers.get(loopCtrl).player_name + "! It is Your TURN:");
			numPlayers.get(loopCtrl).printHand();
			numPlayers.get(loopCtrl).printInfo();
			while (numPlayers.get(loopCtrl).getActions() > 0) {
				List<Card> actCard = Card.filter(numPlayers.get(loopCtrl).hand, Card.Type.ACTION);
				if (actCard.size() == 0)
					break;
				Card c = (Card) actCard.get(0);
				if (c == null)
					break;
				numPlayers.get(loopCtrl).activateCard(c, board, numPlayers, players);
				numPlayers.get(loopCtrl).setActions(-1);
			}
			numPlayers.get(loopCtrl).setCoins(numPlayers.get(loopCtrl).checkTreasure());
			numPlayers.get(loopCtrl).printHand();
			System.out.print("\nYou have " + numPlayers.get(loopCtrl).getCoins() + " coins to use!");
			while (numPlayers.get(loopCtrl).getBuys() > 0) {/*
					if(player.getCoins() >= 8){
						board.buyingCard(1);
						temp = board.buyCards.get(0);
						System.out.println("\nYou just bought " + temp.getCardName()+ "!");
						player.discard.add(temp);
						player.setCoins((-1)*temp.getCost());
						player.setBuys(-1);
					}*/
				randomInt = rand.nextInt(19);
				if (board.buyingCard(randomInt + 1) == 0)
					continue;
				if (board.buyCards.get(randomInt).getCost() > numPlayers.get(loopCtrl).getCoins())
					continue;
				temp = board.buyCards.get(randomInt);
				System.out.print("\nYou just bought " + temp.getCardName() + "!");
				numPlayers.get(loopCtrl).discard.add(temp);
				numPlayers.get(loopCtrl).setCoins((-1) * temp.getCost());
				numPlayers.get(loopCtrl).setBuys(-1);
			}
			System.out.print("\nYour turn is over, going to new player's turn");
			numPlayers.get(loopCtrl).removeHand();
			for (int i = 0; i < 5; i++) {
				numPlayers.get(loopCtrl).drawCard();
				if (numPlayers.get(loopCtrl).deck.isEmpty()) {
					Collections.shuffle(numPlayers.get(loopCtrl).discard, new Random(seed));
					for (Card card : numPlayers.get(loopCtrl).discard) {
						numPlayers.get(loopCtrl).deck.add(card);
					}
					numPlayers.get(loopCtrl).discard.clear();
				}
			}
			numPlayers.get(loopCtrl).resetStats();
			turn = 1;
			//}
			if (board.num_Province == 0 || board.checkEnd() == 1) {
				PlayGame.CheckWin(numPlayers, players);
				break;
			}
			if (loopCtrl < players-1)
				loopCtrl++;
			else
				loopCtrl = 0;
			/*
			while(turn == 1) {
				System.out.print("\n" + player2.player_name + "! It is Your TURN:");
				player2.printHand();
				player2.printInfo();
				while (player2.getActions() > 0) {
					List<Card> actCard = Card.filter(player2.hand, Card.Type.ACTION);
					if (actCard.size() == 0)
						break;
					Card c = (Card) actCard.get(0);
					if (c == null)
						break;
					player2.activateCard(c, board, player2);
					player2.setActions(-1);
				}
				player2.setCoins(player2.checkTreasure());
				player2.printHand();
				System.out.print("\nYou have " + player2.getCoins() + " coins to use!");
				while (player2.getBuys() > 0) {
					if(player2.getCoins() >= 8){
						board.buyingCard(1);
						temp = board.buyCards.get(0);
						System.out.println("\nYou just bought " + temp.getCardName()+ "!");
						player2.discard.add(temp);
						player2.setCoins((-1)*temp.getCost());
						player2.setBuys(-1);
					}
					randomInt = rand.nextInt(19);
					if (board.buyingCard(randomInt) == 0)
						continue;
					if (board.buyCards.get(randomInt).getCost() > player2.getCoins())
						continue;
					temp = board.buyCards.get(randomInt);
					System.out.print("\nYou just bought " + temp.getCardName() + "!");
					player2.discard.add(temp);
					player2.setCoins((-1) * temp.getCost());
					player2.setBuys(-1);
				}
				System.out.print("\nYour turn is over, going to new player's turn");
				player2.removeHand();
				for (int i = 0; i < 5; i++) {
					player2.drawCard();
					if (player2.deck.isEmpty()) {
						Collections.shuffle(player2.discard, new Random(seed));
						for (Card card : player2.discard) {
							player2.deck.add(card);
						}
						player2.discard.clear();
					}
				}
				player2.resetStats();
				turn = 0;
			}
			if (board.num_Province == 0 || board.checkEnd() == 1) {
				PlayGame.CheckWin(player, player2);
				break;
			}
			}*/
				/*
				System.out.print("\nWhat would you like to do:\n1. Action\n2. Buy\n3. End Turn\n");
				decision = input.nextInt();

				if(decision == 1 && player.getActions() != 0){
					while(loopCtrl == 0){
						System.out.print("\nWhich action card would you like to use (Enter 0 to end this menu):\n ");
						cardnum = input.nextInt();
				//If players does not want to play action card
						if(cardnum == 0){
							player.setActions(((-1)*player.getActions()));
							break;
						}
						System.out.print("You chose card number: " + cardnum);
						check = player.checkTypeAction(cardnum);
						if(check == 1){
					//Make Action happen
							player.activateCard(cardnum, board, player2.hand, player2.discard);
							loopCtrl = 1;
							player.setActions(-1);
						}
						else
							System.out.print("\nThe card you picked was not an ACTION card!");
					}
					loopCtrl = 0;
				}
				else if(decision == 2 && player.getBuys() != 0){
				//Check to see if there are any treasure card in hand and how many
					player.setCoins(player.checkTreasure());
					while(player.getBuys() != 0){
						System.out.print("\nYou have " + player.getCoins() +" coins to use!\nHere is the list of cards:");
						board.printBoard();
						System.out.print("\nWhat do you want to buy (Enter 0 to end this menu): ");
						cardnum = input.nextInt();
							if(cardnum == 0){
								player.setBuys(((-1)*player.getBuys()));
								break;
							}
						temp = board.buyCards.get(cardnum-1);
						if(player.getCoins() < temp.getCost()){
							System.out.print("\nInsufficent funds!");
						}
						else if(board.buyingCard(cardnum) == 0){
							System.out.print("\nThere are no more of those cards left");
						}
						else{
							System.out.print("\nYou just bought " + temp.getCardName()+"!");
							player.discard.add(temp);
							player.setCoins(((-1)*temp.getCost()));
							player.setBuys(-1);
						}
					}
				}

			}//End of Player1 loop

				while (turn == 1) {
					System.out.print("\n" + player2.player_name + "! It is Your TURN:");
					player2.printHand();
					player2.printInfo();
					System.out.print("\nWhat would you like to do:\n1. Action\n2. Buy\n3. End Turn\n");
					decision = input.nextInt();
					if (decision == 1 && player2.getActions() != 0) {
						while (loopCtrl == 0) {
							System.out.print("\nWhich action card would you like to use (Enter 0 to end this menu):\n ");
							cardnum = input.nextInt();
							//If player2s does not want to play action card
							if (cardnum == 0) {
								player2.setActions(((-1) * player2.getActions()));
								break;
							}
							System.out.print("You chose card number: " + cardnum);
							check = player2.checkTypeAction(cardnum);
							if (check == 1) {
								//Make Action happen
								player2.activateCard(cardnum, board, player.hand, player.discard);
								loopCtrl = 1;
								player2.setActions(-1);
							} else
								System.out.print("\nThe card you picked was not an ACTION card!");
						}
						loopCtrl = 0;
					} else if (decision == 2 && player2.getBuys() != 0) {
						//Check to see if there are any treasure card in hand and how many
						player2.setCoins(player2.checkTreasure());
						while (player2.getBuys() != 0) {
							System.out.print("\nYou have " + player2.getCoins() + " coins to use!\nHere is the list of cards:");
							board.printBoard();
							System.out.print("\nWhat do you want to buy (Enter 0 to end this menu): ");
							cardnum = input.nextInt();
							if (cardnum == 0) {
								player2.setBuys(((-1) * player2.getBuys()));
								break;
							}
							temp = board.buyCards.get(cardnum - 1);
							if (player2.getCoins() < temp.getCost()) {
								System.out.print("\nInsufficent funds!");
							} else if (board.buyingCard(cardnum) == 0) {
								System.out.print("\nThere are no more of those cards left");
							} else {
								System.out.print("\nYou just bought " + temp.getCardName() + "!");
								player2.discard.add(temp);
								player2.setCoins(((-1) * temp.getCost()));
								player2.setBuys(-1);
							}
						}
					} else if (decision == 3 || (player2.getActions() + player2.getBuys()) == 0) {
						System.out.print("\nYour turn is over, going to new player's turn");
						player2.removeHand();
						for (int i = 0; i < 5; i++) {
							player2.drawCard();
							if (player2.deck.isEmpty()) {
								Collections.shuffle(player2.discard, new Random(seed));
								for (Card card : player2.discard) {
									player2.deck.add(card);
								}
								player2.discard.clear();
							}
						}
						player2.resetStats();
						turn = 0;
					}
				}//End of player2 loop
				if (board.num_Province == 0 || board.checkEnd() == 1) {
					int victory1, victory2, numGarden = 0, numGarden2 = 0, deckSize = player.deck.size(), deckSize2 = player2.deck.size(), gVic;
					player.cleanUp();
					player2.cleanUp();
					System.out.print("\nThe game is over, checking players amount of Victory Cards!");
					victory1 = player.checkVictory();
					victory2 = player2.checkVictory();
					for (Card cards : player.deck) {
						if (cards.getCardName() == Card.CardName.Garden)
							numGarden++;
					}
					gVic = (deckSize / 10) * numGarden;
					victory1 = victory1 + gVic;
					for (Card cards : player2.deck) {
						if (cards.getCardName() == Card.CardName.Garden)
							numGarden2++;
					}
					gVic = (deckSize2 / 10) * numGarden2;
					victory2 = victory2 + gVic;

					System.out.print("\n" + player.player_name + " Victory Score: " + victory1 + "\n" + player2.player_name + " Victory Score: " + victory2);
					if (victory1 > victory2)
						System.out.print("\n" + player.player_name + " WINS!");
					else if (victory1 < victory2)
						System.out.print("\n" + player2.player_name + " WINS!");
					else
						System.out.print("\nThe game ends in a DRAW");
					input.close();
					System.exit(0);
				}*/
		}//End of entire while loop
	}
		public static void CheckWin(List<Player> numPlayer, int players){
			int victory1, victory2, victory3, victory4, numGarden = 0, deckSize = numPlayer.get(0).deck.size(),
					deckSize2 = numPlayer.get(1).deck.size(), deckSize3 = numPlayer.get(2).deck.size(),
					deckSize4 = numPlayer.get(3).deck.size(), gVic;
			System.out.print("\nThe game is over, checking players amount of Victory Cards!");
			for(int i = 0; i < players; i++) {
				numPlayer.get(i).cleanUp();
			}
				victory1 = numPlayer.get(0).checkVictory();
				victory2 = numPlayer.get(1).checkVictory();
				victory3 = numPlayer.get(2).checkVictory();
				victory4 = numPlayer.get(3).checkVictory();

			for (Card cards : numPlayer.get(0).deck) {
				if (cards.getCardName() == Card.CardName.Garden)
					numGarden++;
			}
			gVic = (deckSize / 10) * numGarden;
			victory1 = victory1 + gVic;

			for (Card cards : numPlayer.get(1).deck) {
				if (cards.getCardName() == Card.CardName.Garden)
					numGarden++;
			}
			gVic = (deckSize2 / 10) * numGarden;
			victory2 = victory2 + gVic;

			for (Card cards : numPlayer.get(2).deck) {
				if (cards.getCardName() == Card.CardName.Garden)
					numGarden++;
			}
			gVic = (deckSize3 / 10) * numGarden;
			victory3 = victory3 + gVic;

			for (Card cards : numPlayer.get(3).deck) {
				if (cards.getCardName() == Card.CardName.Garden)
					numGarden++;
			}
			gVic = (deckSize4 / 10) * numGarden;
			victory4 = victory4 + gVic;

			if(players == 2) {
				if (victory1 > victory2)
					System.out.print("\n" + numPlayer.get(0).player_name + " WINS!");
				else if (victory1 < victory2)
					System.out.print("\n" + numPlayer.get(1).player_name + " WINS!");
				else
					System.out.print("\nThe game ends in a DRAW");
			}
			else if(players == 3){
				if((victory1 > victory2) && (victory1 > victory3))
					System.out.print("\n" + numPlayer.get(0).player_name + " WINS!");
				else if((victory2 > victory1) && (victory2 > victory3))
					System.out.print("\n" + numPlayer.get(1).player_name + " WINS!");
				else if((victory3 > victory1) && (victory3 > victory2))
					System.out.print("\n" + numPlayer.get(2).player_name + " WINS!");
				else
					System.out.print("\nThe game ends in a DRAW");
			}
			else if(players == 4){
				if(((victory1 > victory2) && (victory1 > victory3)) && (victory1 > victory4))
					System.out.print("\n" + numPlayer.get(0).player_name + " WINS!");
				else if(((victory2 > victory1) && (victory2 > victory3)) && (victory2 > victory4))
					System.out.print("\n" + numPlayer.get(1).player_name + " WINS!");
				else if(((victory3 > victory2) && (victory3 > victory1)) && (victory3 > victory4))
					System.out.print("\n" + numPlayer.get(2).player_name + " WINS!");
				else if(((victory4 > victory2) && (victory4 > victory3)) && (victory4 > victory1))
					System.out.print("\n" + numPlayer.get(3).player_name + " WINS!");
				else
					System.out.print("\nThe game ends in a DRAW");
			}
			else
				System.out.print("\n" + numPlayer.get(0).player_name + " WINS!");
		}
		}
