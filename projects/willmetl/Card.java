/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;

public enum Card{
  // The Card class represnts a single Dominion card

  COPPER("Copper"), SILVER("Silver"), GOLD("Gold"),
  ESTATE("Estate"), DUCHY("Duchy"), PROVINCE("Province"),
  ADVENTURER("Adventurer"){
    public boolean play(Player p){
      int needTreasures = 2;
      while(needTreasures > 0){
        Card c = p.draw();
        if(c.givesMoney > 0){
          needTreasures--;
        } else {
          p.discard(c);
        }
      }
      return true;
    }
  };

  private final boolean DEBUGGING = true;
  // // Attributes for this card can only be changed when the card is created
  public String cardName;
  public String cardDesc = "No desc";
  public boolean costsAction = true;
  public int costsMoney = 0;
  public int givesVictoryPoints = 0;
  public int givesMoney = 0;
  public int givesActions = 0;
  public int givesCardDraws = 0;

  public String toString(){
    return this.cardName+" - "+this.cardDesc;
  }

  private Card(String cName){
    this.cardName = cName;
  }

  public boolean play(Player p){
    if(DEBUGGING) System.out.println("Card->Play");
    if(givesMoney>0) p.addMoney(givesMoney);
    p.addActions(givesActions-1);
    for(int i=givesCardDraws; i>0; i--) p.draw();
    return true;
  }
}
  // public Card(
  //     String cName, String cDesc,
  //     boolean cAction, int cMoney, int gVP,
  //     int gMoney, int gActions, int gCDraws
  //   ){
  //   // Constructor, takes card attributes and stores them.
  //   this.cardName = cName;
  //   this.cardDesc = cDesc;
  //   this.costsAction = cAction;
  //   this.costsMoney = cMoney;
  //   this.givesVictoryPoints = gVP;
  //   this.givesMoney = gMoney;
  //   this.givesActions = gActions;
  //   this.givesCardDraws = gCDraws;
  // }

  // public boolean play(){
  //   if(DEBUGGING) System.out.println("Card->Play");
  //   return true;
  // }
  //
  // public boolean play(Player target){
  //   if(DEBUGGING) System.out.println("Card->Play w/Target "+target);
  //   return true;
  // }
  //
  //
  // public static boolean playAdventurer(Player p){
  //   int needTreasures = 2;
  //   while(needTreasures > 0){
  //     Card c = p.draw();
  //     if(c.givesMoney > 0){
  //       needTreasures--;
  //     } else {
  //       p.discard(c);
  //     }
  //   }
  //   return true;
  // }

//   public static Card COPPER = new Card(
//     "Copper",    // cardName
//     "+1 money",  // cardDesc
//     false,       // costsAction
//     0,           // costsMoney
//     0,           // givesVictoryPoints
//     1,           // givesMoney
//     0,           // givesActions
//     0            // givesCardDraws
//   );
//   public static Card SILVER = new Card(
//     "Silver",    // cardName
//     "+2 money",  // cardDesc
//     false,       // costsAction
//     3,           // costsMoney
//     0,           // givesVictoryPoints
//     2,           // givesMoney
//     0,           // givesActions
//     0            // givesCardDraws
//   );
//   public static Card GOLD = new Card(
//     "Gold",      // cardName
//     "+3 money",  // cardDesc
//     false,       // costsAction
//     6,           // costsMoney
//     0,           // givesVictoryPoints
//     3,           // givesMoney
//     0,           // givesActions
//     0            // givesCardDraws
//   );
//   public static Card ESTATE = new Card(
//     "Estate",      // cardName
//     "+1 victory",  // cardDesc
//     false,       // costsAction
//     2,           // costsMoney
//     1,           // givesVictoryPoints
//     0,           // givesMoney
//     0,           // givesActions
//     0            // givesCardDraws
//   );
//   public static Card DUCHY = new Card(
//     "Duchy",      // cardName
//     "+3 victory",  // cardDesc
//     false,       // costsAction
//     5,           // costsMoney
//     3,           // givesVictoryPoints
//     0,           // givesMoney
//     0,           // givesActions
//     0            // givesCardDraws
//   );
//   public static Card PROVINCE = new Card(
//     "Province",      // cardName
//     "+6 victory",  // cardDesc
//     false,       // costsAction
//     8,           // costsMoney
//     6,           // givesVictoryPoints
//     0,           // givesMoney
//     0,           // givesActions
//     0            // givesCardDraws
//   );
//   // public static Card ADVENTURER = new Card(
//   //   "Adventurer",      // cardName
//   //   "Reveal cards from your deck until you reveal 2 Treasure "+
//   //   "cards. Put those Treasure cards into your hand and discard"+
//   //   "the other revealed cards.",  // cardDesc
//   //   true,        // costsAction
//   //   6,           // costsMoney
//   //   0,           // givesVictoryPoints
//   //   0,           // givesMoney
//   //   0,           // givesActions
//   //   0            // givesCardDraws
//   // );
// }
//
// public class ADVENTURER {
//
//   public static boolean play(Player p){
//     int needTreasures = 2;
//     while(needTreasures > 0){
//       Card c = p.draw();
//       if(c.givesMoney > 0){
//         needTreasures--;
//       } else {
//         p.discard(c);
//       }
//     }
//     return true;
//   }
// }
