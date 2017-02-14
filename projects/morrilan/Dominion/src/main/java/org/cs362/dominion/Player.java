// Last updated 1/28/2017
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Player extends JPanel
{
	private double IMGSCALE = .75;
	private DrawPile drawPile;
	private DiscardPile discardPile;
	private int drawCount;
	private int dicardCount;
	private int size = 50;
	private Hand hand;
	private int actionCount, buyCount, coins, selectCard; 
	private JButton nextPhase;
	private MouseListener selectListener;
	private JLabel[] handLabel;
	private int selectX, selectY, selectWidth, selectHeight;
	private Random gen;

	//Sets up Player Cards
	public Player(Card[] dr)
	{
		drawPile = new DrawPile(dr);
		discardPile = new DiscardPile();
		int countCopper = 0;
		int countEstate = 0;
		gen = new Random();

		// verifies the startCards
		for (int i = 0; i < dr.length; i++)
		{
			if ("Estate" == dr[i].getName())
			{
				countEstate++;
			}
			else
			{
				countCopper++;
			}
			//sop("Draw Piles: " + dr[i].getName());
			
		}
		sop(" Copper: " + countCopper + "\n Estate: " + countEstate);
		actionCount = 1;
		buyCount = 1;
		// sets intial selecter position to be off screen
		selectX = -500;
		selectY = -500;
		// startup for each player
		hand = new Hand();
		drawCard(5);
		nextPhase = new JButton("Next Phase!");
		
		drawPile.setScale(IMGSCALE);
		// addListeners before Draw
		addListeners();
		draw();
		revalidate();
	}

	// ***************
	// Turn Mechanics!
	// ***************

	// Rewrite as separate turns.
	// Probably going to writeinto GameBoard instead.
	// Will still keep track of number of actionCount and buyCount
	// public void turn()
	// {
	// 	// Player Action Turn
	// 	while (actionCount > 0)
	// 	{
	// 		actionCount--;
	// 	}
	// 	// Player Buy Turn
	// 	while (buyCount > 0)
	// 	{
	// 		buyCount--;
	// 	}
	// 	// Player Cleanup Phase
	// 	hand.cleanup();
	// 	drawCard(5);
	// 	actionCount = 1;
	// 	buyCount = 1;
	// }

	public int getActionCount()
	{
		return actionCount;
	}
	public void removeActionCount()
	{
		actionCount--;
	}
	public void addActionCount()
	{
		actionCount++;
	}
	public void addActionCount(int addAction)
	{
		actionCount += addAction;
	}
	public int getBuyCount()
	{
		return buyCount;
	}
	public void removeBuyCount()
	{
		buyCount--;
	}
	public void addBuyCount()
	{
		buyCount++;
	}
	public void addBuyCount(int addBuy)
	{
		buyCount += addBuy;
	}
	public void cleanup()
	{
		actionCount = 1;
		buyCount = 1;
		// returns current hand to discard
		discard(hand.cleanup());
		drawCard(5);
	}
	public int getCoins()
	{
		return hand.getCoins();
	}
	public void setCoins(int change)
	{
		hand.setCoins(change);
	}


	// ***************************
	// Card Mechanics and Methods!
	// ***************************

	public void drawCard()
	{
		// if cards have been diminished below a certain amount? (Fix in final version, known error 1) 
		// Fixed error through tracing. tempCard Referred to the card that was null after deck swapping.
		//  It created a null value in the Hand after shuffling the discard pile
		Card tempCard = drawPile.drawCard();
		if (tempCard != null)
		{
			hand.addCard(tempCard);
		}
		else
		{
			swapDeck();
			tempCard = drawPile.drawCard();
			hand.addCard(tempCard);
		}
	}

	public void drawCard(int drawNum)
	{
		// if cards have been diminished below a certain amount? (Fix in final version, known error 1 part 2)
		for (int i = 0; i < drawNum; i++)
		{
			drawCard();
		}
	}
	public void addCard(Card card)
	{
		discardPile.discard(card);
	}

	public void swapDeck()
	{
		// calls Discards shuffle, then adds the discardPile to the drawPile;
		// Note: make sure to take care of possible nulls
		int numCards = discardPile.getNumDiscard();
		Card[] tempCards = discardPile.shuffle();
		
		drawPile.setDeck(tempCards, numCards);
	}

	// Discards a card from the hand, Handles null cards
	public void discard(Card card)
	{
		if (card != null)
		{
			discardPile.discard(card);
			sop("Discarding " + card.getName());
		}
	}
	public Card discard()
	{
		Card tempCard = hand.getSelected(selectCard);
		if (tempCard != null)
		{
			// sends the removed card to the discardPile
			discardPile.discard(hand.removeSelectedCard(selectCard));
		}
		// may be null
		return tempCard;
	}
	public void discard(Card[] cards)
	{
		for (int i = 0; i < cards.length; i++)
		{
			discard(cards[i]);
		}
	}
	public void discardRandom()
	{
		int randomIndex = gen.nextInt(hand.getLength());
		discardPile.discard(hand.removeCard(randomIndex));
	}
	// Trashes a card from the hand
	public void trash(Card card)
	{
		// Empty until null stops working.
	}
	public Card getSelected()
	{
		return hand.getSelected(selectCard);
	}
	public int getNumCards()
	{
		return hand.getNumCards();
	}
	public boolean hasCard(Card card)
	{
		return hand.contains(card);
	} 

	// **************************************
	// From here down is all component stuff!
	// **************************************

	// Adds and organizes DrawPile, Hand, and DiscardPile, respectively.
	public void draw()
	{
		//System.out.println("Adding DrawPile");
		handLabel = new JLabel[7];
		add(drawPile.getLabel(), BorderLayout.WEST);
		//System.out.println("DrawPile Added");
		handLabel[0] = hand.getleftLabel();
		handLabel[0].addMouseListener(selectListener);
		add(handLabel[0], BorderLayout.CENTER);
		//add(hand.getleftLabel(), BorderLayout.CENTER);
		for (int i = 0; i < 5; i++)
		{
			handLabel[i + 1] = hand.gethandLabel(i);
			handLabel[i + 1].addMouseListener(selectListener);
			add(handLabel[i + 1], BorderLayout.CENTER);
		}
		handLabel[6] = hand.getrightLabel();
		handLabel[6].addMouseListener(selectListener);
		add(handLabel[6], BorderLayout.CENTER);
		add(discardPile.getLabel(), BorderLayout.EAST);
		//selectWidth = 
	}
	// Holds all the listeners in one place.
	public void addListeners()
	{
		selectListener = new MouseListener()
		{
			@Override
			public void mouseReleased(MouseEvent e){}

			@Override
			public void mousePressed(MouseEvent e) 
			{
				// gets the clicked Card
				Object obj = e.getSource();
				if (obj == hand.getleftLabel())
				{
					hand.scroll(false);
				}
				else if (obj == hand.gethandLabel(0))
				{
					//hand.removeCard(0);
					selectCard = 0;
					System.out.println("Card 1");
					selectX = hand.gethandLabel(0).getX();
					selectY = hand.gethandLabel(0).getY();
				}
				else if (obj == hand.gethandLabel(1))
				{
					// hand.removeCard(1);
					selectCard = 1;
					System.out.println("Card 2");
					selectX = hand.gethandLabel(1).getX();
					selectY = hand.gethandLabel(1).getY();
				}
				else if (obj == hand.gethandLabel(2))
				{
					// hand.removeCard(2);
					selectCard = 2;
					System.out.println("Card 3");
					selectX = hand.gethandLabel(2).getX();
					selectY = hand.gethandLabel(2).getY();
				}
				else if (obj == hand.gethandLabel(3))
				{
					//hand.removeCard(3);
					selectCard = 3;
					System.out.println("Card 4");
					selectX = hand.gethandLabel(3).getX();
					selectY = hand.gethandLabel(3).getY();
				}
				else if (obj == hand.gethandLabel(4))
				{
					// hand.removeCard(4);
					selectCard = 4;
					System.out.println("Card 5");
					selectX = hand.gethandLabel(4).getX();
					selectY = hand.gethandLabel(4).getY();
				}
				else if (obj == hand.getrightLabel())
				{
					hand.scroll(true);
				}
				
				size = 200;
				repaint();
				revalidate();
			}
			@Override
			public void mouseExited(MouseEvent e){}

			@Override
			public void mouseEntered(MouseEvent e){}

			@Override
			public void mouseClicked(MouseEvent e){}
		};
	}

	// Makes Life Easier
	public static void sop(String words)
	{
		System.out.println(words);
	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		//page.drawCircle(100, 100);
		page.fillRect(selectX, selectY-10, 150, 350);
		//Rectangle r = new Rectangle(xPos,yPos,width,height);
		//paint();
	}	

}