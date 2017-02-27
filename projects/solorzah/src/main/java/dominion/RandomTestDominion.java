/*
  Author: Hannah Solorzano
  CS362 - SE II
  Assignment 2
*/
package dominion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomTestDominion{
  public  static void main(String args[]){

    List<Card> cards;
    GameState state;
    Random gen = new Random();
    int numPlayers = gen.nextInt(3)+2;

    cards = new ArrayList<Card>(Card.createCards());
    state = new GameState(cards);
    String[] names = {"pOne", "pTwo", "pThree", "pFour"};

    assert(numPlayers <= 4 && numPlayers >= 2);

    for(int i = 0; i < numPlayers; i++){
      Player player = new Player(state, names[i]);
      state.addPlayer(player);
    }

    //Initialize the game!
    System.out.println("initializing the game!");
    state.initializeGame();
    System.out.println("Finished initializing the game!");

    HashMap<Player, Integer> winners = state.play();
    System.out.println ("Finished game.\n");

    for(Player p: winners.keySet()){
      System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
    }

    System.exit(0);

  }
}
