import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Welcome to Dominion!\nThis will be a 2-player game.");
		
		Player player = new Player("Kien", 1 , 1 , 0);
		System.out.print("\nHello " + player.player_name + " here is your info:");
		player.buildDeck();
		for(int i = 0; i < 5; i++){
			player.drawCard();
		}
		player.printInfo();
		player.printHand();
		
		System.exit(0);
	}

}
