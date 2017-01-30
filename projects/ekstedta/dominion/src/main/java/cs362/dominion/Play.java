package cs362.dominion;

import java.util.ArrayList;

public class Play {
    public static void main(String[] arguments) {
        ArrayList<Card> kingdomCards = new ArrayList<>();
        kingdomCards.add(Card.Cellar);
        kingdomCards.add(Card.Market);
        kingdomCards.add(Card.Militia);
        kingdomCards.add(Card.Mine);
        kingdomCards.add(Card.Moat);
        kingdomCards.add(Card.Remodel);
        kingdomCards.add(Card.Smithy);
        kingdomCards.add(Card.Village);
        kingdomCards.add(Card.Woodcutter);
        kingdomCards.add(Card.Workshop);

        int seed = 1;

        Game game = new Game(2, kingdomCards, seed);
        
    }
}
