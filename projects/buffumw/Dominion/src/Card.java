
//import javax.swing.plaf.nimbus.State;
public class Card {
	private String name;
	private double cost;
	private Type type;
	private Ability ability;
	
	// Constructor
	Card(String name, double cost, Type type, Ability ability){
		this.name = name;
		this.cost = cost;
		this.type = type;
		this.ability = ability;
	}
	
	// Getters
	public String getName(){
		return this.name;
	}
	
	public double getCost(){
		return this.cost;
	}
	
	public Type getType(){
		return this.type;
	}
	
	// call this to essentially "play" the card
	public Ability getAbility(){
		return this.ability;
	}
	
	// Setters
	public void setName(String name){
		this.name = name;
	}
	
	public void setCost(double cost){
		this.cost = cost;
	}
	
	public void setType(Type type){
		this.type = type;
	}
	
	public void setAbility(Ability ability){
		this.ability = ability;
	}
	
	// toString()
	public String toString(){
		return "This is a Card.";
	}
}
