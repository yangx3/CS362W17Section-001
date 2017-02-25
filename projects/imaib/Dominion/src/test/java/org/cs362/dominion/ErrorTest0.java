
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    org.cs362.dominion.Card.Type type3 = card2.getType();
    org.cs362.dominion.Card.CardName cardName4 = card2.getCardName();
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card6);
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState10, "");
    java.lang.String str13 = player12.toString();
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    gameState19.initializeGame();
    card2.play(player12, gameState19);
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName23 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card24 = org.cs362.dominion.Card.getCard(list_card22, cardName23);
    boolean b26 = card24.equals((java.lang.Object)'4');
    int i27 = card24.getTreasureValue();
    java.lang.String str28 = card24.toString();
    int i29 = card24.score();
    player12.AdventurerDiscard(card24);
    player12.playTreasureCard();
    
    // Checks the contract:  compareTo-equals on card24 and card2
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card24 and card2", (card24.compareTo(card2) == 0) == card24.equals(card2));

  }

}
