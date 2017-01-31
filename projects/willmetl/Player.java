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
  private int drawsRemaining;
  private ArrayList<Card> hand;
  public GameState gameState;

  private Scanner scan = new Scanner(System.in);

  public Player(String pName, GameState game){
    // Constructor for the Player class - sets their name
    this.playerName = pName;
    this.gameState = game;
    this.cardPile = new Stack<Card>();
    this.drawsRemaining = 0;
    this.hand = new ArrayList<Card>(20);
    for(int i=0; i<startingCopper; i++)
      takeFreeCard(gameState.takeCard(Card.COPPER));
    for(int i=0; i<startingEstates; i++)
      takeFreeCard(gameState.takeCard(Card.ESTATE));
    shuffle();
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

  private void actionPhase(){
    // Action phase of a player's turn
    while(remActions >= 1){
      // Only prompt the player to choose a card if they have Action cards
      boolean needsChoice = false;
      System.out.print(playerName+"'s hand contains: ");
      for(int i=0; i<hand.size(); i++){
        System.out.format("%s%s", hand.get(i), i+1<hand.size()?", ":".\n");
        if(hand.get(i).getType() == Card.Type.ACTION) needsChoice = true;
      }
      if(needsChoice){
        System.out.println("Please choose an Action card from your hand.");
        Card c = chooseActionCard();
        if(c != null){
          System.out.println(playerName+" chose to play the "+c+" card.");
          playCard(c);
          System.out.println("Back from playing the "+c+" card.");
        }else{  // this is ugly
          return;
        }
      }else{
        return;
      }
    }
  }

  private boolean buyCard(Card c){
    System.out.println("Attempting to buy "+c);
    if(gameState.countCard(c)<=0){
      System.out.println("There are not enough "+c+" available.");
      return false;
    }
    if(remMoney<c.costsMoney){
      System.out.format("A %s costs %d but you only have %d money. ur broke.\n",
        c, c.costsMoney, remMoney
      );
      return false;
    }
    if(discard(gameState.takeCard(c))){
        remMoney -= c.costsMoney;
        remBuys--;
        return true;
    }
    return false;
  }

  private void buyPhase(){
    // Auto convert all Treasure cards and allow player to buy
    ArrayList<Card> tempHand = new ArrayList<Card>(hand);
    for(Card c: tempHand){
      if(c.getType() == Card.Type.TREASURE){
        playCard(c);
      }
    }
    while(remBuys >= 1){
      System.out.format("%s has %d buys and %d money to spend.\n",
        playerName, remBuys, remMoney);
      // Show a list of cards from the bank
      int availCards = gameState.listCards();
      System.out.format("Please enter the card number (1-%d) you want to buy,"+
        " or 0 to cancel: ", availCards);
      int choice = scan.nextInt();
      if( choice>0 && choice<=availCards )
        buyCard(Card.values()[choice-1]);
      else if( choice==0 )
        remBuys = 0;
    }
  }

  private void cleanupPhase(){
    // Discard hand and draw 5 new cards
    cardPile.addAll(drawsRemaining, hand);
    hand.clear();
    // Add 5 new cards from the top of this player's drawPile deck
    for(int i=0; i<5; i++) {
      hand.add(draw());
    }
    // Reset actions and buys for next turn
    remMoney = 0;
    remActions = 1;
    remBuys = 1;
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

  public Card chooseActionCard(){
    for(int i=0; i<hand.size(); i++){
      if(hand.get(i).getType() == Card.Type.ACTION)
        System.out.println(i+1+" - "+hand.get(i));
    }
    System.out.format("Please enter the card number (1-%d) you want to play,"+
      " or 0 to cancel: ", hand.size());
    int choice = scan.nextInt()-1;
    if( choice>-1 && choice<hand.size() ){
      System.out.println("u chose "+hand.get(choice));
      return hand.remove(choice);
    }else if( choice==0 )
      remActions = 0;
    return null;
  }

  public boolean discardRandomFromHand(){
    // This player discards a random card from their hand
    int handsize = hand.size();
    // generate random number in range of hand size instead of this
    Card c = hand.remove(0);
    return discard(c);
  }

  public boolean discardFromHand(Card c){
    int i = hand.indexOf(c);
    System.out.println("i="+i);
    if(i>=0)
      return cardPile.add(hand.remove(i));
    return false;
  }

  public boolean discard(Card c){
    // Add a card to the discard pile
    cardPile.add(cardPile.size(), c);
    return true;
  }

  public Card draw(){
    // System.out.print("Drawing.. "+drawsRemaining+" ->");
    if(drawsRemaining == 0)
      drawsRemaining = shuffle();
    drawsRemaining--;
    Card c = cardPile.remove(0);
    // System.out.println(drawsRemaining+"("+c+")");
    return c;
  }

  public void newTurn(){
    // Start every turn with a new, full hand and 1 action, 1 buy
    if(DEBUGGING) System.out.println("It's "+playerName+"'s turn:");
    // seeDeck();
    hand.add(Card.AMBASSADOR);
    actionPhase();
    buyPhase();
    cleanupPhase();
    // seeDeck();
    if(DEBUGGING) System.out.println(playerName+"'s turn is OVER.\n\n");
  }

  public boolean playCard(Card card){
    return playCard(card, this);
  }
  public boolean playCard(Card c, Player target){
    if(c.costsAction==0 || remActions>1){
      remActions -= c.costsAction;
      // if(DEBUGGING) System.out.println("Playing "+c);
      c.play(this);
    } else {
      System.out.println("You do not have an action to play "+c);
      return false;
    }
    return true;
  }

  public boolean returnCardToShared(Card c){
    // pull from hand?  assume already pulled?
    gameState.replaceCard(c);
  }

  public void seeDeck(){
    if(DEBUGGING){
      System.out.println("Player "+playerName+"'s hand:");
      seeHand();
      System.out.println("Player "+playerName+"'s drawPile:");
      for(int i=0; i<drawsRemaining; i++){
        System.out.println(cardPile.elementAt(i));
      }
      System.out.println("Player "+playerName+"'s discardPile:");
      for(int i=drawsRemaining; i<cardPile.size(); i++){
        System.out.println(cardPile.elementAt(i));
      }
      System.out.println("drawsRemaining = "+drawsRemaining);
    }
  }

  public void seeHand(){
    // Display all cards in a player's hand
    for(Card c: hand){
      System.out.println(c);
    }
  }

  public int shuffle(){
    Collections.shuffle(cardPile);
    drawsRemaining = cardPile.size();
    return drawsRemaining;
  }

  public boolean takeFreeCard(Card c){
    return discard(c);
  }

  @Override
  public String toString() {
    return this.playerName;
  }
}
