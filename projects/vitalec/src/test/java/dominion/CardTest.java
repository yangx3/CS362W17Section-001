package dominion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardTest {
    private List<Card> allCards;

    @BeforeEach
    public void initializeAllCards() {
        this.allCards = Card.createCards();
    }

    @Test
    public void testCreateAllCards() {
        assertAll(
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.COPPER))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.SILVER))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.GOLD))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.PROVINCE))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.DUCHY))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.ESTATE))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.CURSE))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.CELLAR))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.CHAPEL))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.MOAT))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.HARBINGER))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.MERCHANT))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.VASSAL))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.VILLAGE))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.WORKSHOP))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.BUREAUCRAT))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.GARDENS))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.MILITIA))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.MONEYLENDER))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.POACHER))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.REMODEL))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.SMITHY))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.THRONE_ROOM))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.BANDIT))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.COUNCIL_ROOM))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.FESTIVAL))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.LABORATORY))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.LIBRARY))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.MARKET))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.MINE))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.SENTRY))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.WITCH))),
                () -> assertTrue(allCards.contains(Card.getCard(allCards, Card.CardName.ARTISAN)))
        );
    }

    @Test
    public void testGetCardsByTypeTreasure() {
        List<Card> treasureCards = Card.filter(allCards, Card.Type.TREASURE);
        assertEquals(3, treasureCards.size());
    }

    // TODO: testGetCardsByTypeVictory

    // TODO: testGetCardsByTypeAction

    @Test
    public void testGetCardCost() {
        Card copper = Card.getCard(allCards, Card.CardName.COPPER);
        Card silver = Card.getCard(allCards, Card.CardName.SILVER);
        Card gold = Card.getCard(allCards, Card.CardName.GOLD);

        assertAll(
                () -> assertEquals(0, copper.getCost()),
                () -> assertEquals(3, silver.getCost()),
                () -> assertEquals(6, gold.getCost())
        );
    }

    @Test
    public void testCardToString() {
        Card harbinger = Card.getCard(allCards, Card.CardName.HARBINGER);
        assertEquals(" \tHARBINGER-ACTION \t\t Cost: 3 \t\t Score: 0 \tTreasure Value: 0", harbinger.toString());
    }
}
