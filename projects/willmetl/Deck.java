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
  private final boolean sharedDeck;

  private final int pileSize = 8;     // How many cards per pile
  // Initial cards for each player's Deck
  private final int startingCopper = 7;
  private final int startingVP = 3;
  // Initial currency cards in the bank
  private final int bankCopper = 60;
  private final int bankSilver = 40;
  private final int bankGold = 30;
  // Initial victory point cards in the bank
  private final int bankEstates = 24;
  private final int bankDuchies = 12;
  private final int bankProvinces = 12;

  private ArrayList<Card> cards;

  public Deck(){
    // The default constructor makes a new, normal deck for a player
    sharedDeck = false;
    // Add default money and vp cards
  }
  public Deck(int numCards){
    // Constructor for the Deck class
    sharedDeck = true;

    // Make a new shared deck using preset values
    cards = new ArrayList<Card>(numCards * pileSize);
    for(int i=0; i<startingCopper; i++){
      // Generate the deck
      // Card c = new Card("Copper");
      // c.cardDesc = "+1 money";
      // c.costsAction = false;
      // c.givesMoney = 1;
      // cards.add(c);
      cards.add(new Card(
        "Copper",    // cardName
        "+1 money",  // cardDesc
        false,       // costsAction
        0,           // costsMoney
        0,           // givesVictoryPoints
        1,           // givesMoney
        0,           // givesActions
        0            // givesCardDraws
      ));
    }

    // Starting victory cards
    for(int i=0; i<startingVP; i++){
      cards.add(new Card(
        "Estate",
        "+1 victory",
        false,
        2,
        1,
        0,
        0,
        0
      ));
    }
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

  public boolean addCard(Card c){
    // Adds a new card to this deck
    return cards.add(c);
  }

  public void seeDeck(){
    // See the cards in your deck
    for(Card c:this.cards){
      System.out.println(c);
    }
  }

  public static void main(String [ ] args){
    Deck a = new Deck(8);
    a.seeDeck();
  }
}
