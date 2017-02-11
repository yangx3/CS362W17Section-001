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
	public ArrayList<Deck> game = new ArrayList<Deck>();
	public Deck trash = new Deck();
	
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
				if(player.getHand().size() == 0)
				{
					player.draw(5);
				}
				
				actionsPlayed = player.playActions();
				
				//Attacks against other players
				if(actionsPlayed.size() > 0)
				{
					attackPlayers(actionsPlayed, player);
				}
				System.out.printf("My hand at the beginning of actions: %s\n", player.getHand());

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
				for(int itr = 0; itr < player.getHand().size(); itr++)
				{
					player.discardTopHandCard();
				}
				if(player.getHand().size() == 0)
				{
					player.draw(5);
				}
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
			else if(attacks.get(itr).compareTo("Baron") == 0){ baron(player); }
			else if(attacks.get(itr).compareTo("Council_Room") == 0){ councilRoom(player); }
			else if(attacks.get(itr).compareTo("Cutpurse") == 0){ cutpurse(player); }
			else if(attacks.get(itr).compareTo("Embargo") == 0){ embargo(player); }
			else if(attacks.get(itr).compareTo("Feast") == 0){ feast(player); }
			else if(attacks.get(itr).compareTo("Gardens") == 0){ gardens(player); }
			else if(attacks.get(itr).compareTo("Mine") == 0){ mine(player); }
			else if(attacks.get(itr).compareTo("Salvager") == 0){ salvager(player); }
			else { /* nothing special to do */ }
		}
	}
	
	public void adventurer(Player player)
	{
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
	public void ambassador(Player player)
	{
		
	}
	public void baron(Player player)
	{
		System.out.printf("Hand before baron: %s\n", player.getHand());
		System.out.printf("Discard before baron: %s\n\n", player.getDiscard());
		
		Deck hand = player.getHand();
		System.out.printf("Discard an estate card to gain 4 coins: %s\n", hand);
		System.out.printf("If you would like to discard an estate card, type yes: ");
		
		Scanner in = new Scanner(System.in);
		String response = in.nextLine().toLowerCase();
		if(response.compareTo("yes") == 0)
		{
			for(int itr = 0; itr < hand.size(); itr++)
			{
				if(hand.cardAt(itr).getName() == Card.Name.Estate)
				{
					player.discard(hand.removeCard(hand.cardAt(itr)));
					player.addCoins(4);
					break;
				}
			}
		}else{
			for(Deck deck: game)
			{
				if(deck.getTopCard().getName() == Card.Name.Estate)
				{
					hand.addCardToTop(deck.draw());
				}
			}
		}
		
		System.out.printf("Hand after baron: %s\n", player.getHand());
		System.out.printf("Discard after baron: %s\n\n", player.getDiscard());	
	}
	public void councilRoom(Player player)
	{
		for(Player otherPlayers: players)
		{
			if(otherPlayers != player)
			{
				otherPlayers.draw();
			}
		}
	}
	public void cutpurse(Player player)
	{
		for(Player otherPlayer: players)
		{
			if(otherPlayer != player)
			{
				Deck hand = otherPlayer.getHand();
				for(int itr = 0; itr < hand.size(); itr++)
				{
					if(hand.cardAt(itr).getName().toString().compareTo("Copper") == 0)
					{
						otherPlayer.discard(hand.removeCard(hand.cardAt(itr)));
						break;
					}
				}
			}
			System.out.printf("%s's hand includes: %s\n", otherPlayer.username, otherPlayer.getHand());
		}
	}
	public void embargo(Player player)
	{
		System.out.printf("You played embargo, here are the decks you may embargo: \n");
		printBoard();
		
		System.out.print("Which deck would you like to embargo?: ");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		
		for(Deck deck: game)
		{
			if(deck.getTopCard().getName().toString().compareTo(choice) == 0)
			{
				Deck discarded = player.getDiscard();
				deck.toggleEmbargo();
				for(int itr = 0; itr < discarded.size(); itr++)
				{
					if(discarded.cardAt(itr).getName() == Card.Name.Embargo)
					{
						trash.addCardToTop(discarded.removeCard(discarded.cardAt(itr)));
						break;
					}
				}
				break;
			}
		}
	}
	public void feast(Player player)
	{
		for(int itr = 0; itr < player.getDiscard().size(); itr++)
		{
			Card card = player.getDiscard().getCardAt(itr);
			if(card.getName().toString().compareTo("Feast") == 0)
			{
				int tempCoins = player.getCoins();
				player.setCoins(5);
				trash.addCardToTop(player.getDiscard().removeCard(card));
				
				System.out.printf("Since you trashed your Feast, you may get a card that costs 5 or less\n");
				Scanner in = new Scanner(System.in);
				
				boolean purchase = false;
				do{
					printBoard();
					
					System.out.printf("What card you you like?: \n");
					String temp = in.nextLine();
				
					for(Deck deck: game)
					{
						if(deck.compare(temp) != null)
						{
							purchase = player.playPurchasing(deck);
							System.out.println("Did a good purchase happen? : " + purchase);
							break;
						}
					}
					if(!purchase)
					{
						System.out.println("You can only get a card costing a max of 5 coins");
					}
				}while(!purchase);
				player.setCoins(tempCoins);
			}
		}
	}
	public void gardens(Player player)
	{
		int numCards = player.getDraw().size();
		numCards += player.getDiscard().size();
		numCards += player.getHand().size();
		
		player.addPoints(numCards/10);
	}
	public void mine(Player player)
	{
		Deck temp = player.getHand().filterBy(Card.Type.Treasure);
		if(temp.size() > 0)
		{
			System.out.printf("You may trash one of your treasure cards to gain another treasure card of +3 cost. "
					+ "These are the treasures you have: %s\n", temp);
			System.out.printf("If any, besides gold, which treasure card would you like to trash?: ");
			Scanner in = new Scanner(System.in);
			String choice = in.nextLine();
			for(int itr = 0; itr < temp.size(); itr++)
			{
				Card card = temp.getCardAt(itr);
				if(card.toString().compareTo(choice) == 0)
				{
					if(card.getName() == Card.Name.Gold)
					{
						System.out.printf("Sorry you can't trash a gold card\n");
						break;
					}else{
						int value = card.getCost() + 3;
						trash.addCardToTop(temp.removeCard(card));
						for(int iter = 0; iter < game.size(); iter++)
						{
							if(value > 3 && game.get(iter).getTopCard().getName() == Card.Name.Silver)
							{
								player.getHand().addCardToTop(game.get(iter).draw());
								break;
							}else if(value  < 3 && game.get(iter).getTopCard().getName() == Card.Name.Copper)
							{
								player.getHand().addCardToTop(game.get(iter).draw());
								break;
							}else{
								continue;
							}
						}
					}
				}
			}
		}
	}
	public void salvager(Player player)
	{
		Deck hand = player.getHand();
		
		System.out.printf("You may trash a card from your hand and add it's "
				+ "cost to your buy potential, here are your cards %s\n", hand);
		
		System.out.print("Which card would you like to trash?: ");
		Scanner in = new Scanner(System.in);
		
		String choice = in.nextLine();
		for(int itr = 0; itr < hand.size(); itr++)
		{
			if(hand.cardAt(itr).getName().toString().compareTo(choice) == 0)
			{
				player.addCoins(hand.cardAt(itr).getCost());
				trash.addCardToTop(hand.removeCard(hand.cardAt(itr)));
				break;
			}
		}
	}
	
	
	public void printBoard()
	{
		for(Deck deck: game)
		{
			if(deck.size() > 0)
			{
				Card card = deck.getBottomCard();
				int cost = card.getCost();
				System.out.printf("%-15s: Costs: %2d: %2d Left\n", card.getName(), cost, deck.size());
			}
		}
	}
	
}
