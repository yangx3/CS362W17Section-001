import java.util.ArrayList;
import java.util.Iterator;
public class Deck {
	private ArrayList<Card> cards;
	private Iterator<Card> iterator;
	
	Deck()
	{
		cards = new ArrayList<Card>();
		iterator = cards.iterator();
	}
	
	Deck(ArrayList<Card> cards)
	{
		this.cards = new ArrayList<Card>(cards.size());
		this.iterator = cards.iterator();
	}
	
	// Getters
	public Card draw()
	{
		Card card = iterator.hasNext()?iterator.next():null;
		if(card != null){
			iterator.remove();
		}
		
		return card;
	}
	
	public Card getTopCard()
	{
		return iterator.hasNext()?iterator.next():null;
	}
	
	// Accessor
	
	
}
