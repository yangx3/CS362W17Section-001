package org.cs362.dominion; 

import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List;
import java.util.Set;

public final class Card implements Comparable<Card>,Cloneable{

public static enum Type {
ACTION, TREASURE, VICTORY;
}

//card ID
public static enum CardName 
{ /** The Treasure cards */
	Gold, Silver, Copper, 
	/** The Victory cards */ 
	Province,Duchy,Estate,Curse, 
	/** The Kingdom cards */ 
	adventurer,ambassador,baron,council_room,cutpurse,embargo,
	feast,great_hall,mine, minion
}
/**  * @param enum CardName the name of the card (GOLD, SILVER, COPPER,  
 * * @param enum Type the type of the card (Victory, Treasure, or Kingdom  
 * * @param int cost the cost of the card  
 * * @param int score the score of the card, when the game is finished  
 * * @param treasureValue  the treasure value of the treasure cards (cooper,silver, and gold cards)
 */
//each card has
private final Type type; 
private final CardName cardName; 
private final int cost;  
private final int score;
private final int treasureValue; 

//constructor 
Card(CardName cardName, Type type, int cost, int score, int treasureValue)
{
this.cost = cost;
this.score = score;
this.treasureValue = treasureValue; 
this.type = type; 
this.cardName = cardName;
}
//getters

/**  
* Returns the type 
*/ 
public Type getType() { 
	return type; 
}
/**  
 *  Returns the cardName  
 */ 
public CardName getCardName() { 
	return cardName; 
}
/** 
 * Returns the cost  
 */
public int getCost() {
return cost;
}
/**  
 *Returns the treasureValue
 */ 
public int getTreasureValue() { 
	return treasureValue; 
} 
public int getScore() {
return score;
}
//creates the cards with specific unique properties
public static List<Card> createCards() {
List<Card> ret = new LinkedList<Card>();

/** The Treasure cards  */ 
Card g = new Card(CardName.Gold,Type.TREASURE,6,0,3); 
ret.add(g); 
Card s = new Card(CardName.Silver, Type.TREASURE, 3,0,2); 
ret.add(s); 
Card c = new Card(CardName.Copper, Type.TREASURE, 0,0,1); 
ret.add(c);
/** The Victory cards  */ 
Card p = new Card(CardName.Province,Type.VICTORY, 8, 6, 0); 
ret.add(p);
Card d = new Card(CardName.Duchy,Type.VICTORY,5, 1, 0);
ret.add(d); 
Card e = new Card(CardName.Estate,Type.VICTORY,2, 3, 0); 
ret.add(e); 
Card cu = new Card(CardName.Curse,Type.VICTORY,0, -1, 0); 
ret.add(cu);
/**The Kingdom cards*/
Card a = new Card(CardName.adventurer,Type.ACTION,6,0,0); 
ret.add(a);
Card am = new Card(CardName.ambassador,Type.ACTION,3,0,0);
ret.add(am);
Card b = new Card(CardName.baron,Type.ACTION,4,0,0); //possibly 4 tv if discard an estate card
ret.add(am);
Card cR = new Card(CardName.council_room,Type.ACTION,5,0,0); 
ret.add(cR);
Card ct = new Card(CardName.cutpurse,Type.ACTION,4,0,2); 
ret.add(ct);
Card em = new Card(CardName.embargo,Type.ACTION,2,0,2); 
ret.add(em);
Card f = new Card(CardName.feast,Type.ACTION,4,0,0); 
ret.add(f);
Card gh = new Card(CardName.great_hall,Type.ACTION,4,1,0); 
ret.add(gh);
Card m = new Card(CardName.mine,Type.ACTION,5,0,0); 
ret.add(m);
Card mi = new Card(CardName.minion,Type.ACTION,5,0,0);  //possibly plus 2 treasure points
ret.add(mi);
//plus three more
return ret;
}
public void play(Player player, GameState state) {
switch(this.cardName) { 
  case adventurer:
    //Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.*/
		int needTreasures = 2;
	     while(needTreasures > 0){
	    	 
	      Card c = player.drawCard(); 
	      if (c.getType()!=Card.Type.TREASURE)
	      {
	    	  //discard it
	    	  player.discard(c); 
	    	  continue;
	      }
	      player.drawCard(); 
	      needTreasures--;
	     }
   
    System.out.println("Reveal cards from the player deck until player reveal 2 Treasure cards. " +
    "Put those Treasure cards into player hand and discard the other revealed cards.");
    return; 
	case ambassador:
	//Reveal a card from hand. Return up to two copies of it from your hand to supply. Then each other player gains a copy of it.
	      if(player.hand.size() > 0){
	       Card c= player.hand.get(0);
	       //get its name
	       CardName cN = c.getCardName(); 
	       //add to supply
	       state.gameBoard.put(getCard(player.hand, cN), state.gameBoard.get(getCard(state.cards,cN)) +1); 
	       
	       //loop through all the  players
	       for (Player p : state.players)
	       {
	    	   //it's not you
	    	   if(p!=player)
	    	   {
	    		   //remove card from supply
	    		   player.gain(getCard(state.cards,cN));
	    		   state.gameBoard.put(getCard(state.cards, cN), state.gameBoard.get(getCard(state.cards,cN)) -1); 
	    	   }
	       }
	      }
	 System.out.println("Reveal a card from hand. Return up to two copies of it from your hand to supply. Then each other player gains a copy of it."); 
	 return;
	 case baron:
	//+1 buy. You may discard an Estate Card. If you do, +4,otherwise, gain an  Estate card.
	player.numBuys++;
	//check if you have an estate card
	Card c =getCard(player.hand, CardName.Estate); 
	if (c!=null)
	{
		//add 4 coins
		player.coins+=+4; 
	}
	else 
	{
		//get an estate for the supply
		state.gameBoard.put(getCard(player.hand, CardName.Estate), state.gameBoard.get(getCard(state.cards,CardName.Estate)) -1); 
	}
	System.out.println("+1 buy. You may discard an Estate Card. If you do, +4,otherwise, gain an  Estate card.");
    return;
	case council_room:
	//+4 cards +1 buy,each other player draws a card
	player.drawCard(); 
	player.drawCard(); 
	player.drawCard(); 
	player.drawCard(); 
	player.numBuys++; 
	for (Player p : state.players)
    {
		if(p!=player)
		{
		 p.drawCard(); 
		}
    }
	System.out.println("+4 cards +1 buy,each other player draws a card");
	case cutpurse:
	//+2. Each other player discards a copper 
	player.coins+=2; 
	for (Player p : state.players)
    {
		if(p!=player)
		{
			player.discard(getCard(player.hand, CardName.Copper)); 
		}		
	}
	System.out.println("+2. Each other player discards a copper "); 
	case embargo:
	//+2,Trash this card. Put an Embargo token on top of a Supply pile. 
		//trash
		player.playedCards.remove(this);
		return; 
		
	case feast: 
		//Trash this card. Gain a card costing up to 5
		player.playedCards.remove(this);
		player.coins+=5; 
		System.out.println("Trash this card. Gain a card costing up to 5 ");
    case great_hall:
    	//+1 card +1 Action, 1 victory
    	player.drawCard(); 
    	System.out.println("+1 card +1 Action, 1 victory");
    case mine:
    	//you may trash a treasure from your hand. Gain a treasure to your hand costing up to 3 more than it
    	List<Card> cds =filter(player.hand,Type.TREASURE ); 
    	Card treasure = cds.get(0);
    	if(treasure.getCardName()==CardName.Copper)
    	//get a treasure card from supply
    	state.gameBoard.put(getCard(state.cards, CardName.Silver), state.gameBoard.get(getCard(state.cards,CardName.Silver)) -1); 
    	if(treasure.getCardName()==CardName.Silver)
    	state.gameBoard.put(getCard(state.cards, CardName.Gold), state.gameBoard.get(getCard(state.cards,CardName.Gold)) -1); 
    	else
    		state.gameBoard.put(getCard(state.cards, CardName.Gold), state.gameBoard.get(getCard(state.cards,CardName.Gold)) -1); 
    	//remove it
    	cds.remove(treasure); 
       System.out.println("//you may trash a treasure from your hand. Gain a treasure to your hand costing up to 3 more than it"); ;
      case minion:
      //+1 action , Choose one: +2, discard your hand, +4 cards and each other player with at least 5 cards in hand discards their hand and draws 4 cards
       int ndx = (int) Randomness.nextRandomInt(2);
       
       if(ndx==1)
       {
    	   player.coins+=2; 
    	   
       }
       else 
       {
    	   int numCards=player.hand.size();  
    	   for(Card card : player.hand)
    	   {
    		   player.discard(card);
    	   }
    	   player.drawCard();
		   player.drawCard();
		   player.drawCard();
		   player.drawCard();
		    
		   for(Player p : state.players)
		   {
			   if(p.hand.size()>=5)
			   {
				   for(Card card : player.hand)
		    	   {
		    		   player.discard(card);
		    	   }
				   player.drawCard();
				   player.drawCard();
				   player.drawCard();
				   player.drawCard();
			   }
			   
		   }
       }
   return;
   

    	
    	
    	
    	
    	
    	
    	
    	
		
	
	
		
		
	
	
	
	
	
	
/*case Smithy:       
	player.drawCard();          
	player.drawCard();          
	player.drawCard();
return; 
case Village:
    System.out.println("TODO Village Code******************************************");
    System.out.println("The player draw +1 Card.");       System.out.println("The player gets +2 play Actions.");
return;*/

default:return;
    }
}
//searches a list of cards and returns the first card that matches the name of the card passed in, otherwise returns null
public static Card getCard(List<Card> cards,CardName cardName) {
for(int i=0; i<cards.size();i++){
if(cards.get(i).cardName.equals(cardName))
return cards.get(i);
}
return null;
}
//returns a list of cards that are the same type as a particular type passed in in a card list passed in
public static List<Card> filter(Iterable<Card> cards, Type target) {
	    List<Card> out = new ArrayList<Card>();       
	    for (Card c : cards)         
	    	if (c.getType() == target)             
	    		out.add(c);       
	    return out;    }
     //returns all the info about a card in a string
	@Override public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(" \t" + this.getCardName()); 
	sb.append("-" + this.getType() + " "); 
	sb.append("\t\t Cost: " + this.cost + " "); 
	sb.append("\t\t Score: " + this.score + " "); 
	sb.append("\tTreasure Value: " + this.treasureValue);
	return sb.toString();
	}
	@Override 
	public boolean equals(Object obj) { 
		if(this == obj) return true;
	    if(!super.equals(obj)) return false; 
	    if(!(obj instanceof Card)) return false;
	     
	    return cardName.equals(((Card) obj).cardName);
	}
	public int compareTo(Card o) {
	// TODO Auto-generated method stub 
		return cardName.compareTo(o.cardName);
	}
	protected Object clone() throws CloneNotSupportedException {         
	 return super.clone();   
	  }
	}