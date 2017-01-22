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
  private static Card ESTATE = new Card(
    "Estate",
    "+1 victory",
    false,
    2,
    1,
    0,
    0,
    0
  );

  private final int defaultDeckSize = 100;
  private final int pileSize = 8;     // How many cards per pile
  // Initial cards for each player's Deck
  private final int startingCopper = 7;
  private final int startingVP = 3;
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
    for(int i=0; i<bankCopper; i++){
      sharedcards.addCard(COPPER);
    }
    for(int i=0; i<bankEstates; i++){
      sharedcards.addCard(ESTATE);
    }
    System.out.println("Shared deck contains "+sharedcards.getSize()+" cards:");
    // sharedcards.seeDeck();

    Player a = new Player("Amy");
    // I want a way to easily reference a static card here
    a.draw(sharedcards, COPPER);
    a.draw(sharedcards, ESTATE);
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
