package dominion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {
    private List<Card> allCards = Card.createCards();
    private GameState gameState;
    private Player player;


    @BeforeEach
    public void initializePlayer() {
        List<Card> kingdomCards = new ArrayList<>();

        // Add Kingdom Cards from selected Deck
        // Using "Dominion Only - First Game" set
        kingdomCards.add(Card.getCard(allCards, Card.CardName.CELLAR));
        kingdomCards.add(Card.getCard(allCards, Card.CardName.MARKET));
        kingdomCards.add(Card.getCard(allCards, Card.CardName.MERCHANT));
        kingdomCards.add(Card.getCard(allCards, Card.CardName.MILITIA));
        kingdomCards.add(Card.getCard(allCards, Card.CardName.MINE));
        kingdomCards.add(Card.getCard(allCards, Card.CardName.MOAT));
        kingdomCards.add(Card.getCard(allCards, Card.CardName.REMODEL));
        kingdomCards.add(Card.getCard(allCards, Card.CardName.SMITHY));
        kingdomCards.add(Card.getCard(allCards, Card.CardName.VILLAGE));
        kingdomCards.add(Card.getCard(allCards, Card.CardName.WORKSHOP));

        this.gameState = new GameState(kingdomCards);

        // Create Player
        player = new Player(this.gameState, "Player 1");

        // Set up player deck and hand...

        // Draw 7 Copper from Supply
        for(int i = 0; i < 7; i++) {
            player.gainCardFromSupply(Card.getCard(allCards, Card.CardName.COPPER));
        }

        // Draw 3 Estates from Supply
        for(int i = 0; i < 3; i++) {
            player.gainCardFromSupply(Card.getCard(allCards, Card.CardName.ESTATE));
        }

        // Add Player to GameState
        gameState.addPlayer(player);
    }

    @Test
    public void testCanCreatePlayer() {
        assertEquals("Player 1", player.player_username);
    }

    @Test
    public void testPlayerHasGameState() {
        assert(player.gameState != null && player.gameState.players.contains(player));
    }

    @Test
    public void testPlayerCanDrawCard() {
        int startingHandSize = player.hand.size();
        player.drawCard();

        assertTrue(startingHandSize < player.hand.size());
    }

    @Test
    public void testInitializePlayerTurn() {
        player.initializePlayerTurn();
        assertAll(
                () -> assertEquals(1, player.numActions),
                () -> assertEquals(0, player.coins),
                () -> assertEquals(1, player.numBuys)
        );
    }

    @Test
    public void testGainCard() {
        player.gainCard(Card.getCard(allCards, Card.CardName.FESTIVAL));
        assertTrue(player.discard.contains(Card.getCard(allCards, Card.CardName.FESTIVAL)));
    }

    @Test
    public void playerCanDrawCard() {
        int handSize = player.hand.size();
        player.drawCard();
        assertEquals(handSize + 1, player.hand.size());
    }

    @Test
    public void playerCanDiscardCard() {
        player.drawCard();
        assertEquals(1, player.hand.size());

        player.discard(player.hand.get(0));
        assertEquals(0, player.hand.size());
    }
}
