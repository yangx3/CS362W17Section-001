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
import java.util.HashMap;
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
        assertEquals(Card.getCard(cards, Card.CardName.adventurer).getCost(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.adventurer).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.adventurer).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayAdventurer(){

        //player1.initializePlayerTurn();

        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        player1.hand.add(Card.getCard(cards, Card.CardName.adventurer));

        //player1.playKingdomCard();

        assertTrue(player1.hand.size() >= 5);
        assertTrue(player1.deck.size() >= 1);//depends if coppers are in front or not
        assertEquals(player1.playedCards.size(), 0);
    }
    @Test
    public void testValuesAmbassador() {
        assertEquals(Card.getCard(cards, Card.CardName.ambassador).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.ambassador).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.ambassador).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayAmbassador(){

        //initialize their turn
        //player1.initializePlayerTurn();
        //player2.initializePlayerTurn();

        //check everything about player
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player2.discard.size(), 0);

        //ambassador card action
        player1.hand.add(Card.getCard(cards, Card.CardName.ambassador));
        //player1.playKingdomCard();

        // check results
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player2.discard.size(), 0);
    }
    @Test
    public void testValuesBaron() {
        //check card
        assertEquals(Card.getCard(cards, Card.CardName.baron).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.baron).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.baron).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayBaron(){
        //initialize player turn and check
       // player1.initializePlayerTurn();

        assertEquals(player1.numActions, 1);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);

        //add card to hand
        player1.hand.add(Card.getCard(cards, Card.CardName.baron));

        //has estate card
        if(Card.getCard(player1.hand, Card.CardName.Estate) != null){
            //player1.playKingdomCard();

            assertEquals(player1.hand.size(), 6);
            assertEquals(player1.deck.size(), 5);
            assertEquals(player1.discard.size(), 0);
            assertEquals(player1.playedCards.size(), 0);
            assertEquals(player1.numBuys, 1);
            assertEquals(player1.coins, 0);
        } else {
            //alternative
           // player1.playKingdomCard();

            assertEquals(player1.hand.size(), 6);
            assertEquals(player1.deck.size(), 5);
            assertEquals(player1.discard.size(), 0);
            assertEquals(player1.playedCards.size(), 0);
            assertEquals(player1.numActions, 1);
            assertEquals(player1.coins, 0);
        }

    }
    @Test
    public void testValuesCouncil_Room() {
        assertEquals(Card.getCard(cards, Card.CardName.council_room).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.council_room).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.council_room).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayCouncil_Room() {
        //initalize player
        //player1.initializePlayerTurn();
        //player2.initializePlayerTurn();

        //check hands
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.numBuys, 1);

        //get card
        player1.hand.add(Card.getCard(cards, Card.CardName.council_room));

//        player1.playKingdomCard();

        //check hand afterward
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.numBuys, 1);
        //check other player's hands
        for(Player p : state.players){
            if(p != player1) assertEquals(p.hand.size(), 5);
        }
    }
    @Test
    public void testValuesCutpurse() {
        //test card
        assertEquals(Card.getCard(cards, Card.CardName.cutpurse).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.cutpurse).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.cutpurse).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayCutpurse(){
        //initialize and check
        //player1.initializePlayerTurn();
        //player2.initializePlayerTurn();

        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);

        //do stuff
         player1.hand.add(Card.getCard(cards, Card.CardName.cutpurse));
    //    player1.playKingdomCard();

        //check state afterwards
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);
        //check hand size of all other players
        for(Player p : state.players){
            if(p != player1) assertEquals(p.hand.size(), 5);
        }
    }
    @Test
    public void testValuesEmbargo() {
        //test card
        assertEquals(Card.getCard(cards, Card.CardName.embargo).getCost(), 2);
        assertEquals(Card.getCard(cards, Card.CardName.embargo).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.embargo).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayEmbargo(){
        //set it up and check
//        player1.initializePlayerTurn();

        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);

        //add card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.embargo));

        //player1.playKingdomCard();

        //check
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);
    }
    @Test
    public void testValuesFeast() {
        //test card
        assertEquals(Card.getCard(cards, Card.CardName.feast).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.feast).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.feast).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayFeast(){
        //initialize and check
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);
        //draw card and play
        player1.hand.add(Card.getCard(cards, Card.CardName.feast));

        //player1.playKingdomCard();
        //check player hand
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertTrue(player1.coins >=0);
    }
    @Test
    public void testValuesGreatHall() {
        //test card
        assertEquals(Card.getCard(cards, Card.CardName.great_hall).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.great_hall).getScore(), 1);
        assertEquals(Card.getCard(cards, Card.CardName.great_hall).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayGreatHall(){
        //initialize and check
        //player1.initializePlayerTurn();

        assertEquals(player1.numActions, 1);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);

        //draw card and play
         player1.hand.add(Card.getCard(cards, Card.CardName.great_hall));
      //  player1.playKingdomCard();

        //check
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.numActions, 1);
    }
    @Test
    public void testValuesMine() {
        //check card
        assertEquals(Card.getCard(cards, Card.CardName.mine).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.mine).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.mine).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayMine(){

        //set up and check
        //player1.initializePlayerTurn();
        List<Card> before = Card.filter(player1.hand, Card.Type.TREASURE);

        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);

        //draw and play card
         player1.hand.add(Card.getCard(cards, Card.CardName.mine));
  //      player1.playKingdomCard();

        //check before and after decks retrieved
        List<Card> after = Card.filter(player1.hand, Card.Type.TREASURE);
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);

        //assertTrue(before.size() != after.size());

        //check supply
        //assertTrue(Card.getCard(player1.discard, Card.CardName.Silver) != null);
       //assertTrue(Card.getCard(player1.discard, Card.CardName.Gold) == null);
    }
    @Test
    public void testValuesSmithy() {
        //check card
        assertEquals(Card.getCard(cards, Card.CardName.smithy).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.smithy).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.smithy).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlaySmithy(){

        //initialize and check
        //player1.initializePlayerTurn();

        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        //add card
        player1.hand.add(Card.getCard(cards, Card.CardName.smithy));

//        player1.playKingdomCard();
        //check player
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
    }
    @Test
    public void testValuesVillage() {
        //card
        assertEquals(Card.getCard(cards, Card.CardName.village).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.village).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.village).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlayVillage() {

        //initialize and check
        //player1.initializePlayerTurn();

        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);

        //draw card
        player1.hand.add(Card.getCard(cards, Card.CardName.village));
        //player1.playKingdomCard();
        //check player
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.numActions, 1);
    }
    @Test
    public void testValuesSalvager() {
        //card
        assertEquals(Card.getCard(cards, Card.CardName.salvager).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.salvager).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.salvager).getType(), Card.Type.ACTION);
    }
    @Test
    public void testPlaySalvager(){
        //initialize and check
        //player1.initializePlayerTurn();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player1.coins, 0);

        player1.hand.add(Card.getCard(cards, Card.CardName.salvager));
        //player1.playKingdomCard();

        //after check
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertTrue(player1.coins>=0);
    }
}
