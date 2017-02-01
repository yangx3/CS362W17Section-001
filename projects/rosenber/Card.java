/*
 * This class will implement a Super Card class for the cards in a game of
 * Dominion. The cards will hold all of the information that every card in
 * the game has. There are functions that will implement the specific
 * features of each card. If a card does not have one of those features,
 * the function should not be changed in the inherited class.
 * 	Example:
 *   - Dutchy has no action, it will not change the action function
 *   - A copper is worth no victory points, it will have 0 victory points
 *   - Etc
 *   
 *   Robert Rosenberger
 *   Last modified: 1/31/2017
 */
import java.util.ArrayList;

public class Card implements Cloneable {
	
	private String name;
	private int cost;
	private int victoryPoints;
	private int treasure;
	private ArrayList<CardType> types;
	
	//constructor
	public Card(String name, int cost, int victoryPoints, int treasure, ArrayList<CardType> types){
		this.name = new String(name);
		this.cost = cost;
		this.victoryPoints = victoryPoints;
		this.treasure = treasure;
		this.types = new ArrayList<CardType>();
		for(int j=0; j<types.size(); j++)
			this.types.add(types.get(j));
	}
	
	//getters
	public String getName(){
		return name;
	}
	public int getCost(){
		return cost;
	}
	public int getVictoryPoints(){
		return victoryPoints;
	}
	public int getTreasure(){
		return treasure;
	}
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setCost(int cost){
		this.cost = cost;
	}
	public void setVictoryPoints(int points){
		victoryPoints = points;
	}
	public void setTreasureAmount(int amount){
		treasure = amount;
	}
	
	//checks to see if the card if of the passed in type
	// - returns true if it is, false otherwise
	public boolean isCardType(CardType type){
		for(int j=0; j<types.size(); j++)
			if(type == types.get(j))
				return true;
		return false;
	}
	
	//performs the cards action
	public void Action(){};
	
	//performs the cards attack
	public void Attack(){};
	
	//performs the cards reaction
	public void Reaction(){};
	
	//prints the card line specified
	//range: [0-9]
	public void print(int line){}
}































