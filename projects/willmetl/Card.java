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
    public Card play(Player p){
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
      return this;
    }
  },AMBASSADOR("Ambassador", 3){
    public Card play(Player p){
      // See http://wiki.dominionstrategy.com/index.php/File:Ambassador.jpg
      Card c = p.chooseHand();
      if(c != null){  // maybe they cancelled
        GameState g = p.gameState;
        g.addCard(c);
        for(int i=0; i<g.numPlayers; i++){
          if(g.players[i] != p){
            g.players[i].takeFreeCard( g.takeCard(c) );
          }
        }
      }
      return this;
    }
  },BARON("Baron", 4){
    public Card play(Player p){
      // See http://wiki.dominionstrategy.com/index.php/File:Baron.jpg
      // If player discards an estate, +4, otherwise, draw an Estate
      if(p.discardFromHand(Card.ESTATE)){
        p.addMoney(4);
      }else{
        p.discard( p.gameState.takeCard(Card.ESTATE) );
      }
      return this;
    }
  },COUNCILROOM("Council Room", 5){
    public Card play(Player p){
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
      return this;
    }
  },CUTPURSE("Cutpurse", 4){
    public Card play(Player p){
      // See http://wiki.dominionstrategy.com/index.php/File:Cutpurse.jpg
      // +2 money, other players forced to discard a copper or reveal hand
      p.addMoney(2);
      GameState g = p.gameState;
      for(int i=0; i<g.numPlayers; i++){
        Player t = g.players[i];
        if(t != p){
          // If a copper wasn't discarded, reveal their hand
          if(!t.discardFromHand(Card.COPPER)) t.seeHand();
        }
      }
      return this;
    }
  },EMBARGO("Embargo", 2){
    public Card play(Player p){
      // See http://wiki.dominionstrategy.com/index.php/File:Embargo.jpg
      // +2 money, trash this card, add embargo token to supply pile
      // When ANY player buys a card from that pile, they also gain a Curse
      // for EACH embargo token on that pile
      p.addMoney(2);
      GameState g = p.gameState;
      // add embargo token
      return null;  // trash this card
    }
  },FEAST("Feast", 4){
    public Card play(Player p){
      // See http://wiki.dominionstrategy.com/index.php/File:Feast.jpg
      // Trash this card, gain a card costing up to 5 money
      System.out.println(p+" may choose a card up to 5 money from the supply.");
      int choice;
      do{
        int availCards = p.gameState.listCards();
        System.out.format("Please enter the card number (1-%d) you want, "+
          "or 0 to cancel: ", availCards);
        choice = p.scan.nextInt();
        if( choice>0 && choice<=availCards){
          Card c = Card.values()[choice-1];
          if(c.costsMoney <= 5){
            if(p.takeFreeCard(c)) break;
          }else{
            System.out.format("The %s card costs %d, please choose a "+
            "card that costs no more than 5 money.\n", c, c.costsMoney);
          }
        }
      }while(choice != 0);
      return null;
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
  private Type type;

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
    if(money == 0 && victoryPoints == 0)
      this.type = Type.ACTION;
    else if(victoryPoints == 0)
      this.type = Type.TREASURE;
    else
      this.type = Type.VICTORY;
  }

  @Override
  public String toString() {
    return this.cardName;
  }

  public Type getType(){
    return type;
  }

  public Card play(Player p){
    if(DEBUGGING) System.out.println(p+" played a "+cardName);
    if(givesMoney>0) p.addMoney(givesMoney);
    if(givesActions>0) p.addActions(givesActions);
    return this;
  }

  public static enum Type {
		ACTION, TREASURE, VICTORY;
	}
}
