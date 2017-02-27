// Last updated 2/08/2017
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;


public class SupplyPile extends JPanel
{
	private Random gen;
	private Card[] Supply;
	private int numPlayers;
	private int[] cardsRemaining;
	private int SUPPLY_X, SUPPLY_Y = 1;
	private double IMGSCALE = .5;
	private int cardSize_x;
	private int cardSize_y;
	private int selectX = -200;
	private int selectY = 0;
	//private JButton testbtn;
	private JLabel[] supplyLabel;
	private ImageIcon[] supplyImage;
	private MouseListener selectListener;
	private int selectCard = -1;
	public SupplyPile(Card[] possiblePiles, int num)
	{
		//testbtn = new JButton("Supply Test");
		//add(testbtn, BorderLayout.CENTER);
		//Declarations
		gen = new Random();
		//setLayout(new GridLayout(0, 5));
		//So I don't have to cast to int everytime I use cardSize
		double temp;
		temp = 200*IMGSCALE;
		cardSize_x = (int)temp;
		temp = 320*IMGSCALE;
		cardSize_y = (int)temp;
		System.out.println("CardSize : (" + cardSize_x + ", " + cardSize_y + ")");
		numPlayers = num;


		Supply = new Card[17];
		supplyLabel = new JLabel[Supply.length];
		supplyImage = new ImageIcon[Supply.length];

		// sets Curse, Treasure and Victory Cards into Supply
		// for (int i = 0; i < 7; i++)
		// {
		// 	Supply[i] = possiblePiles[i];
		// }
		// suffles cards, randomizes KingdomCards
		possiblePiles = shuffle(possiblePiles, 7, possiblePiles.length);
		// adds the selected cards to a separate array for safe keeping.
		for (int i = 0; i < 17; i++)
		{
			Supply[i] = possiblePiles[i];

			// Test for random Supply Pile.
			// Ran into a null value, immediately fixed, I miscalculated by 1.
			System.out.println("" + Supply[i]);
		}

		// Created a tempRemaining as a workaround for easy declaration, 
		//	as it will be thrown away by Java after the constructor is done, 
		//  and to make it look nice.
		int[] tempRemaining = {
			// 10 Curse Cards at 2 players, plus 10 per extra player.
			numPlayers * 10 - 10,
			// 60 Copper Cards total, minus the ones dealt to the players.
			60 - 7 * numPlayers,
			// 40 Silver Cards, 30 Gold Cards, 12 of each Victory Card
			40, 30, 12, 12, 12,
			// 10 of each Random Kingdom Card
			10, 10, 10, 10, 10,
			10, 10, 10, 10, 10};
			// When there are 2 players, there is only 8 of each Victory Card in Supply.
		if (numPlayers == 2)
		{
			for (int i = 0; i < 3; i++)
			{
				tempRemaining[i + 4] = 8;
			}
			
		}

		// Will keep track of how many are left of each Supply Card.
		cardsRemaining = tempRemaining;

		// checks formulas are correct
		printRemaining();
		addListeners();
		draw();
	}
	// Checks if Supply has requested Card, if so then return Card,
	//	if not then return null
	public Card buy(int cardPos)
	{
		if (cardsRemaining[cardPos] > 0)
		{
			cardsRemaining[cardPos]--;
			return Supply[cardPos];
		}
		else
		{
			//remove card from JLabel
		}
		return null;
	}

	public Card getSelected()
	{
		if (selectCard >= 0)
		{
			return Supply[selectCard];
		}
		return null;
	}
	public void unselect()
	{
		selectCard = -1;
		selectX = -200;
	}
	// Fisher-Yates Shuffle Algorithm, O(n) runtime
	// Most efficient non-biased Shuffling Algorithm
	// Recoded my original shuffle to fit my current needs.

	// if all cards then start = 0 and end = number of Cards - 1
	// For an array that isn't completely filled
	public Card[] shuffle(Card[] arr, int start, int end)
	{
		int j;
		Card temp;
		// Works from back to front.
		for(int i = end - 1; i > start; i--)
		{
			j = gen.nextInt(i - start) + start;
			System.out.println("" + j + ", " + i + ", " + (i - start));
			
			//swap cards
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
		}
		return arr;
	}

	BufferedImage tempImg;
	public void draw()
	{
		
		for (int i = 0; i < Supply.length; i++)
		{
			try 
			{
  				tempImg = ImageIO.read(new File("" + Supply[i].getImg()));
			} 
			catch (IOException e) 
			{
				System.out.println(e);
			}
			supplyImage[i] = new ImageIcon(getScaledImage(tempImg, cardSize_x, cardSize_y));
			//supplyImage[i].setPreferedSize(200*IMGSCALE, 320*IMGSCALE);
			supplyLabel[i] = new JLabel(supplyImage[i]);
			supplyLabel[i].addMouseListener(selectListener);
			add(supplyLabel[i]);
		}
	}
	// Idea barrowed from online, adds a 
	public static Image getScaledImage(Image image, int width, int height)
	{
	    BufferedImage resizedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D graphics = resizedImg.createGraphics();

		graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics.drawImage(image, 0, 0, width, height, null);
		graphics.dispose();

	    return resizedImg;
	}

	//Here for testing purposes currently
	public void printRemaining()
	{
		for (int i = 0; i < 17; i++)
		{
			System.out.println("" + cardsRemaining[i]);
		}
		
	}
	// Not recommended to run on interfaces so... I will use this a mockclick method
	public void setSelected(int index)
	{
		selectCard = index;
	}
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

				if (obj == supplyLabel[0])
				{
					selectCard = 0;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[1])
				{
					selectCard = 1;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[2])
				{
					selectCard = 2;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[3])
				{
					selectCard = 3;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[4])
				{
					selectCard = 4;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[5])
				{
					selectCard = 5;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[6])
				{
					selectCard = 6;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[7])
				{
					selectCard = 7;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[8])
				{
					selectCard = 8;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[9])
				{
					selectCard = 9;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[10])
				{
					selectCard = 10;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[11])
				{
					selectCard = 11;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[12])
				{
					selectCard = 12;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[13])
				{
					selectCard = 13;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[14])
				{
					selectCard = 14;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[15])
				{
					selectCard = 15;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				if (obj == supplyLabel[16])
				{
					selectCard = 16;
					selectX = supplyLabel[selectCard].getX();
					selectY = supplyLabel[selectCard].getY();
				}
				repaint();
			}
	
			@Override
			public void mouseExited(MouseEvent e){}

			@Override
			public void mouseEntered(MouseEvent e){}

			@Override
			public void mouseClicked(MouseEvent e){}
		};
	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		//page.drawCircle(100, 100);
		page.fillRect(selectX, selectY-10, cardSize_x, cardSize_y + 20);
		//Rectangle r = new Rectangle(xPos,yPos,width,height);
		//paint();
	}	
}