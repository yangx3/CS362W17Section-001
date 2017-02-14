package org.thenellb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;


public abstract class Card {

    protected String cardName;          // Title of card
    protected String text;              // official description from dominion website
    protected int victoryValue;         // number of Victory points the card gives
    protected int plusBuyValue;         // number of +Buys the card gives
    protected int plusTreasuryValue;    // number of +Coins the card gives
    protected int plusActionValue;      // number of +Actions the card gives
    protected int plusCardValue;        // number of +Cards drawn
    protected int cost;                 // how many coins it costs to buy
    protected String cardType;
    protected int plusDiscardValue;


    //functions

    //constructor

    public Card(String cardName, String text, int victoryValue, int plusBuyValue, int plusTreasuryValue, int plusActionValue, int plusCardValue, int cost, String cardType ){
        this.cardName = cardName;
        this.text = text;
        this.victoryValue = victoryValue;
        this.plusBuyValue = plusBuyValue;
        this.plusTreasuryValue = plusTreasuryValue;
        this.plusActionValue = plusActionValue;
        this.plusCardValue = plusCardValue;
        this.cost = cost;
        this.cardType = cardType;
    }
    public Card(){
        //no default
    }




    //getters
    public String get_cardName() {
        return cardName;
    }
    public String get_text() {
        return  text;
    }
    public int get_victoryValue() {
        return victoryValue;
    }
    public int get_plusBuyValue() {
        return plusBuyValue;
    }
    public int get_plusTreasuryValue() {
        return plusTreasuryValue;
    }
    public int get_plusActionValue() {
        return plusActionValue;
    }
    public int get_plusCardValue() {
        return plusCardValue;
    }
    public int get_cost() {
        return cost;
    }
    public String get_cardType() {
        return cardType;
    }

    public void printCard() {
        System.out.println("Name of Card:  " +  cardName + "\n");
        System.out.println("Text:   " + text + "\n");
        System.out.println("Victory Points:  " + victoryValue + "\n");
        System.out.println("Number of buys added:  " + plusBuyValue + "\n");
        System.out.println("Number of coins added:  " + plusTreasuryValue + "\n");
        System.out.println("Number of actions added:  " + plusActionValue + "\n");
        System.out.println("Number of cards added:  " + plusCardValue + "\n");
        System.out.println("Cost:  " + cost + "\n");
        System.out.println("Card type:  " + cardType + "\n");
    }

    public int activate() {
        System.out.println("Playing the card:  " + cardName);

        //add things that will allow me to look through deck once deck is made
        return 0;
    }




    /*
            ENUM for card names, keeping commented for now

    public static enum CardName {   //from sample code provided. Lists all possible names
        // The Treasure cards /
        Gold, Silver, Cooper,
        // The Victory cards /
        Province,Duchy,Estate,Curse,
        // The Action cards /
        org.thenellb.Adventurer, Bureaucrat, Cellar, Chancellor, Chapel, Council Room,  Festival, Smithy, Village, Moneylender, Woodcutter,Laboratory,Market
    } */





}