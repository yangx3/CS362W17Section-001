/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;

public class Card{
  // The Card class represnts a single Dominion card

  // Attributes for this card can only be changed when the card is created
  public final boolean costsAction;
  public final int costsMoney;
  public final int givesVictoryPoints;
  public final int givesMoney;
  public final int givesActions;
  public final int givesCardDraws;

  public Card( boolean cAction, int cMoney, int gVP, int gMoney,
               int gActions, int gCDraws ){
    // Constructor, takes card attributes and stores them.
    costsAction = cAction;
    costsMoney = cMoney;
    givesVictoryPoints = gVP;
    givesMoney = gMoney;
    givesActions = gActions;
    givesCardDraws = gCDraws;
  }

  // Should card effects go here or in Deck.java?
}
