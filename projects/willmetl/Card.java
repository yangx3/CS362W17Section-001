/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;

public class Card{
  // The Card class represnts a single Dominion card

  // Attributes for this card can only be changed when the card is created
  public final String cardName;
  public final String cardDesc;
  public final boolean costsAction;
  public final int costsMoney;
  public final int givesVictoryPoints;
  public final int givesMoney;
  public final int givesActions;
  public final int givesCardDraws;

  public Card(
      String cName, String cDesc,
      boolean cAction, int cMoney, int gVP,
      int gMoney, int gActions, int gCDraws
    ){
    // Constructor, takes card attributes and stores them.
    this.cardName = cName;
    this.cardDesc = cDesc;
    this.costsAction = cAction;
    this.costsMoney = cMoney;
    this.givesVictoryPoints = gVP;
    this.givesMoney = gMoney;
    this.givesActions = gActions;
    this.givesCardDraws = gCDraws;
  }

  public boolean play(){
    System.out.println("Card->Play");
    return true;
  }

  public boolean play(Player target){
    System.out.println("Card->Play w/Target "+target);
    return true;
  }

  public String toString(){
    return this.cardName;
  }

  public String getDesc(){
    return this.cardDesc;
  }
}
