import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class Player {
	
	
	private List<Card> hand = new ArrayList<Card>();
	private LinkedList<Card> deck = new LinkedList<Card>();
	private List<Card> discard = new ArrayList<Card>();
	private List<Card> playedCards = new ArrayList<Card>();
	
	private int numActions; /* Starts at 1 each turn */
	private int coins; /* Coins available to buy with */
	private int numBuys; /* Starts at 1 each turn */
	
	private String PlayerUsername;
	private int PlayerNumber;
	
	public Player(String Username, int pNum, GameBoard gb)
	{
		this.PlayerUsername = Username;
		this.PlayerNumber = pNum;
		createDeck(gb);
		initPlayerTurn();
	}
	
	public String getName()
	{
		return this.PlayerUsername;
	}
	
	public int getNum()
	{
		return this.PlayerNumber;
	}
	
	public int getNumActions()
	{
		return this.numActions;
	}
	
	public int getCoins()
	{
		return this.coins;
	}
	
	public int getBuys()
	{
		return this.numBuys;
	}
	
	public List<Card> getHand()
	{
		return this.hand;
	}
	
	public LinkedList<Card> getDeck()
	{
		return this.deck;
	}
	
	public List<Card> getDiscard()
	{
		return this.discard;
	}
	
	public List<Card> getPlayedCards()
	{
		return this.playedCards;
	}
	
	private void createDeck(GameBoard gb)
	{
		for (int i = 0; i < 7; i++)
		{
			gb.takeCard(Card.copper);
			deck.add(Card.copper);
		}
		
		for (int i = 0; i < 3; i++)
		{
			gb.takeCard(Card.estate);
			deck.add(Card.estate);
		}
	}
	
	// Draw a card from the deck. Shuffle if deck is empty
	public Card drawCard()
	{
		if (deck.isEmpty())
		{
			System.out.println("Shuffling the deck of the player " + PlayerUsername + ".");
			while (discard.size() > 0)
			{
				int index = (int) Randomness.nextRandomInt(discard.size());
				deck.add(discard.remove(index));
			}
		}
		Card toDraw = deck.poll();
		hand.add(toDraw);
		System.out.println(PlayerUsername + " drew " + toDraw);
		return toDraw;
	}
	
	//Called in constructor and after each turn is over
	public void initPlayerTurn()
	{
		numActions = 1;
		coins = 0;
		numBuys = 1;
		for (int i = 0; i < 5; i++)
		{
			if (deck.size() + discard.size() > 0)
			{
				drawCard();
			}
		}
	}
	
	public void buyCard(Card c, GameBoard gb)
	{
		if (numBuys >= 1)
		{
			if (coins >= c.getCost())
			{
				for (int i = 0; i < gb.numEmbargoTokens(c); i++)
				{
					if (gb.hasCardsAvailable(Card.curse))
					{
						System.out.println(PlayerUsername + " bought card with embargo token/s.");
						gainCard(Card.curse, gb);
					}
				}
				
				System.out.println(PlayerUsername + " bought " + c);
				gb.takeCard(c);
				discard.add(c);
				coins -= c.getCost();
			}
		}
		
		numBuys --;
	}
	
	public void gainCard(Card c, GameBoard gb)
	{
		if (gb.hasCardsAvailable(c))
		{
			System.out.println(PlayerUsername + " gained " + c);
			gb.takeCard(c);
			discard.add(c);
		}

	}
	
	public void gainCardToHand(Card c, GameBoard gb)
	{
		if (gb.hasCardsAvailable(c))
		{
			System.out.println(PlayerUsername + " gained " + c);
			gb.takeCard(c);
			hand.add(c);
		}
	}

	public void Discard(Card c)
	{
		System.out.println(PlayerUsername + " discarded " + c);
		hand.remove(c);
		discard.add(c);
	}

	public void playCard(int handPos, GameBoard gb)
	{
		Card c = hand.get(handPos);
		System.out.println(PlayerUsername + " played " + c);
		playedCards.add(c);
		hand.remove(handPos);
		
		if (numActions >= 1)
		{
			switch (c) 
			{
				case adventurer: 
					//Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
					/* If no/only 1 treasure found, stop when full deck seen */
					Card card;
					int numTreasureCards = 0;
					while (numTreasureCards != 2)
					{
						if (deck.size() + discard.size() > 0)
						{
							card = drawCard();
							
							if (card.getTypes().contains("treasure"))
							{
								numTreasureCards ++;
							}
							else
							{
								hand.remove(card);
								discard.add(card);
							}
							if (deck.size() == 0)
							{
								break;
							}
						}
						
					}
					break;
				case ambassador:
					//Reveal a card from your hand. Return up to 2 copies of it from your hand to the Supply. Then each other player gains a copy of it.
					/* choice1 = hand#, choice2 = number to return to supply */
					int cardToReveal = Randomness.nextRandomInt(hand.size());
					Card revealCard = hand.get(cardToReveal);
					int numInHand = getNumberInHand(revealCard);
					int numToReturn = Randomness.nextRandomInt(numInHand);
					if (numToReturn > 2)
					{
						numToReturn = 2;
					}
					for (int i = 0; i < numToReturn; i++)
					{
						System.out.println(PlayerUsername + " returned " + revealCard);
						hand.remove(revealCard);
						gb.returnCard(revealCard);
					}
					gb.opponentGainCard(PlayerNumber, revealCard);
					
					break;
				case baron:
					//+1 Buy, You may discard an Estate for +4 coins. If you don't, gain an Estate.
					/* choice1: boolean for discard of estate */
					/* Discard is always of first (lowest index) estate */
					int estateIndex = getFirstEstate();
					numBuys += 1;
					int willDiscard = Randomness.nextRandomInt(2);
					if (estateIndex != -1)
					{
						System.out.println("Has an estate");
						if (willDiscard == 1)
						{
							System.out.println("Gaining coins");
							Discard(hand.get(estateIndex));
							coins += 8;
						}
						else
						{
							System.out.println("Gaining estate");
							gainCard(Card.estate, gb);
						}
					}
					else
					{
						System.out.println("Gaining estate");
						gainCard(Card.estate, gb);
					}
					break;
				case council_room:
					//+4 Cards, +1 Buy, Each other player draws a card.
					for (int i = 0; i < 4; i++)
					{
						if (deck.size() + discard.size() > 0)
						{
							drawCard();
						}
					}
					numBuys += 1;
					gb.opponentDraw(PlayerNumber);
					break;
				case cutpurse:
					//+2 coin, Each other player discards a Copper card (or reveals a hand with no Copper).
					coins += 2;
					gb.opponentDiscardCopper(PlayerNumber);
					break;
				case embargo:
					//+2 coins,	Trash this card. Put an Embargo token on top of a Supply pile. When a player buys a card, he gains a Curse card per Embargo token on that pile.
					/* choice1 = supply# */
					coins += 2;
					gb.trashCard(c);
					playedCards.remove(playedCards.indexOf(c));
					List<Card> activeSupplyPiles = gb.getActiveSupplyPiles();
					int supplyIndex = (int) Randomness.nextRandomInt(activeSupplyPiles.size());
					gb.placeEmbargo(activeSupplyPiles.get(supplyIndex));
					break;
				case feast:
					//Trash this card. Gain a card costing up to 5 coins.
					/* choice1 is supply # of card gained) */
					gb.trashCard(c);
					playedCards.remove(playedCards.indexOf(c));
					List<Card> cardsUpToFive = gb.getPurchaseableCards(5);
					int indexToGainFeast = (int) Randomness.nextRandomInt(cardsUpToFive.size());
					gainCard(cardsUpToFive.get(indexToGainFeast), gb);
					break;
				case great_hall:
					//+1 Card, +1 Action. Worth 1 victory point
					if (deck.size() + discard.size() > 0)
					{
						drawCard();
					}
					if (deck.size() + discard.size() > 0)
					{
						drawCard();
					}
					if (deck.size() + discard.size() > 0)
					{
						drawCard();
					}
					numActions += 2;
					break;
				case mine:
					//You may trash a Treasure from your hand. Gain a Treasure to your hand costing up to 3 coins more than it.
					/* choice1 is hand# of money to trash, choice2 is supply# of money to put in hand */
					List<Integer> indices = treasureCardIndices();
					if (indices.size() != 0)
					{
						int indexTreasureToTrash = (int) Randomness.nextRandomInt(indices.size());
						List<Card> treasuresToGain = gb.getPurchaseableCards(hand.get(indices.get(indexTreasureToTrash)).getCost() + 3, "treasure");
						gb.trashCard(hand.get(indices.get(indexTreasureToTrash)));
						hand.remove(indices.get(indexTreasureToTrash));
						hand.add(getHighestValueCard(treasuresToGain));
					}
					break;
				case remodel:
					//Trash a card from your hand. Gain a card costing up to 2 coins more than it.
					/* choice1 is hand# of card to remodel, choice2 is supply# */
					int indexToTrash = (int) Randomness.nextRandomInt(hand.size());
					gb.trashCard(hand.get(indexToTrash));
					List<Card> cardsToGain = gb.getPurchaseableCards(hand.get(indexToTrash).getCost());
					hand.remove(indexToTrash);
					int indexToGain = (int) Randomness.nextRandomInt(cardsToGain.size());
					gainCard(cardsToGain.get(indexToGain), gb);
					break;
				case smithy:
					//+3 Cards
					for (int i = 0; i < 3; i++)
					{
						if (deck.size() + discard.size() > 0)
						{
							drawCard();
						}
					}
					break;
				case salvager:
					//+1 buy, trash a card from your hand. + coins equal to its cost
					numBuys += 1;
					Card salvageCard = Randomness.randomMember(hand);
					gb.trashCard(salvageCard);
					hand.remove(hand.indexOf(salvageCard));
					coins += salvageCard.getCost();
					break;
				default:
					break;
			
			}
		}
		numActions --;
	}
	
	private List<Integer> treasureCardIndices()
	{
		List<Integer> indices = new ArrayList<Integer>();
		for (int i = 0; i < hand.size(); i++)
		{
			if (hand.get(i).getTypes().contains("treasure"))
			{
				indices.add(i);
			}
		}
		return indices;
	}
	
	private Card getHighestValueCard(List<Card> cards)
	{
		int MaxValue = 0;
		Card MaxCard = null;
		
		for (Card c : cards)
		{
			if (c.getCost() > MaxValue)
			{
				MaxValue = c.getCost();
				MaxCard = c;
			}
		}
		
		return MaxCard;
	}

	public boolean hasCard(Card c)
	{
		return hand.contains(c);
	}
	
	private int getFirstEstate()
	{
		return hand.indexOf(Card.estate);
	}
	
	public int getNumberInHand(Card c)
	{
		int count = 0;
		for (Card ca : hand)
		{
			if (ca == c)
			{
				count ++;
			}
		}
		return count;
	}
	
	public int getNumberInHand(String type)
	{
		int count = 0;
		for (Card ca : hand)
		{
			if (ca.getTypes().contains(type))
			{
				count ++;
			}
		}
		return count;
	}
	
	public List<Integer> getActionCardIndices()
	{
		List<Integer> l = new ArrayList<Integer>();
		
		for (int i = 0; i < hand.size(); i++)
		{
			if (hand.get(i).getTypes().contains("action"))
			{
				l.add(i);
			}
		}
		
		return l;
	}
	
	public boolean hasActions()
	{
		return numActions > 0;
	}
	
	public boolean hasActionCard()
	{
		boolean hasCard = false;
		for (Card c : hand)
		{
			if(c.getTypes().contains("action"))
			{
				hasCard = true;
				break;
			}
		}
		return hasCard;
	}
	
	public boolean hasBuys()
	{
		return numBuys > 0;
	}
	
	public Card getRandomBuyCard(GameBoard gb)
	{
		Card c = null;
		
		List<Card> buyableCards = gb.getPurchaseableCards(coins);
		if (buyableCards.size() > 0)
		{
			int cardToBuyIndex = Randomness.nextRandomInt(buyableCards.size());
			c = buyableCards.get(cardToBuyIndex);
		}
		
		
		return c;
	}
	
	public void discardHandAndInPlay()
	{
		for (int i = hand.size() - 1; i >= 0; i--)
		{
			discard.add(hand.get(i));
			hand.remove(i);
		}
		for (int i = playedCards.size() - 1; i >= 0; i--)
		{
			discard.add(playedCards.get(i));
			playedCards.remove(i);
		}
	}
	
	public int getTotalVictoryPoints()
	{
		int totalCards = hand.size() + deck.size() + discard.size() + playedCards.size();
		Card.gardens.setVictory(totalCards / 10);
		int victoryPoints = 0;
		for (Card c : hand)
		{
			victoryPoints += c.getVictory();
		}
		for (Card c : playedCards)
		{
			victoryPoints += c.getVictory();
		}
		for (Card c : deck)
		{
			victoryPoints += c.getVictory();
		}
		for (Card c : discard)
		{
			victoryPoints += c.getVictory();
		}
		
		Card.gardens.setVictory(0);
		
		return victoryPoints;
	}
	
	public void countTreasure()
	{
		for (int i = hand.size() - 1; i >= 0; i--)
		{
			if (hand.get(i).getTypes().contains("treasure"))
			{
				coins += hand.get(i).getTreasure();
				playedCards.add(hand.get(i));
				hand.remove(i);
			}
		}
	}
	
	// This is just used to help with unit tests
	public void addActions(int num)
	{
		numActions += num;
	}
	
	public int getTotalCards()
	{
		return deck.size() + hand.size() + discard.size() + playedCards.size();
	}
	
}
