import java.util.ArrayList;
import java.util.List;

import org.junit.Test;




public class RandomTestDominionTest {
	
	@Test
	public  void randomTester()
	{
		for (int i = 1; i < 5; i++)
		{
		   int seed = i * 10;
		   Randomness.reset(seed);
		   
		   List<Integer> possiblePlayerNums = new ArrayList<Integer>();
		   possiblePlayerNums.add(2);
		   possiblePlayerNums.add(3);
		   possiblePlayerNums.add(4);
		   int numPlayers = Randomness.randomMember(possiblePlayerNums);
	       
	       GameBoard gb = new GameBoard(numPlayers, seed);
	       
	       int playerTurn = 0;
	       int totalCards;
	       Card c;
			List<Integer> actionCardIndices;
			while (!gb.gameDone())
			{
				//Action Phase
				while (gb.getPlayers().get(playerTurn).hasActions() && gb.getPlayers().get(playerTurn).hasActionCard())
				{
					actionCardIndices = gb.getPlayers().get(playerTurn).getActionCardIndices();
					if (actionCardIndices.size() > 0)
					{
						int indexToPlay = Randomness.nextRandomInt(actionCardIndices.size());
						c = gb.getPlayers().get(playerTurn).getHand().get(actionCardIndices.get(indexToPlay));
						gb.getPlayers().get(playerTurn).playCard(actionCardIndices.get(indexToPlay), gb);
						assertTrue(effectHappened(c,gb.getPlayers().get(playerTurn), gb), gb.getPlayers().get(playerTurn));
					}
				}
				
				//Buy Phase
				gb.getPlayers().get(playerTurn).countTreasure();
				while (gb.getPlayers().get(playerTurn).hasBuys())
				{
					if (gb.getPurchaseableCards(gb.getPlayers().get(playerTurn).getCoins()).size() > 0)
					{
						c = gb.getPlayers().get(playerTurn).getRandomBuyCard(gb);
						if (c != null)
						{
							totalCards = gb.getPlayers().get(playerTurn).getTotalCards();
							gb.getPlayers().get(playerTurn).buyCard(c, gb);
							assertTrue(totalCardsIncreased(gb.getPlayers().get(playerTurn), totalCards), gb.getPlayers().get(playerTurn));
						}
					}
				}
				
				//Clean-up Phase
				gb.getPlayers().get(playerTurn).discardHandAndInPlay();
				assertTrue(gb.getPlayers().get(playerTurn).getHand().size() == 0 && gb.getPlayers().get(playerTurn).getPlayedCards().size() == 0, gb.getPlayers().get(playerTurn));
				gb.getPlayers().get(playerTurn).initPlayerTurn();
				assertTrue(gb.getPlayers().get(playerTurn).getHand().size() == 5 || (gb.getPlayers().get(playerTurn).getHand().size() < 5 && gb.getPlayers().get(playerTurn).getDeck().size() == 0 && gb.getPlayers().get(playerTurn).getDiscard().size() == 0), gb.getPlayers().get(playerTurn));
				
				//Move to next player
				playerTurn ++;
				if (playerTurn >= gb.getPlayers().size())
				{
					playerTurn = 0;
				}
				
			}
			
			gb.displayFinalScores();
		}
	   }
	   
	   public static boolean effectHappened(Card c, Player p, GameBoard gb)
	   {
		   switch (c) 
			{
				case adventurer: 
					//Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
					/* If no/only 1 treasure found, stop when full deck seen */
					if (p.getDeck().size() == 0 || p.getNumberInHand("treasure") >= 2)
					{
						return true;
					}
					else
					{
						return false;
					}
					
				case ambassador:
					//Reveal a card from your hand. Return up to 2 copies of it from your hand to the Supply. Then each other player gains a copy of it.
					/* choice1 = hand#, choice2 = number to return to supply */
					return true;
					
				case baron:
					//+1 Buy, You may discard an Estate for +4 coins. If you don't, gain an Estate.
					/* choice1: boolean for discard of estate */
					/* Discard is always of first (lowest index) estate */
					if (p.getBuys() > 1 && (p.getCoins() >= 4 || p.getDiscard().contains(Card.estate) || !gb.hasCardsAvailable(Card.estate)))
					{
						return true;
					}
					else
					{
						return false;
					}
					
				case council_room:
					//+4 Cards, +1 Buy, Each other player draws a card.
					if (p.getHand().size() >= 4 && p.getBuys() > 1)
					{
						return true;
					}
					else
					{
						return false;
					}
					
				case cutpurse:
					//+2 coin, Each other player discards a Copper card (or reveals a hand with no Copper).
					if (p.getCoins() >= 2)
					{
						return true;
					}
					else
					{
						return false;
					}
					
				case embargo:
					//+2 coins,	Trash this card. Put an Embargo token on top of a Supply pile. When a player buys a card, he gains a Curse card per Embargo token on that pile.
					/* choice1 = supply# */
					if (p.getCoins() >= 2)
					{
						return true;
					}
					else
					{
						return false;
					}
					
				case feast:
					//Trash this card. Gain a card costing up to 5 coins.
					/* choice1 is supply # of card gained) */
					if (p.getDiscard().size() >= 1)
					{
						return true;
					}
					else
					{
						return false;
					}
					
					
				case great_hall:
					//+1 Card, +1 Action. Worth 1 victory point
					if (p.getNumActions() >= 1)
					{
						return true;
					}
					else
					{
						return false;
					}
					
				case mine:
					//You may trash a Treasure from your hand. Gain a Treasure to your hand costing up to 3 coins more than it.
					/* choice1 is hand# of money to trash, choice2 is supply# of money to put in hand */
					return true;
					
				case remodel:
					//Trash a card from your hand. Gain a card costing up to 2 coins more than it.
					/* choice1 is hand# of card to remodel, choice2 is supply# */
					if (p.getDiscard().size() > 0)
					{
						return true;
					}
					else
					{
						return false;
					}
					
				case smithy:
					//+3 Cards
					if (p.getHand().size() >= 3)
					{
						return true;
					}
					else
					{
						return false;
					}
					
				case salvager:
					//+1 buy, trash a card from your hand. + coins equal to its cost
					if (p.getBuys() > 1)
					{
						return true;
					}
					else
					{
						return false;
					}
					
				default:
					return false;
			}
		   
	   }
	   
	   public static boolean totalCardsIncreased(Player p, int prev)
	   {
		   return p.getTotalCards() > prev;
	   }
	   
	   public static void assertTrue(boolean b, Player p)
	   {
		   if (b)
		   {
				System.out.println("TEST SUCCESSFULLY PASSED");
				System.out.println(p.getName() + " has:");
				System.out.println(p.getBuys() + " buys");
				System.out.println(p.getCoins() + " coins");
				System.out.println(p.getNumActions() + " actions");

		   }
		   else
		   {
			    System.out.println("TEST FAILED");
			    System.out.println(p.getName() + " has:");
				System.out.println(p.getBuys() + " buys");
				System.out.println(p.getCoins() + " coins");
				System.out.println(p.getNumActions() + " actions");
		   }
	   }
}
