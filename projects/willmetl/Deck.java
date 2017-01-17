/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;
import java.util.*;

public class Deck{

  private final boolean sharedDeck;
  // private final int numCards = 8;     // Num of shared card piles
  private final int pileSize = 8;     // How many cards per pile

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
    for(int i=0; i<numCards; i++){
      // Generate the deck
      // cards.add(new Card)
    }
  }

}
