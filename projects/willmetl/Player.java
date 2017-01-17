/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;
import java.util.*;

public class Player{
  // The Player class represents a single Dominion player

  // Attributes for this class are private
  private final String playerName;
  private final int drawCards = 7;  // inital hand size
  private int remActions;
  private int remBuys;
  private ArrayList<Card> hand = new ArrayList<Card>(7);

  public Player(String pName){
    // Constructor for the Player class - sets their name
    playerName = pName;
  }

  public int getActions(){
    return remActions;
  }

  public int getBuys(){
    return remBuys;
  }

  public void seeHand(){
    // Display all cards in a player's hand
    for(willmetl.Card c : hand){
      System.out.println(c);
    }
  }

  public void newTurn(){
    // Start every turn with a new, full hand and 1 action, 1 buy
    remActions = 1;
    remBuys = 1;
    hand.clear();
    // Add 7 new cards from the top of this player's deck
  }
}
