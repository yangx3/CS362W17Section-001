// Last updated 1/28/2017
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import java.util.Random;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class DrawPile
{
	// adjusts card size compared to the table.
	private double IMGSCALE = .75;
	private int topCard, numDraw;
	private Card drawCards[];
	private ImageIcon backImage;
	private JLabel backLabel;
	private BufferedImage tempImg;

	private int cardSize_x;
	private int cardSize_y;

	public DrawPile(Card[] cards)
	{
		//super(cards);
		drawCards = cards;
		topCard = 0;

		// must change if drawCards contains any null values initially
		numDraw = drawCards.length;
		shuffle();
		double temp;
		temp = 200*IMGSCALE;
		cardSize_x = (int)temp;
		temp = 320*IMGSCALE;
		cardSize_y = (int)temp;
		draw();
	}
	
	public Card drawCard()
	{	
		//checks if cards exist
		// will require a null check
		if (topCard >= drawCards.length)
		{
			return null;
		}
		else if (drawCards[topCard] != null) // OutofBoundsException: 10 Solved
		{
			topCard++;
			numDraw--;
		}
		else
		{
			return null;
		}
		// cause of null?
		return drawCards[topCard - 1];
	}
	public void setDeck(Card[] cards, int numCards)
	{
		numDraw = numCards;
		drawCards = cards;
		topCard = 0;
		System.out.println("DrawPile Length: " + drawCards.length + "\nnumDraw: " + numDraw);
	}
	// needs to be fininshed
	public int cardsRemaining()
	{
		return numDraw;
	}

	
	public void draw()
	{
		try 
		{
			tempImg = ImageIO.read(new File("images/Back.jpg"));
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}

		backImage = new ImageIcon(getScaledImage(tempImg, cardSize_x, cardSize_y));
		backLabel = new JLabel(backImage);
		System.out.println("DrawPileImage added to JLabel");
	}
	// Requires testing
	public void shuffle()
	{
		int j;
		Card temp;
		Random gen = new Random();
		// Works from back to front.
		for(int i = numDraw - 1; i > 0; i--)
		{
			j = gen.nextInt(i);
			//System.out.println("" + j + ", " + i + ", " + (i - start));
			//swap cards
			temp = drawCards[j];
			drawCards[j] = drawCards[i];
			drawCards[i] = temp;
		}
		// returns nothing, called in the class
	}

	public static Image getScaledImage(Image image, int width, int height)
	{
	    BufferedImage resizedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D graphics = resizedImg.createGraphics();

		graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics.drawImage(image, 0, 0, width, height, null);
		graphics.dispose();

	    return resizedImg;
	}

	public JLabel getLabel()
	{
		System.out.println("Returning DrawPileImage");
		return backLabel;
	}


	public void setScale(double IMGSCALE)
	{
		double temp;
		temp = 200*IMGSCALE;
		cardSize_x = (int)temp;
		temp = 320*IMGSCALE;
		cardSize_y = (int)temp;	
	}
}