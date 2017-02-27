package org.cs362.dominion;

/**
 * Created by Meagan on 2/12/2017.
 * Collaborated with David Baugh
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CardTest{
    //members
    private List<Card> cards;
    private GameState state;
    private Player player1;
    private Player player2;

//    Randomness.reset(10)

    @Before
    public void initializeGame() {
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
        player1 = new Player(state, "PLAYER 1");
        state.addPlayer(player1);
        player2 = new Player(state, "PLAYER 2");
        state.addPlayer(player2);
        state.initializeGame();
    }
    //-------------------
// KINGDOM CARD TESTS
//-------------------
    @Test
    public void testValuesAdventurer() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.adventurer).getCost(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.adventurer).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.adventurer).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayAdventurer() {
        player1.initializePlayerTurn();

        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);
        player1.hand.add(Card.getCard(cards, Card.CardName.adventurer));
        System.out.println(player1);
        player1.playKingdomCard();
        assertTrue(player1.hand.size() >= 6);
        assertTrue(player1.deck.size() >= 1);//depends if coppers are in front or not
        assertEquals(player1.playedCards.size(), 1);
        System.out.println(player1);
    }
    @Test
    public void testValuesAmbassador() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.ambassador).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.ambassador).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.ambassador).getType(), Card.Type.ACTION);
    }
    public void testPlayAmbassador() {
        player1.initializePlayerTurn();
        player2.initializePlayerTurn();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player2.discard.size(), 0);
        player1.hand.add(Card.getCard(cards, Card.CardName.ambassador));
        System.out.println(player1);
        player1.playKingdomCard();
        assertEquals(player1.hand.size(), 4);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 1);
        assertEquals(player2.discard.size(), 1);
        System.out.println(player1);
    }

    @Test
    public void testValuesBaron() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.baron).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.baron).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.baron).getType(), Card.Type.ACTION);
    }

    @Test
    public void testPlayBaron() {
        player1.initializePlayerTurn();
        assertEquals(player1.numBuys, 1);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);
        player1.hand.add(Card.getCard(cards, Card.CardName.baron));
        System.out.println(player1);
        if (Card.getCard(player1.hand, Card.CardName.Estate) != null) {
            player1.playKingdomCard();
            assertEquals(player1.hand.size(), 4);
            assertEquals(player1.deck.size(), 5);
            assertEquals(player1.discard.size(), 1);
            assertEquals(player1.playedCards.size(), 1);
            assertEquals(player1.numBuys, 2);
            assertEquals(player1.coins, 4);
        } else {
            player1.playKingdomCard();
            assertEquals(player1.hand.size(), 5);
            assertEquals(player1.deck.size(), 4);
            assertEquals(player1.discard.size(), 0);
            assertEquals(player1.playedCards.size(), 1);
            assertEquals(player1.numActions, 2);
            assertEquals(player1.coins, 0);
        }


        System.out.println(player1);
    }
    @Test
    public void testValuesCouncilRoom() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.council_room).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.council_room).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.council_room).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayCouncilRoom() {
        player1.initializePlayerTurn();
        player2.initializePlayerTurn();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.numBuys, 1);
        player1.hand.add(Card.getCard(cards, Card.CardName.council_room));
        System.out.println(player1);
        player1.playKingdomCard();
        assertEquals(player1.hand.size(), 9);
        assertEquals(player1.deck.size(), 1);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 1);
        assertEquals(player1.numBuys, 2);
        for(Player p : state.players){
            if(p != player1) assertEquals(p.hand.size(), 6);
        }
        System.out.println(player1);
    }
    @Test
    public void testValuesCutpurse() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.cutpurse).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.cutpurse).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.cutpurse).getType(), Card.Type.ACTION);
    }

    @Test
    public void TestPlayCutpurse(){
        player1.initializePlayerTurn();
        player2.initializePlayerTurn();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);
        player1.hand.add(Card.getCard(cards, Card.CardName.cutpurse));
        System.out.println(player1);
        player1.playKingdomCard();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 1);
        assertEquals(player1.coins, 2);
        for(Player p : state.players){
            if(p != player1) assertEquals(p.hand.size(), 4);
        }
        System.out.println(player1);
    }

    @Test
    public void testValuesEmbargo() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.embargo).getCost(), 2);
        assertEquals(Card.getCard(cards, Card.CardName.embargo).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.embargo).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayEmbargo() {
        player1.initializePlayerTurn();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);
        player1.hand.add(Card.getCard(cards, Card.CardName.embargo));
        System.out.println(player1);
        player1.playKingdomCard();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 2);
//        assertTrue(state.embargoTokens.size() > 0);
        System.out.println(player1);
    }
    @Test
    public void testValuesFeast() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.feast).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.feast).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.feast).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayFeast(){
        player1.initializePlayerTurn();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);
        player1.hand.add(Card.getCard(cards, Card.CardName.feast));
        System.out.println(player1);
        player1.playKingdomCard();
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertTrue(player1.coins > 5);
        System.out.println(player1);
    }
    @Test
    public void testValuesGreatHall() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.great_hall).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.great_hall).getScore(), 1);
        assertEquals(Card.getCard(cards, Card.CardName.great_hall).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayGreatHall() {
        player1.initializePlayerTurn();
        assertEquals(player1.numActions, 1);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        player1.hand.add(Card.getCard(cards, Card.CardName.great_hall));
        System.out.println(player1);
        player1.playKingdomCard();
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 4);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 1);
        assertEquals(player1.numActions, 1);
        System.out.println(player1);
    }
    @Test
    public void testValuesMine() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.mine).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.mine).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.mine).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayMine(){
        player1.initializePlayerTurn();
        List<Card> before = Card.filter(player1.hand, Card.Type.TREASURE);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        player1.hand.add(Card.getCard(cards, Card.CardName.mine));
        System.out.println(player1);
        player1.playKingdomCard();
        List<Card> after = Card.filter(player1.hand, Card.Type.TREASURE);
        assertEquals(player1.hand.size(), 4);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 1);
        assertEquals(player1.playedCards.size(), 1);
        assertTrue(before.size() != after.size());
        assertTrue(Card.getCard(player1.discard, Card.CardName.Silver) != null);
        assertTrue(Card.getCard(player1.discard, Card.CardName.Gold) == null);
        System.out.println(player1);
    }
    @Test
    public void testValuesSmithy() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.smithy).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.smithy).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.smithy).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlaySmithy() {
        player1.initializePlayerTurn();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        player1.hand.add(Card.getCard(cards, Card.CardName.smithy));
        System.out.println(player1);
        player1.playKingdomCard();
        assertEquals(player1.hand.size(), 8);
        assertEquals(player1.deck.size(), 2);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 1);
        System.out.println(player1);}

    @Test
        public void testValuesVillage() {
            //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
            assertEquals(Card.getCard(cards, Card.CardName.village).getCost(), 3);
            assertEquals(Card.getCard(cards, Card.CardName.village).getScore(), 0);
            assertEquals(Card.getCard(cards, Card.CardName.village).getType(), Card.Type.ACTION);
        }
    @Test
    public void testPlayVillage() {
        player1.initializePlayerTurn();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        player1.hand.add(Card.getCard(cards, Card.CardName.village));
        System.out.println(player1);
        player1.playKingdomCard();
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 4);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 1);
        assertEquals(player1.numActions, 2);
        System.out.println(player1);
    }
    @Test
    public void TestValuesSalvager() {
        //card
        assertEquals(Card.getCard(cards, Card.CardName.salvager).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.salvager).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.salvager).getType(), Card.Type.ACTION);
    }
    @Test
    public void TestPlaySalvager(){
    //initialize and check
        player1.initializePlayerTurn();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);

        player1.hand.add(Card.getCard(cards, Card.CardName.salvager));
        player1.playKingdomCard();

        //after check
        assertEquals(player1.hand.size(), 4);
        assertEquals(player1.deck.size(), 4);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 1);
        assertTrue(player1.coins>=0);
    }
}
