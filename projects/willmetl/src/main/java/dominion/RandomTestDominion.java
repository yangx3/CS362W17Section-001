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

    for(int i=0; i<numPlayers; i++){
      game.addPlayer(names[i], true);
    }

    // System.out.println("checkEndConditions is: "+game.checkEndConditions());
    // System.out.println("provinces: "+game.countCard(Card.PROVINCE));
    while(game.checkEndConditions() == false){
      System.out.println("New turn");
      game.nextTurn();
    }
  }

  public static void main(String[] args){
    RandomTestDominion rtd = new RandomTestDominion();
    rtd.setupGame();
  }
}
