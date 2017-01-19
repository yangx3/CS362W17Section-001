/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;
import java.util.*;

public class Player{
  // The Player class represents a single Dominion player
  private final boolean DEBUGGING = true;
  // Attributes for this class are private
  private final String playerName;
  private final int drawCards = 7;  // inital hand size
  private int remActions;
  private int remBuys;

  private ArrayList<Card> hand = new ArrayList<Card>(7);
  // private Deck hand = new Deck(0);
  private Deck drawPile = new Deck(0);
  private Deck discardPile = new Deck(0);

  public Player(String pName){
    // Constructor for the Player class - sets their name
    this.playerName = pName;
  }

  public int getActions(){
    return this.remActions;
  }

  public int getBuys(){
    return this.remBuys;
  }

  public void seeHand(){
    // Display all cards in a player's hand
    for(willmetl.Card c : this.hand){
      System.out.println(c);
    }
  }

  public void newTurn(){
    // Start every turn with a new, full hand and 1 action, 1 buy
    this.remActions = 1;
    this.remBuys = 1;
    this.hand.clear();
    // Add 7 new cards from the top of this player's deck
  }
  public boolean playCard(Card card){
    return playCard(card, this);
  }
  public boolean playCard(Card card, Player target){
    if(this.remActions<1 || !card.costsAction){
      if(DEBUGGING) System.out.println("Playing "+card);
      card.play(this);
    } else {
      System.out.println("You do not have an action to play "+card);
    }
    return true;
  }
}
