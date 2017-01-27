/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;
import java.util.*;

public class GameState{
  private final int defaultDeckSize = 100;
  private final int pileSize = 8;     // How many cards per pile
  // Initial cards for each player's Deck
  private final int startingCopper = 7;
  private final int startingEstates = 3;
  // Initial currency cards in the bank
  private final int bankCopper = 60;
  private final int bankSilver = 40;
  private final int bankGold = 30;
  // Initial victory point cards in the bank
  private final int bankEstates = 24;
  private final int bankDuchies = 12;
  private final int bankProvinces = 12;
  // Initial kingdom cards in the bank
  private final int bankKingdomCards = 8;

  public Deck bankCards;
  public Player[] players;
  public int numPlayers = 0;
  public int playerTurn = 0;

  public GameState(){
    // shared cards that players can buy
    this.bankCards = new Deck(defaultDeckSize);
    this.players = new Player[2];
    // Fill the shared deck with the starting cards
    for(int i=0; i<bankCopper; i++)   bankCards.addCard(Card.COPPER);
    for(int i=0; i<bankSilver; i++)   bankCards.addCard(Card.SILVER);
    for(int i=0; i<bankGold; i++)     bankCards.addCard(Card.GOLD);
    for(int i=0; i<bankEstates; i++)  bankCards.addCard(Card.ESTATE);
    for(int i=0; i<bankDuchies; i++)  bankCards.addCard(Card.DUCHY);
    for(int i=0; i<bankProvinces; i++)bankCards.addCard(Card.PROVINCE);
    for(int i=0; i<bankKingdomCards; i++)bankCards.addCard(Card.ADVENTURER);
    for(int i=0; i<bankKingdomCards; i++)bankCards.addCard(Card.AMBASSADOR);
  }

  public void addPlayer(String name, GameState game){
    Player a = new Player(name, game);
    for(int i=0; i<startingCopper; i++)   a.draw(bankCards, Card.COPPER);
    for(int i=0; i<startingEstates; i++)  a.draw(bankCards, Card.ESTATE);
    players[this.numPlayers++] = a;
  }

  public void nextTurn(){
    players[playerTurn].newTurn();
    playerTurn = (playerTurn+1)%numPlayers;
  }

  public void play(){
    while(true){
      System.out.println("...new turn...");
      nextTurn();
    }
  }
}
