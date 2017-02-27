import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Turn {
	int actions, buys, treasure;
	List<Card> hand;
	
	public Turn(Player player, CardSupply theSupply){
		actions=1;
		buys=1;
		treasure=0;
		hand= new LinkedList<Card>();
		
		for(int i=0; i<5; i++){
			hand.add(player.drawCard());
		}

	}

	public void buyCards(Player player, CardSupply theSupply) {
		String whatCard="nothing";
		String pick2[]={"estate", "embargo"};
		String pick3[]={"silver", "ambassador", "great hall", "village", "woodcutter"};
		String pick4[]={"baron", "cutpurse", "feast", "gardens", "smithy"};
		String pick5[]={"council room", "mine"};
		String pick6[]={"gold", "adventurer"};
		Random randomness=new Random();
		
		switch(treasure){
		case 1: //no card costs 1, therefore default to purchasing copper 
		case 0:
			if(theSupply.copper.quantity>0){
				player.discard.addCard("copper");
				theSupply.removeCard("copper");
				whatCard="copper";
			}
			break;
		case 2:
			whatCard = pick2[randomness.nextInt(2)];
			if(theSupply.howMany(whatCard)<1) whatCard=pick2[randomness.nextInt(2)];
			player.discard.addCard(whatCard);
			theSupply.removeCard(whatCard);
			spend(2, player);
			break;
		case 3:
			whatCard= pick3[randomness.nextInt(5)];
			if(theSupply.howMany(whatCard)<1){
				for(int i=0; i<5; i++){ //make sure we're not looking forever
					whatCard= pick3[randomness.nextInt(5)];
					if(theSupply.howMany(whatCard)>0) break;
				}					
			}
			player.discard.addCard(whatCard);
			theSupply.removeCard(whatCard);
			spend(3, player);
			break;
		case 4:
			whatCard= pick4[randomness.nextInt(5)];
			if(theSupply.howMany(whatCard)<1){
				for(int i=0; i<5; i++){ //make sure we're not looking forever
					whatCard= pick4[randomness.nextInt(5)];
					if(theSupply.howMany(whatCard)>0) break;
				}					
			}
			player.discard.addCard(whatCard);
			theSupply.removeCard(whatCard);
			spend(3, player);
			break;
		case 5:
			whatCard= pick5[randomness.nextInt(2)];
			if(theSupply.howMany(whatCard)<1){
				for(int i=0; i<5; i++){ //make sure we're not looking forever
					whatCard= pick5[randomness.nextInt(2)];
					if(theSupply.howMany(whatCard)>0) break;
				}					
			}
			player.discard.addCard(whatCard);
			theSupply.removeCard(whatCard);
			spend(5, player);
			break;
		case 6:
			whatCard= pick6[randomness.nextInt(2)];
			if(theSupply.howMany(whatCard)<1){
				for(int i=0; i<5; i++){ //make sure we're not looking forever
					whatCard= pick6[randomness.nextInt(2)];
					if(theSupply.howMany(whatCard)>0) break;
				}					
			}
			player.discard.addCard(whatCard);
			theSupply.removeCard(whatCard);
			spend(6, player);
			break;
		default: 
			if(theSupply.province.quantity>0)
				{
				player.discard.addCard("province");
				theSupply.removeCard("province");
				spend(8, player);
				whatCard="province";
				}
		}
		player.discard.addCard("curse", theSupply.isEmbargod(whatCard));
		System.out.println("I purchased "+whatCard);
		return;
		
	}

	public void spend(int i, Player player) {
		ListIterator<Card> iterator = hand.listIterator();
		Card myCard;
		while(iterator.hasNext()){
			myCard=iterator.next();
			if(myCard.worth>0){
				i-=myCard.worth;
				player.discard.addCard(myCard.cardType);
				
				if(i<1) return;
			}
		}
		
	}

	public void endTurn(Player player) {
		for(int i=0; i<hand.size(); i++){
			player.discard.addCard(hand.get(i).cardType);
		}
		hand.clear();
	}
	
	public void takeTurn(Player player, Player player2, CardSupply theSupply){
		while(actions > 0){
			playAction(player, player2, theSupply);
			actions--;
		}
		

		
		while(buys > 0){
			for(int i=0; i<hand.size(); i++){
				treasure+=hand.get(i).worth; //calculate worth.
			}
			buyCards(player, theSupply);
			buys--;
		}
		
		endTurn(player);	
	}

	public void playAction(Player player, Player player2, CardSupply theSupply) {
		for(int i=0; i<hand.size()+1; i++) //go through each card in hand.
		{
			if(i==hand.size()) break;
			if(hand.get(i).action){
				System.out.println("I play "+hand.get(i).cardType);
				actions+=hand.get(i).actionsGranted;;
				buys+=hand.get(i).buysGranted;
				treasure+=hand.get(i).worth;
				for(int j=0; j<hand.get(i).cardsGranted; j++){
					hand.add(player.drawCard());
				}
				Card card=hand.get(i);
				if(hand.get(i).special) doTheThing(hand.get(i), player, player2, theSupply);
				else player.discard.addCard(hand.get(i).cardType);
				hand.remove(card);
				return;
			}
		}
		System.out.println("I forfitted an action");
		return;
	}

	public void doTheThing(Card card, Player player, Player player2, CardSupply theSupply) {
		String whatCard;
		Random randomness = new Random();
		switch(card.cardType){
		case "mine":
			ListIterator<Card> myHand = hand.listIterator();
			Card thisCard;
			
			while(myHand.hasNext()){
				thisCard=myHand.next();
				if(thisCard.cardType=="copper")
				{
					hand.remove(card);
					hand.add(new Card("silver"));
					return;
				}
				else if(thisCard.cardType=="silver")
				{
					hand.remove(card);
					hand.add(new Card("gold"));
					return;
				}
			}
			System.out.println("I chose to forfit my use of Mine");
			break;
		case "feast":
			hand.remove(card);
			String pick[]={"estate", "embargo", "silver", "ambassador", "great hall", "village", "woodcutter", "baron", "cutpurse", "feast", "gardens", "smithy", "council room", "mine"};
			whatCard= pick[randomness.nextInt(14)];
			if(theSupply.howMany(whatCard)<1){
				for(int i=0; i<14; i++){ //make sure we're not looking forever
					whatCard= pick[randomness.nextInt(2)];
					if(theSupply.howMany(whatCard)>0) break;
				}
			if(whatCard==null) System.out.println("I didn't find a card to pick up");
			else hand.add(new Card(whatCard));
			return;
			}
		case "embargo":
			hand.remove(card);
			String embargo = theSupply.kingdomCards.get(randomness.nextInt(theSupply.kingdomCards.size()));
			theSupply.embargo(embargo);
			return;
		
			}
		
		return;
		}		
	
}
