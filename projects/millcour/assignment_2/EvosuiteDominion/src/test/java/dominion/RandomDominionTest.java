package dominion;

import java.util.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class RandomDominionTest{
		private Game game;
		
		@After
		public void tearDown(){
			this.game = null;
		}
		
		public boolean asserttrue(int num1, int num2){
			if(num1 == num2){
				System.out.println("TEST PASSED SUCCESSFULLY");
				return true;
			}else{
				System.out.println("TEST FAILED");
				return false;
			}
		}
		
		public boolean assertEnd(boolean compare){
			int numEmpty = 0;
			//if(numEmpty == 0){
			if((game.getBoard().get(2).getName() == Card.CardName.Province) && (game.getBoard().get(2).getPile().size() == 0) && (compare == true)){
			//if(game.getBoard().get(2).getPile().size() == 0){
				System.out.println("TEST PASSED SUCCESSFULLY");
				return true;
			}else{
				for(int i=0; i<game.getBoard().size(); i++){
					if(game.getBoard().get(i).getPile().size() == 0){
						numEmpty++;
						if(numEmpty == 3){
							if(compare == false){
								System.out.println("TEST PASSED SUCCESSFULLY");
								return true;
							}
						}
					}
				}
			}
			System.out.println("TEST FAILED");
			return false;
		}
		
		@Test
		public void playGameTest(){
			this.game = new Game();
			Random play = new Random(10);
			int num = play.nextInt()%3+3;
			game.setGame(num);  //set up game with random number of players
			game.getBoard().remove(play.nextInt(game.getBoard().size()));		//randomly choose which cards to remove from this run
			game.getBoard().remove(play.nextInt(game.getBoard().size()));
			game.getBoard().remove(play.nextInt(game.getBoard().size()));
			asserttrue(game.getBoard().size(), 10);
			while(game.checkForEnd()){
				for(int i=0; i<game.getPlayers().size(); i++){
					game.getPlayers().get(i).resetPlayer();
				}
				for(int i=0; i<game.getPlayers().size(); i++){
					if(asserttrue(game.getPlayers().get(i).getNumBuys(), 1)){
						System.out.println("Player has correct number of buys before turn");
					}else{
						System.out.println("Player does not have correct number of buys before turn");
					}    
					if(asserttrue(game.getPlayers().get(i).getNumActions(), 1)){
						System.out.println("Player has correct number of actions before turn");
					}else{
						System.out.println("Player does not have correct number of actions before turn");
					}
					if(asserttrue(game.getPlayers().get(i).getCoins(), 0)){
						System.out.println("Player has correct number of coins before turn");
					}else{
						System.out.println("Player does not have correct number of coins before turn");
					}    
					System.out.println("------------------Player " + (i+1) + "--------------------");
						game.takeTurn(i);
						if((game.getPlayers().get(i).getDraw().getPile().size()) < 5){
							game.getPlayers().get(i).getDiscard().shuffleDeck();
							game.getPlayers().get(i).discardToDraw();
						}
						if(asserttrue(game.getPlayers().get(i).getNumBuys(), 0)){
							System.out.println("Player has correct number of buys after turn");
						}else{
							System.out.println("Player doesn not have correct number of buys after turn");
						}
						if(asserttrue(game.getPlayers().get(i).getNumActions(), 0)){
							System.out.println("Player has correct number of actions after turn");
						}else{
							System.out.println("Player does not have correct number of actions after turn");
						}
					if(game.checkForEnd() == false)
						break;
				}
				if(assertEnd(true)){
					System.out.println("Game continuing on correct condition");
				}else{
					System.out.println("Game continuing on bad condtition");
				}
			}
			if(assertEnd(false)){
				System.out.println("Game ended on correct condition");
			}else{
				System.out.println("Game ended on incorrect condition");
			}
			game.whoWon();
		}
}