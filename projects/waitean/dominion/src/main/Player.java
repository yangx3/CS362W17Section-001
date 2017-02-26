package waitean.DominionMaven;
import java.util.ArrayList;

public class Player {
	ArrayList<Card> hand;
	ArrayList<Card> deck;
	ArrayList<Card> discard;
	ArrayList<Card> play;
	int actions, buys, treasure;
	String playerName;
	GameBoard board;
	
	public Player(String name) {
		hand = new ArrayList<Card>();
		deck = new ArrayList<Card>();
		discard = new ArrayList<Card>();
		play = new ArrayList<Card>();
		board = null;
		String playerName = new String(name);
		initializePlayer();
	}
	
	public String getName() {
		return playerName;
	}
	
	public ArrayList<Card> getHand() {
		return hand;
	}
	
	public void addTreasure(int t) {
		this.treasure += t;
	}
	
	public void addActions(int a) {
		this.actions+=a;
	}
	
	public void addBuys(int b) {
		this.buys+=b;
	}
	
	public void initializePlayer() {
		hand.clear();
		deck.clear();
		discard.clear();
		play.clear();
		actions = 0;
		buys = 0;
		treasure = 0;
		for (int i = 0; i < 7; i++) {
			deck.add(new Card(Card.CardName.Copper, Card.CardType.TREASURE, 0));
		}
		for (int i = 0; i < 3; i++) {
			deck.add(new Card(Card.CardName.Estate, Card.CardType.VICTORY, 2));
		}
		shuffle(deck);
		for (int i = 0; i < 5; i++) {
			draw();
		}
	}
	
	public void setGameBoard(GameBoard b) {
		this.board = b;
	}
	
	public int getScore() {
		int score = 0;
		int numGardens = 0;
		int numCards = 0;
		for (Card c : hand) {
			numCards+=1;
			if (c.getName().equals(Card.CardName.Gardens))
				numGardens+=1;
			score+= Card.getScoreCard(c);
		}
		for (Card c : deck) {
			numCards+=1;
			if (c.getName().equals(Card.CardName.Gardens))
				numGardens+=1;
			score+= Card.getScoreCard(c);
		}
		for (Card c : discard) {
			numCards+=1;
			if (c.getName().equals(Card.CardName.Gardens))
				numGardens+=1;
			score+= Card.getScoreCard(c);
		}
		return (score + (numCards/10)*numGardens);
	}
	
	public void shuffle(ArrayList<Card> cards) {
		int locToAdd;
		Card cardToAdd;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j<cards.size()/2;j++) {
				locToAdd = j+cards.size()/2;
				cardToAdd = cards.get(0);
				cards.remove(0);
				cards.add(locToAdd, cardToAdd);
			}
		}
	}//End of shuffle function. It riffle shuffles the deck
	
	public void draw() {
		if (deck.size() == 0) {
			for (Card c : discard) {
				deck.add(c);
				discard.remove(c);
			}
			shuffle(deck);
		}
		if (deck.size() == 0)
			return;
		Card cardToDraw = deck.get(0);
		deck.remove(0);
		hand.add(0, cardToDraw);
	}//End of draw function
	
	public void startTurn() {
		this.actions = 1;
		this.buys = 1;
		this.treasure = 0;
		playKingdomCards();
		playTreasureCards();
		buyCards();
		endTurn();
	}
	
	public void playKingdomCards() {
		ArrayList<Card> actionCards = Card.filterCards(hand, Card.CardType.ACTION);
		for (Card c : actionCards) {
			if (this.actions > 0) {
				c.play(this, board);
				play.add(c);
				hand.remove(c);
			}
		}
	}//End of playKingdomCards
	
	public void playTreasureCards() {
		ArrayList<Card> actionCards = Card.filterCards(hand, Card.CardType.TREASURE);
		for (Card c : actionCards) {
			c.play(this, board);
			play.add(c);
			hand.remove(c);
		}
	}
	
	public void buyCards() {
		ArrayList<Pile> availablePiles;
		int cardsToBuy;
		while (this.buys > 0) {
			availablePiles = board.filterPiles(this.treasure);
			cardsToBuy = availablePiles.get(0).buyCard(this.treasure);
			for (int i = 0; i < cardsToBuy; i++) {
				if (i == 0) {
					discard.add(availablePiles.get(0).aquireCard());
				} else {
					discard.add(board.getCardFromPiles(Card.CardName.Curse).aquireCard());
				}
			}
		}
	}
	
	public void endTurn() {
		for (Card c : play) {
			discard.add(c);
			play.remove(c);
		}
		for (Card c : hand) {
			discard.add(c);
			hand.remove(c);
		}
		for (int i = 0; i < 5; i++) {
			draw();
		}
	}
	
	public Card drawToAdventurer() {
		if (deck.size() == 0) {
			for (Card c : discard) {
				deck.add(c);
				discard.remove(c);
			}
			shuffle(deck);
		}
		if (deck.size() == 0) {
			return null;
		}
		Card cardToDraw = deck.get(0);
		deck.remove(0);
		return cardToDraw;
	}
	
	public void discard(Card c) {
		discard.add(c);
	}
	
	public void addToHand(Card c) {
		hand.add(c);
	}
	
	public void removeFromHand(Card c) {
		hand.remove(c);
	}
	
	public void addToPlay(Card c) {
		play.add(c);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(playerName + "\n");
		sb.append("Discard: " + discard.size() + "\n");
		sb.append("Deck: " + deck.size() + "\n");
		for (Card c : hand) {
			sb.append(c.toString() + " ");
		}
		return sb.toString();
	}
}
