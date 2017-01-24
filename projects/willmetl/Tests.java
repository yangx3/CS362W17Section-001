/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;

public class Tests{
  // This is just a series of experiments and early tests
  // private static Card ADVENTURER = new Card(
  //   "Adventurer",      // cardName
  //   "Reveal cards from your deck until you reveal 2 Treasure "+
  //   "cards. Put those Treasure cards into your hand and discard"+
  //   "the other revealed cards.",  // cardDesc
  //   true,        // costsAction
  //   6,           // costsMoney
  //   0,           // givesVictoryPoints
  //   0,           // givesMoney
  //   0,           // givesActions
  //   0            // givesCardDraws
  // );


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

  private void setupGame(){
    // shared cards that players can buy
    Deck sharedcards = new Deck(defaultDeckSize);
    // Fill the shared deck with the starting cards
    for(int i=0; i<bankCopper; i++)   sharedcards.addCard(Card.COPPER);
    for(int i=0; i<bankSilver; i++)   sharedcards.addCard(Card.SILVER);
    for(int i=0; i<bankGold; i++)     sharedcards.addCard(Card.GOLD);
    for(int i=0; i<bankEstates; i++)  sharedcards.addCard(Card.ESTATE);
    for(int i=0; i<bankDuchies; i++)  sharedcards.addCard(Card.DUCHY);
    for(int i=0; i<bankProvinces; i++)sharedcards.addCard(Card.PROVINCE);

    sharedcards.addCard(Card.ADVENTURER);

    assert(sharedcards.getSize() == bankCopper+bankSilver+bankGold+
      bankEstates+bankDuchies+bankProvinces
    );
    System.out.println("Shared deck contains "+sharedcards.getSize()+" cards:");
    // sharedcards.seeDeck();

    Player a = new Player("Amy");
    // I want a way to easily reference a static card here
    for(int i=0; i<startingCopper; i++)   a.draw(sharedcards, Card.COPPER);
    for(int i=0; i<startingEstates; i++)  a.draw(sharedcards, Card.ESTATE);
    assert(a.getDrawSize() == 0);
    assert(a.getDiscardSize() == startingCopper+startingEstates);
    a.seeDeck();

    sharedcards.shuffle();
    System.out.println("Shared deck contains "+sharedcards.getSize()+" cards:");
    // sharedcards.seeDeck();

    Player b = new Player("Bill");
  }

  public static void main(String [ ] args){
    Tests game1 = new Tests();
    game1.setupGame();
  }
}
