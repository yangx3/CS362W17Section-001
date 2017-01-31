package cs362.dominion;

import java.util.ArrayList;

public class Play {
    public static void main(String[] arguments) {
        // Standard starting set of kingdom cards.
        // I can't believe java doesn't have array literals??
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

        System.out.println("Starting game.");

        int money = 0;
        int smithyPos = -1;
        int adventurerPos = -1;
        int i = 0;

        int numSmithies = 0;
        int numAdventurers = 0;

        while (!game.isGameOver()) {
            money = 0;
            smithyPos = -1;
            adventurerPos = -1;
            for (i = 0; i < game.numHandCards(); i++) {
                if (game.handCard(i) == Card.Copper) {
                    money++;
                } else if (game.handCard(i) == Card.Silver) {
                    money += 2;
                } else if (game.handCard(i) == Card.Gold) {
                    money += 3;
                } else if (game.handCard(i) == Card.Smithy) {
                    smithyPos = i;
                } else if (game.handCard(i) == Card.Adventurer) {
                    adventurerPos = i;
                }
            }

            if (game.whoseTurn() == 0) {
                // Player 0: likes to buy smithies
                if (smithyPos != -1) {
                    System.out.printf("0: smithy played from position %d\n", smithyPos);
                    game.playCard(smithyPos, -1, -1, -1);
                    System.out.printf("smithy played.\n");
                    money = 0;
                    for (i = 0; i < game.numHandCards(); i++) {
                        if (game.handCard(i) == Card.Copper){
                            game.playCard(i, -1, -1, -1);
                            money++;
                        }
                        else if (game.handCard(i) == Card.Silver){
                            game.playCard(i, -1, -1, -1);
                            money += 2;
                        }
                        else if (game.handCard(i) == Card.Gold){
                            game.playCard(i, -1, -1, -1);
                            money += 3;
                        }
                        i++;
                    }
                }

                System.out.printf("0: money = %d\n", money);

                if (money >= 8) {
                    System.out.printf("0: bought province\n");
                    game.buyCard(Card.Province);
                } else if (money >= 6) {
                    System.out.printf("0: bought gold\n");
                    game.buyCard(Card.Gold);
                } else if ((money >= 4) && (numSmithies < 2)) {
                    System.out.printf("0: bought smithy\n");
                    game.buyCard(Card.Smithy);
                    numSmithies++;
                } else if (money >= 3) {
                    System.out.printf("0: bought silver\n");
                    game.buyCard(Card.Silver);
                }

                System.out.printf("0: end turn\n");
                game.endTurn();
            } else {
                // Player 1: likes to buy adventurers
                if (adventurerPos != -1) {
                    System.out.printf("1: adventurer played from position %d\n", adventurerPos);
                    game.playCard(adventurerPos, -1, -1, -1);
                    money = 0;
                    i=0;
                    for (i = 0; i < game.numHandCards(); i++) {
                        if (game.handCard(i) == Card.Copper){
                            game.playCard(i, -1, -1, -1);
                            money++;
                        }
                        else if (game.handCard(i) == Card.Silver){
                            game.playCard(i, -1, -1, -1);
                            money += 2;
                        }
                        else if (game.handCard(i) == Card.Gold){
                            game.playCard(i, -1, -1, -1);
                            money += 3;
                        }
                        i++;
                    }
                }

                System.out.printf("1: money = %d\n", money);

                if (money >= 8) {
                    System.out.printf("1: bought province\n");
                    game.buyCard(Card.Province);
                } else if ((money >= 6) && (numAdventurers < 2)) {
                    System.out.printf("1: bought adventurer\n");
                    game.buyCard(Card.Adventurer);
                    numAdventurers++;
                } else if (money >= 6) {
                    System.out.printf("1: bought gold\n");
                    game.buyCard(Card.Gold);
                } else if (money >= 3) {
                    System.out.printf("1: bought silver\n");
                    game.buyCard(Card.Silver);
                }

                System.out.printf("1: endTurn\n");
                game.endTurn();
            }

            System.out.printf("Player 0: %d\n", game.scoreFor(0));
            System.out.printf("Player 1: %d\n", game.scoreFor(1));
        }

        System.out.printf("Finished game.\n");
        System.out.printf("Player 0: %d\n", game.scoreFor(0));
        System.out.printf("Player 1: %d\n", game.scoreFor(1));

    }
}
