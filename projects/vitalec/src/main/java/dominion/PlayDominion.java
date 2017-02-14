package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PlayDominion {

	public static void main(String args[]) {
	    // Using GSON to debug Objects
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();

	    // Print Logo
        System.out.println(
                "   ___             _      _         \n" +
                "  / _ \\___  __ _  (_)__  (_)__  ___ \n" +
                " / // / _ \\/  ' \\/ / _ \\/ / _ \\/ _ \\\n" +
                "/____/\\___/_/_/_/_/_//_/_/\\___/_//_/\n" +
                "                                    ");

        // Initialize Game Board
        System.out.print("Setting up Game board... ");

	    List<Card> availableCards = Card.createCards();
        List<Card> kingdomCards = new ArrayList<>();

        // Add Kingdom Cards from selected Deck
        // TODO: Implement preset / random decks
        // Using "Dominion Only - First Game" set
        kingdomCards.add(Card.getCard(availableCards, Card.CardName.CELLAR));
        kingdomCards.add(Card.getCard(availableCards, Card.CardName.MARKET));
        kingdomCards.add(Card.getCard(availableCards, Card.CardName.MERCHANT));
        kingdomCards.add(Card.getCard(availableCards, Card.CardName.MILITIA));
        kingdomCards.add(Card.getCard(availableCards, Card.CardName.MINE));
        kingdomCards.add(Card.getCard(availableCards, Card.CardName.MOAT));
        kingdomCards.add(Card.getCard(availableCards, Card.CardName.REMODEL));
        kingdomCards.add(Card.getCard(availableCards, Card.CardName.SMITHY));
        kingdomCards.add(Card.getCard(availableCards, Card.CardName.VILLAGE));
        kingdomCards.add(Card.getCard(availableCards, Card.CardName.WORKSHOP));

        System.out.println("Done!");

        GameState state = new GameState(kingdomCards);

        System.out.println(gson.toJson(state));
        System.out.println();

        // Initialize Players
        System.out.println("Initializing Players... ");
        int numPlayers = 2;

        for(int playerID = 1; playerID <= numPlayers; playerID++) {
            // Create Player
            Player player = new Player(state, "Player " + playerID);

            // Set up player deck and hand
            System.out.println(player.player_username + " drawing cards...");

            // Draw 7 Copper from Supply
            for(int i = 0; i < 7; i++) {
                player.gainCardFromSupply(Card.getCard(availableCards, Card.CardName.COPPER));
            }

            // Draw 3 Estates from Supply
            for(int i = 0; i < 3; i++) {
                player.gainCardFromSupply(Card.getCard(availableCards, Card.CardName.ESTATE));
            }

            System.out.println(player.player_username + " hand:");
            System.out.println(gson.toJson(player.hand));

            // Add Player to GameState
            state.addPlayer(player);
        }

        // Play game
        HashMap<Player, Integer> winners = state.play();

        // Display winners
        for(Player p: winners.keySet()){
			System.out.println ("Player name: "+winners.get(p) + " , Score: "+ winners.get(p) );
		}
			
		System.exit(0);  
	}
	
}
