package dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public final class Card implements Comparable < Card >, Cloneable{
	public static enum Type {
		ACTION,
		TREASURE,
		VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold,
		Silver,
		Copper,
		/** The Victory cards */
		Province,
		Duchy,
		Estate,
		Curse,
		Gardens,
		/** The Kingdom cards */
		Adventurer,
		Smithy,
		Village,
		Baron,
		Council_Room,
		Feast,
		Mine,
		Great_Hall,
		Cutpurse,
		Ambassador,
		Embargo,
		Remodel,
		Salvager,
		Steward;
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
	private final int cost,
	score,
	treasureValue;

	Card(CardName cardName, Type type, int cost, int score, int treasureValue) {
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

	public int getTreasureValue() {
		return treasureValue;
	}
	public int getCost() {
		return cost;
	}
	public int score(Player player) {
		if (this.cardName == CardName.Gardens) {
			Integer scoreGarden = (player.hand.size() + player.discard.size() + player.deck.size()) / 10;
			//System.out.println("garden value:" + scoreGarden);
			return scoreGarden;
		} else {
			return score;
		}
	}

	static List < Card > createCards() {
		List < Card > ret = new LinkedList < Card > ();

		/** The Treasure cards  */
		Card o = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.Copper, Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards  */
		o = new Card(CardName.Province, Type.VICTORY, 8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy, Type.VICTORY, 5, 3, 0);
		ret.add(o);
		o = new Card(CardName.Estate, Type.VICTORY, 2, 1, 0);
		ret.add(o);
		o = new Card(CardName.Curse, Type.VICTORY, 0, -1, 0);
		ret.add(o);
		o = new Card(CardName.Gardens, Type.VICTORY, 4, 0, 0);
		ret.add(o);
		//Awkward Duals
		o = new Card(CardName.Great_Hall, Type.ACTION, 4, 1, 0); // BUG HERE
		ret.add(o);
		/** The Kingdom cards , it should more than 10 cards*/

		o = new Card(CardName.Adventurer, Type.ACTION, 6, 0, 0);
		ret.add(o);
		o = new Card(CardName.Smithy, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Village, Type.ACTION, 3, 0, 0);
		ret.add(o);
		o = new Card(CardName.Baron, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Council_Room, Type.ACTION, 5, 0, 0);
		ret.add(o);
		o = new Card(CardName.Feast, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Mine, Type.ACTION, 5, 0, 0);
		ret.add(o);
		o = new Card(CardName.Cutpurse, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Ambassador, Type.ACTION, 3, 0, 0);
		ret.add(o);
		o = new Card(CardName.Embargo, Type.ACTION, 2, 0, 0);
		ret.add(o);
		o = new Card(CardName.Remodel, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Salvager, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Steward, Type.ACTION, 3, 0, 0);
		ret.add(o);
		
		return ret;
	}

	public void play(Player player, GameState state) {

		switch (this.cardName) {
			case Adventurer:
				player.discard(Card.getCard(state.cards, CardName.Adventurer));
				//System.out.println("Reveal cards from the player deck until player reveal 2 Treasure cards. Put those Treasure cards into player hand and discard the other revealed cards.");
				int found = 0;
				while (found < 2) {
					Card checker = player.drawCard();
					if (checker.getType().equals(Type.TREASURE)) {
						found++;
					} else {
						player.discard(checker);
					}
				}

				return;

			case Smithy:
				player.discard(Card.getCard(state.cards, CardName.Smithy));
				//System.out.println("The player draw +3 Card.");
				for (int i = 0; i < 3; i++) {
					player.drawCard();
				}

				return;

			case Village:
				player.discard(Card.getCard(state.cards, CardName.Village));
				//System.out.println("The player draw +1 Card. The player gets +2 Actions.");
				player.drawCard();
				player.numActions += 2;

				return;

				//REQUIRED
			case Baron:
				player.discard(Card.getCard(state.cards, CardName.Baron));
				//System.out.println("+1 Buy. You may discard an Estate for +4 Coins. If you don't, gain an Estate.");
				player.numBuys++;
				if (player.hand.contains(Card.getCard(state.cards, Card.CardName.Estate))) {
					switch((int)Randomness.nextRandomInt(2)){
						case 0:
							return;
						case 1:
							player.discard(Card.getCard(state.cards, Card.CardName.Estate));
							player.coins += 4;
							return;
					}
					return;
				}
				else {
					state.pollPile(player, Card.getCard(state.cards, Card.CardName.Estate));
				}
				return;
				//4-Action

			case Council_Room:
				player.discard(Card.getCard(state.cards, CardName.Council_Room));
				//System.out.println("+4 Cards. +1 Buy. Each other player draws a card.");
				for (int i = 0; i < 3; i++) { // BUG HERE
					player.drawCard();
				}
				player.numBuys++;
				for (Player active: state.players) {
					active.drawCard();
				}
				//5-Action
				return;

			case Feast:
				//System.out.println("Trash this card. Gain a card costing up to 5 Coins.");
				List < Card > affordableCards = Card.priceCheck(state.pileRetrieve(), 5);
				player.trash(Card.getCard(state.cards, Card.CardName.Feast));
				Card feasting = Randomness.randomMember(affordableCards);
				state.pollPile(player,feasting);
				//4-Action
				return;

			case Mine:
				player.discard(Card.getCard(state.cards, CardName.Mine));
				//System.out.println("You may trash a Treasure from your hand. Gain a Treasure to your hand costing up to 3 Coins more than it");
				List < Card > treasureCards = Card.filter(player.hand, Type.TREASURE);

				if (treasureCards.size() == 0){
					return;
				}
				else{
					switch((int)Randomness.nextRandomInt(2)){
						case 0:
							return;
						case 1:
							Card mining = Randomness.randomMember(treasureCards);
							player.trash(mining);
							List < Card > minableCards = Card.priceCheck(Card.filter(state.pileRetrieve(),Type.TREASURE),(mining.getCost() + 3));
							state.pollPile(player,Randomness.randomMember(minableCards));
							return;
					}
				}
				//Check implementation
				
				return;

			case Great_Hall:
				player.discard(Card.getCard(state.cards, CardName.Great_Hall));
				//System.out.println("+1 Card. +1 Action.");
				player.drawCard();
				player.numActions++;
				//4-Action/Victory
				return;

			case Cutpurse:
				player.discard(Card.getCard(state.cards, CardName.Cutpurse));
				//System.out.println("+2 Coins. Each other player discards a Copper card (or reveals a hand with no Copper)");
				player.coins += 2;
				for (Player active: state.players) {
					//System.out.println(active.toString());
					if (!active.player_username.equals(player.player_username)) {
						//System.out.println(active.toString());
						if (active.hand.contains(Card.getCard(active.hand, CardName.Copper))) {
							//System.out.println(active.toString());
							active.discard(Card.getCard(active.hand, CardName.Copper)); // BUG HERE
							//System.out.println(active.toString());
						}
					}
				}
				//4-Action/Attack
				return;

			case Ambassador:
				player.discard(Card.getCard(state.cards, CardName.Ambassador));
				//System.out.println("Reveal a card from your hand. Return up to 2 copies of it from your hand to the Supply. Then each other player gains a copy of it.");
				Card ambassadoring = Randomness.randomMember(player.hand);
				List < Card > ambassadorPiles = new ArrayList < Card > (state.gameBoard.keySet());
				Card ambassadorPile = Card.getCard(ambassadorPiles, ambassadoring.getCardName());
				switch((int)Randomness.nextRandomInt(2)){
					case 0:
						break;
					case 1:
						player.trash(ambassadoring);
						state.gameBoard.put(ambassadorPile,(state.gameBoard.get(ambassadorPile) + 1));
						if (player.hand.contains(ambassadoring)) {
							switch((int)Randomness.nextRandomInt(2)){
								case 0:
									break;
								case 1:
									player.trash(ambassadoring);
									state.gameBoard.put(ambassadorPile,(state.gameBoard.get(ambassadorPile) + 1));
									break;
						}
					}
					break;
				}
				
				
				for (Player active: state.players) {
					if (!active.player_username.equals(player.player_username)) {
						state.pollPile(active,ambassadorPile);
					}
				}
				//3-Action/Attack
				return;
				//Check implementation

			case Embargo:
				//System.out.println("+2 Coins. Trash this card. Put an Embargo token on top of a Supply pile. When a player buys a card, he gains a Curse card per Embargo token on that pile.");
				player.coins +=2;
				
				player.trash(Card.getCard(state.cards, Card.CardName.Embargo));
				Card embargoChoice = Randomness.randomMember(state.cards);
				List < Card > embargoPiles = new ArrayList < Card > (state.embargoTokens.keySet());
				Card embargoing = Card.getCard(embargoPiles, embargoChoice.cardName);
				//System.out.println(embargoing.toString());
				//System.out.println(state.embargoTokens.get(embargoing));
				state.embargoTokens.put(embargoing,(state.embargoTokens.get(embargoing) + 1));
				//System.out.println(state.embargoTokens.toString());
				//2-Action
				return;
									
				//PICK 3 FROM THE ONES BELOW#################				
				
			case Remodel:
				player.discard(Card.getCard(state.cards, CardName.Remodel));
				//System.out.println("Played: " + this.toString());System.out.println("Trash a card from your hand. Gain a card costing up to 2 Coins more than it.");
				if(player.hand.size() == 0){
					return;
				}
				Card remodeling = Randomness.randomMember(player.hand);
				player.trash(remodeling);
				List < Card > remodelCards = new ArrayList < Card > (Card.priceCheck(state.pileRetrieve(),remodeling.getCost()+2));
				if(remodelCards.size() == 0){
					return;
				}
				state.pollPile(player,Randomness.randomMember(remodelCards));				
				//4-Action
				return;
			
			case Salvager:
				player.discard(Card.getCard(state.cards, CardName.Salvager));
				//System.out.println("+1 Buy. Trash a card from your hand. Get Coins equal to its cost.");
				player.numBuys ++;
				Card salvaging = Randomness.randomMember(player.hand);
				player.trash(salvaging);
				player.coins += salvaging.getCost();
				//4-Action
				return;

			case Steward:
				//System.out.println("Choose one: +2 Cards; or +2 Coins; or trash 2 cards from your hand.");
				player.discard(Card.getCard(state.cards, CardName.Steward));
				switch((int)Randomness.nextRandomInt(3)){
					case 0:
						player.drawCard();
						player.drawCard();
						return;
					case 1:
						player.coins +=2;
						return;
					case 2:
						for(int i = 0; i<2; i++){
							if(player.hand.size() != 0){
								player.trash(Randomness.randomMember(player.hand));
								
							}
						}
						return;
				}
				//3-Action
				return;
											
			/*
			case Tribute:
				System.out.println("The player to your left reveals then discards the top 2 cards of his deck. For each differently named card revealed, if it is an - Action Card: +2 Actions - Treasure Card: +2 Coins - Victory Card: +2 Cards");
				//5-Action
				return;

			case Outpost:
				System.out.println("You only draw 3 cards (instead of 5) in this turn's Clean-up phase. Take an extra turn after this one. This can’t cause you to take more than two consecutive turns.");
				//5-Action/Duration
				return;
				
			case Sea_Hag:
				System.out.println("Each other player discards the top card of his deck, then gains a Curse card, putting it on top of his deck.");
				//4-Action/Attack
				return;
				
			case Treasure_Map:
				System.out.println("Trash this and another copy of Treasure Map from your hand. If you do trash two Treasure Maps, gain 4 Gold cards, putting them on top of your deck.");
				//4-Action
				return;
			*/
			default:
				return;

		}
	}

	public static Card getCard(List < Card > cards, CardName cardName) {
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).cardName.equals(cardName))
				return cards.get(i);
		}

		return null;



	}

	public static List < Card > filter(Iterable < Card > cards, Type target) {
		List < Card > out = new ArrayList < Card > ();
		for (Card c: cards)
			if (c.getType() == target)
				out.add(c);
		return out;
	}
	// this method will print out all the constant cards ENUM
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" " + this.getCardName());
		//sb.append("-" + this.getType() + " ");
		//sb.append("\t\t Cost: " + this.cost + " ");
		//sb.append("\t\t Score: " + this.score + " ");
		//sb.append("\tTreasure Value: " + this.treasureValue);

		return sb.toString();

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (!(obj instanceof Card)) return false;

		return cardName.equals(((Card) obj).cardName);
	}

	public static List < Card > priceCheck(Iterable < Card > cards, Integer price) {
		List < Card > out = new ArrayList < Card > ();
		for (Card c: cards)
			if (c.getCost() <= price)
				out.add(c);
		return out;
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}
	protected Object clone() throws CloneNotSupportedException {
		return (Card) super.clone();
	}

}