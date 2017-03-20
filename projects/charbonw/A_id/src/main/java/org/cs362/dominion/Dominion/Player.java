package org.cs362.dominion.Dominion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Player {
	public final String name;
	public final boolean bot;
	private int actions = 1;
	private int buys = 1;
	private int money = 0;
	private ArrayList<Card> deck = new ArrayList<Card>();
	private ArrayList<Card> discard = new ArrayList<Card>();
	private ArrayList<Card> hand = new ArrayList<Card>();
	private ArrayList<Card> field = new ArrayList<Card>();
	public GameState gameState;
	
	public Player() {
		this("testPlayer", false, new GameState(0, 0, false), 0, 0);
	}
	
	public Player(String name, boolean bot, GameState gameState, int pCopper, int pEstate) {
		this.name = name;
		this.bot = bot;
		this.gameState = gameState;
		int i;
		for (i = 0; i < pCopper; i++)
			deck.add(Card.COPPER);
		for (i = 0; i < pEstate; i++)
			deck.add(Card.ESTATE);
		cleanup();
	}
	
	public void playTurn(int turn) {
		money = 0; actions = 1; buys = 1;
		print("\nTurn " + Integer.toString(turn) + " - " + name + " (" +
		Integer.toString(getVictory()) + ")\n");
		actionPhase();
		buyPhase();
		cleanup();
	}
	
	public void actionPhase() {
		printHand();
		int cnt = hand.size(), choice;
		boolean chk = false;
		Card c;
		for (Card t : hand) {								// if there are no action cards, skip this phase
			if (t.getType() == 'A') {
				chk = true;
				break;
			}
		}
		if (!chk)
			return;
		if (!bot)
			print("Choose an Action card or enter '0' for none (1-" + cnt + "): ");
		do {
			choice = prompt(0, cnt);
			if (choice == 0)
			return;
//			choice = prompt(0, cnt) - 1;
//			if (choice == -1)
//				return;
			c = hand.get(choice);
		} while (c.getType() != 'A');
		c.play(this);
		actions--;
		if (actions > 0) {
			print("\nActions: " + actions);
			actionPhase();
		}
	}
	
	public void buyPhase() {
		int choice;
		Card c;
		boolean valid = false;
		GameState g = this.gameState;
		for (int i = 0; i < hand.size(); i++) {
			c = hand.get(i);
			if (c.type == Card.COPPER.type) {				// automatically plays Treasures
				c.play(this);
				i--;
			}
		}
		if (!bot)
			g.printBoard();
		print(name + " has $" + Integer.toString(money) + "\n");
		if (!bot) {
			print("To see a Card description, enter 'desc [i]'");
			print("Choose a Card to buy or enter '0' for none (1-" + g.supply.size() + "): ");
		}
		do {
			choice = prompt(0, g.supply.size()) - 1;
			if (choice == -1) {
				return;
			} else if (g.getFaceCard(choice).cost > money) {
				if (!bot)
					print("Insufficient funds\n");
			} else {
				valid = true;
			}
		} while (!valid);
		if (gain(choice)) {
			money -= g.getFaceCard(choice).cost;
			if (g.getEmbargo(choice))
				gain(Card.CURSE);
		}
		buys--;
		if (buys > 0)
			buyPhase();
		return;
	}
	
	public void cleanup() {
		shuffle();
		for (int i = 0; i < 5; i++)
			draw(false);
	}
	
	public Card draw() {
		return draw(true);
	}
	
	public Card draw(boolean loudDraw) {
		if (deck.size() == 0)
			return null;
		Card c = deck.get(deck.size() - 1);
		if (loudDraw)
			print(this.name + " draws " + c.aOrAn() + c.name);
		deck.remove(deck.size() - 1);
		hand.add(c);
		return c;											// returns null if deck is empty
	}
	
	public boolean gain(int index) {
		return gain(gameState.getFaceCard(index));
	}
	
	public boolean gain(Card c) {
		GameState g = this.gameState;
		if (g.removeSupply(c)) {							// decrements supply pile
			print(this.name + " gains " + c.aOrAn() + c.name);
			deck.add(c);
			return true;
		}
		return false;
	}
	
	public boolean discard(Card c) {
		if (hand.remove(c)) {								// Card can only be discarded from player hand
			discard.add(c);
			print(this.name + " discards " + c.aOrAn() + c.name);
			return true;
		}
		return false;
	}

	public boolean trash(Card c) {
		if (!hand.remove(c))
			return false;
		this.gameState.addTrash(c);
		print(this.name + " trashes " + c.aOrAn() + c.name);
		return true;
	}
	
	public void reveal(Card c) {
		print(this.name + " reveals " + c.aOrAn() + c.name);
	}
	
	public void shuffle() {
		Card c;
		while (hand.size() > 0) {
			c = hand.remove(0);
			deck.add(c);
		}
		while (discard.size() > 0) {
			c = discard.remove(0);
			deck.add(c);
		}
		while (field.size() > 0) {
			c = field.remove(0);
			deck.add(c);
		}
		Collections.shuffle(deck);
	}

	public boolean playField(Card c) {
//		if (hand.remove(c)) {
		hand.remove(c);
		field.add(c);
		return true;
//		}
//		return false;
	}
	
	public boolean returnSupply(Card c) {
		if (hand.remove(c)) {
			this.gameState.addSupply(c);
			return true;
		}
		return false;
	}
	
	// getters and setters
	public int getActions() {
		return actions;
	}
	
	public void addActions(int n) {
		print("+" + n + " Actions");
		actions += n;
	}

	public void addBuys(int n) {
		print("+" + n + " Buys\n");
		buys += n;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void addMoney(int n) {
		addMoney(n, false);
	}
	
	public void addMoney(int n, boolean loudMoney) {
		if (loudMoney)
			print("+$" + n + "\n");
		money += n;
	}
	
	public int getHandSize() {
		return hand.size();
	}
	
	public boolean handContains(Card c) {
		return hand.contains(c);
	}
	
	public Card getHand(int index) {
		return hand.get(index);
	}

	public int getDeckSize() {
		return deck.size();
	}

	public int getVictory() {
		int victory = 0;
		for (Card c : deck)
			victory += c.getVictory(this);
		for (Card c : hand)
			victory += c.getVictory(this);
		for (Card c : discard)
			victory += c.getVictory(this);
		for (Card c : field)
			victory += c.getVictory(this);
		return victory;
	}
	
	public Card chooseCard() {
		printHand();
		print("Choose a card from your hand\n");
		int choice = prompt(1, hand.size()) - 1;
		return hand.get(choice);
	}
	
	public int prompt(int min, int max) {
		return this.prompt(min,  max, -1);
	}
	
	// yes = 1; no = 0; else return integer
	public int prompt(int min, int max, int Test) {
		int botResponse = Test;
		if (botResponse == -1) {													// Test == -1 indicates random
			Random rand = new Random();
			botResponse = rand.nextInt(max) + min;
		}
		if (bot || !gameState.loud) {
			if (botResponse < min || botResponse > max)
				return max;
			return botResponse;
		}
		String input = gameState.scan.next();
		if (input.equals("y") || input.equals("yes"))
			return 1;
		if (input.equals("n") || input.equals("no"))
			return 0;
		int choice;
		try {
			if (input.contains("desc"))
				choice = Integer.parseInt(input.replaceAll("[\\D]", ""));			// clean characters to obtain index
			else
				choice = Integer.parseInt(input);
		} catch (NumberFormatException | StringIndexOutOfBoundsException e) {
			choice = prompt(min, max, botResponse);
		}
		if (choice < min || choice > max) {
			print("input out of bounds, try again\n");
			return prompt(min, max, botResponse);
		}
		if (input.contains("desc")) {
//			if (choice == 0) {
//				print("index out of range\n");
//				return prompt(min, max, botResponse);
//			}
			this.gameState.getFaceCard(choice - 1).getDesc(this);						// print description
			return prompt(min, max, botResponse);
		}
		return choice;
	}
	
	// Print hand in two columns + top card of discard pile
	public void printHand() {
		if (!gameState.loud)
			return;
		int i = 0;
		for (Card c : hand) {
			if ((i & 1) == 0)									// if i is even
				System.out.printf("[%d] %-15s", i + 1, c.name);
			else
				System.out.printf("[%d] %s%n", i + 1, c.name);
			i++;
		}
		System.out.printf("%n");
		if ((i & 1) == 1)
			System.out.printf("%n");
		if (discard.size() != 0)
			System.out.printf("Discard: %s%n%n", discard.get(discard.size() - 1).name);
	}
	
	public void print(String buffer) {
		if (!gameState.loud)
			return;
		System.out.println(buffer);
	}
	
	// Test Methods
	public void clean() {
		shuffle();
		while (deck.size() > 0)
			deck.remove(0);
		addBuys(1 - getBuys());
		addActions(1 - getActions());
		addMoney(-getMoney());
	}
	
	public void addDeck(Card c) {
		deck.add(c);
	}
	
	public void addHand(Card c) {
		hand.add(c);
	}
	
	public void addField(Card c) {
		field.add(c);
	}
	
	public void addDiscard(Card c) {
		discard.add(c);
	}

	public int getFieldSize() {
		return field.size();
	}

	public int getDiscardSize() {
		return discard.size();
	}
	
	public int getBuys() {
		return buys;
	}
}
