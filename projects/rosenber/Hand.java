/*
 * This class implements a hand of cards for a game of Dominion. Cards
 * can be added, removed, played, etc.
 * 
 * Robert Rosenberger
 * Last modified: 1/31/2017
 */
import java.util.ArrayList;

public class Hand{
	
	private ArrayList<Card> hand;
	
	//constructor
	public Hand(){
		hand = new ArrayList<Card>();
	}
	
	//returns the number of cards in the hand
	public int size(){
		return hand.size();
	}
	
	//adds card to the hand
	public void addCard(Card c){
		hand.add(c);
	}
	
	//checks if the card is in the hand
	// returns true if it is, false otherwise
	public boolean inHand(Card c){
		if(hand.indexOf(c) == -1)
			return false;
		return true;
	}
	
	//removes card from the hand
	// - c not in hand, does nothing
	// - idx has to be good
	public void removeCard(Card c){
		if(!inHand(c))
			return;
		hand.remove(hand.indexOf(c));
	}
	public void removeCard(int idx){
		hand.remove(idx);
	}
	
	//returns card from the hand
	public Card getCard(Card c){
		return hand.get(hand.indexOf(c));
	}
	public Card getCard(int idx){
		return hand.get(idx);
	}
	
	//returns card and removes card from hand
	// - card must be in hand
	// - idx must be good
	public Card playCard(Card c){
		Card temp = getCard(c);
		removeCard(c);
		return temp;
	}
	public Card playCard(int idx){
		Card temp = getCard(idx);
		removeCard(idx);
		return temp;
	}
	
	//prints the cards in the hand
	public void print(){
		int cardsPerRow = 4;
		for(int j=0; j<10; j++){
			for(int k=0; k<cardsPerRow; k++){
				//TODO
				//PRINT THE CARDS
			}
		}
	}
}




















