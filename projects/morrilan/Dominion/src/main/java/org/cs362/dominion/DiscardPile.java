// Last updated 1/28/2017
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import java.util.Random;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class DiscardPile
{
	private double IMGSCALE = .75;
	private Random gen;

	private int numDiscard = 0;
	private Card[] discardCards;
	private ImageIcon discardImage;
	private JLabel discardLabel;
	private BufferedImage tempImg;

	private int cardSize_x, cardSize_y;

	public DiscardPile()
	{
		discardCards = new Card[8];

		double temp;
		temp = 200*IMGSCALE;
		cardSize_x = (int)temp;
		temp = 320*IMGSCALE;
		cardSize_y = (int)temp;

		gen = new Random();
		draw();
	}
	public void discard(Card discarded)
	{
		// If length of array is too small, move to larger array.
		//	Doubles the size of the array. O(n) time, can run quickly till in the several thousands.
		
		if (numDiscard >= discardCards.length)
		{
			// Requires testing...
			// Card[] tempDiscard = discardCards;
			// discardCards = new Card[numDiscard*2];
			// discardCards = tempDiscard;
			// System.out.println("" + discardCards[5]);
			// System.out.println("Length: " + discardCards.length + "\nnumDiscard: " + numDiscard);
			increaseDiscardSize();
		}
		discardCards[numDiscard] = discarded;
		numDiscard++; 
	
	}
	// calls single discard method multiple times
	// Avoids repitition
	public void discard(Card[] discards)
	{
		for(int i = 0; i < discards.length; i++)
		{
			discard(discards[i]);
		}
	}
	
	public Card[] shuffle()
	{
		// Shuffles discard, returns a temp after setting discardCards to null
		// Caused error, fixing numbers, continuing printouts till error is found
		// One time had 4 Victory and 6 Treasures before and after shuffle.
		int j;
		Card temp;
		for (int i = 0; i < discardCards.length; i++)
		{
			System.out.println("" + discardCards[i]);
		}
		// Works from back to front.
		for(int i = numDiscard - 1; i > 0; i--)
		{
			j = gen.nextInt(i);
			
			//swap cards
			temp = discardCards[j];
			discardCards[j] = discardCards[i];
			discardCards[i] = temp;
			
		}
		// Shouldn't need to cut the Null values, just can't shuffle them. 
		Card[] tempCards = discardCards;
		discardCards = new Card[8];
		numDiscard = 0;
		for (int i = 0; i < tempCards.length; i++)
		{
			System.out.println("" + tempCards[i]);
		}
		
		return tempCards; 
	}

	public void increaseDiscardSize()
	{
		Card[] tempDiscard = discardCards;
		discardCards = new Card[numDiscard*2];
		for (int i = 0; i < tempDiscard.length; i++)
		{
			discardCards[i] = tempDiscard[i];
		}
		//System.out.println("" + discardCards[8]);
		System.out.println("Length: " + discardCards.length + "\nnumDiscard: " + numDiscard);
	}
	
	public void draw()
	{
		try 
		{
			tempImg = ImageIO.read(new File("images/Trash.jpg"));
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}

		discardImage = new ImageIcon(getScaledImage(tempImg, cardSize_x, cardSize_y));
		discardLabel = new JLabel(discardImage);
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
		return discardLabel;
	}
	public int getNumDiscard()
	{
		return numDiscard;
	}
}