package org.cs362.dominion.Dominion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameState {
	public boolean loud;
	private int turn = 0;
	private int sEstate = 12;
	private int sDuchy = 12;
	private int sProvince = 12;
	private int sCopper = 60;
	private int sSilver = 40;
	private int sGold = 30;
	private int sKingdom = 10;
	private int sCurse = 10;
	private int pCopper = 7;
	private int pEstate = 3;
	public ArrayList<Player> players = new ArrayList<Player>();
	public ArrayList<Supply> supply = new ArrayList<Supply>();
	public ArrayList<Card> trash = new ArrayList<Card>();
	public Scanner scan = new Scanner(System.in);

	// Class for Supply stacks
	public class Supply {
		private final Card faceCard;
		private int amount;
		private boolean embargo;
		
		private Supply() {
			this(Card.CURSE);
		}
		
		private Supply(Card c) {
			this(c, 0);
		}
		
		private Supply(Card c, int n) {
			faceCard = c;
			amount = n;
		}

		public boolean equals(Supply s) {
			return (this.faceCard.equals(s.faceCard));
		}
		
		public int getAmount() {
			return amount;
		}
		
		public void addAmount(int n) {
			amount += n;
			if (amount < 0)
				amount = 0;
		}
		
		public Card getFaceCard() {
			return faceCard;
		}
		
		public boolean embargo() {
			return embargo;
		}
		
		public void setEmbargo() {
			embargo = true;
		}
	}
	
	public GameState(int nPlayers, int nBots, boolean loud) {
		int i;
		this.loud = loud;
		if (nPlayers == 2) {									// games of two use 8 of each VC
			sEstate = 8;
			sDuchy = 8;
			sProvince = 8;
		} else if (nPlayers >= 5) {								// games of 5-6 use double Treasure
			sProvince += (nPlayers - 4) * 3;
			sCopper *= 2;
			sSilver *= 2;
			sGold *= 2;
		}
		sCurse = (nPlayers - 1) * 10;
		sCopper -= nPlayers * pCopper;
		sEstate -= nPlayers * pEstate;
		
		Supply s1 = new Supply(Card.ESTATE, sEstate);
		Supply s2 = new Supply(Card.DUCHY, sDuchy);
		Supply s3 = new Supply(Card.PROVINCE, sProvince);
		Supply s4 = new Supply(Card.CURSE, sCurse);
		Supply s5 = new Supply(Card.COPPER, sCopper);
		Supply s6 = new Supply(Card.SILVER, sSilver);
		Supply s7 = new Supply(Card.GOLD, sGold);
		supply.add(s1);
		supply.add(s2);
		supply.add(s3);
		supply.add(s4);
		supply.add(s5);
		supply.add(s6);
		supply.add(s7);
		
		// Proven by James Gosling to be the most efficient way to pick Kingdom cards
		List<Integer> kingdomCards = new ArrayList<Integer>();
		for (i = 0; i < 13; i++) {
			kingdomCards.add(i);
		}
		Supply sCase = new Supply();
		Collections.shuffle(kingdomCards);
		for (i = 0; i < sKingdom; i++) {
			int tmp = kingdomCards.get(i);
			switch(tmp) {
				case 0:
					sCase = new Supply(Card.ADVENTURER, 10);
					break;
				case 1:
					sCase = new Supply(Card.AMBASSADOR, 10);
					break;
				case 2:
					sCase = new Supply(Card.BARON, 10);
					break;
				case 3:
					sCase = new Supply(Card.COUNCILROOM, 10);
					break;
				case 4:
					sCase = new Supply(Card.CUTPURSE, 10);
					break;
				case 5:
					sCase = new Supply(Card.EMBARGO, 10);
					break;
				case 6:
					sCase = new Supply(Card.FEAST, 10);
					break;
				case 7:
					sCase = new Supply(Card.GARDENS, 10);
					break;
				case 8:
					sCase = new Supply(Card.GREATHALL, 10);
					break;
				case 9:
					sCase = new Supply(Card.MINE, 10);
					break;
				case 10:
					sCase = new Supply(Card.SMITHY, 10);
					break;
				case 11:
					sCase = new Supply(Card.TREASUREMAP, 10);
					break;
				case 12:
					sCase = new Supply(Card.VILLAGE, 10);
					break;
			}
			supply.add(sCase);
		}
		sortSupply();
		
		String playerName;
		String bot[] = {"Lord Rattington",
					 	"Revenge Witch",
					 	"Lord Voldebot",
					 	"Bad Advisor",
					 	"Scout Rush"};
		for (i = 0; i < nPlayers - nBots; i++) {
			if (loud)
				playerName = playerName(i + 1);
			else
				playerName = "test" + i;
			Player p = new Player(playerName, false, this, pCopper, pEstate);
			players.add(p);
		}
		for (i = 0; i < nBots; i++) {
			Player b = new Player(bot[i], true, this, pCopper, pEstate);
			players.add(b);
		}
	}
	
	private String playerName(int n) {
		System.out.printf("Enter name for Player %d: ", n);
		String input = scan.next();
		return input;
	}
	
	// shallow copy constructor
	private Supply supplyCopy(Supply s) {
		return new Supply(s.getFaceCard(), s.getAmount());
	}
	
	// sorts the Action cards by cost
	public void sortSupply() {
		int floor = 7, cost = 2;
		Supply s = new Supply();
		Supply tmp = new Supply();
		while (cost <= 6) {
			for (int i = 7; i < supply.size(); i++) {
				s = supply.get(i);
				if (s.getFaceCard().cost == cost) {
					tmp = supply.get(floor);
					supply.set(floor, supplyCopy(s));
					supply.set(i, supplyCopy(tmp));
					floor++;
				}
			}
			cost++;
		}
	}

	public boolean removeSupply(Card c) {
		for (Supply s : supply) {
//			if (c == s.getFaceCard() && s.getAmount() != 0) {
			if (c == s.getFaceCard()) {
				s.addAmount(-1);
				return true;
			}
		}
		return false;
	}
	
	public boolean addSupply(int index) {
		supply.get(index).addAmount(1);
		return true;
	}
	
	public boolean addSupply(Card c) {
		Supply s = new Supply(c);
		for (Supply s0 : supply) {
			if (s.equals(s0)) {
				s0.addAmount(1);
				return true;
			}
		}
		return false;
	}
	
	public boolean getEmbargo(int index) {
		return supply.get(index).embargo();
	}
	
	public void setEmbargo(int index) {
		supply.get(index).setEmbargo();
	}
	
	public Card getFaceCard(int index) {
		return supply.get(index).getFaceCard();
	}
	
	public int getAmount(int index) {
		return supply.get(index).amount;
	}

	public void addTrash(Card c) {
		trash.add(c);
	}
	
	public boolean newTurn() {
		turn++;
		for (Player p : players) {
			p.playTurn(turn);
			if (gameEnd())
				return false;
		}
		return true;
	}
	
	// Game ends if Provinces or any three supply piles are reduced to zero
	public boolean gameEnd() {
		if (getAmount(2) == 0)									// Provinces exhausted
			return true;
		int cnt = 0;
		for (int i = 0; i < supply.size(); i++) {				// three supplies exhausted
			if (getAmount(i) == 0)
				cnt++;
		}
		if (cnt >= 3) {
			findWinner();
			return true;
		}
		return false;
	}
	
	public void findWinner() {
		int max = -64;
		String winner = "myself";
		for (Player p : players) {
			String line = String.format("%s has %d Victory Points%n", p.name, p.getVictory());
			p.print(line);
			if (p.getVictory() >= max) {
				max = p.getVictory();
				winner = p.name;
			}
		}
		System.out.printf("Congratulations, %s!%n", winner);
		scan.close();
	}
	
	public void printBoard() {
		if (!loud)
			return;
		System.out.printf("%n%s %s %s %-15s %s%n", "Index", "Cost", "Type", "Card", "Remain");
		System.out.printf("--------------------------------------%n");
		for (int i = 0; i < supply.size(); i++) {
			Card c = supply.get(i).getFaceCard();
			char e = supply.get(i).embargo() ? '*' : ' ';			// indicates embargo
			System.out.flush();
			if (i == 4 || i == 7)
				System.out.printf("--------------------------------------%n");
			if (i < 9) {
				System.out.printf("[%d]%c  $%-3d %-4c %-15s %d%n", i + 1, e, c.cost, c.getType(), c.name, getAmount(i));
			}
			else
				System.out.printf("[%d]%c $%-3d %-4c %-15s %d%n", i + 1, e, c.cost, c.getType(), c.name, getAmount(i));
		}
		System.out.printf("--------------------------------------%n%n");
	}
	
	// Test Methods
	public int getTrashSize() {
		return trash.size();
	}
	
	public void clean() {
		for (int  i = 0; i < supply.size(); i++)
			supply.get(i).addAmount(-supply.get(i).getAmount());
	}
}
