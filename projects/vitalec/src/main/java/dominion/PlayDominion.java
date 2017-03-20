package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Card> kingdomCards = Card.createCards().stream()
                .filter(card -> card.getType() == Card.Type.ACTION)
                .collect(Collectors.toList());

        List<Card> selectedKingdomCards = new ArrayList<>();

        // Select 10 random kingdom cards for this game
        while(selectedKingdomCards.size() < 10) {
            Card card = Randomness.randomMember(kingdomCards);

            if(!selectedKingdomCards.contains(card)) {
                selectedKingdomCards.add(card);
            }
        }

        System.out.println("Done!");

        GameState state = new GameState(kingdomCards);

        System.out.println(gson.toJson(state));
        System.out.println();

        // Initialize Players
        System.out.println("Initializing Players... ");
        int numPlayers = 2;
        if(args.length == 1) {
            int numPlayersArg = Integer.parseInt(args[0]);
            if(numPlayers >= 2 && numPlayersArg <= 4) {
                numPlayers = numPlayersArg;
            }
        }

        for(int playerID = 1; playerID <= numPlayers; playerID++) {
            // Create Player
            Player player = new Player(state, "Player " + playerID);

            // Set up player deck and hand
            System.out.println(player.player_username + " initializing deck...");

            // Add 7 Copper from Supply to Deck
            for(int i = 0; i < 7; i++) {
                player.gainCardFromSupply(Card.getCard(availableCards, Card.CardName.COPPER));
            }

            // Add 3 Estates from Supply to Deck
            for(int i = 0; i < 3; i++) {
                player.gainCardFromSupply(Card.getCard(availableCards, Card.CardName.ESTATE));
            }

            // Add Player to GameState
            state.addPlayer(player);
        }

        // Play game
        HashMap<Player, Integer> winners = state.play();

        // Display winners
        winners.forEach((winner, score) -> {
            System.out.println(winner.player_username + " - Score: " + winners.get(winner));
        });

		System.exit(0);
	}

}
