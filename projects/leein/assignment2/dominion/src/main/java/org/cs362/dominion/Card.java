package org.cs362.dominion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public final class Card implements Comparable<Card>, Cloneable{
	public static enum Type {
		ACTION, TREASURE, VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Cooper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse,Gardens,
		/** The Kingdom cards */
		Adventurer, Smithy, Village, Ambassador, Baron, Cutpurse, Council_Room, Embargo, Feast, Great_Hall, Minion, Mine;
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

	private Card(CardName cardName, Type type, int cost, int score, int treasureValue) {
		this.cost = cost;
		this.score = score;
		this.treasureValue = treasureValue;
		this.realType = type;
		this.cardName = cardName;
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
	/**
	 * Returns the cost
	 */
	public int getCost() {
		return cost;
	}


	/**
	 * Returns the treasureValue
	 */
	public int getTreasureValue() {
		return treasureValue; 
	}
	public int score() { 
			return score; 
		}
	
	public static List<Card> createCards() {
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
		o = new Card(CardName.Duchy,Type.VICTORY,		5, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY,		2, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY,		0, -1, 0);
		ret.add(o);				
		o = new Card(CardName.Gardens,Type.VICTORY,4,0,0);
		ret.add(o);
		/** The Kingdom cards , it should more than 10 cards*/ 	
		
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(CardName.Ambassador,Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(CardName.Baron,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Cutpurse,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Council_Room,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Embargo,Type.ACTION,2,0,0);
		ret.add(o);
		o = new Card(CardName.Feast,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Great_Hall,Type.ACTION,4,1,0);
		ret.add(o);
		o = new Card(CardName.Minion,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Mine,Type.ACTION,5,0,0);
		ret.add(o);
		return ret;
	}
	
	public void play(Player player, GameState state) {
		
		switch(this.cardName) {
		case Adventurer:
			  player.hand.remove(this);
			  player.discard.add(this);
			  int counter = 0;
			  while(counter<2){
				  Card fromDeck = player.drawCard();
				  if(fromDeck.getCardName() == CardName.Gold || fromDeck.getCardName() == CardName.Silver || fromDeck.getCardName() == CardName.Cooper){
					//error from drawCard() card has been added to hand
					  player.hand.add(fromDeck); //delete
					  counter++;
					  System.out.println("Player revealed " + counter + fromDeck.getCardName() +"Treasuer cards.");
				  }else{
					//error from drawCard() card has been added to hand
					//player.hand.remove(fromDeck);
					  player.discard.add(fromDeck);
					  System.out.println("Player revealed " + fromDeck.getCardName() +"card.");
					  System.out.println("This card will discarded.");
				  }
			  }	
			return;
		case Smithy:
			 player.hand.remove(this);
			 player.discard.add(this);
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();
			return;
			
		case Village:
			  player.hand.remove(this);
			  player.discard.add(this);
			  
			  player.numActions++;
			return;
		case Ambassador:
			  player.hand.remove(this);
			  player.discard.add(this);
			  if(player.hand.size()<2){
				  return;
			  }
			  int curseCounter = 0;
			  Card card = getCard(state.cards,Card.CardName.Curse);
			  for(Card c : player.hand){
				  if(c.getCardName() == cardName.Curse){
					  curseCounter++;
				  }
			  }
			  
			  if(curseCounter>1){
				  player.hand.remove(card);
				  player.hand.remove(card);
				  int cardnum = state.gameBoard.get(card);
				  cardnum = cardnum + 2;
				  state.gameBoard.put(card,cardnum);
				  
				  for(Player p : state.players){
					  if(p.player_username == player.player_username){
						  
					  }else{
						  if(cardnum>0){
							  cardnum--;
							  state.gameBoard.put(card,cardnum);
							  p.gain(card);
						  }
						  if(cardnum>0){
							  cardnum--;
							  state.gameBoard.put(card,cardnum);
							  p.gain(card);
						  }
					  }
				  }
			  }else if(curseCounter==1){
				  player.hand.remove(card);
				  int cardnum = state.gameBoard.get(card);
				  cardnum = cardnum + 1;
				  state.gameBoard.put(card,cardnum);
				  
				  for(Player p : state.players){
					  if(p.player_username == player.player_username){
						  
					  }else{
						  if(cardnum>0){
							  cardnum--;
							  state.gameBoard.put(card,cardnum);
							  p.gain(card);
						  }
					  }
				  }
				  Card randcard;
				  randcard = player.hand.get(0);
				  for(Card c : state.cards){
					  if(c.getCardName()==randcard.getCardName()){
						  randcard = c;
					  }
				  }
				  player.hand.remove(randcard);
				  cardnum = state.gameBoard.get(randcard);
				  cardnum = cardnum + 1;
				  state.gameBoard.put(randcard,cardnum);
				  
				  for(Player p : state.players){
					  if(p.player_username == player.player_username){
						  
					  }else{
						  if(cardnum>0){
							  cardnum--;
							  state.gameBoard.put(randcard,cardnum);
							  p.gain(randcard);
						  }
					  }
				  }
				  
			  }else{
				  Card randcard = player.hand.get(0);
				  for(Card c : state.cards){
					  if(c.getCardName()==randcard.getCardName()){
						  randcard = c;
					  }
				  }
				  player.hand.remove(randcard);
				  int cardnum = state.gameBoard.get(randcard);
				  cardnum = cardnum + 1;
				  state.gameBoard.put(randcard,cardnum);
				  
				  for(Player p : state.players){
					  if(p.player_username == player.player_username){
						  
					  }else{
						  if(cardnum>0){
							  cardnum--;
							  state.gameBoard.put(randcard,cardnum);
							  p.gain(randcard);
						  }
					  }
				  }
				  
				  randcard = player.hand.get(0);
				  for(Card c : state.cards){
					  if(c.getCardName()==randcard.getCardName()){
						  randcard = c;
					  }
				  }
				  player.hand.remove(randcard);
				  cardnum = state.gameBoard.get(randcard);
				  cardnum = cardnum + 1;
				  state.gameBoard.put(randcard,cardnum);
				  
				  for(Player p : state.players){
					  if(p.player_username == player.player_username){
						  
					  }else{
						  if(cardnum>0){
							  cardnum--;
							  state.gameBoard.put(randcard,cardnum);
							  p.gain(randcard);
						  }
					  }
				  }
			  }
			return;
		case Baron:
			  player.hand.remove(this);
			  player.discard.add(this);
			  
			  Card estate = getCard(state.cards,Card.CardName.Estate);
			  if(player.hand.contains(estate)){
				  player.coins = player.coins+4;
			  }else{
				  player.discard.add(estate);
				  int cardnum = state.gameBoard.get(estate);
				  cardnum--;
				  state.gameBoard.put(estate,cardnum);
			  }
			return;
		case Cutpurse:
			player.hand.remove(this);
			player.discard.add(this);
			player.coins = player.coins+2;
			Card coper = getCard(state.cards,Card.CardName.Cooper);
			for(Player p : state.players){
				  if(p.player_username == player.player_username){
					  
				  }else{
					  p.discard(coper);
				  }
			  }
			return;
		case Council_Room:
			player.hand.remove(this);
			player.discard.add(this);
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.numBuys++;
			for(Player p : state.players){
				  if(p.player_username == player.player_username){
					  
				  }else{
					  p.drawCard();
				  }
			  }
			return;
		case Embargo:
			player.hand.remove(this);
			player.coins = player.coins+2;
			state.embargoCoin++;
			return;
		case Feast:
			player.hand.remove(this);
			//player.gain(card); //gain random card costing up to 5
			int stop = 0;
			while(stop == 0){
				Card randcard;
				do{
					int ndx = (int) Randomness.nextRandomInt(state.cards.size());
					randcard = state.cards.get(ndx);
				}while(state.gameBoard.get(randcard) == null || state.gameBoard.get(randcard) <= 0);
				
				if(randcard.cost < 6){
					player.discard.add(randcard);
					int numrandcard = state.gameBoard.get(randcard);
					numrandcard = numrandcard -1;
					state.gameBoard.put(randcard,numrandcard);
					stop ++;
				}
			}
			return;
		case Great_Hall:
			player.hand.remove(this);
			player.discard.add(this);
			player.drawCard();
			player.numActions++;
			return;
		case Minion:
			player.hand.remove(this);
			player.discard.add(this);
			player.numActions++;
			int choice = Randomness.nextRandomInt(2);
			if(choice == 0){
				player.coins = player.coins + 2;
			}else{
				for(Card c : player.hand){
					player.discard.add(c);
				}
				player.hand.clear();
				for(int i = 0; i<4; i++){
					player.drawCard();
				}
				for(Player p : state.players){
						  if(p.player_username == player.player_username){
							  
						  }else{
							  if(p.hand.size()>=5){
								  for(Card c : p.hand){
										p.discard.add(c);
								  }
								  p.hand.clear();
								  for(int i = 0; i<4; i++){
										p.drawCard();
								  }  
							  }
						  }
					  }
				}
			return;
		case Mine:
			player.hand.remove(this);
			player.discard.add(this);
			int numcooper = 0;
			Card rmcooper = null;
			Card addsilver = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
			for(Card c : player.hand){
				if(c.cardName == CardName.Cooper){
					numcooper++;
					rmcooper = c;
				}
			}
			
			if(numcooper>0){
				player.hand.remove(rmcooper);
				player.discard.add(addsilver);
			}
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

		sb.append(" \n\t" + this.getCardName());
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

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}
