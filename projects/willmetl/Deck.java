/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;
import java.util.*;

public class Deck{
  // The Deck class represents either a shared or Player deck of Cards
  private final boolean DEBUGGING = true;
  private ArrayList<Card> cards;

  public Deck(){
    this(100);
  }
  public Deck(int size){
    // The default constructor makes a new, normal deck for a player
    this.cards = new ArrayList<Card>(size);
  }

  public Card drawCard(){
    // Pops the top card from this deck
    // This _should_ handle empty decks!
    return drawCard(cards.size());
  }
  public Card drawCard(int i){
    // Returns the card at a specific index
    Card c = cards.get(i); // not sure if this removes or returns?
    return c;
  }
  public Card drawCard(Card c){
    // Removes a card from this deck and returns it
    // ArrayList.remove(c) returns boolean if c was removed
    if(cards.remove(c)){
      return c;
    } else {
      return null;
    }
  }
  public ArrayList drawAll(){
    // Returns every card in this deck as an ArrayList
    return cards;
  }

  public boolean addCard(Card c){
    // Adds a new card to this deck
    return cards.add(c);
  }
  public boolean addCard(ArrayList cards){
    // Adds an ArrayList of cards to this deck
    return cards.addAll(cards);
  }

  public void seeDeck(){
    // See the cards in your deck
    for(Card c:this.cards){
      System.out.println(c);
    }
  }

  public int getSize(){
    // Returns number of cards in this deck
    return this.cards.size();
  }
}
