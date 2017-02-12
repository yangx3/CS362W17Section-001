/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package dominion;

public class Dominion{

  public void setupGame(){
    GameState game = new GameState();

    game.addPlayer("Amy");
    assert(game.numPlayers == 1);

    game.addPlayer("Billy", true);
    assert(game.numPlayers == 2);

    while(true)
      game.nextTurn();
  }

  public static void main(String [ ] args){
    System.out.println("Making a new Dominion game.");
    Dominion game1 = new Dominion();
    game1.setupGame();
  }
}
