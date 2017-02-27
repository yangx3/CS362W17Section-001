package org.cs362.dominion;
import java.io.IOException;
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
	private int emptyDecks = 0;
	private Player winner;
	private int speed = 0;
	
	
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
			throw new IndexOutOfBoundsException("Error: This game must be played by 2 - 4 players, please restart");
		}
		
		// initializing number of cards in each deck
		for(Card card: availableCards)
		{
			game.add(Builder.buildBoard(card));
		}
		
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Billy");
//		names.add("Connor");
		
		for(int itr = 0; itr < players.size(); itr++)
		{
//			players.get(itr).username = names.get(itr);
			System.out.printf("Welcome to the game %s, setting up your deck now!\n", players.get(itr).username);
			players.get(itr).setDeck(Builder.buildPlayerStartDeck());
			try { Thread.sleep(speed); } 
			catch (InterruptedException e) { e.printStackTrace(); }
			System.out.print("\033[2J\033[K\033[H");
		}
		
		
		System.out.print("\033[2J\033[K\033[H");
	}
	
	public Player aWinner()
	{
		
		if(game.size() <= 18)
		{
			//TODO: Bug 1
			int maxPoints = 1000;
			for(Player player: players)
			{
				for(int itr=0; itr < player.getDraw().size(); itr++)
				{
					try {
						player.addPoints(player.getDraw().cardAt(itr).getPoints());
					}catch(Exception e)
					{
						continue;
					}
				}
				
				for(int itr=0; itr < player.getHand().size(); itr++)
				{
					
					try {
						player.addPoints(player.getHand().cardAt(itr).getPoints());
					}catch(Exception e){
						continue;
					}
					
				}
				
				for(int itr=0; itr < player.getDiscard().size(); itr++)
				{
					try {
						player.addPoints(player.getDiscard().cardAt(itr).getPoints());
					}catch(Exception e)
					{
						continue;
					}
					
				}

				if(player.getPoints() < maxPoints)
				{
					maxPoints = player.getPoints();
					winner = player;
				}
			}
		}
		return winner;
	}
	
	public Player play()
	{
		int turn = 0;
		boolean embargoed = false;
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
				
				
				System.out.printf("Your hand includes: %s\n", player.getHand());
				
				actionsPlayed = player.playActions();
				try { Thread.sleep(speed); } 
				catch (InterruptedException e) { e.printStackTrace(); }
				
				//Attacks against other players
				if(actionsPlayed.size() > 0)
				{
					attackPlayers(actionsPlayed, player);
				}
				
				int coins = player.getCoins();
				System.out.print("\033[2J\033[K\033[H");
				System.out.printf("Welcome to the buying phase %s, you have %d coins. Here are the available cards: \n\n", player.username, coins);
				
				player.playPurchasing(game);
				
				if(embargoed == true)
				{
					for(Deck deck: game)
					{
						if(deck.compare("Curse") != null)
						{
							System.out.println("This card was embargoed, you gain a curse card.");
							player.getDiscard().addCardToTop(deck.draw());
							break;
						}
					}
				}
				System.out.print("\033[2J\033[K\033[H");
				for(int itr = 0; itr < player.getHand().size(); itr++)
				{
					player.discardTopHandCard();
				}
				if(player.getHand().size() == 0)
				{
					player.draw(5);
				}
			}
			
			countEmpties();
			turn++;
			
		}while(aWinner() == null);
		
		for(Player player: players)
		{
			System.out.printf("%s has %d points\n",player.username,player.getPoints());
		}
		
		return winner;
	}
	
	public void removeEmptyDecks()
	{
		for(int itr = 0; itr < game.size(); itr++)
		{
			if(game.get(itr).size() == 0)
			{
				game.remove(itr);
			}
		}
	}
	
	public void countEmpties()
	{
		int empty = 0;
		for(int itr = 0; itr < game.size(); itr++)
		{
			if(game.get(itr).size() == 0)
			{
				empty++;
			}
		}
		emptyDecks = empty;
	}
	
	public void attackPlayers(ArrayList<String> attacks, Player player)
	{
		for(int itr = 0; itr < attacks.size(); itr++)
		{
			if(attacks.get(itr).compareTo("Adventurer") == 0){ adventurer(player); }
			else if(attacks.get(itr).compareTo("Ambassador") == 0){ ambassador(player); }
			else if(attacks.get(itr).compareTo("Baron") == 0){ baron(player); }
			else if(attacks.get(itr).compareTo("Council_Room") == 0){ councilRoom(player); }
			else if(attacks.get(itr).compareTo("Cutpurse") == 0){ cutpurse(player); }
			else if(attacks.get(itr).compareTo("Embargo") == 0){ embargo(player); }
			else if(attacks.get(itr).compareTo("Feast") == 0){ feast(player); }
			else if(attacks.get(itr).compareTo("Gardens") == 0){ gardens(player); }
			else if(attacks.get(itr).compareTo("Mine") == 0){ mine(player); }
			else if(attacks.get(itr).compareTo("Salvager") == 0){ salvager(player); }
		}
		
	}

	public void adventurer(Player player)
	{
		int finished = 0;
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
	}
	public void ambassador(Player player)
	{
		System.out.println("You played the ambassador card. With this card you may reveal "
				+ "a card from your hand and return up to two copies of it to the Supply from "
				+ "your hand; then, each other player gains a copy.");
		
		Deck hand = player.getHand();
		if(hand.size() > 0)
		{
			String choice = player.getChoice(hand);
			System.out.printf("Here is your hand: %s\n", hand);
			System.out.printf("Which card would you like to return to the supply?: %s\n", choice);
			
			for(int itr = 0; itr < hand.size(); itr++)
			{
				if(hand.cardAt(itr).getName().toString().compareTo(choice) == 0)
				{
					Card card = hand.removeCard(hand.cardAt(itr));
					for(Deck decks: game)
					{
						int result = -1;
						try {
							result = decks.getTopCard().getName().toString().compareTo(choice);
						}catch(Exception e)
						{
							continue;
						}
						
						if(result == 0)
						{
							decks.addCardToBottom(card);
							for(Player thisPlayer: players)
							{
								if(thisPlayer != player)
								{
									thisPlayer.getDiscard().addCardToTop(decks.draw());
								}
							}
							break;
						}
					}
					break;
				}
			}
		}
		
	}
	public void baron(Player player)
	{
	
		Deck hand = player.getHand();
		System.out.printf("Discard an estate card to gain 4 coins: %s\n", hand);
		System.out.printf("If you would like to discard an estate card, type yes: ");
		
		Random random = new Random(10);
		int choice = random.nextInt(1);
		
		System.out.println(choice);
		
		if(choice == 0)
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
			
	}
	public void councilRoom(Player player)
	{
		for(Player otherPlayers: players)
		{
			if(otherPlayers != player)
			{
				//TODO: Bug 4
				otherPlayers.draw(3);
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
						//TODO: Bug 5
//						break;
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
		

		Random random = new Random(10);
		int number = random.nextInt(game.size());
		String choice = game.get(number).toString();
		
		System.out.printf("Which deck would you like to embargo?: %s\n", choice);
		
		
		for(Deck deck: game)
		{
			if(deck.size() == 0)
			{
				System.out.println("Sorry no cards left in that deck.");
				break;
			}
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
			Card card = player.getDiscard().cardAt(itr);
			if(card.getName().toString().compareTo("Feast") == 0)
			{
				int tempCoins = player.getCoins();
				player.setCoins(5);
				trash.addCardToTop(player.getDiscard().removeCard(card));
				
				System.out.printf("Since you trashed your Feast, you may get a card that costs 5 or less\n");
				
				printBoard();
				
				player.playPurchasing(game);
				
				//TODO: Bug 2
				//player.setCoins(tempCoins);
			}
		}
	}
	public void gardens(Player player)
	{
		
		int numCards = player.getDraw().size();
		numCards += player.getDiscard().size();
		numCards += player.getHand().size();
		//TODO: Bug 3
		player.addPoints(numCards*10);
	}
	public void mine(Player player)
	{
		Deck temp = player.getHand().filterBy(Card.Type.Treasure);
		if(temp.size() > 0)
		{
			System.out.printf("You may trash one of your treasure cards to gain another treasure card of +3 cost. "
					+ "These are the treasures you have: %s\n", temp);
			System.out.printf("If any, besides gold, which treasure card would you like to trash?: ");
			
			String choice = player.getChoice(temp);
			for(int itr = 0; itr < temp.size(); itr++)
			{
				Card card = temp.cardAt(itr);
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
							try {
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
							}catch(Exception e)
							{
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
		if(hand.size() > 0)
		{
			String choice = player.getChoice(hand);
			System.out.print("Which card would you like to trash?: ");
			
			for(int itr = 0; itr < hand.size(); itr++)
			{
				int result = -1;
				
				try {
					result = hand.cardAt(itr).getName().toString().compareTo(choice);
				}catch(Exception e)
				{
					break;
				}
				if(result == 0)
				{
					player.addCoins(hand.cardAt(itr).getCost());
					trash.addCardToTop(hand.removeCard(hand.cardAt(itr)));
					break;
				}
			}	
		}
	}
	
	
	public void printBoard()
	{
		for(Deck deck: game)
		{
			if(deck.size() > 0)
			{
				
				String embargo = " ";
				if(deck.embargoed == true)
				{
					embargo = "*";
				}
				Card card = deck.getBottomCard();
				int cost = card.getCost();
				System.out.printf("%s%-15s: Costs: %2d: %2d Left: \"%s\"\n", embargo, card.getName(), cost, deck.size(), card.getDescription());
			}
		}
		System.out.println("");
	}
	
}
