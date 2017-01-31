import java.util.Vector;
import java.util.Iterator;

public class Ability {
	private String terms;
	private Vector<Reward> rewards;
	private Iterator<Reward> iterator;
	
	// Constructors
	Ability(){
		rewards = null;
		terms = null;
		this.iterator = null;
	}
	
	Ability(String terms, Vector<Reward> rewards){
		this.terms = terms;
		this.rewards = new Vector<Reward>(rewards.size());
		this.rewards.addAll(rewards);
		this.iterator = this.rewards.iterator();
	}
	
	
	
	// Getters
	public String getTerms(){
		return this.terms;
	}
	
	public Vector<Reward> getRewards(){
		return this.rewards;
	}
	
	public int getNumRewards(){
		return this.rewards.size();
	}
	
	public Iterator<Reward> rewardsIterator(){
		return this.iterator;
	}
	
	public Reward nextReward(){
		return this.iterator.hasNext()? this.iterator.next(): null;
	}
	
	// Setters - return true on error, false on success
	public boolean setTerms(String terms){
		this.terms = terms;
		// returns true if it failed to add string to this.terms, false on success
		return this.terms.isEmpty();
	}
	
	public boolean addReward(Reward reward){
		// returns true if add failed, false if add succeeded
		return !this.rewards.add(reward);
	}
	
	public boolean addAll(Vector<Reward> rewards){
		// returns true if it failed to add all rewards, false on success
		return !this.rewards.addAll(rewards);
	}
	
}
