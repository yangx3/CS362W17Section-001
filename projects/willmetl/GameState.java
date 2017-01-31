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

  private ArrayList<Card> supply;
  public Player[] players;
  public int numPlayers = 0;
  public int playerTurn = 0;

  public GameState(){
    // shared cards that players can buy
    this.supply = new ArrayList<Card>(200);
    this.players = new Player[2];
    // Fill the shared deck with the starting cards
    for(int i=0; i<bankCopper; i++)   supply.add(Card.COPPER);
    for(int i=0; i<bankSilver; i++)   supply.add(Card.SILVER);
    for(int i=0; i<bankGold; i++)     supply.add(Card.GOLD);
    for(int i=0; i<bankEstates; i++)  supply.add(Card.ESTATE);
    for(int i=0; i<bankDuchies; i++)  supply.add(Card.DUCHY);
    for(int i=0; i<bankProvinces; i++)supply.add(Card.PROVINCE);
    for(int i=0; i<bankKingdomCards; i++)supply.add(Card.ADVENTURER);
    for(int i=0; i<bankKingdomCards; i++)supply.add(Card.AMBASSADOR);
    for(int i=0; i<bankKingdomCards; i++)supply.add(Card.BARON);
    for(int i=0; i<bankKingdomCards; i++)supply.add(Card.COUNCILROOM);
  }

  public void addPlayer(String name, GameState game){
    Player a = new Player(name, game);
    players[this.numPlayers++] = a;
  }

  public void addCard(Card c){
    supply.add(c);
  }

  public int countCard(Card c){
    return Collections.frequency(supply, c);
  }

  public Card takeCard(Card c){
    int i = supply.indexOf(c);
    if(i >= 0) return supply.remove(i);
    return null;
  }

  public boolean replaceCard(Card c){
    return supply.add(c);
  }

  public void nextTurn(){
    if(countCard(Card.PROVINCE)>0){
      players[playerTurn].newTurn();
      playerTurn = (playerTurn+1)%numPlayers;
    }else{
      endGame("The bank is out of Province cards, so the game is over!");
    }
  }

  public int listCards(){
    int i = 0;
    System.out.format(" # - %-15s %s  %s\n", "Card Name", "Cost", "Qty");
    for(Card c: Card.values()){
      System.out.format("%2d - %-15s %-5d %2d\n",
        ++i, c, c.costsMoney, Collections.frequency(supply, c)
      );
    }
    return i;
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
