import java.util.Vector;

public class ActionCard extends Card {
	public enum ActionType {
		ADVENTURER,
		AMBASSADOR,
		BARON,
		COUNCIL_ROOM,
		CUTPURSE,
		EMBARGO,
		FEAST,
		GREAT_HALL,
		MINE,
		SEA_HAG,
		SMITHY,
		VILLAGE
	}
	
	private ActionType type;
	
	public ActionCard(ActionType type) {
		this.type = type;
		
		switch(type) {
			case ADVENTURER:
				super.name = "Adventurer";
				super.cost = 6;
				break;
			case AMBASSADOR:
				super.name = "Ambassador";
				super.cost = 3;
				break;
			case BARON:
				super.name = "Baron";
				super.cost = 4;
				break;
			case COUNCIL_ROOM:
				super.name = "Council Room";
				super.cost = 5;
				break;
			case CUTPURSE	:
				super.name = "Cutpurse";
				super.cost = 4;
				break;
			case EMBARGO:
				super.name = "Embargo";
				super.cost = 2;
				break;
			case FEAST:
				super.name = "Feast";
				super.cost = 4;
				break;
			case GREAT_HALL:
				super.name = "Great Hall";
				super.cost = 3;
				break;
			case MINE:
				super.name = "Mine";
				super.cost = 5;
				break;
			case SMITHY:
				super.name = "Smithy";
				super.cost = 4;
				break;
			case SEA_HAG:
				super.name = "Sea Hag";
				super.cost = 4;
				break;
			default:
				super.name = "Village";
				super.cost = 3;
				break;
		}
	}
	
	@Override
	public ActionCard clone() {
		final ActionCard clone = (ActionCard)super.clone();
		return clone;
	}
	
	public void PlayAction(GameState state) {
		switch(type) {
			case ADVENTURER:
				
				break;
			case AMBASSADOR:
			
				break;
			case BARON:
			
				break;
			case CUTPURSE:
				state.currentPlayer.AddCoins(2);
				Vector<Card> hand = state.otherPlayer.deck.GetHand();
				for(int i=0; i<hand.size(); i++) {
					Card card = hand.get(i);
					if(card.GetName() == "Copper") {
						state.otherPlayer.deck.DiscardFromHand(card);
						break;
					}
				}
				break;
			case EMBARGO:
				
				break;
			case COUNCIL_ROOM:
				state.DrawCards(state.currentPlayer, 4);
				state.currentPlayer.AddBuys(1);
				state.DrawCards(state.otherPlayer, 1);
				break;
			case FEAST:
				
				break;
			case GREAT_HALL:
				state.DrawCards(state.currentPlayer, 1);
				state.currentPlayer.AddActions(1);
				break;
			case MINE:
				
				break;
			case SMITHY:
				state.DrawCards(state.currentPlayer, 3);
				break;
			case SEA_HAG:
				
				break;
			default:
				state.DrawCards(state.currentPlayer, 1);
				state.currentPlayer.AddActions(2);
				break;
		}
	}
}
