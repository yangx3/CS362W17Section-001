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
  private Card[] ADVENTURER = new Card[bankKingdomCards];

  public Stack<Card> bankCards;
  public Player[] players;
  public int numPlayers = 0;
  public int playerTurn = 0;

  public GameState(){
    // shared cards that players can buy
    this.bankCards = new Stack<Card>();
    this.players = new Player[2];
    // Fill the shared deck with the starting cards
    for(int i=0; i<bankCopper; i++)   bankCards.push(Card.COPPER);
    for(int i=0; i<bankSilver; i++)   bankCards.push(Card.SILVER);
    for(int i=0; i<bankGold; i++)     bankCards.push(Card.GOLD);
    for(int i=0; i<bankEstates; i++)  bankCards.push(Card.ESTATE);
    for(int i=0; i<bankDuchies; i++)  bankCards.push(Card.DUCHY);
    for(int i=0; i<bankProvinces; i++)bankCards.push(Card.PROVINCE);
    for(int i=0; i<bankKingdomCards; i++)bankCards.push(Card.ADVENTURER);
    for(int i=0; i<bankKingdomCards; i++)bankCards.push(Card.AMBASSADOR);
    for(int i=0; i<bankKingdomCards; i++)bankCards.push(Card.BARON);
    for(int i=0; i<bankKingdomCards; i++)bankCards.push(Card.COUNCILROOM);
  }

  public void addPlayer(String name, GameState game){
    Player a = new Player(name, game);
    players[this.numPlayers++] = a;
  }

  public Card takeCard(Card c){
    if(bankCards.contains(c)) return bankCards.remove(bankCards.indexOf(c));
    endGame("The bank is out of "+c+" cards, so the game is over!");
    return null;
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

  private void endGame(String s){
    System.out.println(s);
    System.out.println("Thanks for playing!");
  }
}
