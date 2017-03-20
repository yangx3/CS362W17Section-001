package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class RandomTestDominion {

    public  static void main(String args[]){

        List<Card> cards;
        GameState state;
        Random gen = new Random();

        System.out.println("INITIALIZING CARDS\n");
        cards = new ArrayList<Card>(Card.createCards()); //Initialize Cards
        System.out.println("INITIALIZING GAMESTATE\n");
        state = new GameState(cards); //Initialize State

        Player player;
        player = new Player(state, "PLAYER 1");
        state.addPlayer(player);
        player = new Player(state, "PLAYER 2");
        state.addPlayer(player);
        int numPlayers = gen.nextInt(3);
        while(numPlayers > 0)
        {
            player = new Player(state, "PLAYER " + (numPlayers+2));
            state.addPlayer(player);
            numPlayers--;
        }

        //Assert for number of players
        if(state.players.size() >= 2 && state.players.size() <= 4)
        {
            System.out.println("CORRECT NUMBER OF PLAYERS");
        } else System.out.println("ERROR: INCORRECT NUMBER OF PLAYERS");
        state.initializeGame(); //Set up and initialize the game
        System.out.println("Printing Decks!: ");
        System.out.println("\nInitialization of Dominion Board:\n" + state.toString()); //print decks

        HashMap<Player, Integer> winners = state.play(); //Start PlayGame
        System.out.println ("GAME FINISHED. THANK YOU FOR PLAYING.\n\n");
        for(Player p: winners.keySet()){ //Printing Winners
        	System.out.println("Printing Winners!: ");
            System.out.println ("Player name: " + p.player_username + " , Score: " + winners.get(p) );
        }
        player.printStateGame(); // Player Cards with board


        System.exit(0);

    }


}
