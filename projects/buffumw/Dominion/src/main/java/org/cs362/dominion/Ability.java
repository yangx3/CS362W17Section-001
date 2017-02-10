package org.cs362.dominion;
import java.util.ArrayList;
import java.util.Iterator;

public class Ability {
	private String terms;
	private ArrayList<Reward> rewards;
	private Iterator<Reward> iterator;
	private int currentIndex;
	
	// Constructors
	Ability(){
		rewards = null;
		terms = null;
		this.iterator = null;
		currentIndex = 0;
	}
	
	Ability(String terms, ArrayList<Reward> rewards){
		this.terms = terms;
		this.rewards = new ArrayList<Reward>(rewards.size());
		this.rewards.addAll(rewards);
		this.iterator = this.rewards.iterator();
		currentIndex = 0;
	}
	
	// Getters
	public String getTerms(){
		return this.terms;
	}
	
	public ArrayList<Reward> getRewards(){
		return this.rewards;
	}
	
	public int getNumRewards(){
		return this.rewards.size();
	}
	
	public Reward nextReward(){
		Reward reward = null;
		if(currentIndex < this.rewards.size()){
			reward = this.rewards.get(currentIndex);
			currentIndex++;
			System.out.println("Here");
		}
		return reward;
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
	
	public boolean addAll(ArrayList<Reward> rewards){
		// returns true if it failed to add all rewards, false on success
		return !this.rewards.addAll(rewards);
	}
	
	public void resetIndex()
	{
		currentIndex = 0;
	}
	
}
