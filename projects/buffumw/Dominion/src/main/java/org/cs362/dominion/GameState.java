package org.cs362.dominion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
//import java.util.HashSet;

public class GameState {
	public final ArrayList<Player> players = new ArrayList<Player>();
	public final ArrayList<Card> availableCards = new ArrayList<Card>();
	public HashMap<Card, Integer> board = new HashMap<Card, Integer>();
	public ArrayList<Deck> game = new ArrayList<Deck>();
	
	// initialize the cards to select from
	public GameState(ArrayList<Card> availableCards)
	{
		this.availableCards.addAll(availableCards);
	}
	
	// add players to the game
	public void addPlayer(Player player)
	{
		this.players.add(player);
	}

	// initialize the board with players
	public void initializeGame()
	{
		// verifying that there are enough players
		if(players.size() < 2 || players.size() > 4)
		{
			System.err.println("Error: This game must be played by 2 - 4 players, please restart");
			System.exit(1); // exit status 1 and game must be redone
		}
		
		// initializing number of cards in each deck
		for(Card card: availableCards)
		{
			game.add(Builder.buildBoard(card));
		}
		
		// initialize player decks
		for(Player player: players)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("What is your username? ");
			player.username = in.nextLine();
			player.setDeck(Builder.buildPlayerStartDeck());
		}
	}
	
	public boolean aWinner()
	{
		return false;
	}
	
	public Player play()
	{
		int turn = 0;
		do
		{
			for(Player player: players)
			{
				
				System.out.printf("Hi %s, it's your turn!\n\n", player.username);
				player.draw(5);
				player.playActions();
				int coins = player.getCoins();
				
				System.out.printf("Hi %s, welcome to the buying phase, you have %2d coins. Here are the available cards: \n\n", player.username, coins);
				boolean purchase = true;
				do{
					if(purchase == false)
					{
						System.out.println("You did not have enough coins to purchase that card. Please select another card.");
					}
				
					for(Deck deck: game)
					{
						Card card = deck.getBottomCard();
						int cost = card.getCost();
						System.out.printf("%-15s: Costs: %2d: %2d Left\n", card.getName(), cost, deck.size());//System.out.println(card.getName() + ":\t costs " + cost + ": " + deck.size() + " left");
					}
					
					System.out.print("What card would you like to purchase?: ");
					Scanner in = new Scanner(System.in);
					String temp = in.nextLine();
					for(Deck deck: game)
					{
						if(deck.compare(temp) != null)
						{
							purchase = player.playPurchasing(deck);
							System.out.println("Did a good purchase happen? : " + purchase);
						}
					}
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				}while(purchase == false);
			}
			turn++;
		}while(aWinner() == false);
		
		return new Player();
	}
	
	
}
