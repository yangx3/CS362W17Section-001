package org.cs362.dominion;

import java.util.LinkedList;
import java.util.List;

public class Player {
	CardSupply discard, drawPile;
	
	public Player(CardSupply supply)
	{
		discard=new CardSupply(supply);
		drawPile=new CardSupply(supply);
		drawPile.addCard("copper", 7);
		drawPile.addCard("estate", 3);
	}


	public void shuffleDiscard(){ //doesn't actually shuffle, just moves discard back into drawPile
		drawPile.adventurer.quantity=discard.adventurer.quantity;
		discard.adventurer.quantity=0;
		drawPile.ambassador.quantity=discard.ambassador.quantity;
		discard.ambassador.quantity=0;
		drawPile.copper.quantity=discard.copper.quantity;
		discard.copper.quantity=0;
		drawPile.silver.quantity=discard.silver.quantity;
		discard.silver.quantity=0;
		drawPile.gold.quantity=discard.gold.quantity;
		discard.gold.quantity=0;
		drawPile.estate.quantity=discard.estate.quantity;
		discard.estate.quantity=0;
		drawPile.baron.quantity=discard.baron.quantity;
		discard.baron.quantity=0;
		drawPile.duchy.quantity=discard.duchy.quantity;
		discard.duchy.quantity=0;
		drawPile.province.quantity=discard.province.quantity;
		discard.province.quantity=0;
		drawPile.curse.quantity=discard.curse.quantity;
		discard.curse.quantity=0;
		drawPile.councilRoom.quantity=discard.councilRoom.quantity;
		discard.councilRoom.quantity=0;
		drawPile.cutPurse.quantity=discard.cutPurse.quantity;
		discard.cutPurse.quantity=0;
		drawPile.embargo.quantity=discard.embargo.quantity;
		discard.embargo.quantity=0;
		drawPile.feast.quantity=discard.feast.quantity;
		discard.feast.quantity=0;
		drawPile.gardens.quantity=discard.gardens.quantity;
		discard.gardens.quantity=0;
		drawPile.greatHall.quantity=discard.greatHall.quantity;
		discard.greatHall.quantity=0;
		drawPile.mine.quantity=discard.mine.quantity;
		discard.mine.quantity=0;
		drawPile.smithy.quantity=discard.smithy.quantity;
		discard.smithy.quantity=0;
		drawPile.village.quantity=discard.village.quantity;
		discard.village.quantity=0;
		drawPile.woodcutter.quantity=discard.woodcutter.quantity;
		discard.woodcutter.quantity=0;
		return;
	}

	public Card drawCard() {
		if(deckSize(drawPile)<1) shuffleDiscard();
		return drawPile.drawCard();
	}


	public int deckSize(CardSupply deck) {
		List<String> cardsUsed= new LinkedList<String>();
		int cardsRemaining=0;
		for(String card : deck.kingdomCards)
			cardsUsed.add(card);
		cardsUsed.add("copper");
		cardsUsed.add("silver");
		cardsUsed.add("gold");
		cardsUsed.add("duchy");
		cardsUsed.add("estate");
		cardsUsed.add("province");
		cardsUsed.add("curse");
		for(String card : cardsUsed)
			cardsRemaining+=deck.howMany(card);
		return cardsRemaining;
	}


	public int countPoints() {
		int myPoints=0;
		shuffleDiscard();
		for(String card: discard.smithy.type.allCards())
			myPoints+=(discard.cardVP(card)*(drawPile.howMany(card)));
		myPoints+=deckSize(drawPile)*drawPile.howMany("gardens");
		return myPoints;
	}
	
	
	
	

}
