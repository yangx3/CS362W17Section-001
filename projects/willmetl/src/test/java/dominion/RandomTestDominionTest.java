package dominion;

import org.junit.*;
import java.util.Random;

public class RandomTestDominionTest{

  @Test
  public void playGame(){
    for(int i=0; i<5; i++){
      RandomTestDominion rtd = new RandomTestDominion();
      rtd.setupGame();
    }
  }
}
