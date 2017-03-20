package dominion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import dominion.Card.Type;

public class Player {

    List<Card> hand = new ArrayList<>();
    LinkedList<Card> deck = new LinkedList<>();
    List<Card> discard = new ArrayList<>();
    List<Card> trash = new ArrayList<>();
    List<Card> cardsInPlay = new ArrayList<>();

    String player_username;

    int numActions;
    int numBuys;
    int coins;

    final GameState gameState;


    public Player(GameState gameState, String player_username) {
        this.player_username = player_username;
        this.gameState = gameState;
    }

    final void drawCard() {
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

        if(deck.isEmpty()) {
            return;
        }

        Card toDraw = deck.poll();
        hand.add(toDraw);// Add card to hand and hand count automatically will
        // be incremented since we use List
        System.out.println("draw " + toDraw);
        Collections.sort(hand);
    }

    final void initializePlayerTurn() {
        this.numActions = 1;
        this.coins = 0;
        this.numBuys = 1;

        // Draw the top 5 cards as your starting hand
        for (int i = 0; i < 5; i++) {
            this.drawCard();
        }
    }


    final boolean gainCard(Card card) {
        discard.add(card);
        System.out.println("Player: "+this.player_username+" gains "+card);
        return true;
    }

    public void gainCardFromSupply(Card card) {
        if(this.gameState.supply.containsKey(card)) {
            int currentCards = this.gameState.supply.get(card);
            this.discard.add(card);
            this.gameState.supply.put(card, currentCards - 1);
        }
    }

    //Discard hand
    public void discard(Card card) {
        discard.add(hand.remove(hand.indexOf(card)));
        System.out.println("Player:  "+player_username+" discards "+card);
    }

    public void buyCard() {
        int availCoins = getAvailableCoins();
        System.out.println("Available Coins: " + availCoins);

        List<Card> affordableCards = gameState.supply.entrySet().stream()
                .filter(map -> map.getKey().getCost() <= availCoins && map.getKey().getCardName() != Card.CardName.CURSE)
                .map(map -> map.getKey())
                .collect(Collectors.toList());

        System.out.println(affordableCards.toString());

        Card selectedCard = Randomness.randomMember(affordableCards);
        System.out.println(player_username + " buying: " + selectedCard.getCardName());

        List<Card> treasureCards = Card.filter(hand, Type.TREASURE);

        while(coins < selectedCard.getCost() && !treasureCards.isEmpty()) {
            Card treasureCard = treasureCards.get(0);
            coins += treasureCard.getTreasureValue();
            discard(treasureCard);

            treasureCards = Card.filter(hand, Type.TREASURE);
        }

        gainCardFromSupply(selectedCard);
    }

    private int getAvailableCoins() {
        int availCoins = coins;

        for (Card card : Card.filter(hand, Type.TREASURE)) {
            availCoins += card.getTreasureValue();
        }

        System.out.println("Available coins: " + availCoins);

        return availCoins;
    }

    public void playKingdomCard() {
        System.out.println("numActions: " + numActions);
        while (numActions > 0) {
            System.out.println("DOING A THING");
            List<Card> actionCards = Card.filter(hand, Type.ACTION);

            System.out.println(actionCards.size());

            if (actionCards.size() == 0)
                return;

            Card c = actionCards.get(0);
            if (c == null)
                return;
            System.out.println("Player.actionPhase Card:" + c.toString());
            numActions -= 1;

            c.play(this, gameState);
        }
    }

    public void trashFromHand(Card card) {
        if(this.hand.contains(card)) {
            this.hand.remove(card);
            this.trash.add(card);
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

    final void endTurn() {
        System.out.println("END PHASE - DISCARD HAND");
        for(int i = 0; i < hand.size(); i++) {
            discard(hand.get(i));
        }
    }

    public void showHand() {
        System.out.println(this.player_username + " revealing hand!");
        this.hand.forEach(card -> System.out.println(card.getCardName()));
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