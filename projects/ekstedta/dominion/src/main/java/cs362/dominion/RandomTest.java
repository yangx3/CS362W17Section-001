package cs362.dominion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTest {
    private Random rng = new Random();
    private List<Card> supply;

    // List of all kingdom cards
    private ArrayList<Card> allkc = Card.list(
        Card.Adventurer,
        Card.Ambassador,
        Card.Baron,
        Card.CouncilRoom,
        Card.Cutpurse,
        Card.Embargo,
        Card.Feast,
        Card.Gardens,
        Card.GreatHall,
        Card.Market,
        Card.Mine,
        Card.Smithy,
        Card.Village
    );

    // Swap two elements in an array
    public static <T> void swap(List<T> arr, int i, int j) {
        if (i != j) {
            T a = arr.get(i);
            T b = arr.get(j);
            arr.set(i, b);
            arr.set(j, a);
        }
    }

    public static void main(String[] arguments) {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("-------- Beginning game %d --------\n", i);
            new RandomTest().play(i);
            System.out.printf("-------- End of game %d --------\n", i);
        }
    }

    public void play(int seed) {
        rng.setSeed(seed);

        // Select 10 random kingdom cards
        ArrayList<Card> allkc = new ArrayList<Card>(this.allkc);
        ArrayList<Card> kc = new ArrayList<Card>();
        for (int i = 0; i < 10; i++) {
            int j = i + rng.nextInt(allkc.size() - i);
            swap(allkc, i, j);
            kc.add(allkc.get(i));
        }

        int numPlayers = 2 + rng.nextInt(3);
        Game game = new Game(numPlayers, kc, seed);

        List<Card> supply = game.getSupplyCards();
        this.supply = supply;

        ////

        System.out.println("Starting game.");

        int turn = 0;
        while (!game.isGameOver()) {
            //printCards(game);

            while (game.getActions() > 0) {
                // Get action cards
                List<Integer> actions = new ArrayList<Integer>();
                for (int i = 0; i < game.numHandCards(); i++) {
                    if (game.handCard(i).isAction()) {
                        actions.add(i);
                    }
                }

                // Select a random action to play
                // or nothing
                int n = rng.nextInt(actions.size()+1)-1;
                if (n == -1) {
                    break;
                }

                // Play the card
                int pos = actions.get(n);

                System.out.printf("player %d: playing %s\n", game.getCurrentPlayer(), game.handCard(pos));
                playAction(game, pos);
            }

            // Buy phase
            // play all our treasure cards
            playTreasures(game);

            while (game.getBuys() > 0 && game.getCoins() > 0) {
                // Select a random card to buy, or nothing
                int n = rng.nextInt(supply.size()+1)-1;
                if (n == -1) {
                    break;
                }

                // Can we buy it?
                Card card = supply.get(n);
                if (card.cost() > game.getCoins()) {
                    // If it is too expensive, roll again
                    continue;
                }
                if (game.supplyCount(card) <= 0) {
                    // if the card isn't available,
                    // delete it and try again
                    supply.remove(card);
                    continue;
                }

                // Buy the card
                System.out.printf("player %d: buying %s\n", game.getCurrentPlayer(), card);
                game.buyCard(card);
            }
            game.endTurn();
            turn++;
        }
        System.out.printf(" Game ended after %d turns\n", turn);
    }

    public void playAction(Game game, int pos) {
        Card card = game.handCard(pos);
        if (card == Card.Ambassador) {
            // select a random card to reveal
            int reveal = rng.nextInt(game.numHandCards() - 1);
            if (reveal >= pos) {
                reveal++;
            }
            game.playAction(pos, game.handCard(reveal), 0);
        } else if (card == Card.Baron) {
            boolean discard = false;
            game.playAction(pos, discard);
        } else if (card == Card.Embargo) {
            // Choose a random card from the supply
            int n = rng.nextInt(this.supply.size());
            game.playAction(pos, this.supply.get(n));
        } else if (card == Card.Feast) {
            // Choose a random card to gain from the supply
            Card x = this.supply.get(rng.nextInt(this.supply.size()));
            while (x.cost() > 4 || game.supplyCount(x) <= 0) {
                this.supply.remove(x);
                x = this.supply.get(rng.nextInt(this.supply.size()));
            }
            game.playAction(pos, x);
        } else if (card == Card.Mine) {
            // Select a random treasure card to trash
            List<Integer> treasures = new ArrayList<Integer>();
            for (int i = 0; i < game.numHandCards(); i++) {
                if (game.handCard(i).isTreasure()) {
                    treasures.add(i);
                }
            }
            if (treasures.size() < 1) {
                return; // :(
            }
            int n = treasures.get(rng.nextInt(treasures.size()));
            // select a treasure card to gain
            Card gain = Card.Copper;
            if (game.handCard(n).cost()+3 >= 6) {
                gain = Card.Gold;
            } else if (game.handCard(n).cost()+3 >= 3) {
                gain = Card.Silver;
            }
            if (n >= pos) {
                n--;
            }
            game.playAction(pos, n, gain);
        } else {
            game.playAction(pos);
        }
    }

    public static int playTreasures(Game game) {
        int money = 0;
        for (int i = 0; i < game.numHandCards(); i++) {
            if (game.handCard(i) == Card.Copper){
                game.playTreasure(i);
                money++;
                i--;
            }
            else if (game.handCard(i) == Card.Silver){
                game.playTreasure(i);
                money += 2;
                i--;
            }
            else if (game.handCard(i) == Card.Gold){
                game.playTreasure(i);
                money += 3;
                i--;
            }
        }
        return money;
    }

    public static void printCards(Game game) {
        for (int i = 0; i < game.numHandCards(); i++) {
            System.out.printf("Player %d card %d: %s\n", game.getCurrentPlayer(), i, game.handCard(i));
        }
    }
}
