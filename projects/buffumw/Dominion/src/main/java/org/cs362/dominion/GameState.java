package org.cs362.dominion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.Enumeration;
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
				ArrayList<String> actionsPlayed = new ArrayList<String>();
				System.out.printf("Hi %s, it's your turn!\n\n", player.username);
				player.draw(5);
				actionsPlayed = player.playActions();
				
				//Attacks against other players
				if(actionsPlayed.size() > 0)
				{
					attackPlayers(actionsPlayed, player);
				}
				

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
						if(deck.size() > 0)
						{
							Card card = deck.getBottomCard();
							int cost = card.getCost();
							System.out.printf("%-15s: Costs: %2d: %2d Left\n", card.getName(), cost, deck.size());
						}
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
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				}while(purchase == false);
			}
			turn++;
		}while(aWinner() == false);
		
		return new Player();
	}
	
	public void attackPlayers(ArrayList<String> attacks, Player player)
	{
		System.out.printf("These actions were played by %s: %s\n", player.username, attacks);
		for(int itr = 0; itr < attacks.size(); itr++)
		{
			if(attacks.get(itr).compareTo("Adventurer") == 0){ adventurer(player); }
			else if(attacks.get(itr).compareTo("Ambassador") == 0){ /* run Ambassador code*/}
			else if(attacks.get(itr).compareTo("Baron") == 0){ /* run Baron code*/}
			else if(attacks.get(itr).compareTo("Council_Room") == 0){ /* run Council_Room code*/}
			else if(attacks.get(itr).compareTo("Cutpurse") == 0){ /* run Cutpurse code*/}
			else if(attacks.get(itr).compareTo("Embargo") == 0){ /* run Embargo code*/}
			else if(attacks.get(itr).compareTo("Feast") == 0){ /* run Feast code*/}
			else if(attacks.get(itr).compareTo("Gardens") == 0){ /* run Gardens code*/}
			else if(attacks.get(itr).compareTo("Mine") == 0){ /* run Mine code*/}
			else if(attacks.get(itr).compareTo("Salvager") == 0){ /* run Salvager code*/}
			else { /* nothing special to do */ }
		}
	}
	
	public void adventurer(Player player){
		int finished = 0;
		System.out.printf("\nAdventurer about to be played, old hand: %s\n", player.getHand());
		while(finished < 2){
			Card tempCard = player.draw();
			
			if(tempCard.getType().toString().compareTo("Treasure") == 0){
				finished++;
				System.out.println("This card is worth: " + tempCard.getCoinsWorth());
				player.addCoins(tempCard.getCoinsWorth());
			}else{
				player.discardTopHandCard();
			}
		}
		System.out.printf("\nAdventurer played, new hand: %s\n", player.getHand());
	}
	
}
