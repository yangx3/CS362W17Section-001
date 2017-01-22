/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package willmetl;

public class Tests{
  // This is just a series of experiments and early tests
  private static Card COPPER = new Card(
    "Copper",    // cardName
    "+1 money",  // cardDesc
    false,       // costsAction
    0,           // costsMoney
    0,           // givesVictoryPoints
    1,           // givesMoney
    0,           // givesActions
    0            // givesCardDraws
  );
  private static Card SILVER = new Card(
    "Silver",    // cardName
    "+2 money",  // cardDesc
    false,       // costsAction
    3,           // costsMoney
    0,           // givesVictoryPoints
    2,           // givesMoney
    0,           // givesActions
    0            // givesCardDraws
  );
  private static Card GOLD = new Card(
    "Gold",      // cardName
    "+3 money",  // cardDesc
    false,       // costsAction
    6,           // costsMoney
    0,           // givesVictoryPoints
    3,           // givesMoney
    0,           // givesActions
    0            // givesCardDraws
  );
  private static Card ESTATE = new Card(
    "Estate",      // cardName
    "+1 victory",  // cardDesc
    false,       // costsAction
    2,           // costsMoney
    1,           // givesVictoryPoints
    0,           // givesMoney
    0,           // givesActions
    0            // givesCardDraws
  );
  private static Card DUCHY = new Card(
    "Duchy",      // cardName
    "+3 victory",  // cardDesc
    false,       // costsAction
    5,           // costsMoney
    3,           // givesVictoryPoints
    0,           // givesMoney
    0,           // givesActions
    0            // givesCardDraws
  );
  private static Card PROVINCE = new Card(
    "Province",      // cardName
    "+6 victory",  // cardDesc
    false,       // costsAction
    8,           // costsMoney
    6,           // givesVictoryPoints
    0,           // givesMoney
    0,           // givesActions
    0            // givesCardDraws
  );


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
    for(int i=0; i<bankCopper; i++)   sharedcards.addCard(COPPER);
    for(int i=0; i<bankSilver; i++)   sharedcards.addCard(SILVER);
    for(int i=0; i<bankGold; i++)     sharedcards.addCard(GOLD);
    for(int i=0; i<bankEstates; i++)  sharedcards.addCard(ESTATE);
    for(int i=0; i<bankDuchies; i++)  sharedcards.addCard(DUCHY);
    for(int i=0; i<bankProvinces; i++)sharedcards.addCard(PROVINCE);

    assert(sharedcards.getSize() == bankCopper+bankSilver+bankGold+
      bankEstates+bankDuchies+bankProvinces
    );
    // System.out.println("Shared deck contains "+sharedcards.getSize()+" cards:");
    // sharedcards.seeDeck();

    Player a = new Player("Amy");
    // I want a way to easily reference a static card here
    for(int i=0; i<startingCopper; i++)   a.draw(sharedcards, COPPER);
    for(int i=0; i<startingEstates; i++)  a.draw(sharedcards, ESTATE);
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
