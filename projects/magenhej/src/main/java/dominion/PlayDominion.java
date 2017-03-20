package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import java.util.Collections;


public class PlayDominion {

	   public  static void main(String args[]){
		   
		    List<Card> cards;
		    List<Card> ActionCards = new ArrayList<Card>();
		    GameState state;
			Randomness.reset(10);
			int playerCount = 2;
			int kingdomCards = 10;
			
			switch (args.length) 
			{
			case 2:
			    playerCount = Integer.valueOf(args[0]);
			    kingdomCards = Integer.valueOf(args[1]);
			    System.out.println("\n\tGAMESTATE: Players: "+playerCount+" | Kingdom Cards: " +kingdomCards);
			    break;
			case 1:
			    playerCount = Integer.valueOf(args[0]);
			    System.out.println("\n\tGAMESTATE: Players: "+playerCount+" | Kingdom Cards: " +kingdomCards);
			    break;
			default:
			    playerCount = 2;
			    System.out.println("\n\t(Default) GAMESTATE: Players: 2 | Kingdom Cards: 10");
			    break;
			}
			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			
			int kingdomCnt = 0;
			for(int i = 0; i < cards.size(); i++){
				if(kingdomCnt == kingdomCards){
					break;
				}
				if(cards.get(i).getType() == Card.Type.ACTION){
					ActionCards.add(cards.get(i));
					kingdomCnt++;
				}
			}
			
			
			state = new GameState(cards);
			Player player; 
			
			for(int p = 1; p <= playerCount; p++){
				player = new Player(state, "player-" + p);
				for(int i = 0; i < kingdomCards; i++){
					int randomNum = ThreadLocalRandom.current().nextInt(0, ActionCards.size());
					player.hand.add(cards.get(randomNum));
				}
				state.addPlayer(player);	
			}
			state.initializeGame();
		      
		    System.out.println("Initializing DominionBoard:\n " + state.toString());
		      
		    HashMap<Player, Integer> winners=state.play();
		    System.out.println ("Finished game.\n");
		    
		    for(Player pl: winners.keySet()){
		    	System.out.println ("Player name: "+winners.get(pl) + " , Score: "+ winners.get(pl) );
		    }     
		      
			System.exit(0);  

	   }
	
	
}
