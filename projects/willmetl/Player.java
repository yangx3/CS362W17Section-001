/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;
import java.util.*;

public class Player{
  // The Player class represents a single Dominion player
  private final boolean DEBUGGING = true;
  // Initial cards for each player's Deck
  private final int startingCopper = 7;
  private final int startingEstates = 3;
  // Attributes for this class are private
  private final String playerName;
  private final int drawCards = 7;  // inital hand size
  private int remActions;
  private int remBuys;
  private int remMoney;

  private Stack<Card> cardPile;
  private int shuffleCounter;
  private ArrayList<Card> hand;
  public GameState gameState;

  private Scanner scan = new Scanner(System.in);

  public Player(String pName, GameState game){
    // Constructor for the Player class - sets their name
    this.playerName = pName;
    this.gameState = game;
    this.cardPile = new Stack<Card>();
    this.shuffleCounter = 0;
    this.hand = new ArrayList<Card>(20);
    for(int i=0; i<startingCopper; i++)
      takeFreeCard(gameState.takeCard(Card.COPPER));
    for(int i=0; i<startingEstates; i++)
      takeFreeCard(gameState.takeCard(Card.ESTATE));
    cleanupPhase();
  }

  public int addMoney(int m){
    this.remMoney += m;
    return remMoney;
  }

  public int addActions(int a){
    this.remActions += a;
    return remActions;
  }

  public int addBuys(int b){
    this.remBuys += b;
    return remBuys;
  }

  public int getActions(){
    return this.remActions;
  }

  public int getBuys(){
    return this.remBuys;
  }

  public void seeHand(){
    // Display all cards in a player's hand
    for(Card c: hand){
      System.out.println(c);
    }
  }

  public Card chooseHand(){
    for(int i=0; i<hand.size(); i++){
      System.out.println(i+1+" - "+hand.get(i));
    }
    System.out.format("Please enter the card number (1-%d) you want to play,"+
      " or 0 to cancel: ", hand.size());
    int choice = scan.nextInt();
    if( choice>0 && choice<hand.size() )
      return hand.remove(choice);
    return null;
  }

  public int shuffle(){
    Collections.shuffle(cardPile);
    shuffleCounter = cardPile.size();
    return shuffleCounter;
  }

  public void seeDeck(){
    if(DEBUGGING){
      System.out.println("Player "+playerName+"'s hand:");
      seeHand();
      System.out.println("Player "+playerName+"'s drawPile:");
      for(int i=0; i<shuffleCounter-1; i++){
        System.out.println(cardPile.elementAt(i));
      }
      System.out.println("Player "+playerName+"'s discardPile:");
      for(int i=shuffleCounter; i<cardPile.size()-1; i++){
        System.out.println(cardPile.elementAt(i));
      }
    }
  }

  public boolean takeFreeCard(Card c){
    return discard(c);
  }

  public boolean discardRandomFromHand(){
    // This player discards a random card from their hand
    int handsize = hand.size();
    // generate random number in range of hand size instead of this
    Card c = hand.remove(0);
    return discard(c);
  }

  public boolean discard(Card c){
    // Add a card to the discard pile
    cardPile.add(cardPile.size(), c);
    return true;
  }

  public Card draw(){
    if(shuffleCounter-- > 1) return cardPile.pop();
    shuffleCounter = shuffle();
    return cardPile.pop();
  }

  public void returnCardToShared(Card c){
    // gameState.bankCards.push(c);
  }

  private void actionPhase(){
    // Action phase of a player's turn

    while(remActions >= 1){
      System.out.print(playerName+"'s hand contains: ");
      for(int i=0; i<hand.size(); i++)
        System.out.format("%s%s", hand.get(i), i+1<hand.size()?", ":".\n");

      System.out.println("Please choose a card: "+
        "(Treasure cards are played in your Buy phase)");
      Card c = chooseHand();
      if(c != null){
        System.out.println(playerName+" chose to play the "+c+" card.\n");
        playCard(c);
      }else{
        // end turn
        return;
      }
    }
  }

  private void buyPhase(){
    // Auto convert all Treasure cards and allow player to buy
    for(Card c: hand){
      if(c.givesMoney>0 && c.costsAction==0) playCard(c);
    }
    System.out.format("%s has %d money to spend.\n", playerName, remMoney);
    // Show a list of cards from the bank
  }

  private void cleanupPhase(){
    // Discard hand and draw 5 new cards
    cardPile.addAll(hand);
    // Add 5 new cards from the top of this player's drawPile deck
    for(int i=0; i<5; i++) hand.add(draw());
  }

  public void newTurn(){
    // Start every turn with a new, full hand and 1 action, 1 buy
    if(DEBUGGING) System.out.println("It's "+playerName+"'s turn:");
    remActions = 1;
    remBuys = 1;
    actionPhase();
    buyPhase();
    cleanupPhase();
  }

  public boolean playCard(Card card){
    return playCard(card, this);
  }
  public boolean playCard(Card card, Player target){
    if(card.costsAction==0 || this.remActions>1){
      if(DEBUGGING) System.out.println("Playing "+card);
      card.play(this);
    } else {
      System.out.println("You do not have an action to play "+card);
    }
    return true;
  }

}
