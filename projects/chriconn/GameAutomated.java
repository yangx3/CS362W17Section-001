import java.io.*;
// package org.cs362.dominion;
import java.util.*;

public class GameAutomated {
    public static void main(String[] args) {

        //creates three players
        GameAutomated dominion = new GameAutomated("Connor", "Billy", "Lily", "Robert");
        // GameAutomated dominion = new GameAutomated("Connor");

        //draw 5 cards for each player
        for (int x = 0; x < dominion.numPlayers(); x++) {
            dominion.getPlayer(x).draw(5);
        }

        //as long as the game has not been won
        while (!dominion.win()) {
            for (int x = 0; x < dominion.numPlayers(); x++) {
                dominion.playerTurn(x);
            }
        }

        System.out.println("The game is over");

        //consolidate all the cards into one deck for counting
        for (int y = 0; y < dominion.numPlayers(); y++) {
            dominion.getPlayer(y).discardAll();
            dominion.getPlayer(y).recycle();
        }
    }

    //array of all decks the game owns
    ArrayList<Deck> bank;
    public Deck trash;
    int numPlayers;
    ArrayList<Player> players;
    public ArrayList<String> cardsInGame;

    public String randomCard() {
        Random rand = new Random();
        return cardsInGame.get(rand.nextInt(cardsInGame.size()));
    }
    public boolean yesNo() {
        Random rand = new Random();
        if (rand.nextInt(2) == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    public String randomTreasure() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        if (n == 0)         { return "gold";   }
        else if (n == 1)    { return "silver"; }
        else                { return "copper"; }
    }
    public GameAutomated() {
        bank = new ArrayList<Deck>();
        players = new ArrayList<Player>();
        trash = new Deck();
        cardsInGame = new ArrayList<String>();
        //treasure
        bank.add(new Deck(30, new Card("gold")));
        bank.add(new Deck(40, new Card("silver")));
        bank.add(new Deck(60, new Card("copper")));

        //victory
        bank.add(new Deck(12, new Card("province")));
        bank.add(new Deck(12, new Card("dutchy")));
        bank.add(new Deck(24, new Card("estate")));

        //action
        cardsInGame.add("adventurer");
        cardsInGame.add("ambassador");
        cardsInGame.add("baron");
        cardsInGame.add("council room");
        cardsInGame.add("cutpurse");
        cardsInGame.add("embargo");
        cardsInGame.add("feast");
        cardsInGame.add("gardens");
        cardsInGame.add("great hall");
        cardsInGame.add("mine");
        cardsInGame.add("curse");
        cardsInGame.add("smithy");
        cardsInGame.add("village");
        cardsInGame.add("witch");
        cardsInGame.add("cellar");
        cardsInGame.add("salvager");

        for (String deckName: cardsInGame) {
            bank.add(new Deck(10, new Card(deckName)));
        }

        cardsInGame.add("gold");
        cardsInGame.add("silver");
        cardsInGame.add("copper");
        cardsInGame.add("province");
        cardsInGame.add("dutchy");
        cardsInGame.add("estate");
    }
    public GameAutomated(String ... names) {
        bank = new ArrayList<Deck>();
        trash = new Deck();
        cardsInGame = new ArrayList<String>();
        //treasure
        bank.add(new Deck(30, new Card("gold")));
        bank.add(new Deck(40, new Card("silver")));
        bank.add(new Deck(60, new Card("copper")));

        //victory
        bank.add(new Deck(12, new Card("province")));
        bank.add(new Deck(12, new Card("dutchy")));
        bank.add(new Deck(24, new Card("estate")));

        //build the action decks
        cardsInGame.add("adventurer");
        cardsInGame.add("ambassador");
        cardsInGame.add("baron");
        cardsInGame.add("council room");
        cardsInGame.add("cutpurse");
        cardsInGame.add("embargo");
        cardsInGame.add("feast");
        cardsInGame.add("gardens");
        cardsInGame.add("great hall");
        cardsInGame.add("mine");
        cardsInGame.add("curse");
        cardsInGame.add("smithy");
        cardsInGame.add("village");
        cardsInGame.add("witch");
        cardsInGame.add("cellar");
        cardsInGame.add("salvager");

        for (String deckName: cardsInGame) {
            bank.add(new Deck(10, new Card(deckName)));
        }

        cardsInGame.add("gold");
        cardsInGame.add("silver");
        cardsInGame.add("copper");
        cardsInGame.add("province");
        cardsInGame.add("dutchy");
        cardsInGame.add("estate");

        //build the players
        players = new ArrayList<Player>();
        for (String s: names) {
            players.add(new Player(s));
        }
        numPlayers = names.length;
    }
    public void playerTurn(int num) {

        /*******************************************************/
        /*************** Variable initialization ***************/
        /*******************************************************/

        String name = getPlayer(num).getName(); //players name
        String cardToPlay;                      //card the user will want to play
        //award the player one action and one buy to start the turn
        getPlayer(num).starterPoints();
        System.out.println("\n\n");
        System.out.println(getPlayer(num).getMoves());
        System.out.println("\n");
        showHand(num);

        /*******************************************************/
        /******************** Action phase ********************/
        /*******************************************************/

        //if the player has action points and they have action cards in their hand
        while (getPlayer(num).hasActions()) {
            cardToPlay = randomCard();
            System.out.printf("Playing %s\n", cardToPlay);
            playCard(num, cardToPlay);
        }

        /*******************************************************/
        /******************** Buying Phase ********************/
        /*******************************************************/

        //tally up the total treasure value
        getPlayer(num).sumTreasure();

        System.out.println("\n");
        System.out.println(getPlayer(num).getMoves());

        //set the loop to exit by default
        String purchaseCard;
        boolean done = true;
        do {
            purchaseCard = randomCard();
            printBank();
            System.out.printf("Buying %s\n", purchaseCard);
            //if the getDeck function couldn't find the deck, it will return null
            //if it didn't return null, it means it found the deck.
            if (getDeck(purchaseCard) != null) {
                getPlayer(num).buy(getDeck(purchaseCard));

                getPlayer(num).modifyBuys(-1);
                getPlayer(num).modifyValues(-1 * getDeck(purchaseCard).cardInfo(0).getCost());

                done = false;
            }
        } while (!done && (getPlayer(num).getBuys() > 0));

        // System.out.println("\n");
        // getPlayer(num).printAllDecks();

        getPlayer(num).discardAll();
        getPlayer(num).draw(5);
    }
    public boolean playCard(int num, String cardName) {
        if (getPlayer(num).hand.indexOf(cardName) >= 0) {
            Card temp = new Card(cardName);
            if (!temp.isType("action")) {

                return false;
            }
            else {
                applyCardActions(getPlayer(num), num, temp);
                if (! (cardName.equals("feast")) ) {
                    getPlayer(num).discard(cardName);
                }
                getPlayer(num).modifyActions(-1);
                return true;
            }
        }
        else {
            return false;
        }
    }
    public void applyCardActions(Player player, int num, Card card) {
        Random rand = new Random();

        player.modifyActions(card.getActions());
        player.modifyValues(card.getValue());
        player.modifyBuys(card.getBuys());

        if (card.getCards() > 0) {
            player.draw(card.getCards());
        }

        //Section to apply special actions from cards
        if (card.isType("special action")) {

            /*Custom Cards:
                Adventurer -
                    Reveal cards from your deck until you reveal 2 treasure cards.
                    Put those Treasure cards into your hand and discard the other reveal cards.
                Ambassador -
                    Reveal a card from your hand.
                    Return up to 2 copies of it from your hand to the Supply.
                    Then each other player gains a copy of it.
                Baron -
                    You may discard an Estate card.
                    If you do, +4 Coins. Otherwise, gain an Estate card.
                Council room -
                    +4 Cards, +1 Buy, Each other player draws a card
                Cutpurse -
                    Each other player discards a copper card (or reveals a hand with no copper)
                Embargo -
                    Trash for +2 coins. Put an Embargo token on top of a Supply pile.
                    A player gains a Curse card per Embargo token on that pile when a card is bought.
                Feast -
                    Trash this card. Gain a card costing up to 5 coins
                Gardens -
                    Worth 1 victory for every 10 cards in your deck(rounded down)
                Great hall -
                    Lets the player draw an extra card and have an extra action
                Mine -
                    Trash a treasure card from your hand.
                    Gain a treasure card costing up to 3 coins more and put that card in your hand
                Custom Cards:
                DONE
                Gardens -
                    Worth 1 victory for every 10 cards in your deck(rounded down)
            */
            if (card.getName().equals("adventurer")) {
                //number of treasures drawn so far is 0
                int numTreasures = 0;
                //the loop stops when we draw two treasure cards
                while (numTreasures < 2) {
                    //if we draw a treasure, increment the treasure counter
                    if (player.draw().isType("treasure")) {
                        numTreasures++;
                    }
                    //otherwise, discard that card we just drew
                    else {
                        player.discardAtIndex(player.hand.numCards() - 1);
                    }
                }
            }
            else if (card.getName().equals("baron")) {
                boolean discard = yesNo();
                if (discard) {
                    player.discard("estate");
                    player.modifyValues(4);
                }
                else {
                    //draw from the estate deck
                    player.buy(getDeck("estate"));

                }
            }
            else if (card.getName().equals("witch")) {
                for (int x = 0; x < players.size(); x++) {
                    if (x != num) {
                        getPlayer(x).buy(getDeck("curse"));
                    }
                }
            }
            else if (card.getName().equals("cellar")) {
                String discard;
                int numDraw = 0;
                int n;
                do {
                    n = rand.nextInt(200);
                    if ( n > 40) {
                        discard = randomCard();
                    }
                    else {
                        discard = "done";
                    }

                    if (player.hand.hasCard(discard)) {
                        player.discard(discard);
                        numDraw++;
                        player.showHand();
                    }

                } while (!discard.equals("done"));
                player.draw(numDraw);
            }
            else if (card.getName().equals("council room")) {
                for (int x = 0; x < players.size(); x++) {
                    if (x != num) {
                        getPlayer(x).draw();
                    }
                }

            }
            else if (card.getName().equals("cutpurse")) {
                for (int x = 0; x < players.size(); x++) {
                    if (x != num) {
                        if (getPlayer(x).hand.indexOf("copper") >= 0) {
                            getPlayer(x).discardAtIndex(getPlayer(x).hand.indexOf("copper"));
                        }
                    }
                }
            }
            else if (card.getName().equals("feast")) {
                trash.addCard(player.hand.drawCard("feast"));
                player.buy(getDeck(randomCard()));
            }
            else if (card.getName().equals("mine")) {
                String treasureName = randomTreasure();
                boolean again = false;
                do {
                    if (treasureName.equals("copper")) {
                        trash.addCard(player.hand.drawCard("copper"));
                        player.hand.addCard(getDeck("silver").drawCard());
                        again = false;
                    }
                    else if (treasureName.equals("silver")) {
                        trash.addCard(player.hand.drawCard("silver"));
                        player.hand.addCard(getDeck("gold").drawCard());
                        again = false;
                    }
                    else {
                        again = true;
                    }
                } while (again);
            }
            else if (card.getName().equals("ambassador")) {
                String supply = randomCard();
                int numberBack = rand.nextInt(2) + 1;

                for (int y = 0; y < numberBack; y++) {
                    if (player.hand.hasCard(supply)) {
                        getDeck(supply).addCard(player.hand.drawCard(supply));
                        for (int x = 0; x < players.size(); x++) {
                            if (x != num) {
                                getPlayer(x).buy(getDeck(supply));
                            }
                        }
                    }
                }
            }
            else if (card.getName().equals("embargo")) {
                trash.addCard(player.hand.drawCard("embargo"));
                player.modifyValues(2);
                getDeck(randomCard()).modifyTokens(1);
            }
        }
    }
    public Player getPlayer(int number) {
        return players.get(number);
    }
    public Deck getDeck(String name) {
        for(int x = 0; x < bank.size(); x++) {
            String deckName = bank.get(x).getName();
            if (deckName.equals(name)) {
                return bank.get(x);
            }
        }
        return null;
    }
    public int numPlayers() {
        return numPlayers;
    }
    public int calculateVictoryPoints(Player player) {
        int victoryPoints = 0;
        int numCards = player.drawDeck.numCards();
        for (int x = 0; x < numCards; x++) {
            if (player.drawDeck.cardInfo(x).isType("victory")) {
                victoryPoints +=  player.drawDeck.cardInfo(x).getVictoryPoints();
            }
        }
        return victoryPoints;
    }
    public boolean win() {
        if (getDeck("province").empty()) {
            return true;
        }
        int emptyDecks = 0;
        for (int x = 0; x < bank.size(); x++) {
            if (bank.get(x).empty()) {
                emptyDecks++;
                if (emptyDecks == 3) {
                    return true;
                }
            }
        }
        return false;
    }



    public void printAllDecks(int num) {
        String name = getPlayer(num).getName();
        System.out.println("\n" + name + "'s draw deck: ");
        getPlayer(num).drawDeck.printDeck();
        System.out.println("\n" +  name + "'s hand:");
        getPlayer(num).showHand();
        System.out.println("\n" + name + "'s discarded deck: ");
        getPlayer(num).discard.printDeck();
    }
    public void printBank() {
        for (int x = 0; x < bank.size(); x++) {
            System.out.printf("%-15s# remaining: %d\tCost: %d\tTokens: %d\tDescription: %s\n", bank.get(x).getName(), bank.get(x).numCards(), bank.get(x).cardInfo(0).getCost(), bank.get(x).getTokens(), bank.get(x).cardInfo(0).getDescription());
        }
    }
    public void showHand(int playerNumber) {
        System.out.println(getPlayer(playerNumber).getName() + "'s hand: ");
        getPlayer(playerNumber).showHand();
    }
    public void printBank(int coinLimit) {
        for (int x = 0; x < bank.size(); x++) {
            if (bank.get(x).cardInfo(0).getCost() <= coinLimit) {
                System.out.printf("%-15s# remaining: %d\tCost: %d\tTokens: %d\tDescription: %s\n", bank.get(x).cardInfo(0).getName(), bank.get(x).numCards(), bank.get(x).cardInfo(0).getCost(), bank.get(x).getTokens(), bank.get(x).cardInfo(0).getDescription());
            }
        }
    }


}
