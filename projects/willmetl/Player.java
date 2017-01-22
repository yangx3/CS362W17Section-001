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

  private Deck hand;
  private Deck drawPile;
  private Deck discardPile;

  public Player(String pName){
    // Constructor for the Player class - sets their name
    this.playerName = pName;
    this.drawPile = new Deck();         // not shared, empty
    this.discardPile = new Deck();      // not shared, empty
    this.hand = new Deck();             // not shared, empty
  }

  public int getActions(){
    return this.remActions;
  }

  public int getBuys(){
    return this.remBuys;
  }

  public void seeHand(){
    // Display all cards in a player's hand
    this.hand.seeDeck();
  }

  public void seeDeck(){
    if(DEBUGGING){
      System.out.println("Player "+this.playerName+"'s drawPile:");
      drawPile.seeDeck();
      System.out.println("Player "+this.playerName+"'s discardPile:");
      discardPile.seeDeck();
    }
  }

  public boolean discardCard(){
    // This player discards a random card from their hand
    int handsize = this.hand.getSize();
    // generate random number in range of hand size
    Card c = hand.drawCard(1);
    return discardCard(c);
  }
  public boolean discardCard(Card c){
    // Returns result of attempting to move a card from hand to discardPile
    return discardPile.addCard(hand.drawCard(c));
  }
  public boolean discardCard(Card c, Player target){
    // Target player discards a specific card
    return target.discardCard(c);
  }

  public boolean draw(Deck d, Card c){
    // Take a card from a deck and put it into your discardPile
    return discardPile.addCard(d.drawCard());
  }

  public void newTurn(){
    // Start every turn with a new, full hand and 1 action, 1 buy
    this.remActions = 1;
    this.remBuys = 1;
    this.discardPile.addCard(this.hand.drawAll());
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
