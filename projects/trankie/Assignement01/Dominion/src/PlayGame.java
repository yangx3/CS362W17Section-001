import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Welcome to Dominion!\nThis will be a 2-player game.");
		List<Card> testCards = new LinkedList<Card>();
		
		for (Card card:testCards)
			System.out.print(card.toString());
		
		System.exit(0);
	}

}
