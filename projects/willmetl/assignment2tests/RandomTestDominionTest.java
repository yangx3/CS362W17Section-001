package dominion;

import org.junit.*;
import java.util.Random;

public class RandomTestDominionTest{

  @Test
  public void playGame(){
    Random rand = new Random(10);
    String[] names = {"Amy", "Bill", "Catherine", "David"};
    for(int j=0; j<5; j++){
      GameState game = new GameState();
      int numPlayers = rand.nextInt(3)+2; // 2-4 players

      assert(numPlayers<=4 && numPlayers>=2);

      for(int i=0; i<numPlayers; i++){
        game.addPlayer(names[i], true);
      }

      while(game.checkEndConditions() == false){
        game.nextTurn();
      }
    }
  }
}
