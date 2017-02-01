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
  CURSE("Curse", 0, 0, -1),
  ADVENTURER("Adventurer", 6){
    // See http://wiki.dominionstrategy.com/index.php/File:Adventurer.jpg
    public Card play(Player p){
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
    // See http://wiki.dominionstrategy.com/index.php/File:Ambassador.jpg
    public Card play(Player p){
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
    // See http://wiki.dominionstrategy.com/index.php/File:Baron.jpg
    public Card play(Player p){
      // If player discards an estate, +4, otherwise, draw an Estate
      if(p.discardFromHand(Card.ESTATE)){
        p.addMoney(4);
      }else{
        p.discard( p.gameState.takeCard(Card.ESTATE) );
      }
      return this;
    }
  },COUNCILROOM("Council Room", 5){
    // See http://wiki.dominionstrategy.com/index.php/File:Council_Room.jpg
    public Card play(Player p){
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
    // See http://wiki.dominionstrategy.com/index.php/File:Cutpurse.jpg
    public Card play(Player p){
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
    // See http://wiki.dominionstrategy.com/index.php/File:Embargo.jpg
    public Card play(Player p){
      // +2 money, trash this card, add embargo token to supply pile
      // When ANY player buys a card from that pile, they also gain a Curse
      // for EACH embargo token on that pile
      p.addMoney(2);
      GameState g = p.gameState;
      // add embargo token
      return null;  // trash this card
    }
  },FEAST("Feast", 4){
    // See http://wiki.dominionstrategy.com/index.php/File:Feast.jpg
    public Card play(Player p){
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
            if(p.takeFreeCard(p.gameState.takeCard(c))) break;
          }else{
            System.out.format("The %s card costs %d, please choose a "+
            "card that costs no more than 5 money.\n", c, c.costsMoney);
          }
        }
      }while(choice != 0);
      return null;
    }
  },GARDENS("Gardens", 4){
    // See http://wiki.dominionstrategy.com/index.php/File:Gardens.jpg
    public int getVictoryPoints(Player p){
      // Worth 1 vp per 10 cards you have, rounded down
      return p.countAllCards() / 10;
    }
  },GREAT_HALL("Great Hall", 3){
    // See http://wiki.dominionstrategy.com/index.php/File:Great_Hall.jpg
    public Card play(Player p){
      // +1 card, +1 action, worth 1 vp
      p.addActions(1);
      p.draw();
      return this;
    };
    public int getVictoryPoints(Player p){
      // worth 1 vp
      return 1;
    }
  },MINE("Mine", 5){
    // See http://wiki.dominionstrategy.com/index.php/File:Mine.jpg
    public Card play(Player p){
      // Trash a treasure card from your hand to gain 3 money more than it
      // Put this new card in your HAND
      boolean unresolved = true;
      while(true){
        System.out.println("Trash a treasure card from your hand to gain "+
          "3 more money than it normally gives.");
        Card c = p.chooseTypeOfCard(Type.TREASURE);
        if(c != null){
          p.addMoney(c.givesMoney+3);
          return null;
        }else return this;
      }
    }
  },SALVAGER("Salvager", 4){
    // See http://wiki.dominionstrategy.com/index.php/File:Salvager.jpg
    public Card play(Player p){
      // +1 buy, trash a card and gain money equal to it's cost
      p.addBuys(1);
      Card c = p.chooseHand();
      if(c != null) p.addMoney(c.costsMoney);
      return this;
    }
  },SMITHY("Smithy", 4){
    // See http://wiki.dominionstrategy.com/index.php/File:Smithy.jpg
    public Card play(Player p){
      // +3 cards
      for(int i=0; i<3; i++) p.draw();
      return this;
    }
  },VILLAGE("Village", 3){
    // See http://wiki.dominionstrategy.com/index.php/File:Village.jpg
    public Card play(Player p){
      // +1 card, +2 actions
      p.draw();
      p.addActions(2);
      return this;
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

  public int getVictoryPoints(Player p){
    return this.givesVictoryPoints;
  }

  public static enum Type {
		ACTION, TREASURE, VICTORY;
	}
}
