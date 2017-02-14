package cs362.dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public final class Card implements Comparable<Card>{
	public enum Type {
		ACTION, TREASURE, VICTORY;//, ACTION_ATTACK, ACTION_VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Cooper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse,
		/** The Kingdom cards */
		Adventurer, Smithy, Village, Steward, Garden, Mine, Embargo,
		Ambassador, Baron, Council_Room, Cutpurse, Feast, Great_Hall;

	}
	/**
	 * @param enum CardName the name of the card (GOLD, SILVER, COPPER, 
	 * @param enum Type the type of the card (Victory, Treasure, or Kingdom
	 * @param int cost the cost of the card
	 * @param int score the score of the card, when the game is finished
	 * @param treasureValue  the treasure value of the treasure cards (cooper, silver, and gold cards)
	 */
	private final Type realType;
	private final CardName cardName;
	private final int cost, score, treasureValue;

	public int getCost() {
		return cost;
	}

	Card(CardName cardName, Type type, int cost, int score, int treasureValue) {
		this.cost = cost;
		this.score = score;
		this.treasureValue = treasureValue;
		this.realType = type;
		this.cardName = cardName;
	}

	public static int countCardName(List<Card> cards,CardName cardName) {
		int count = 0;
		for(int i=0; i<cards.size();i++){
			if(cards.get(i).cardName.equals(cardName))
				count++;
		}
		return count;
	}

	/**
	 * Returns the type
	 */
	public Type getType() {
		return realType;
	}

	/**
	 * Returns the cardName
	 */
	public CardName getCardName() {
		return cardName;
	}

	public int getTreasureValue() { return treasureValue; }
	public int score(Player player) { return score; }

	static List<Card> createCards() {
		List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards  */
		Card o = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.Cooper, Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards  */ 
		o = new Card(CardName.Province,Type.VICTORY, 	8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy,Type.VICTORY,		5, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY,		0, -1, 0);
		ret.add(o);				
		/** The Kingdom cards , it should more than 10 cards*/ 	
		//Card(CardName cardName, Type type, int cost, int score, int treasureValue)
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(CardName.Embargo, Type.ACTION,2,0,0);
		ret.add(o);
		o = new Card(CardName.Mine, Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Garden, Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Steward, Type.ACTION, 3,0,0);
		ret.add(o);
		o = new Card(CardName.Great_Hall, Type.ACTION,3,1,0);
		ret.add(o);
		o = new Card(CardName.Feast, Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Cutpurse,Type.ACTION, 4,0,0);
		ret.add(o);
		o = new Card(CardName.Council_Room, Type.ACTION, 5, 0,0);
		ret.add(o);
		o = new Card(CardName.Baron, Type.ACTION, 4, 0,0);
		ret.add(o);
		o = new Card(CardName.Ambassador, Type.ACTION, 3, 0,0);
		ret.add(o);
		
		return ret;
	}

	public void play(Player player, GameState state) {

		boolean pchoice = true; //This references choices a player can make when presented a card effect choice. For AI usage.

		switch(this.cardName) {
		case Adventurer:
			//Reveal cards from your deck until you reveal 2 Treasure cards.
			//Put those Treasure cards into your hand and discard the other revealed cards.
			//System.out.println("Reveal cards from the player deck until player reveal 2 Treasure cards. " +
			//		"Put those Treasure cards into player hand and discard the other revealed cards.");
			int pushed = 0;
			while(!player.deck.isEmpty() && pushed < 2){
				Card pulled = player.deck.removeFirst();

				if(pulled.realType == Card.Type.TREASURE){
					player.hand.add(pulled);
					pushed++;
				}else{
					//TODO IMPLEMENT REVEAL METHOD FOR PRINTING REVEALED CARD.
					//HAVE INPUT FOR WHICH CARD IS BEING PLAYED"	    			  
					player.discard.add(pulled);
				}
			}
			//Keep pulling cards till empty or 2 Treasure Cards
			//For Each pull
			//If treasure card, put in handpush
			//else, card goes to player's discard
			return;
		case Smithy:
			player.drawCard();
			player.drawCard();
			player.drawCard();
			return;

		case Village:
			//System.out.println("The player draw +1 Card.");
			//System.out.println("The player gets +2 play Actions.");
			player.numActions += 2;
			player.drawCard();
			return;

		case Embargo:
			//+Coin2.png
			//Trash this card. Put an Embargo token on top of a Supply pile.
			//When a player buys a card, he gains a Curse card per Embargo token on that pile.
			player.coins += 2;
			state.trashPile.add(this);
			for(Entry<Card, Integer> key: state.gameBoard.entrySet()){
				if(state.gameBoard.get(key.getKey()) > 0){
					int n = state.embargoTokens.get(key.getKey()) + 1;
					state.embargoTokens.put(key.getKey(), n);
					break;
				}
			}
			return;
		case Steward:
			int choice = Randomness.nextRandomInt(3);
			//PLAYER DECISION RANDOM

			//CHOOSE +2 CARDS OR +2 COIN OR TRASH 2 FROM HAND
			if(choice == 0){
				player.drawCard();
				player.drawCard();
				player.drawCard();
			}else if(choice == 1){
				player.coins += 2;
			}else{
				//Player chose 
				for(int i=0;i<2;i++){
					Card trash_pull = player.hand.remove(i);
					state.trashPile.add(trash_pull);
				}
			}


			return;
		case Mine:
			//You may trash a Treasure from your hand.
			//Gain a Treasure to your hand costing up to Coin3.png more than it.
			//System.out.println("You may trash a treasure from your hand and gain a treasure worth up to 3 more than what was trashed.");

			pchoice = true;
			//ANOTHER PLAYER DECISION
			if(pchoice){
				for(int i = 0; i < player.hand.size(); i++){
					if(player.hand.get(i).getType() == Type.TREASURE){
						Card trash_pull = player.hand.remove(i);
						int mine_gain_lim = trash_pull.cost + 3;

						for(Map.Entry<Card, Integer> entry: state.gameBoard.entrySet()){
							//ANOTHER PLAYER DECISION
							Card gain = entry.getKey();
							if(gain.getType() == Type.TREASURE &&
									gain.cost <= mine_gain_lim &&
									entry.getValue() > 0){

								int n = state.gameBoard.get(gain);
								state.gameBoard.put(gain, n - 1); //Decrement and pull from selected kingdom card pile
								player.hand.add(gain);
								break;
							}
						}
						break;
					}
				}
			}
			return;

		case Garden:
			return;
		case Ambassador:
			//Reveal a card from your hand.
			//Return up to 2 copies of it from your hand to the Supply.
			//Then each other player gains a copy of it.
			//PLAYER DECISION
			int revealPick = Randomness.nextRandomInt(player.hand.size());
			Card reveal = player.hand.get(revealPick);
			System.out.println(player.player_username + " reveals " + reveal);
			
			int reveable_n = 0;
			for(Card c : player.hand){
				if(c == reveal){
					reveable_n++;
				}
			}
			
			int return_up_to_n = Randomness.nextRandomInt(reveable_n > 2? 2: reveable_n);
			for(int i = 0; i < return_up_to_n;i++){
				player.hand.remove(player.hand.indexOf(reveal));
				int putback = state.gameBoard.get(reveal) + 1;
				state.gameBoard.put(reveal, putback);
			}
			
			for(Player p : state.players){
				if(p != player){
					p.gain(reveal, false);
				}
			}
			return;
		case Baron:
			player.numBuys += 1;
			pchoice = true;
			//PLAYER DECISION
			Card estate = Card.getCard(state.cards, CardName.Estate);
			if(pchoice && player.hand.contains(estate)){
				player.discard(estate);
				player.coins+=4;
			}else{
				player.gain(estate, false);
			}
			
			return;
		case Council_Room:
			for(int i = 0; i < 3;i++){
				player.drawCard();				
			}
			player.numBuys++;

			for(Player p : state.players){
				if(p != player){
					p.drawCard();
				}
			}
			return;
		case Cutpurse:
			player.coins += 2;
			Card Cooper = Card.getCard(state.cards, CardName.Cooper);
			for(Player p: state.players){
				if(p!=player){
					if(p.hand.contains(Cooper)){
						p.discard(Cooper);
					}else{
						System.out.println("CUTPURSE ACTIVE EFFECT");
						p.revealHand();
					}
				}
			}
			return;
		case Feast:
			int index = player.hand.indexOf(this);
			player.hand.remove(index);
			state.trashPile.add(this);
			//PLAYER DECISION
			for(Map.Entry<Card, Integer> entry: state.gameBoard.entrySet()){
				Card gain = entry.getKey();
				if(gain.cost <= 5 &&
						entry.getValue() > 0){
					int n = state.gameBoard.get(gain);
					state.gameBoard.put(gain, n - 1); //Decrement and pull from selected kingdom card pile
					player.hand.add(gain);
					break;
				}
			}
			
			return;
		case Great_Hall:
			player.numActions += 1;
			player.drawCard();
			return;
			
		default: return;
		}
	}

	public static Card getCard(List<Card> cards,CardName cardName) {
		for(int i=0; i<cards.size();i++){
			if(cards.get(i).cardName.equals(cardName))
				return 	cards.get(i);
		}

		return null;



	}

	public static List<Card> filter(Iterable<Card> cards, Type target) {
		List<Card> out = new ArrayList<Card>();
		for (Card c : cards)
			if (c.getType() == target)
				out.add(c);
		return out;
	}
	// this method will print out all the constant cards ENUM
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" \t" + this.getCardName());
		sb.append("-" + this.getType() + " ");
		sb.append("\t\t Cost: " + this.cost + " ");
		sb.append("\t\t Score: " + this.score + " ");
		sb.append("\tTreasure Value: " + this.treasureValue);

		return sb.toString();

	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!super.equals(obj)) return false;
		if(!(obj instanceof Card)) return false;

		return cardName.equals(((Card) obj).cardName);
	}

	public int compareTo(Card o) {
		return cardName.compareTo(o.cardName);
	}


}
