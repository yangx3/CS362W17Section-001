import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Vector;

public class TestBoard {
	@Test
	public void testBoard() {
		DominionBoard board = new DominionBoard();
		board.PrintBoard();
		
		//test GetBuyable
		Vector<Card> buyable = board.GetBuyable(100);
		assert buyable.size() == 17;
		
		buyable = board.GetBuyable(2);
		assert buyable.size() < 17;
		
		buyable = board.GetBuyable(0);
		assert buyable.size() != 0;
		
		//test BuyCard
		buyable = board.GetBuyable(5);
		int idx = buyable.size()-1;
		Vector<Card> cards = board.BuyCard(idx);
		assert cards.size() == 1;
		assert cards.elementAt(0).GetName() == buyable.elementAt(idx).GetName();
		
		board.EmbargoPile(idx);
		cards = board.BuyCard(idx);
		assert cards.size() == 2;
		assert cards.elementAt(0).GetName() == buyable.elementAt(idx).GetName();
		assert cards.elementAt(cards.size()-1).GetName() == "Curse";
		
		board.EmbargoPile(idx);
		cards = board.BuyCard(idx);
		assert cards.size() == 3;
		assert cards.elementAt(0).GetName() == buyable.elementAt(idx).GetName();
		assert cards.elementAt(cards.size()-1).GetName() == "Curse";
		
		//test BuyCurse
		Card curse = board.BuyCurse();
		assert curse.GetName() == "Curse";
		
		while(curse != null) {
			curse = board.BuyCurse();
		}
		
		curse  = board.BuyCurse();
		assert curse == null;
		
		//curse should be in expended cards pile
		board.PrintBoard();
		
		buyable = board.GetBuyable(5);
		idx = buyable.size()-1;
		board.EmbargoPile(idx);
		cards = board.BuyCard(idx);
		assert cards.size() == 1;
		assert cards.elementAt(0).GetName() == buyable.elementAt(idx).GetName();
		
		//test GameOver
		assert board.GameOver() == false;
		
		int max = buyable.size();
		while(buyable.size() >= max) {
			cards = board.BuyCard(buyable.size()-1);
			buyable = board.GetBuyable(7);
		}
		
		max = buyable.size();
		while(buyable.size() >= max) {
			cards = board.BuyCard(buyable.size()-1);
			buyable = board.GetBuyable(7);
		}
		
		board.PrintBoard();
		assert board.GameOver() == true;
		
		board = new DominionBoard();
		
		buyable = board.GetBuyable(8);
		
		cards = board.BuyCard(buyable.size()-1);
		
		if(cards.firstElement().GetName() == "Province") {
			assert board.GameOver() == false;
			
			max = buyable.size();
			while(buyable.size() >= max) {
				cards = board.BuyCard(buyable.size()-1);
				buyable = board.GetBuyable(8);
			}
			
			assert board.GameOver() == true;
		}
	}
}
