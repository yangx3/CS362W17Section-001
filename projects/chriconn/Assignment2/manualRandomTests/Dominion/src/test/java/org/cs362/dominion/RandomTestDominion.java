package org.cs362.dominion;
import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class RandomTestDominion {
    @Test
    public void main() {
        //creates a game with the number of required players
        Game dominion = new Game();
        ArrayList<String> playerNames = new ArrayList<String>();
        playerNames.add("Connor");
        playerNames.add("Billy");
        playerNames.add("Robert");
        playerNames.add("Courtney");
        Random rand = new Random(10);
        int playersToAdd = rand.nextInt(3) + 2;
        for (int x = 0; x < playersToAdd; x++) {
            dominion.addPlayer(playerNames.remove(rand.nextInt(playerNames.size())));
        }

        //adds ten random kingdom cards to the bank
        int cardNumbers = 0;
        while (cardNumbers < 10) {
            String tempCard = dominion.randomKingdomCard();
            if (dominion.getDeck(tempCard) == null) {
                dominion.addToBank(tempCard);
                cardNumbers++;
            }
        }


        //draws 5 cards for each person
        for (int x = 0; x < dominion.numPlayers(); x++) {
            dominion.getPlayer(x).draw(5);
        }

        //as long as the game has not been won, play the game
        while (!dominion.win()) {
            for (int x = 0; x < dominion.numPlayers(); x++) {
                dominion.playerTurn(x);
            }
        }
        dominion.tallyPoints();
    }
}
