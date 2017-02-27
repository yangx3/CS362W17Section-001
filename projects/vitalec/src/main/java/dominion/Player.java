package dominion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import dominion.Card.Type;

public class Player {

    List<Card> hand = new ArrayList<>();
    LinkedList<Card> deck = new LinkedList<>();
    List<Card> discard = new ArrayList<>();
    List<Card> trash = new ArrayList<>();

    String player_username;

    int numActions;
    int numBuys;
    int coins;

    final GameState gameState;


    public Player(GameState gameState, String player_username) {
        this.player_username = player_username;
        this.gameState = gameState;
    }

    final Card drawCard() {
        if (deck.isEmpty()) {// Deck is empty
            // Step 1 Shuffle the discard pile back into a deck
            System.out.println("reshuffle the deck of the player "
                    + player_username + " to draw FIVE cards");
            while (discard.size() > 0) {
                int ndx = (int) Randomness.nextRandomInt(discard.size());
                // Move discard to deck
                deck.add(discard.remove(ndx));
            }
        }

        Card toDraw = deck.poll();
        hand.add(toDraw);// Add card to hand and hand count automatically will
        // be incremented since we use List
        System.out.println("draw " + toDraw);
        Collections.sort(hand);
        return toDraw;
    }

    final void initializePlayerTurn() {
        this.numActions = 1;
        this.coins = 0;
        this.numBuys = 1;

        // Draw the top 5 cards as your starting hand
        for (int i = 0; i < 5; i++) {
            drawCard();
        }
    }


    final boolean gainCard(Card card) {
        discard.add(card);
        System.out.println("Player: "+this.player_username+" gains "+card);
        return true;
    }

    public void gainCardFromSupply(Card card) {
        int currentCards = this.gameState.supply.get(card);
        this.discard.add(card);
        this.gameState.supply.put(card, currentCards - 1);
    }

    //Discard hand
    public void discard(Card card) {
        hand.remove(card);
        discard.add(card);
        System.out.println("Player:  "+player_username+" discards "+card);
    }

    public void playKingdomCard() {
        while (numActions > 0) {
            List<Card> actionCards = Card.filter(hand, Type.ACTION);

            if (actionCards.size() == 0)
                return;

            Card c = (Card) actionCards.get(0);
            if (c == null)
                return;
            System.out.println("Player.actionPhase Card:" + c.toString());
            numActions -= 1;

            c.play(this, gameState, null, null);
        }
    }

    final int scoreFor() {
        int score = 0;
        //score from hand
        for (Card c : hand)
            score += c.score(this);
        //score from discard
        for (Card c : discard)
            score += c.score(this);
        //score from deck
        for (Card c : deck)
            score += c.score(this);



        return score;
    }

    public void playTreasureCard() {
        System.out.println(" --- --------------------------- --- ");
        System.out.println("TO-DO playTreasureCard ");
        System.out.println(" --- --------------------------- --- ");
    }

    public void buyCard(Card card) {
        if(this.gameState.supply.containsKey(card) && this.coins >= card.getCost()) {
            this.discard.add(card);
            this.gameState.supply.remove(card);
        }
    }

    final void endTurn() {
        System.out.println(" --- --------------------------- --- ");
        System.out.println("TO-DO endTurn ");
        System.out.println(" --- --------------------------- --- ");
    }


    public void printStateGame(){
        System.out.println(" --- " + this.player_username + " --- ");
        System.out.println(" --- --------------------------- --- ");
        System.out.println(this.gameState.toString());
        System.out.println(" --- --------------------------- --- ");
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(" --- " + this.player_username + " --- ");
        sb.append(" --- --------------------------- --- ");

        sb.append("Hand: " + this.hand);
        sb.append("Discard: " + this.discard);
        sb.append("Deck: " + this.deck);
        sb.append("numActions: " + this.numActions);
        sb.append("coinss: " + this.coins);
        sb.append("numBuys: " + this.numBuys);
        sb.append("\n");

        return sb.toString();
    }

}