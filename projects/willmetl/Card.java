/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;

public enum Card{
  // The Card class represnts a single Dominion card
  COPPER("Copper", 0, 1, 0), SILVER("Silver", 3, 2, 0),
  GOLD("Gold", 6, 3, 0), ESTATE("Estate", 2, 0, 1),
  DUCHY("Duchy", 5, 0, 3), PROVINCE("Province", 8, 0, 6),
  ADVENTURER("Adventurer", 6){
    public void play(Player p){
      // See http://wiki.dominionstrategy.com/index.php/File:Adventurer.jpg
      int needTreasures = 2;
      while(needTreasures > 0){
        Card c = p.draw();
        if(c.givesMoney > 0){
          needTreasures--;
        } else {
          p.discard(c);
        }
      }
  }},
  AMBASSADOR("Ambassador", 3){
    public void play(Player p){
      // See http://wiki.dominionstrategy.com/index.php/File:Ambassador.jpg
      Card c = p.chooseHand();
      GameState g = p.gameState;
      g.bankCards.add(c);
      for(int i=0; i<g.numPlayers; i++){
        if(g.players[i] != p){
          g.players[i].takeFreeCard( g.takeCard(c) );
        }
      }
  }},
  BARON("Baron", 4){
    public void play(Player p){
      // See http://wiki.dominionstrategy.com/index.php/File:Baron.jpg
      // If player discards an estate, +4, otherwise, draw an Estate
      if(p.discard(Card.ESTATE)){
        p.addMoney(4);
      }else{
        p.discard( p.gameState.takeCard(Card.ESTATE) );
      }
  }},
  COUNCILROOM("Council Room", 5){
    public void play(Player p){
      // See http://wiki.dominionstrategy.com/index.php/File:Council_Room.jpg
      // +4 cards, +1 buy, each other player draws a card
      for(int i=0; i<4; i++) p.draw();
      p.addBuys(1);
      GameState g = p.gameState;
      for(int i=0; i<g.numPlayers; i++){
        if(g.players[i] != p){
          g.players[i].draw();
        }
      }
    }
  };

  private final boolean DEBUGGING = true;
  public final String cardName;
  public String cardDesc = "No desc";
  public int costsAction;
  public int costsMoney;
  public int givesVictoryPoints = 0;
  public int givesMoney = 0;
  public int givesActions = 0;
  public int givesCardDraws = 0;

  /*
  adventurer
  ambassador
  baron
  council_room
  cutpurse
  embargo
  feast
  gardens
  great_hall
  mine
  */


  private Card(String cName, int cost){
    this(cName, cost, 0, 0);
  }
  private Card(String cName, int cost, int money, int victoryPoints){
    this.cardName = cName;
    this.costsMoney = cost;
    this.givesMoney = money;
    this.givesVictoryPoints = victoryPoints;
  }

  public String toString(){
    return this.cardName;
  }

  public void play(Player p){
    if(DEBUGGING) System.out.println("Card->Play");
    if(givesMoney>0) p.addMoney(givesMoney);
    p.addActions(givesActions-1);
    for(int i=givesCardDraws; i>0; i--) p.draw();
  }
}
