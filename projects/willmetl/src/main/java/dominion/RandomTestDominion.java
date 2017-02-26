/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 2 - Random Test Dominion
*/
package dominion;
import java.util.Random;

public class RandomTestDominion{
  public void setupGame(){
    GameState game = new GameState();
    Random rand = new Random();
    int numPlayers = rand.nextInt(3)+2; // 2-4 players
    String[] names = {"Amy", "Bill", "Catherine", "David"};

    assert(numPlayers<=4 && numPlayers>=2);

    for(int i=0; i<numPlayers; i++){
      game.addPlayer(names[i], true);
    }

    while(game.checkEndConditions() == false){
      game.nextTurn();
    }
  }

  public static void main(String[] args){
    RandomTestDominion rtd = new RandomTestDominion();
    rtd.setupGame();
  }
}
