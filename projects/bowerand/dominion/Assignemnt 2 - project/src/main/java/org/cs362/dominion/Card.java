package org.cs362.dominion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public final class Card implements Comparable<Card>, Cloneable{
    Random randomGenerator = new Random();
    Card(CardName cardName, Type type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public static enum Type {
		ACTION, TREASURE, VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Copper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse,
		/** The Kingdom cards */
		Adventurer, Ambassador, Smithy, Village, Baron, Council_Room, Cutpurse, Embargo, Feast, Gardens, Great_Hall, Mine, Salvager;
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
        public int supplyPile;

	Card(CardName cardName, Type type, int cost, int score, int treasureValue, int supplyPile) {
		this.cost = cost;
		this.score = score;
		this.treasureValue = treasureValue;
		this.realType = type;
		this.cardName = cardName;
                this.supplyPile = supplyPile;
	}

	/**
	 * Returns the type
     * @return 
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
		Card o = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3, 0);
		ret.add(o);
		o = new Card(CardName.Silver, Type.TREASURE, 3, 0, 9, 0);
		ret.add(o);
		o = new Card(CardName.Copper, Type.TREASURE, 0, 0, 1, 0);
		ret.add(o);

		/** The Victory cards  */ 
		o = new Card(CardName.Province,Type.VICTORY, 8, 6, 0, 0);
		ret.add(o);
		o = new Card(CardName.Duchy,Type.VICTORY,5, 1, 0, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY, 2, 3, 0, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY,0, -100, 0, 0);
		ret.add(o);				
		/** The Kingdom cards , it should more than 10 cards*/ 	
		
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0, 0);
		ret.add(o);
                
                o = new Card(CardName.Ambassador,Type.ACTION,3,0,0, 0);
		ret.add(o);
                o = new Card(CardName.Baron,Type.ACTION,4,0,0, 0);
		ret.add(o);
                o = new Card(CardName.Council_Room,Type.ACTION,5,0,0, 0);
		ret.add(o);
                o = new Card(CardName.Cutpurse,Type.ACTION,4,0,0, 0);
		ret.add(o);
                o = new Card(CardName.Embargo,Type.ACTION,2,0,0, 0);
		ret.add(o);
                o = new Card(CardName.Feast,Type.ACTION,4,0,0, 0);
		ret.add(o);
                o = new Card(CardName.Gardens,Type.ACTION,4,0,0, 0);
		ret.add(o);
                o = new Card(CardName.Great_Hall,Type.ACTION,3,0,0, 0);
		ret.add(o);
                o = new Card(CardName.Mine,Type.ACTION,5,0,0, 0);
		ret.add(o);
                o = new Card(CardName.Salvager,Type.ACTION,4,0,0, 0);
		ret.add(o);
                
		
                o = new Card(CardName.Smithy,Type.ACTION,4,0,0, 0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION,3,0,0, 0);
		ret.add(o);	
		return ret;
	}
	
	public void play(Player player, GameState state) {
		
		switch(this.cardName) {
		case Adventurer:
	    	  /*Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
                    System.out.println("TODO Adventurer Code******************************************");
                    System.out.println("Reveal cards from the player deck until player reveal 2 Treasure cards. " +
	    	  		"Put those Treasure cards into player hand and discard the other revealed cards.");
                  */
                    int count = 0;
                    Card temp = new Card(CardName.Copper, Type.TREASURE, 0, 0, 0, 0); // temp treasure card
                    while(count < 2) {
                        player.checkCardType(temp); // Check for treasure, adds if found
                        count++;  // increments number of teasure cards in hand - need 2
                    }
                    player.discard(this); // discard this card
                    return;
                    
                case Ambassador:
                    //NOTE: ###NOT FINISHED#######
                    player.discard(this); // discard this card
                    //int pos1 = Randomness.random.nextInt(player.hand.size());
                    int pos1 = randomGenerator.nextInt(player.hand.size());
                    int pos2 = -1;
                    
                    int ct = 0; // iterate through hand
                    int nums = 0; // we already have one of this card, we're trying to find if the player
                                  // has another of this type in their hand.
                    
                    // loop through hand, if we find a card with the same time, increase nums
                    while (ct < player.hand.size()) {
                        if(player.hand.get(ct).cardName == player.hand.get(pos1).cardName) {
                            if(ct != pos1) { // not the same card as the original - different copy of it in hand
                                nums +=1;
                                pos2 = ct;
                                break;
                            }
                        }
                        ct += 1;
                    }
                    if (nums == 0) { // add 0 or 1 of this card to supply
                        //int rnd = Randomness.random.nextInt(2);
                        int rnd = randomGenerator.nextInt(2);
                        if (rnd == 0) {
                            return;
                        }
                        else {
                        state.cards.add(player.hand.get(pos1)); // inc supply of this card by one
                        }
                    }
                    else if (nums > 1) { // add 0, 1, or 2 of this card to supply
                        //int rnd = Randomness.random.nextInt(3);
                        int rnd = randomGenerator.nextInt(3);
                        if (rnd == 0) {
                            return;
                        }
                        else if (rnd == 1) {
                            // inc supply of this card by one
                            state.cards.add(player.hand.get(pos1));
                        }
                        else {
                            state.cards.add(player.hand.get(pos1)); // inc supply of this card by one
                            state.cards.add(player.hand.get(pos2));
                        }
                        int pPos = state.players.indexOf(player);
                        ct = 0;
                        while (ct < state.players.size()) {
                            if (ct != pPos) {
                                player.gain(Card.getCard(state.cards, player.hand.get(pos1).getCardName())); // give everyone else this card
                            }
                        }
                        player.discard(player.hand.get(pos1)); // discard first copy
                        if (pos2 != -1) player.discard(player.hand.get(pos2)); // discard second copy
                    } 
                    return;
                
                case Baron:
                    player.numBuys += 1;
                    //int randOption = Randomness.random.nextInt(2); // randomly select between removing estate for $4, or gaining one
                    int randOption = randomGenerator.nextInt(2);
                    if (randOption == 0) {
                        int num = 0;
                        while (num < player.hand.size()) {
                            if(player.hand.get(num).getCardName() ==  Card.CardName.Estate) {
                                player.coins += 4;
                                player.discard(player.hand.get(num));
                            }
                            num += 1;
                        }
                        System.out.println("No Estate Cards to remove.");
                    }
                    else if (randOption == 1) {
                        player.gain(Card.getCard(state.cards, Card.CardName.Estate));
                    }
                    player.discard(this); // discard this card
                    return;
                    
                case Curse:
                    player.gain(Card.getCard(state.cards, Card.CardName.Curse));
                    player.discard(this); // discard this card
                    return;
                        
                case Council_Room:
                    player.discard(this); // discard this card
                    int n = 3;
                    while(n > 0) {
                        player.drawCard();
                        n -= 1;
                    }
                    player.numBuys += 1;
                    for(int l = 0; l < state.players.size(); l++) {
                        state.players.get(l).drawCard();
                    }
                    
                    return;
                        
                case Cutpurse:
                    player.coins += 2;
                    player.discard(this); // discard this card
                    //NOTE: ###NEED TO TEST#######
                    for(int l = 0; l < state.players.size(); l++) {
                        for(int w = 0; w < state.players.get(l).hand.size(); w++) {
                            if(state.players.get(l).hand.get(w).cardName == Card.CardName.Copper) {
                               state.players.get(l).discard(state.players.get(l).hand.get(w));
                               break;
                            }
                            else if (w == state.players.get(l).hand.size() - 1) {
                                System.out.println(state.players.get(l).player_username+" had no copper in their hand.\n");
                            }
                        }
                    }
                    return;
                        
                case Embargo:
                    player.coins += 50;
                    player.trash(this);
                    //int randcrd = Randomness.random.nextInt(20);
                    int randcrd = randomGenerator.nextInt(20);
                    state.cards.get(randcrd).supplyPile += 1;
                    return;
                
                case Feast:
                    int randCost; // 5 = number of different card costs to choose from (with same value)
                    player.trash(this);
                    //##############################################################################
                    //randCost =  (int) Randomness.random.nextInt(6); // random card cost 0-5
                    randCost = (int) randomGenerator.nextInt(6);
                    if (randCost == 0) {
                        player.gain(Card.getCard(state.cards, Card.CardName.Copper));

                    }
                    else if (randCost == 2) {
                        // randCost =  (int) Randomness.random.nextInt(2); // 2 = number of different cards to choose from (with same value)
                        randCost = (int) randomGenerator.nextInt(2);
                        if (randCost == 0) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Embargo));
                        }
                        else {
                            player.gain(Card.getCard(state.cards, Card.CardName.Estate));
                        }
                    }
                    else if (randCost == 3) {
                        //randCost =  (int) Randomness.random.nextInt(4); // 4 = number of different cards to choose from (with same value)
                        randCost = (int) randomGenerator.nextInt(4);
                        if (randCost == 0) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Ambassador));
                        }
                        else if (randCost == 1) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Great_Hall));
                        }
                        else if (randCost == 2) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Village));
                        }
                        else if (randCost == 3) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Silver));
                        }
                    }
                    else if (randCost == 4) {
                        //randCost =  (int) Randomness.random.nextInt(6); // 6 = number of different cards to choose from (with same value)
                        randCost = (int) randomGenerator.nextInt(6);
                        if (randCost == 0) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Baron));
                        }
                        else if (randCost == 1) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Cutpurse));
                        }
                        else if (randCost == 2) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Feast));
                        }
                        else if (randCost == 3) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Gardens));
                        }
                        else if (randCost == 4) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Salvager));
                        }
                        else if (randCost == 5) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Smithy));
                        }
                    }
                    else if (randCost == 5) {
                        //randCost =  (int) Randomness.random.nextInt(3); // 3 = number of different cards to choose from (with same value)
                        randCost = (int) randomGenerator.nextInt(3);
                        if (randCost == 0) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Duchy));
                        }
                        else if (randCost == 1) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Council_Room));
                        }
                        else if (randCost == 2) {
                            player.gain(Card.getCard(state.cards, Card.CardName.Mine));
                        }
                    }
                    return;
                
                case Gardens:
                    player.discard(this);
                    int j = (player.hand.size() + player.deck.size() + player.discard.size()) / 10;
                    if (j == 0) {
                        System.out.println("You don't have enough cards.");
                        return;
                    }
                    while (j > 0) {
                        player.gain(Card.getCard(state.cards, Card.CardName.Duchy));
                        j--;
                    }
                    return;
                        
                case Great_Hall:
                    player.discard(this);
                    player.gain(Card.getCard(state.cards, Card.CardName.Duchy));
                    player.drawCard();
                    player.numActions += 5;
                    return;
                        
                case Mine:
                    int num = 0;
                    while (num < player.hand.size()) {
                        if(player.hand.get(num).getType() == Card.Type.TREASURE) {
                            int cst = player.hand.get(num).cost + 3;
                            player.trash(player.hand.get(num));
                            
                            if (cst >= 6) {
                                player.gain(Card.getCard(state.cards, Card.CardName.Gold));
                            }
                            else if (cst >= 3) {
                                player.gain(Card.getCard(state.cards, Card.CardName.Silver));
                            }
                            else {
                                player.gain(Card.getCard(state.cards, Card.CardName.Copper));
                            }
                        }
                        num += 1;
                    }    
                    return;
                
                    
                case Smithy:
                 player.discard(this);
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();
			return;
                        
		case Village:
                    /*
                    System.out.println("TODO Village Code******************************************");
                    System.out.println("The player draw +1 Card.");
                    System.out.println("The player gets +2 play Actions."); */
                    player.discard(this);
                    player.drawCard();
                    player.numActions += 2;
                    return;
		
                case Salvager:
                    player.discard(this);
                    player.numBuys += 1;
                    //int x = Randomness.random.nextInt(player.hand.size()); // get random card from hand
                    int x = randomGenerator.nextInt(player.hand.size());
                    int y = player.hand.get(x).cost; // get card's cost
                    player.coins -= y; // remove $ equal to discared card's cost
                    player.trash(player.hand.get(x)); // discard random card from hand
                    return;
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
//		sb.append("-" + this.getType() + " ");
//		sb.append("\t\t Cost: " + this.cost + " ");
//		sb.append("\t\t Score: " + this.score + " ");
//		sb.append("\tTreasure Value: " + this.treasureValue);

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
