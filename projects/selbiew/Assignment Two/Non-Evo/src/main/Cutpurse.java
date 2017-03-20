public class Cutpurse extends Card {
	public Cutpurse() {
		name = "Cutpurse";
		description = "+2 Coins. Each other player discards a Copper card (or reveals a hand with no Copper).";
		cardType = Type.ATTACK;
		cost = 4;
		value = 0;
		points = 0;
		actions = 0;
		cardDraw = 0;
		buys = 0;
		playOrder = 10;
	}
	
	public void play(DomGame domGame, int playerID, int cardIndex) {
		System.out.println("Playing " + name);
		domGame.players[playerID].bonusCoins += 2;																//Gain 2 coins
		
		for(int h = 0; h < domGame.playerCount; h++) {
			if(h != playerID) {
				for(int i = 0; i < domGame.players[h].hand.size; i++) {
					if(domGame.players[h].hand.cards.get(i).name == "Copper") {									//Goes through other player's hand to discard a copper
						System.out.println("Opponent discards: " + domGame.players[h].hand.cards.get(i).name);	
						domGame.players[h].discard.addCard(domGame.players[h].hand.cards.get(i));
						domGame.players[h].hand.removeCard(i);
						break;
					}
					else {
						System.out.println("Reveals: " + domGame.players[h].hand.cards.get(i).name);			//Reveal non Copper Cards
					}
				}
			}
		}

		
		System.out.println("Discarding: " + name);																	//Discard cutpurse
		for(int i = 0; i < domGame.players[playerID].hand.getSize(); i++) {
			if(domGame.players[playerID].hand.cards.get(i).name == name) {
				domGame.players[playerID].discard.addCard(domGame.players[playerID].hand.cards.get(i));
				domGame.players[playerID].hand.removeCard(i);
				break;
			}
		}
	}
	
	public float dynamicValue(DomGame domGame, Player player) {
		return 2.0f - 3 * (player.getActionCount()/player.getCardCount());
	}
}
