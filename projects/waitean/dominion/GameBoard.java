package waitean.DominionMaven;
import java.util.ArrayList;

public class GameBoard {
	private ArrayList<Pile> piles;
	private ArrayList<Player> players;
	
	public GameBoard(ArrayList<Player> newPlayers) {
		piles = new ArrayList<Pile>();
		players = new ArrayList<Player>();
		initializeGame(newPlayers);
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	public ArrayList<Pile> getPiles() {
		return piles;
	}
	
	public void initializeGame(ArrayList<Player> newPlayers) {
		piles.clear();
		players.clear();
		int nP = newPlayers.size();
		if (nP < 2 || nP > 6) {
			return;
		} 
		for (Player p : newPlayers) {
			p.setGameBoard(this);
			players.add(p);
		}
		int victoryToAdd;
		if (nP == 2) {
			victoryToAdd = 8;
		} else {
			victoryToAdd = 10;
		}
		piles.add(new Pile(new Card(Card.CardName.Province, Card.CardType.VICTORY, 8), victoryToAdd));
		piles.add(new Pile(new Card(Card.CardName.Duchy, Card.CardType.VICTORY, 5), victoryToAdd));
		piles.add(new Pile(new Card(Card.CardName.Estate, Card.CardType.VICTORY, 2), victoryToAdd));
		piles.add(new Pile(new Card(Card.CardName.Curse, Card.CardType.VICTORY, 0), (nP-1)*10));
		piles.add(new Pile(new Card(Card.CardName.Gold, Card.CardType.TREASURE, 6), 30));
		piles.add(new Pile(new Card(Card.CardName.Silver, Card.CardType.TREASURE, 3), 40));
		piles.add(new Pile(new Card(Card.CardName.Copper, Card.CardType.TREASURE, 0), 60));
		ArrayList<Card> kingdomCards = Card.getKingdomCards();
		for (Card c : kingdomCards) {
			if (c.getType() == Card.CardType.VICTORY)
				piles.add(new Pile(c, 8));
			else
				piles.add(new Pile(c, 10));
		}
	}//End of initialize game
	
	public Pile getCardFromPiles(Card.CardName name) {
		for (Pile p : piles) {
			if (p.getCard().getName().equals(name))
				return p;
		}
		return null;
	}//End of get card from piles
	
	public ArrayList<Pile> filterPiles(Card.CardType type) {
		ArrayList<Pile> ret = new ArrayList<Pile>();
		for (Pile p : piles) {
			if (p.getCard().getType().equals(type))
				ret.add(p);
		}
		return ret;
	}//end of filter piles by type
	
	public ArrayList<Pile> filterPiles(int cost) {
		ArrayList<Pile> ret = new ArrayList<Pile>();
		for (Pile p : piles) {
			if (p.getCard().getCost() <= cost)
				ret.add(p);
		}
		return ret;
	}//End of filter piles by cost
	
	public ArrayList<Player> getWinners() {
		int winningScore = 0;
		ArrayList<Player> winners = new ArrayList<Player>();
		for (Player p : players) {
			if (p.getScore() > winningScore) {
				winners.clear();
				winners.add(p);
				winningScore = p.getScore();
			} else if (p.getScore() == winningScore) {
				winners.add(p);
			}
		}
		return winners;
	}//End of get winners
	
	public boolean isGameOver() {
		int numEmptyPiles = 0;
		for (Pile p : piles) {
			if (p.getNumber() == 0)
				numEmptyPiles+=1;
			if (p.getCard().getName() == Card.CardName.Province)
				if (p.getNumber() == 0)
					return true;
		}
		if (numEmptyPiles >= 3) 
			return true;
		return false;
	}//End of isGameOver
	
	public void play() {
		while (!isGameOver()) {
			for (Player p : players) {
				System.out.print(this);
				System.out.print(p.getName() + " is taking their turn!");
				System.out.print(p);
				p.startTurn();
			}
		}
		printWinner();
	}
	
	public void printWinner() { 
		ArrayList<Player> winners = getWinners();
		if (winners.size() > 1) {
			System.out.println("There was a tie!");
			for (Player p : winners) {
				System.out.println(p.getName() + " with a score of " + p.getScore());
			}
		} else {
			System.out.println("We have a winner!");
			System.out.println(winners.get(0).getName() + " with a score of " + winners.get(0).getScore());
		}
	}//End of print winner
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("----Game Board----\n");
		for (Pile p : piles) {
			sb.append(p.toString() + "\n");
		}
		sb.append("----Game Board----");
		return sb.toString();
	}
}
