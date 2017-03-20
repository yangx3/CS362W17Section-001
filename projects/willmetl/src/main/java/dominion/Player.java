/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package dominion;
import java.util.*;

public class Player{
  // The Player class represents a single Dominion player
  // Initial cards for each player's Deck
  public int startingCopper = 7;
  public int startingEstates = 3;
  // Attributes for this class are public
  public String playerName;
  public int drawCards = 7;  // inital hand size
  public int remActions;
  public int remBuys;
  public int remMoney;

  public Stack<Card> cardPile;
  public int drawsRemaining;
  public ArrayList<Card> hand;
  public GameState gameState;

  public int randomSeed = 11;

  public Random rand = new Random(randomSeed);

  public Player(String pName, GameState game){
    // Constructor for the Player class - sets their name
    this.playerName = pName;
    this.gameState = game;
    this.cardPile = new Stack<Card>();
    this.hand = new ArrayList<Card>();
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

  public int getHandSize(){
    return hand.size();
  }

  public int getMoney(){
    return this.remMoney;
  }

  public String getName(){
    return this.playerName;
  }

  public void actionPhase(){
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
        // Card c = chooseActionCard();
        Card c = chooseTypeOfCard(Card.Type.ACTION);
        if(c != null){
          playCard(c);
        }else{  // this is ugly
          return;
        }
      }else{
        System.out.println(playerName+" has no Action cards to play.");
        return;
      }
    }
  }

  public boolean buyCard(Card c){
    // System.out.println("Attempting to buy "+c);
    if(gameState.countCard(c)<=0){
      System.out.println("There are not enough "+c+" available.");
      return false;
    }
    if(remMoney<c.getCost()){
      System.out.format("A %s costs %d but you only have %d money. ur broke.\n",
        c, c.getCost(), remMoney
      );
      return false;
    }
    remMoney -= c.getCost();
    remBuys--;
    return discard(gameState.takeCard(c));
  }

  public void buyPhase(){
    // Auto convert all Treasure cards and allow player to buy
    // Iterating over an ArrayList while removing elements gets messy
    ArrayList<Card> tcards = new ArrayList<Card>();
    for(Card c: hand)
      if(c.getType() == Card.Type.TREASURE) tcards.add(c);
    for(Card c: tcards){
      hand.remove(c);
      playCard(c);
    }
    while(remBuys >= 1){
      System.out.format("%s has %d buys and %d money to spend.\n",
        playerName, remBuys, remMoney);
      // Show a list of cards from the bank
      int availCards = gameState.listCards();
      System.out.format("Please enter the card number (1-%d) you want to buy,"+
        " or 0 to cancel: ", availCards);
        // Bots play the first card of the correct type
      int choice = rand.nextInt(20)+1;
      buyCard(Card.values()[choice-1]);
    }
  }

  public void cleanupPhase(){
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
    // Bots select a random card
    Collections.shuffle(hand, rand);
    if(hand.size() > 0)
      return hand.remove(rand.nextInt(hand.size()));
    else return null;
  }

  public Card chooseTypeOfCard(Card.Type type){
    // Bots play the first card of the correct type
    for(int i=0; i<hand.size(); i++)
      if(hand.get(i).getType() == type)
        return hand.remove(i);
    return null;
  }

  public int countAllCards(){
    return hand.size() + cardPile.size();
  }

  public int countVictoryPoints(){
    int total = 0;
    for(Card c: hand){
      total += c.getVictoryPoints(this);
    }
    for(Card c: cardPile){
      total += c.getVictoryPoints(this);
    }
    return total;
  }

  public boolean discardFromHand(){
    // This player discards a random card from their hand
    // int handsize = hand.size();
    if(hand.size()==0) return false;
    Card c = hand.get(rand.nextInt(hand.size()));
    return discardFromHand(c);
  }
  public boolean discardFromHand(Card c){
    int i = hand.indexOf(c);
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
    if(drawsRemaining == 0)
      drawsRemaining = shuffle();
    drawsRemaining--;
    Card c = cardPile.remove(0);
    return c;
  }

  public boolean isCardInHand(Card c){
    return hand.contains(c);
  }

  public boolean isCardInDeck(Card c){
    return cardPile.contains(c);
  }

  public void newTurn(){
    // Start every turn with a new, full hand and 1 action, 1 buy
    System.out.println("It's "+playerName+"'s turn:");
    actionPhase();
    buyPhase();
    cleanupPhase();
  }

  public boolean playCard(Card card){
    return playCard(card, this);
  }
  public boolean playCard(Card c, Player target){
    if(c.getType() != Card.Type.ACTION || remActions>=1){
      remActions -= c.getActionCost();
      if(c.play(this) == null)
        hand.remove(c); // trash the card from your hand
      else
        discard(c);
    } else {
      System.out.println("You do not have an action to play "+c);
      return false;
    }
    return true;
  }

  public boolean putInHand(Card c){
    return hand.add(c);
  }

  public boolean returnCardToShared(Card c){
    // pull from hand?  assume already pulled?
    return gameState.addCard(c);
  }

  public void seeDeck(){
    System.out.println("Player "+playerName+"'s discardPile:");
    for(int i=drawsRemaining; i<cardPile.size(); i++){
      System.out.println(cardPile.elementAt(i));
    }
    System.out.println("drawsRemaining = "+drawsRemaining);
  }

  public void seeHand(){
    System.out.println("Player "+playerName+"'s hand:");
    // Display all cards in a player's hand
    for(Card c: hand){
      System.out.println(c);
    }
  }

  public int shuffle(){
    Collections.shuffle(cardPile, rand);
    drawsRemaining = cardPile.size();
    return drawsRemaining;
  }

  public boolean takeFreeCard(Card c){
    if(gameState.countCard(c)<=0){
      System.out.println("There are not enough "+c+" available in the supply.");
      return false;
    }
    // System.out.format("%s gained a free %s.\n", playerName, c);
    return discard(c);
  }

  @Override
  public String toString() {
    return this.playerName;
  }
}
