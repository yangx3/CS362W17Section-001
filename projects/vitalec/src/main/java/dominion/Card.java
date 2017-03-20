package dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public final class Card implements Comparable<Card>{

	public enum Type {
		ACTION, TREASURE, VICTORY
	}

	public enum CardName {
		/** The Treasure cards */
		COPPER("Copper"), SILVER("Silver"), GOLD("Gold"),

		/** The Victory cards */
		PROVINCE("Province"), DUCHY("Duchy"), ESTATE("Estate"), CURSE("Curse"),

		/** The Kingdom cards  2C */
		CELLAR("Cellar"), CHAPEL("Chapel"), MOAT("Moat"),

		/** Kingdom Cards - 3C */
		HARBINGER("Harbinger"), MERCHANT("Merchant"), VASSAL("Vassal"), VILLAGE("Village"), WORKSHOP("Workshop"),

		/** Kingdom Cards - 4C */
		BUREAUCRAT("Bureaucrat"), GARDENS("Gardens"), MILITIA("Militia"), MONEYLENDER("Moneylender"),
        POACHER("Poacher"), REMODEL("Remodel"), SMITHY("Smithy"), THRONE_ROOM("Throne Room"),

		/** Kingdom Cards - 5C */
		BANDIT("Bandit"), COUNCIL_ROOM("Council Room"), FESTIVAL("Festival"), LABORATORY("LABORATORY"),
        LIBRARY("Library"), MARKET("Market"), MINE("Mine"), SENTRY("SENTRY"), WITCH("Witch"),

		/** Kingdom Cards - 6C */
		ARTISAN("Artisan");


		private String name;

		CardName(String name) {
			this.name = name;
		}

		//public String getName() {
		//	return this.name;
		//}
	}
	/**
	 * @param enum CardName the name of the card (GOLD, SILVER, COPPER, 
	 * @param enum Type the type of the card (Victory, Treasure, or Kingdom
	 * @param int cost the cost of the card
	 * @param int score the score of the card, when the game is finished
	 * @param treasureValue  the treasure value of the treasure cards (copper, silver, and gold cards)
	 */
	private final Type realType;
	private final CardName cardName;
	private final int cost, score, treasureValue;

	public int getCost() { return this.cost; }

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

	public int getTreasureValue() { return treasureValue; }
	public int score(Player player) { return score; }
	
	static List<Card> createCards() {
		List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards  */
		Card o = new Card(CardName.GOLD, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.SILVER, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.COPPER, Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards  */ 
		o = new Card(CardName.PROVINCE,Type.VICTORY, 	8, 6, 0);
		ret.add(o);
		o = new Card(CardName.DUCHY,Type.VICTORY,		5, 1, 0);
		ret.add(o);		
		o = new Card(CardName.ESTATE,Type.VICTORY,		2, 3, 0);
		ret.add(o);		
		o = new Card(CardName.CURSE,Type.VICTORY,		0, -1, 0);
		ret.add(o);

		/** The Kingdom cards , it should more than 10 cards*/
		// 2* Cards
		o = new Card(CardName.CELLAR, Type.ACTION, 2, 0, 0);
		ret.add(o);
		o = new Card(CardName.CHAPEL, Type.ACTION, 2, 0, 0);
		ret.add(o);
        o = new Card(CardName.MOAT, Type.ACTION, 2, 0, 0);
        ret.add(o);

        // 3* Cards
        o = new Card(CardName.HARBINGER, Type.ACTION, 3, 0, 0);
        ret.add(o);
        o = new Card(CardName.MERCHANT, Type.ACTION, 3, 0, 0);
        ret.add(o);
        o = new Card(CardName.VASSAL, Type.ACTION, 3, 0, 0);
        ret.add(o);
        o = new Card(CardName.VILLAGE,Type.ACTION,3,0,0);
        ret.add(o);
        o = new Card(CardName.WORKSHOP, Type.ACTION, 3, 0 , 0);
        ret.add(o);


        // 4* Cards
        o = new Card(CardName.BUREAUCRAT, Type.ACTION, 4, 0, 0);
        ret.add(o);
        o = new Card(CardName.GARDENS, Type.VICTORY, 4, 0, 0);
        ret.add(o);
        o = new Card(CardName.MILITIA, Type.ACTION, 4, 0, 0);
        ret.add(o);
        o = new Card(CardName.MONEYLENDER, Type.ACTION, 4, 0, 0);
        ret.add(o);
        o = new Card(CardName.POACHER, Type.ACTION, 4, 0, 0);
        ret.add(o);
        o = new Card(CardName.REMODEL, Type.ACTION, 4, 0, 0);
        ret.add(o);
		o = new Card(CardName.SMITHY,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.THRONE_ROOM, Type.ACTION, 4, 0, 0);
		ret.add(o);

		// 5* Cards
        o = new Card(CardName.BANDIT, Type.ACTION, 5, 0, 0);
        ret.add(o);
        o = new Card(CardName.COUNCIL_ROOM, Type.ACTION, 5, 0, 0);
        ret.add(o);
        o = new Card(CardName.FESTIVAL, Type.ACTION, 5, 0 ,0);
        ret.add(o);
        o = new Card(CardName.LABORATORY, Type.ACTION, 5, 0, 0);
        ret.add(o);
        o = new Card(CardName.LIBRARY, Type.ACTION, 5, 0, 0);
        ret.add(o);
        o = new Card(CardName.MARKET, Type.ACTION, 5, 0, 0);
        ret.add(o);
        o = new Card(CardName.MINE, Type.ACTION, 5, 0, 0);
        ret.add(o);
        o = new Card(CardName.SENTRY, Type.ACTION, 5, 0, 0);
        ret.add(o);
        o = new Card(CardName.WITCH, Type.ACTION, 5, 0, 0);
        ret.add(o);

        // 6* Cards
        o = new Card(CardName.ARTISAN, Type.ACTION, 5, 0, 0);
        ret.add(o);

		return ret;
	}

	public List<Card> getByType(List<Card> cards, Type type) {
	    List<Card> matchingCards = cards.stream()
                .filter(card -> card.getType() == type)
                .collect(Collectors.toList());

	    return matchingCards;
    }
	
	public void play(Player player, GameState state) {
	    // Move card to in-play area to prevent discarding self
        player.cardsInPlay.add(player.hand.remove(player.hand.indexOf(this)));
		
		switch(this.cardName) {
            case CELLAR:
                player.numActions++;
                int numberToDiscard = Randomness.nextRandomInt(player.hand.size());
                for(int i = 0; i < numberToDiscard; i++) {
                    player.discard(Randomness.randomMember(player.hand));
                }

                for(int j = 0; j < numberToDiscard; j++) {
                    player.drawCard();
                }
                break;

            case CHAPEL:
                int numberToTrash = Randomness.nextRandomInt(player.hand.size());
                for(int i = 0; i < numberToTrash; i++) {
                    player.trashFromHand(Randomness.randomMember(player.hand));
                }
                break;

            // TODO: Implement Moat Card
            case MOAT:
                break;

            case HARBINGER:
                player.drawCard();
                player.numActions++;

                if(!player.discard.isEmpty()) {
                    Card card = Randomness.randomMember(player.discard);
                    player.deck.add(card);
                    player.discard.remove(card);
                }
                break;

            // TODO: Implement Merchant Card
            case MERCHANT:
                player.drawCard();
                player.numActions++;
                // TODO: "The first time you play a Silver this turn, +1 coin"
                break;

            // TODO: Implement Vassal Card
            case VASSAL:
//                player.coins += 2;
//                Card card = player.deck.pop();
//                player.discard.add(card);
//                if(card.getType() == Type.ACTION) {
//                    int play = Randomness.nextRandomInt(1);
//                    if(play == 1) {
//                        card.play(player, state);
//                    }
//                }
                break;

            case VILLAGE:
                player.drawCard();
                player.numActions += 2;
                break;

            case WORKSHOP:
                List<Card> cards = state.supply.entrySet().stream()
                        .filter(map -> map.getKey().getCost() <= 4)
                        .map(map -> map.getKey())
                        .collect(Collectors.toList());

                player.gainCardFromSupply(Randomness.randomMember(cards));
                break;

            case BUREAUCRAT:
                player.gainCardFromSupply(Card.getCard(state.availCards, CardName.SILVER));

                System.out.println("Bureaucrat played - Other players reveal hands.");
                state.players.forEach(plyr -> {
                    if(!player.player_username.equals(plyr.player_username)) {
                        plyr.showHand();
                    }
                });
                break;

            case GARDENS:
                // Gardens is a victory card and does not do anything until end of game.
                break;

            case MILITIA:
                player.coins += 2;

                System.out.println("Militia played - other players discard down to 3 cards.");
                state.players.forEach(plyr -> {
                    if(!player.player_username.equals(plyr.player_username)) {
                        while(plyr.hand.size() > 3) {
                            plyr.discard(Randomness.randomMember(plyr.hand));
                        }
                    }
                });
                break;

            case MONEYLENDER:
                Card copper = Card.getCard(state.availCards, CardName.COPPER);
                if(player.hand.contains(copper)) {
                    player.hand.remove(copper);
                    player.trash.add(copper);
                    player.coins += 3;
                }
                break;

            case POACHER:
                player.drawCard();
                player.numActions++;
                player.coins++;

                state.supply.forEach((crd, amount) -> {
                    if(amount == 0 && !player.hand.isEmpty()) {
                        Card randomCard = Randomness.randomMember(player.hand);
                        player.discard(randomCard);
                    }
                });
                break;

            case REMODEL:
                if(!player.hand.isEmpty()) {
                    Card randomCard = Randomness.randomMember(player.hand);
                    player.trashFromHand(randomCard);
                }
                break;

            case SMITHY:
                player.drawCard();
                player.drawCard();
                player.drawCard();
                break;

            // TODO: Implement Throne Room Card
            case THRONE_ROOM:
                break;

            // TODO: Implement Bandit Card
            case BANDIT:
//                player.gainCardFromSupply(Card.getCard(state.availCards, Card.CardName.GOLD));
//
//                state.players.forEach(plyr -> {
//                    if(!player.player_username.equals(plyr.player_username)) {
//                        boolean trashed = false;
//                        Card crd = plyr.deck.poll();
//                        if(crd.getType() == Type.TREASURE && crd.cardName != CardName.COPPER) {
//                            plyr.trash.add(crd);
//                            trashed = true;
//                        } else {
//                            plyr.discard.add(crd);
//                        }
//
//                        crd = plyr.deck.pop();
//                        if(!trashed && crd.getType() == Type.TREASURE && crd.cardName != CardName.COPPER) {
//                            plyr.trash.add(crd);
//                        } else {
//                            plyr.discard.add(crd);
//                        }
//                    }
//                });
                break;

            case COUNCIL_ROOM:
                for(int i = 0; i < 3; i++) {
                    player.drawCard();
                }

                state.players.forEach(plyr -> plyr.drawCard());
                break;

            case FESTIVAL:
                player.numActions += 2;
                player.numBuys++;
                player.coins += 2;
                break;

            case LABORATORY:
                player.drawCard();
                player.drawCard();
                player.numActions++;
                break;

            // TODO: Implement Library Card
            case LIBRARY:
                while(player.hand.size() < 7) {
                    player.drawCard();
                }
                break;

            case MARKET:
                player.drawCard();
                player.numActions++;
                player.numBuys++;
                player.coins++;
                break;

            // TODO: Implement Mine Card
            case MINE:
                break;

            // TODO: Implement Sentry Card
            case SENTRY:
                break;

            // TODO: Implement Witch Card
            case WITCH:
                player.drawCard();
                player.drawCard();

                state.players.forEach(plyr -> {
                    if(!player.player_username.equals(plyr.player_username)) {
                        plyr.gainCardFromSupply(Card.getCard(state.availCards, CardName.CURSE));
                    }
                });
                break;

            // TODO: Implement Artisan Card
            case ARTISAN:
                break;

			default:
				break;
		}

		// Move card from in-play area back to hand prior to discard
		player.hand.add(player.cardsInPlay.remove(player.cardsInPlay.indexOf(this)));

		player.discard(this);
	}

	public static Card getCard(List<Card> cards,CardName cardName) {
		for(int i=0; i<cards.size();i++){
			if(cards.get(i).cardName.equals(cardName)) {
				return 	cards.get(i);
			}
		}
		
		return null;
	}

	public static List<Card> filter(Iterable<Card> cards, Type target) {
			List<Card> out = new ArrayList<Card>();
			for (Card c : cards) {
				if (c.getType() == target) {
					out.add(c);
				}
			}
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
        if(!(obj instanceof Card)) return false;

        return cardName.equals(((Card) obj).cardName);
	}

	@Override
    public int hashCode() {
	    int hash = 5;
	    hash = hash + (this.cardName != null ? this.cardName.hashCode() : 0);
	    return hash;
    }

	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}

}
