import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class RandomTestDominion {

    public  static void main(String args[]){

        List<Card> cards;
        GameState state;
        Random gen = new Random();

//INITIALIZE CARDS AND STATE
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

//INITIALIZE PLAYERS 2-4
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
            System.out.println("NUMBER OF PLAYERS IS CORRECT");
        } else System.out.println("ERROR: NUMBER OF PLAYERS IS INCORRECT");
//INITIALIZE GAME
        state.initializeGame();

//PRINT PLAYER DECKS
        System.out.println("\nInitialization of Dominion Board:\n\n" + state.toString());

//ACTUALLY PLAY THE GAME HERE!!!
        HashMap<Player, Integer> winners = state.play();
        System.out.println ("Finished game.\n\n");

//PRINT WINNERS
        for(Player p: winners.keySet()){
            System.out.println ("Player name: " + p.player_username + " , Score: " + winners.get(p) );
        }

//PRINT PLAYER'S CARDS AND GAMEBOARD
        player.printStateGame();


        System.exit(0);

    }


}
