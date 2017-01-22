/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;

public class Card{
  // The Card class represnts a single Dominion card
  private final boolean DEBUGGING = true;
  // Attributes for this card can only be changed when the card is created
  public String cardName;
  public String cardDesc = "No desc";
  public boolean costsAction = true;
  public int costsMoney = 0;
  public int givesVictoryPoints = 0;
  public int givesMoney = 0;
  public int givesActions = 0;
  public int givesCardDraws = 0;

  public Card(String cName){
    this.cardName = cName;
  }

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
    if(DEBUGGING) System.out.println("Card->Play");
    return true;
  }

  public boolean play(Player target){
    if(DEBUGGING) System.out.println("Card->Play w/Target "+target);
    return true;
  }

  public String toString(){
    return this.cardName+" - "+this.cardDesc;
  }
}
