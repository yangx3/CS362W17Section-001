import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CardSupply {
	SupplyStack copper, silver, gold, estate, duchy, province, curse, adventurer;
	SupplyStack ambassador, baron, councilRoom, cutPurse, embargo, feast, gardens;
	SupplyStack greatHall, mine, smithy, village, woodcutter;
	List<String> kingdomCards=		new LinkedList<String>(); //contain kingdom cards used this game
	
	CardSupply(CardSupply supply){
		copper= 	new SupplyStack("copper", 0); //need 46 for supply 
		silver=		new SupplyStack("silver", 0); //need 40 for supply
		gold= 		new SupplyStack("gold", 0);//need 30
		estate=		new SupplyStack("estate", 0); //Need 18
		duchy=		new SupplyStack("duchy", 0); //need 12
		province= 	new SupplyStack("province", 0); //need 12
		curse=	 	new SupplyStack("curse", 0); //need 10 for 2 players
		adventurer=	new SupplyStack("adventurer", 0); //need 10
		ambassador=	new SupplyStack("abassador", 0); //need 10
		baron= 		new SupplyStack("baron", 0); //need 10
		councilRoom=new SupplyStack("council room", 0); //need 10
		cutPurse= 	new SupplyStack("cutpurse", 0); //need 10
		embargo= 	new SupplyStack("embargo", 0); //need 10
		feast= 		new SupplyStack("feast", 0); //need 10
		gardens= 	new SupplyStack("gardens", 0); //need 10
		greatHall= 	new SupplyStack("great hall", 0); //need 10
		mine= 		new SupplyStack("mine", 0); //need 10
		smithy= 	new SupplyStack("smithy", 0); //need 10
		village= 	new SupplyStack("village", 0); //need 10
		woodcutter= new SupplyStack("woodcutter", 0); //need 10
		kingdomCards=supply.kingdomCards;
		}
	
	

	CardSupply(){
		copper= 	new SupplyStack("copper", 46); //need 46 for supply 
		silver=		new SupplyStack("silver",  40); //need 40 for supply
		gold= 		new SupplyStack("gold",  30);//need 30
		estate=		new SupplyStack("estate",  12); //Need 18
		duchy=		new SupplyStack("duchy",  12); //need 12
		province= 	new SupplyStack("province",  12); //need 12
		curse=	 	new SupplyStack("curse",  10); //need 10 for 2 players
		adventurer=	new SupplyStack("adventurer",  10); //need 10
		ambassador=	new SupplyStack("abassador",  10); //need 10
		baron= 		new SupplyStack("baron",  10); //need 10
		councilRoom=new SupplyStack("council room",  10); //need 10
		cutPurse= 	new SupplyStack("cutpurse",  10); //need 10
		embargo= 	new SupplyStack("embargo",  10); //need 10
		feast= 		new SupplyStack("feast",  10); //need 10
		gardens= 	new SupplyStack("gardens",  10); //need 10
		greatHall= 	new SupplyStack("great hall",  10); //need 10
		mine= 		new SupplyStack("mine",  10); //need 10
		smithy= 	new SupplyStack("smithy",  10); //need 10
		village= 	new SupplyStack("village",  10); //need 10
		woodcutter= new SupplyStack("woodcutter",  10); //need 10
		selectKingdomCards();
		}


	private void selectKingdomCards() {
		String cardList[]={"adventurer", "ambassador", "baron", "council room", "cutpurse", "embargo", "feast", "gardens", "great hall", "mine", "smithy", "village", "woodcutter"};
		Random randomness=new Random();
		int index;
		
		while(kingdomCards.size()<10){
			index=randomness.nextInt(13);
			if(!kingdomCards.contains(cardList[index])) kingdomCards.add(cardList[index]);
		}
		
	}
	
	public Card drawCard(){
		List<String> choices= new LinkedList<String>();
		String cardTypes[]=copper.type.allCards();
		for(String card : cardTypes){
			choices.add(card);
		}
		Random randomness= new Random();
		int index;
		Card card;

		index=randomness.nextInt(20);
		while(howMany(choices.get(index))<=0){ //Grab different card types until one actually exists in the deck
			index=randomness.nextInt(20);
		}
		card = new Card(choices.get(index));
		removeCard(choices.get(index));
		return card;
		
		}
	
	public void removeCard(String string) {
		switch(string){
		case "copper":
			copper.quantity--;
			return;
		case "silver":
			silver.quantity--;
			return;
		case "gold":
			gold.quantity--;
			return;
		case "estate":
			estate.quantity--;
			return;
		case "duchy":
			duchy.quantity--;
			return;
		case "province":
			province.quantity--;
			return;
		case "adventurer":
			adventurer.quantity--;
			return;
		case "ambassador":
			ambassador.quantity--;
			return;
		case "baron":
			baron.quantity--;
			return;
		case "council room":
			councilRoom.quantity--;
			return;
		case "cutpurse":
			cutPurse.quantity--;
			return; 
		case "embargo":
			embargo.quantity--;
			return;
		case "feast":
			feast.quantity--;
			return;
		case "gardens":
			gardens.quantity--;
			return;
		case "great hall":
			greatHall.quantity--;
			return;
		case "mine":
			mine.quantity--;
			return;
		case "smithy":
			smithy.quantity--;
			return;
		case "village":
			village.quantity--;
			return;
		case "woodcutter":
			woodcutter.quantity--;
			return;
		case "curse":
			curse.quantity--;
			return;
		}
		
	}

	public void addCard(String string) {
		switch(string){
		case "copper":
			copper.quantity++;
			return;
		case "silver":
			silver.quantity++;
			return;
		case "gold":
			gold.quantity++;
			return;
		case "estate":
			estate.quantity++;
			return;
		case "duchy":
			duchy.quantity++;
			return;
		case "province":
			province.quantity++;
			return;
		case "adventurer":
			adventurer.quantity++;
			return;
		case "ambassador":
			ambassador.quantity++;
			return;
		case "baron":
			baron.quantity++;
			return;
		case "council room":
			councilRoom.quantity++;
			return;
		case "cutpurse":
			cutPurse.quantity++;
			return; 
		case "embargo":
			embargo.quantity++;
			return;
		case "feast":
			feast.quantity++;
			return;
		case "gardens":
			gardens.quantity++;
			return;
		case "great hall":
			greatHall.quantity++;
			return;
		case "mine":
			mine.quantity++;
			return;
		case "smithy":
			smithy.quantity++;
			return;
		case "village":
			village.quantity++;
			return;
		case "woodcutter":
			woodcutter.quantity++;
			return;
		case "curse":
			curse.quantity++;
			return;
		}
		
	}

	public int howMany(String ofWhat){
		switch(ofWhat){
		case "copper":
			return copper.quantity;
		case "silver":
			return silver.quantity;
		case "gold":
			return gold.quantity;
		case "estate":
			return estate.quantity;
		case "duchy":
			return duchy.quantity;
		case "province":
			return province.quantity;
		case "adventurer":
			return adventurer.quantity;
		case "ambassador":
			return ambassador.quantity;
		case "baron":
			return baron.quantity;
		case "council room":
			return councilRoom.quantity;
		case "cutpurse":
			return cutPurse.quantity; 
		case "embargo":
			return embargo.quantity;
		case "feast":
			return feast.quantity;
		case "gardens":
			return gardens.quantity;
		case "great hall":
			return greatHall.quantity;
		case "mine":
			return mine.quantity;
		case "smithy":
			return smithy.quantity;
		case "village":
			return village.quantity;
		case "woodcutter":
			return woodcutter.quantity;
		case "curse":
			return curse.quantity;
		}
		
		return 0;

	}
	
	public int cardVP(String ofWhat){
		switch(ofWhat){
		case "copper":
			return copper.type.victoryPoints;
		case "silver":
			return silver.type.victoryPoints;
		case "gold":
			return gold.type.victoryPoints;
		case "estate":
			return estate.type.victoryPoints;
		case "duchy":
			return duchy.type.victoryPoints;
		case "province":
			return province.type.victoryPoints;
		case "adventurer":
			return adventurer.type.victoryPoints;
		case "ambassador":
			return ambassador.type.victoryPoints;
		case "baron":
			return baron.type.victoryPoints;
		case "council room":
			return councilRoom.type.victoryPoints;
		case "cutpurse":
			return cutPurse.type.victoryPoints; 
		case "embargo":
			return embargo.type.victoryPoints;
		case "feast":
			return feast.type.victoryPoints;
		case "gardens":
			return gardens.type.victoryPoints;
		case "great hall":
			return greatHall.type.victoryPoints;
		case "mine":
			return mine.type.victoryPoints;
		case "smithy":
			return smithy.type.victoryPoints;
		case "village":
			return village.type.victoryPoints;
		case "woodcutter":
			return woodcutter.type.victoryPoints;
		case "curse":
			return curse.type.victoryPoints;
		}
		
		return 0;

	}
			
	public String toString(){
		String returnString="";
		String theList[]=curse.type.allCards();
		
		for(String eachCard : theList){
			returnString+=eachCard+" has: "+howMany(eachCard)+" cards currently\n";
		}
		
		return returnString;
		}

	public void addCard(String string, int i) {
		if (i==0) return;
		switch(string){
		case "copper":
			copper.quantity+=i;
			return;
		case "silver":
			silver.quantity+=i;
			return;
		case "gold":
			gold.quantity+=i;
			return;
		case "estate":
			estate.quantity+=i;
			return;
		case "duchy":
			duchy.quantity+=i;
			return;
		case "province":
			province.quantity+=i;
			return;
		case "adventurer":
			adventurer.quantity+=i;
			return;
		case "ambassador":
			ambassador.quantity+=i;
			return;
		case "baron":
			baron.quantity+=i;
			return;
		case "council room":
			councilRoom.quantity+=i;
			return;
		case "cutpurse":
			cutPurse.quantity+=i;
			return; 
		case "embargo":
			embargo.quantity+=i;
			return;
		case "feast":
			feast.quantity+=i;
			return;
		case "gardens":
			gardens.quantity+=i;
			return;
		case "great hall":
			greatHall.quantity+=i;
			return;
		case "mine":
			mine.quantity+=i;
			return;
		case "smithy":
			smithy.quantity+=i;
			return;
		case "village":
			village.quantity+=i;
			return;
		case "woodcutter":
			woodcutter.quantity+=i;
			return;
		case "curse":
			curse.quantity+=i;
			return;
		
		}
	}
	
	public boolean endgame() {
		int emptyPiles=0;
		String remainingPiles[]={"copper", "silver", "gold", "estate", "duchy", "curse"};
		if(province.quantity<1) return true;
		for(String card: kingdomCards)
			if(howMany(card)<1) emptyPiles++;
		if(emptyPiles>=3) return true;
		for(String card: remainingPiles)
			if(howMany(card)<1) emptyPiles++;
		if(emptyPiles>=3) return true;
		
		return false;
	}



	
	public void embargo(String embargo2) {
		switch(embargo2){
		case "copper":
			copper.embargoTokens++;
			break;
		case "silver":
			silver.embargoTokens++;
			break;
		case "gold":
			gold.embargoTokens++;
			break;
		case "estate":
			estate.embargoTokens++;
			break;
		case "duchy":
			duchy.embargoTokens++;
			break;
		case "province":
			province.embargoTokens++;
			break;
		case "adventurer":
			adventurer.embargoTokens++;
			break;
		case "ambassador":
			ambassador.embargoTokens++;
			break;
		case "baron":
			baron.embargoTokens++;
			break;
		case "council room":
			councilRoom.embargoTokens++;
		case "cutpurse":
			cutPurse.embargoTokens++;
		case "embargo":
			embargo.embargoTokens++;
			break;
		case "feast":
			feast.embargoTokens++;
			break;
		case "gardens":
			gardens.embargoTokens++;
			break;
		case "great hall":
			greatHall.embargoTokens++;
			break;
		case "mine":
			mine.embargoTokens++;
			break;
		case "smithy":
			smithy.embargoTokens++;
			break;
		case "village":
			village.embargoTokens++;
			break;
		case "woodcutter":
			woodcutter.embargoTokens++;
			break;
		case "curse":
			curse.embargoTokens++;
			break;
		}
		
	}

	public int isEmbargod(String whatCard) {
		switch(whatCard){
		case "copper":
			return copper.embargoTokens;
		case "silver":
			return silver.embargoTokens;
		case "gold":
			return gold.embargoTokens;
		case "estate":
			return estate.embargoTokens;
		case "duchy":
			return duchy.embargoTokens;
		case "province":
			return province.embargoTokens;
		case "adventurer":
			return adventurer.embargoTokens;
		case "ambassador":
			return ambassador.embargoTokens;
		case "baron":
			return baron.embargoTokens;
		case "council room":
			return councilRoom.embargoTokens;
		case "cutpurse":
			return cutPurse.embargoTokens; 
		case "embargo":
			return embargo.embargoTokens;
		case "feast":
			return feast.embargoTokens;
		case "gardens":
			return gardens.embargoTokens;
		case "great hall":
			return greatHall.embargoTokens;
		case "mine":
			return mine.embargoTokens;
		case "smithy":
			return smithy.embargoTokens;
		case "village":
			return village.embargoTokens;
		case "woodcutter":
			return woodcutter.embargoTokens;
		case "curse":
			return curse.embargoTokens;
		}
		
		return 0;
	}
}
	