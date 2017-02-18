
public class SupplyStack {
	Card type;
	int quantity, embargoTokens;
	
	public SupplyStack(String type, int count){
		this.type=new Card(type);
		quantity=count;
		embargoTokens=0;
	}
	
	public String getType(){
		return type.cardType;
	}
	
	public int hasTreasure(){
		return type.worth;
	}
		
}
