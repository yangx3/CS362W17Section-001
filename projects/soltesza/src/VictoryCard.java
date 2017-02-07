
public class VictoryCard extends Card {
	public enum VictoryType {
		CURSE,
		ESTATE,
		DUCHY,
		PROVINCE
	}
	
	public final VictoryType type;
	
	public VictoryCard(VictoryType type) {
		this.type = type;
		
		switch(type) {
			case CURSE:
				super.name = "Curse";
				super.cost = 0;
				break;
			case ESTATE:
				super.name = "Estate";
				super.cost = 1;
				break;
			case DUCHY:
				super.name = "Duchy";
				super.cost = 5;
				break;
			default:
				super.name = "Province";
				super.cost = 8;
				break;
		}
	}
	
	public int GetVPs() {
		switch(type) {
			case CURSE:
				return -1;
			
			case ESTATE:
				return 1;
			
			case DUCHY:
				return 5;
				
			default:
				return 8;
		}
	}
}
