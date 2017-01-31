import java.util.Vector;
public class Game {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Reward> rewards = new Vector<Reward>(2,1);
		Reward reward = new Reward();
		reward.entity = "Coin";
		reward.quantity = 1;
		rewards.add(reward);
		reward.entity = "Cards";
		reward.quantity = 2;
		rewards.add(reward);
		
		String terms = "A mysterious figure suddenly appears bringing treasure...";
		
		
		Ability ability = new Ability(terms, rewards);
		
		Card soldier = new Card("Soldier",4,Type.Action,ability);
		
		System.out.println(soldier);
		//System.out.println(newCard);
		//System.out.println(newCard.getAbility().getTerms());
	}
	
}
