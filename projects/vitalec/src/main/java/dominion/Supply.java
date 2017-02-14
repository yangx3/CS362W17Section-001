package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Supply {

    private HashMap<Card, Integer> cards;

    Supply(ArrayList<Card> kingdomCardSet) {
        List<Card> availCards = Card.createCards();
        this.cards.put(Card.getCard(availCards, Card.CardName.COPPER), 60);
        this.cards.put(Card.getCard(availCards, Card.CardName.SILVER), 40);
        this.cards.put(Card.getCard(availCards, Card.CardName.GOLD), 30);
        this.cards.put(Card.getCard(availCards, Card.CardName.ESTATE), 14);
        this.cards.put(Card.getCard(availCards, Card.CardName.DUCHY), 8);
        this.cards.put(Card.getCard(availCards, Card.CardName.PROVINCE), 8);

        kingdomCardSet.forEach(card -> {
            if(card.getType() == Card.Type.VICTORY) {
                this.cards.put(card, 8);
            } else {
                this.cards.put(card, 10);
            }
        });
    }

}
