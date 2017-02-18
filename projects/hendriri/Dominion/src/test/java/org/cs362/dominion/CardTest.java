package org.cs362.dominion;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CardTest {

    private GameState state;
    private Player player1;
    private Player player2;
    private List<Card> cards;

    //we must intialize a state, player, and cards in order for this to work.
    @Before
    public void initialize() {
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
        player1 = new Player(state, "player-1");
        state.addPlayer(player1);
        player2 = new Player(state, "player-2");
        state.addPlayer(player2);
        state.initializeGame();
    }

    /**
     * START OF TREASURE TESTS
     */

    @Test
    //Testing to see if the treasure cards were intialized
    public void testtreasures(){

        //Cooper tests
        assertEquals(Card.getCard(cards, Card.CardName.Cooper).getCost(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Cooper).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Cooper).getTreasureValue(), 1);
        assertEquals(Card.getCard(cards, Card.CardName.Cooper).getType(), Card.Type.TREASURE);

        //Silver
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getTreasureValue(), 2);
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getType(), Card.Type.TREASURE);

        //gold
        assertEquals(Card.getCard(cards, Card.CardName.Gold).getCost(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Gold).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Gold).getTreasureValue(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Gold).getType(), Card.Type.TREASURE);
    }

    @Test
    //Testing to see if the treasure cards can be played
    public void silverplay() {
        //Silver
        int count = 0;
        assertEquals(player1.coins, 0);
        //have to get rid of the coins that are already in the hand
        for(int i = 0; i < player1.hand.size(); i++){
            if(player1.hand.get(i).getCardName() == Card.CardName.Cooper)
                count +=1;
        }
        //iterate through the amount of cooper and get rid of it
        while(count > 0){
            player1.discard(Card.getCard(cards, Card.CardName.Cooper));
            count -= 1;
        }
        //add silver to the hand
        player1.hand.add(Card.getCard(cards, Card.CardName.Silver));
        player1.playTtreasureCard();
        assertEquals(player1.coins, 2);
    }

    @Test
    //Testing to see if the treasure cards can be played
    public void cooperplay() {
        //cooper
        int count = 0;
        assertEquals(player1.coins, 0);
        //have to get rid of the coins that are already in the hand
        for(int i = 0; i < player1.hand.size(); i++){
            if(player1.hand.get(i).getCardName() == Card.CardName.Cooper)
                count +=1;
        }
        //iterate through the amount of cooper and get rid of it
        while(count > 0){
            player1.discard(Card.getCard(cards, Card.CardName.Cooper));
            count -= 1;
        }
        //add cooper to the hand
        player1.hand.add(Card.getCard(cards, Card.CardName.Cooper));
        player1.playTtreasureCard();
        assertEquals(player1.coins, 1);
    }

    @Test
    //Testing to see if the treasure cards can be played
    public void goldplay() {
        //cooper
        int count = 0;
        assertEquals(player1.coins, 0);
        //have to get rid of the coins that are already in the hand
        for(int i = 0; i < player1.hand.size(); i++){
            if(player1.hand.get(i).getCardName() == Card.CardName.Cooper)
                count +=1;
        }
        //iterate through the amount of cooper and get rid of it
        while(count > 0){
            player1.discard(Card.getCard(cards, Card.CardName.Cooper));
            count -= 1;
        }
        //add cooper to the hand
        player1.hand.add(Card.getCard(cards, Card.CardName.Gold));
        player1.playTtreasureCard();
        assertEquals(player1.coins, 3);
    }

    /**
     * END OF TREASURE TESTS
     *
     *
     * START OF KINGDOM TESTS
     */
    @Test
    public void Adventurer() {
        //test card values
        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getCost(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //add kingdom card and play it
        player1.hand.add(Card.getCard(cards, Card.CardName.Adventurer));
        player1.playKingdomCard();
        //we need to have added 2 more coppers due to the starting hand
        assertTrue(player1.hand.size() == 7);
        assertTrue(player1.deck.size() >= 0);
        assertEquals(player1.playedCards.size(), 1);
        System.out.println(player1);
    }

    @Test
    public void Smithy() {

        assertEquals(Card.getCard(cards, Card.CardName.Smithy).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Smithy).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Smithy).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //add Smithy card and play it
        player1.hand.add(Card.getCard(cards, Card.CardName.Smithy));
        player1.playKingdomCard();
        assertEquals(player1.hand.size(), 8);
        assertEquals(player1.deck.size(), 2);
        assertEquals(player1.playedCards.size(), 1);
        System.out.println(player1);
    }

    @Test
    public void Ittakesavillage() {
        assertEquals(Card.getCard(cards, Card.CardName.Village).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Village).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Village).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //add Village Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.Village));
        player1.playKingdomCard();
        //one action was decremented when the card was played
        assertEquals(player1.numActions, 2);
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 4);
        assertEquals(player1.playedCards.size(), 1);
        System.out.println(player1);
    }

    @Test
    public void salveme() {

        boolean estate = false;

        assertEquals(Card.getCard(cards, Card.CardName.salvager).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.salvager).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.salvager).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        while(!estate){
            for(int i = 0; i < player1.hand.size(); i++){
                if(player1.hand.get(i).getCardName() == Card.CardName.Estate){
                    estate = true;
                }
            }
            //we need to have an estate for this, so if there isn't one we will draw until there is
            if(!estate){
                player1.drawCard();
                //we can assume if there is no estates there is only copper
                player1.discard(Card.getCard(cards, Card.CardName.Cooper));
            }
        }

        //add salvager Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.salvager));
        player1.playKingdomCard();



        assertEquals(player1.numBuys, 2);
        //since this is the starting hand we have to assume that there will be an estate card
        //and that estate card will be trashed for 2 coins
        assertEquals(player1.coins, 2);
        assertEquals(player1.Trash.size(), 1);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.playedCards.size(), 1);

        //could check case where there is no card that the player would scrap
    }


    @Test
    //if the player has copper in their hand
    public void AmbassTEST1() {

        boolean therecooper = false;

        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        assertEquals(player2.coins, 0);
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.playedCards.size(), 0);

        int precooper = state.gameBoard.get(Card.getCard(cards, Card.CardName.Cooper));

        //add Village Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.Ambassador));
        player1.playKingdomCard();

        int aftercooper = state.gameBoard.get(Card.getCard(cards, Card.CardName.Cooper));

        System.out.println(aftercooper);
        System.out.println(precooper);

        //this is true since the player will only ever add one copper to the supply and we can check to see if the player1's hand has decremented
        assertEquals(precooper,aftercooper);
        assertEquals(player1.hand.size(), 4);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.discard.size(), 1);
    }

    @Test
    //if the player has copper in their hand
    public void AmbassTEST2() {

        boolean therecooper = true;
        Card Temp = null;

        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        assertEquals(player2.coins, 0);
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.playedCards.size(), 0);

        //if there is copper we need to get rid of it
        while (therecooper) {
            therecooper = false;
            for (int i = 0; i < player1.hand.size(); i++) {
                if (player1.hand.get(i).getCardName() == Card.CardName.Cooper) {
                    Temp = player1.hand.get(i);
                    therecooper = true;
                }
            }
            if(therecooper){
                player1.hand.remove(Temp);
            }
        }

        int prehand = player1.hand.size();

        //add Village Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.Ambassador));
        player1.playKingdomCard();

        assertEquals(player1.coins, 0);
        assertEquals(prehand, player1.hand.size());
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 1);
        assertEquals(player1.discard.size(), 1);


        assertEquals(player2.coins, 0);
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.playedCards.size(), 0);



    }


    //IF there is an estate card in player1's hand. this means a few edits to ensure there is at least one in hand
    @Test
    public void BaronTEST1() {

        boolean estate = false;

        assertEquals(Card.getCard(cards, Card.CardName.Baron).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getType(), Card.Type.ACTION);



        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //likely to not run but a backup, checks to see if an estate card is in teh deck
        while(!estate){
            for(int i = 0; i < player1.hand.size(); i++){
                if(player1.hand.get(i).getCardName() == Card.CardName.Estate){
                    estate = true;
                }
            }
            //we need to have an estate for this, so if there isn't one we will draw until there is
            if(!estate){
                player1.drawCard();
                //we can assume if there is no estates there is only copper
                player1.discard(Card.getCard(cards, Card.CardName.Cooper));
            }
        }

        //add Village Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.Baron));
        player1.playKingdomCard();

        assertEquals(player1.numBuys, 2);
        assertEquals(player1.coins, 4);
    }

    @Test
    //when there is no estate
    public void BaronTEST2() {


        Card Temp = null;
        boolean estate = true;

        assertEquals(Card.getCard(cards, Card.CardName.Baron).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getType(), Card.Type.ACTION);


        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //if there is an estate in the deck then we need to get rid of it
        while (estate) {
            int estatecount = 0;
            for (int i = 0; i < player1.hand.size(); i++) {
                if (player1.hand.get(i).getCardName() == Card.CardName.Estate) {
                    Temp = player1.hand.get(i);
                    estatecount +=1;
                    estate = true;
                }
            }
            if(estatecount == 0){
                estate = false;
            }
            else if (estate) {
                player1.drawCard();
                //we can assume if there is no estates there is only copper
                player1.discard(Temp);
            }
        }

        System.out.println(player1.hand);

        int discardsize_before = player1.discard.size();

        //we assume that the discard will be incremented with an estate and the played card
        discardsize_before+=2;

        player1.hand.add(Card.getCard(cards, Card.CardName.Baron));
        player1.playKingdomCard();

        assertEquals(player1.numBuys, 2);
        assertEquals(player1.coins, 0);
        assertEquals(player1.discard.size(), discardsize_before);
    }

    @Test
    public void cuturpurse() {

        boolean therecooper = false;

        assertEquals(Card.getCard(cards, Card.CardName.cutpurse).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.cutpurse).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.cutpurse).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        assertEquals(player2.coins, 0);
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.playedCards.size(), 0);

        //if player2 doesnt have copper
        while(!therecooper){
            for(int i = 0; i < player2.hand.size(); i++){
                if(player2.hand.get(i).getCardName() == Card.CardName.Cooper){
                    therecooper = true;
                }
            }
            //we need to have a copper for this, so if there isn't one we will draw until there is
            if(!therecooper){
                player2.drawCard();
                //we can assume if there is no estates there is only copper
                player2.discard(Card.getCard(cards, Card.CardName.Estate));
            }
        }

        int discardsize_before = player2.discard.size();

        //we assume that the discard will be incremented with a copper for player 2
        discardsize_before+=1;

        //add cutpurse Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.cutpurse));
        player1.playKingdomCard();

        assertEquals(player1.coins, 2);
        assertEquals(player2.discard.size(), discardsize_before);
        assertEquals(player2.hand.size(), 4);

    }

    @Test
    public void emdargo() {
        assertEquals(Card.getCard(cards, Card.CardName.embargo).getCost(), 2);
        assertEquals(Card.getCard(cards, Card.CardName.embargo).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.embargo).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //add embargo Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.embargo));
        player1.playKingdomCard();

        assertEquals(player1.coins, 2);
        assertEquals(player1.Trash.size(), 1);
        assertEquals(player1.hand.size(), 5);
        assertEquals(state.embargo, 1);
    }

    @Test
    public void FEAST() {
        assertEquals(Card.getCard(cards, Card.CardName.feast).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.feast).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.feast).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //add embargo Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.feast));
        player1.playKingdomCard();

        assertEquals(player1.Trash.size(), 1);
        assertEquals(player1.discard.size(), 1);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.discard.get(0).getCost(), 5);
    }

    @Test
    public void gardens() {
        assertEquals(Card.getCard(cards, Card.CardName.gardens).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.gardens).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.gardens).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //add garden Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.gardens));
        player1.playKingdomCard();

        //garden simply discards a card, toscore does the rest
        assertEquals(player1.discard.size(), 1);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        int score = player1.scoreFor();

        //the return would be 9 if garden did not exist
        assertEquals(score, 10);

    }

    @Test
    public void greathall() {
        assertEquals(Card.getCard(cards, Card.CardName.greathall).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.greathall).getScore(), 1);
        assertEquals(Card.getCard(cards, Card.CardName.greathall).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //add greathall Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.greathall));
        player1.hand.add(Card.getCard(cards, Card.CardName.greathall));
        player1.playKingdomCard();

        assertEquals(player1.numActions, 1);
        assertEquals(player1.discard.size(), 2);
        assertEquals(player1.hand.size(), 7);
        assertEquals(player1.deck.size(), 3);

        int score = player1.scoreFor();
        System.out.println(score);
        System.out.println(player1.hand);

        //since we have two great halls there should be two more to the score
        assertEquals(score, 11);
    }

    @Test
    //This is a test for copper and switching it with silver
    public void minerTEST1() {
        assertEquals(Card.getCard(cards, Card.CardName.mine).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.mine).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.mine).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //add mine Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.mine));
        player1.playKingdomCard();

        assertEquals(player1.discard.size(), 1);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.Trash.size(), 1);
        assertEquals(player1.discard.get(0).getCardName(), Card.CardName.Silver);
    }

    @Test
    //This is a test for Silver and switching it with Gold
    public void minerTEST2() {

        Card Temp = null;

        boolean therecooper = true;

        assertEquals(Card.getCard(cards, Card.CardName.mine).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.mine).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.mine).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        //if player1 has copper we want to get rid of it (like straight up remove it)
        while(therecooper){
            therecooper = false;
            for(int i = 0; i < player1.hand.size(); i++){
                if(player1.hand.get(i).getCardName() == Card.CardName.Cooper){
                    Temp = player1.hand.get(i);
                    therecooper = true;
                }
            }
            //we don't want copper so if there is any we are going to send it to hell
            if(therecooper){
                player1.hand.remove(Temp);
            }
        }

        System.out.println(player1.hand);


        //add mine Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.mine));
        player1.hand.add(Card.getCard(cards, Card.CardName.Silver));
        player1.playKingdomCard();

        assertEquals(player1.discard.size(), 1);
        assertEquals(player1.Trash.size(), 1);
        assertEquals(player1.discard.get(0).getCardName(), Card.CardName.Gold);
    }

    @Test
    //This is a test for council room
    public void Councilrum() {
        assertEquals(Card.getCard(cards, Card.CardName.CouncilRoom).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.CouncilRoom).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.CouncilRoom).getType(), Card.Type.ACTION);

        //TEST IMPLEMENTATION
        //hand and coins before kingdom card is played
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.playedCards.size(), 0);

        assertEquals(player2.coins, 0);
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.playedCards.size(), 0);

        //add mine Card to hand and play
        player1.hand.add(Card.getCard(cards, Card.CardName.CouncilRoom));
        player1.playKingdomCard();

        assertEquals(player1.discard.size(), 1);
        assertEquals(player1.hand.size(), 9);
        assertEquals(player1.deck.size(), 1);
        assertEquals(player1.numBuys, 2);

        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.hand.size(), 6);
        assertEquals(player2.deck.size(), 4);
        assertEquals(player2.numBuys, 1);
    }


}