package cs362.dominion;

import java.util.List;

public class RandPlayer extends Player {

	public RandPlayer(GameState gameState, String player_username) {
		super(gameState, player_username);
	}
	public void buyCard() {
	
		
		while(numBuys > 0){
			if(coins >= 8 && tryBuy(Card.CardName.Province) && Randomness.nextRandomInt(2)%2 ==0 ){

			}else if(coins >= 4 && tryBuy(Card.CardName.Smithy) && Randomness.nextRandomInt(2)%2 ==0 ){
				
			}else if(coins >= 3 && tryBuy(Card.CardName.Gold) && Randomness.nextRandomInt(2)%2 ==0 ){
				
			}else if(coins >= 2 && tryBuy(Card.CardName.Silver) && Randomness.nextRandomInt(2)%2 ==0 ){
			}else if(coins >= 1){
				tryBuy(Card.CardName.Estate);
			}else{
				tryBuy(Card.CardName.Cooper);
			}
		}
	}
	
	public void playKingdomCard() {
		while (numActions > 0) {
			List<Card> actionCards = Card.filter(hand, Card.Type.ACTION);

			if (actionCards.size() == 0)
				return;

			Card c = (Card)actionCards.get(Randomness.nextRandomInt(actionCards.size()));
			if (c == null)
				return;
			System.out.println("Player.actionPhase Card:" + c.toString());
			
			numActions -= 1;
			c.play(this, gameState);

			playedCards.add(c);
			

			hand.remove(c);
			this.discard.add(c);
		}
	}
}
