package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomTestDominion {

  public  static void main(String args[]){
    int error = 0;
    List<Card> cards;
    GameState state;
    Randomness.reset(10);    

    for(int i=0;i < 10; i++){
      cards = new ArrayList<Card>(Card.createCards());
      state = new GameState(cards);
      //       System.out.println("Initialization DominionBoard:\n " + state.toString()); 
      
      int randi = (int)  Randomness.random.nextInt(4);
      for (int k=0;i<randi;i++){
        Player player = new Player(state, "player");
        state.addPlayer(player);
      }

      //Initialize the game!
      state.initializeGame();

      System.out.println("Initialization DominionBoard:\n " + state.toString());

      HashMap<Player, Integer> winners=state.play();
      System.out.println ("Finished game.\n");

      for (Integer j : state.gameBoard.values()) {
        if (j<0) {
        error = 1;
        break;
      }
    }
    if (error==1){
      System.out.println("ERROR: there was an instance where one of the cards went below 0");
    }
    else{
      System.out.println("NO errors found");
    }
    System.exit(0);
  }	
}
}