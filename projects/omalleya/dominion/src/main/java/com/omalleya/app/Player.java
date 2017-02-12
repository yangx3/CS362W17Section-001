//HAND - arraylist
//which relates player to card
//DECK - linkedlist
//DISCARD

//Start with 7 coppers 3 estates

package com.omalleya.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.omalleya.app.Card.Type;


import java.util.Collections;


public class Player {
    LinkedList<Card> deck = new LinkedList<Card>();
    ArrayList<Card> hand = new ArrayList<Card>();
    LinkedList<Card> discarded = new LinkedList<Card>();
    List<Card> playedCards = new ArrayList<Card>();

    public String player_name;
    int numActions, numBuys, coins;

    final GameState gameState;

    public Player(GameState gameState,String player_name) {
		this.player_name = player_name;
		this.gameState=gameState;
	}

    final void initializePlayerTurn() {
		//initialize first player's turn
        numActions = 1;
        coins = 0;
        numBuys = 1;
        //5 cards as your starting hand
        for (int i = 0; i < 5; i++) {
            drawCard();
        }
	}

    //Action phase
        //optional, need not play action card just because you have it
        //must do as much as you can of action card
    public void action() {
        while(numActions>0){
            List<Card> actionCards = Card.filter(hand, Type.ACTION);

            if(actionCards.size() == 0)
                return;

            //play next action card
            Card c = actionCards.get(0);
            if(c == null)
                return;
            
            playedCards.add(actionCards.remove(0));
            hand.remove(c);
            numActions--;
            c.play(this); //might need to give this the current player and gamestate

        }
    }

    //Buy phase
        //normally a player may only buy one card
    public void buy(GameState state) {
        List<Card> treasureCards = Card.filter(hand, Type.TREASURE);

        for(int i=0; i<treasureCards.size(); i++) {
            Card c = treasureCards.get(i);
            coins += c.getTreasureValue();
            playedCards.add(hand.remove(i));
            hand.remove(treasureCards.get(i));
        }

        while(numBuys>0) {

            if(treasureCards.size() == 0)
            {
                //buy copper?
                return;
            }
            
        }
    }

    //Clean-up phase
    public void cleanUp() {
        for(Card c : hand) {
            discarded.add(c);
        }
        hand.clear();
        for(Card c : playedCards) {
            discarded.add(c);
        }
        playedCards.clear();
        
    }

    private void shuffle() {
        int k;
        for(int i=0; i<deck.size(); i++) {
            k = (int) Randomness.nextRandomInt(deck.size());
            Collections.swap(deck, i, k);
        }
    }

    public void drawCard() {
        if(deck.isEmpty())
        {
            //shuffle deck with cards from discarded
            System.out.println("Shuffling deck with discarded pile");
            while(discarded.size() > 0) {
                deck.add(discarded.poll());
            }
            shuffle();
        }
        hand.add(deck.poll());
    }

    public void gain(Card card) {
        discarded.add(card);
        System.out.println(this.player_name + " gained " + card);
    }

    public void discard(Card card) {
        hand.remove(card);
        discarded.add(card);
        System.out.println(this.player_name + " discarded " + card);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            
        sb.append(" --- " + this.player_name + " --- ");
        sb.append(" --- --------------------------- --- ");

        sb.append("Hand: " + this.hand);
        sb.append("Discard: " + this.discarded);
        sb.append("Deck: " + this.deck);
        sb.append("Played Cards: " + this.playedCards);
        sb.append("numActions: " + this.numActions);
        sb.append("coins: " + this.coins);
        sb.append("numBuys: " + this.numBuys);
        sb.append("\n");     

        return sb.toString();

    }

}