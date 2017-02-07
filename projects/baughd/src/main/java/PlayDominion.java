import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PlayDominion {

	   public  static void main(String args[]){

		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//INITIALIZE GAME
			//the cards are achieved by each element/constant in the enum class
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
			//System.out.println("Initialization DominionBoard:\n " + state.toString());

//INITIALIZE PLAYERS
            Player player = new Player(state, "PLAYER1");
		    state.addPlayer(player);

		    player = new Player(state, "PLAYER2");
		    state.addPlayer(player);

//Get 10 cards, draw 5, set actions and buys
           state.initializeGame();

//Prints out players initial decks
           System.out.println("\nInitialization of Dominion Board:\n\n" + state.toString());

//ACTUALLY PLAY THE GAME HERE!!!
           HashMap<Player, Integer> winners = state.play();
		   System.out.println ("Finished game.\n");
		    
           for(Player p: winners.keySet()){
               System.out.println ("Player name: " + winners.get(p) + " , Score: " + winners.get(p) );
           }
		      
	//	    player.printStateGame();
		      
		      
			System.exit(0);  

	   }
	
	
}
