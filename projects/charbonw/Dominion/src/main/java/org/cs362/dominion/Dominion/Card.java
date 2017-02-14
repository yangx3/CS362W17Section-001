package org.cs362.dominion.Dominion;

public enum Card {
	// ID("Name", Cost, Value, Victory Points)
	COPPER("Copper", 0, 1, 0, "+$1"),
	SILVER("Silver", 3, 2, 0, "+$2"),
	GOLD("Gold", 6, 3, 0, "+$3"),
	CURSE("Curse", 0, 0, -1, "-1 Victory Point"),
	ESTATE("Estate", 2, 0, 1, "1 Victory Point"),
	DUCHY("Duchy", 5, 0, 3, "3 Victory Points"),
	PROVINCE("Province", 8, 0, 6, "6 Victory Points"),
	ADVENTURER("Adventurer", 6, 0, 0, "Reveal cards from your deck until you reveal 2 Treasure cards.\n" +
	"Put those treasure cards into your hand and discard the other revealed cards.") {
		// Reveal cards from your deck until you reveal 2 Treasure cards.
		// Put those treasure cards into your hand and discard the other revealed cards.
		public boolean effect(Player p) {
			int cnt = 0;
			while (cnt < 2) {
				Card c = p.draw();
				if (c == null)
					break;
				p.reveal(c);
				if (c.type != Type.TREASURE)
					p.discard(c);
				else
					cnt++;
			}
			return true;
		}
	},
	AMBASSADOR("Ambassador", 3, 0, 0, "Reveal a card from your hand.\n" + 
	"Return up to two copies of it from your hand to the Supply.\n" + 
	"Then each other player gains a copy of it.") {
		// Reveal a card from your hand.
		// Return up to two copies of it from your hand to the Supply.
		// Then each other player gains a copy of it.
		public boolean effect(Player p) {
			if (p.getHandSize() == 0)
				return true;
			Card c = p.chooseCard();
			p.reveal(c);
			p.print("How many copies would you like to return? (0-2)\n");
			int choice = p.prompt(0, 2);
			if (choice > 0)
				p.returnSupply(c);
			if (choice > 1)
				p.returnSupply(c);
			GameState g = p.gameState;
			for (Player p0 : g.players) {
				if (p0 == p)
					continue;
				p0.gain(c);
			}
			return true;
		}
	},
	BARON("Baron", 4, 0, 0, "+1 Buy\nYou may discard an Estate card.\n" + 
	"If you do, +$4.\nOtherwise, gain an Estate card.") {
		// +1 Buy
		// You may discard an Estate card.
		// If you do, +$4.
		// Otherwise, gain an Estate card.
		public boolean effect(Player p) {
			return effect(p, 0);
		}
		
		public boolean effect(Player p, int Test) {
			int choice;
			p.addBuys(1);
			Card c = ESTATE;
			if (!p.handContains(c))
				return true;
			if (!p.gameState.loud)
				choice = p.prompt(0, 1, Test);
			else
				choice = p.prompt(0,  1);
			p.print("Discard an Estate? (y/n)\n");
			if (choice != 0) {
				p.discard(c);
				p.addMoney(4, true);
			} else {
				p.gain(c);
			}
			return true;
		}
	},
	COUNCILROOM("Council Room", 5, 0, 0, "+4 Cards; +1 Buy\nEach other player draws a card.") {
		// +4 Cards; +1 Buy
		// Each other player draws a card.
		public boolean effect(Player p) {
			for (int i = 0; i < 4; i++)
				p.draw();
			p.addBuys(1);
			GameState g = p.gameState;
			for (Player p0 : g.players) {
				if (p0 == p)
					continue;
				p0.draw();
			}
			return true;
		}
	},
	CUTPURSE("Cutpurse", 4, 0, 0, "+$2\nEach other player discards a Copper card " + 
	"(or reveals a hand with no Copper).") {
		// +$2
		// Each other player discards a Copper card (or reveals a hand with no Copper).
		public boolean effect(Player p) {
			p.addMoney(2, true);
			GameState g = p.gameState;
			Card c = COPPER;
			for (Player p0 : g.players) {
				if (p0 == p)
					continue;
				if (p0.handContains(c)) {
						p0.discard(c);
				} else {
					for (int i = 0; i < p0.getHandSize(); i++) {
						Card c0 = p0.getHand(i);
						p0.reveal(c0);
					}
				}
			}
			return true;
		}
	},
	EMBARGO("Embargo", 2, 0, 0, "+$2\nTrash this card.\nPut an Embargo token on top of a Supply pile.\n" +
	"When a player buys a card, he gains a curse card per Embargo token on that pile.") {
		// +$2
		// Trash this card.
		// Put an Embargo token on top of a Supply pile.
		// When a player buys a card, he gains a curse card per Embargo token on that pile.
		public boolean effect(Player p) {
			return effect(p, 0);
		}
		
		public boolean effect(Player p, int Test) {
			int choice;
			p.addMoney(2, true);
			GameState g = p.gameState;
			p.print("Select a Supply pile to embargo (1-" + g.supply.size() + ")");
			if (!p.gameState.loud)
				choice = p.prompt(1, g.supply.size() - 1, Test);
			else
				choice = p.prompt(1,  g.supply.size() - 1);
			g.setEmbargo(choice);
			p.trash(this);
			return false;
		}
	},
	FEAST("Feast", 4, 0, 0, "Trash this card.\nGain a card costing up to $5.") {
		// Trash this card.
		// Gain a card costing up to $5.
		public boolean effect(Player p) {
			return effect(p, 0);
		}
		
		public boolean effect(Player p, int Test) {
			GameState g = p.gameState;
			Card c;
			p.print("Gain a card from the Supply costing less than $5 (1-" + g.supply.size() + ")\n");
			int choice;
			do {
				if (!p.gameState.loud) {
					choice = p.prompt(1, g.supply.size() - 1, Test);
					Test--;
				} else {
					choice = p.prompt(1,  g.supply.size() - 1);
				}
				c = g.getFaceCard(choice);
			} while (c.cost >= 5 || g.getAmount(choice) == 0);
			p.gain(choice);
			p.trash(this);
			return false;
		}
	},
	GARDENS("Gardens", 4, 0, 0, "Worth 1 Victory Point for every 10 cards in your deck (rounded down).") {
		// Worth 1 victory point for every 10 cards in your deck (rounded down).
		public int getVictory(Player p) {
			return (p.getDeckSize() + p.getHandSize()) / 10;
		}
		
		public char getType() {
			return 'V';
		}
	},
	GREATHALL("Great Hall", 3, 0, 0, "1 Victory Point\n+1 Card; +1 Action") {
		// 1 Victory Point
		// +1 Card; +1 Action
		public boolean effect(Player p) {
			p.draw();
			p.addActions(1);
			return true;
		}
		public int getVictory(Player p) {
			return 1;
		}
	},
	MINE("Mine", 5, 0, 0, "Trash a Treasure card from your hand.\n" + 
	"Gain a Treasure card costing up to $3 more; put it into your hand.") {
		// Trash a Treasure card from your hand.
		// Gain a Treasure card costing up to $3 more; put it into your hand.
		public boolean effect(Player p) {
			return effect(p, 0);
		}
		public boolean effect(Player p, int Test) {
			boolean trashed = false;
			int cardVal = 0, choice;
			for (int i = 0; i < p.getHandSize(); i++) {
				Card c = p.getHand(i);
				if (c.type == Type.TREASURE) {
					p.print("Trash " + c.name + "? (y/n)");
					if (!p.gameState.loud)
						choice = p.prompt(0, 1, Test);
					else
						choice = p.prompt(0, 1);
					if (choice != 0) {
						cardVal = c.cost;
						p.trash(c);
						trashed = true;
						break;
					}
				}
			}
			if (!trashed)
				return true;
			GameState g = p.gameState;
			p.print("Choose a Treasure card costing up to $" + (cardVal + 3) + "\n");
			p.print("[1] Copper  $0\n[2] Silver  $3\n[3] Gold    $6\n");
			Card c;
			do {
				if (!p.gameState.loud)
					choice = p.prompt(1, 3, Test);
				else
					choice = p.prompt(1, 3);
				c = g.getFaceCard(choice + 3);
			} while (c.cost > cardVal + 3 || g.getAmount(choice + 3) == 0);
			p.gain(c);
			p.draw();
			return true;
		}
	},
	TREASUREMAP("Treasure Map", 4, 0, 0, "Trash this and another copy of Treasure Map from your hand.\n" + 
	"If you do, gain 4 Gold cards, putting them on top of your deck.") {
		// Trash this and another copy of Treasure Map from your hand.
		// If you do, gain 4 Gold cards, putting them on top of your deck.
		public boolean effect(Player p) {
			boolean copy = false;
			Card c;
			p.trash(this);
			for (int i = 0; i < p.getHandSize(); i++) {
				c = p.getHand(i);
				if (c.equals(Card.TREASUREMAP)) {
					p.trash(c);
					copy = true;
					break;
				}
			}
			if (copy) {
				p.gain(Card.GOLD);
				p.gain(Card.GOLD);
				p.gain(Card.GOLD);
				p.gain(Card.GOLD);
			}
			return false;
		}
	},
	SMITHY("Smithy", 4, 0, 0, "+3 Cards") {
		// +3 Cards
		public boolean effect(Player p) {
			p.draw();
			p.draw();
			p.draw();
			return true;
		}
	},
	VILLAGE("Village", 3, 0, 0, "+1 Card; +2 Actions") {
		// +1 Card; +2 Actions
		public boolean effect(Player p) {
			p.draw();
			p.addActions(2);
			return true;
		}
	};
	
	public final String name;
	public final int cost;
	public final int value;
	public final Type type;
	private final int victory;
	private final String desc;

	private Card(String name, int cost, int value, int victory, String desc) {
		this.name = name;
		this.cost = cost;
		this.value = value;
		this.victory = victory;
		this.desc = desc;
		if (value > 0)
			this.type = Type.TREASURE;
		else if (victory != 0)
			this.type = Type.VICTORY;
		else
			this.type = Type.ACTION;
	}
	
	public void play(Player p) {
		play(p, 0);
	}
	
	public void play(Player p, int Test) {
		p.print(p.name + " plays " + this.aOrAn() + this.name);
		p.addMoney(value);
		if (effect(p, Test))								// if card trashed, don't add to field
			p.playField(this);
	}

	// overidden inside enum
	public boolean effect(Player p) {
		return effect(p, 0);
	}
	
	public boolean effect(Player p, int Test) {
		return true;
	}

	// true: precede name with 'an'; false: 'a'
	public String aOrAn() {
		String Vowels = "AEIOU", pref;
		boolean a;
		a = (Vowels.indexOf(name.charAt(0)) >= 0);
		pref = a ? "a " : "an ";
		return pref;
	}

	public int getVictory(Player p) {
		return victory;
	}
	
	public char getType() {
		char t;
		if (type == Type.ACTION)
			t = 'A';
		else if (type == Type.TREASURE)
			t = 'T';
		else
			t ='V';
		return t;
	}

	public void getDesc(Player p) {
		p.print("Card: " + name + "\n" + desc + "\n");
	}

	public boolean equals(Card c) {
		if (!(c instanceof Card)) {
			return false;
		}
		return (name.equals(c.name));
	}
	
	public static enum Type {
		ACTION, TREASURE, VICTORY;
	}
}
