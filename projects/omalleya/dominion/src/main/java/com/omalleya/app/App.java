package com.omalleya.app;

import java.util.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Starting main");
        List<Card> cards = Card.createCards();
        System.out.println("created cards");
        GameState gs = new GameState(cards);
        System.out.println("created game state");

        Player p1 = new Player(gs, "player 1");
        System.out.println("created player 1");
        Player p2 = new Player(gs, "player 2");
        System.out.println("created player 2");

        gs.addPlayer(p1);
        System.out.println("added player 1");
        gs.addPlayer(p2);
        System.out.println("added player 2");

        gs.initializeGame();
        System.out.println("initialized Game");

        for(Card c : p1.deck) {
            System.out.println(c.toString());
        }
    }
}
