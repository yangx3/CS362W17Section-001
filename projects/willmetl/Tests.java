/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;

public class Tests{

  public void setupGame(){
    GameState game = new GameState();
    assert(game.bankCards.getSize() == 194);


    game.addPlayer("Amy", game);
    assert(game.numPlayers == 1);

    game.addPlayer("Billy", game);
    assert(game.numPlayers == 2);

    game.players[0].seeDeck();
    game.nextTurn();
    game.players[0].seeDeck();

    System.out.println("Shared draw pile has: "+
      game.bankCards.getSize()+" cards.");
  }

  public static void main(String [ ] args){
    Tests game1 = new Tests();
    game1.setupGame();
  }
}
