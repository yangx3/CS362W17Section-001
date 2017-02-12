import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestKingdomSlot {
	@Test
	public void testSlot() {
		Card card = new TreasureCard(TreasureCard.TreasureType.COPPER);
		KingdomSlot slot = new KingdomSlot(card,1);
		
		assert card == slot.GetCard();
		assert slot.GetEmbargoes() == 0;
		slot.AddEmbargo();
		assert slot.GetEmbargoes() == 1;
		
		Card newCard = slot.DrawCard();
		
		assert newCard instanceof TreasureCard;
		assert newCard != card;
		assert newCard.GetName() == "Copper";
		
		newCard = slot.DrawCard();
		assert newCard == null;
		
		newCard = slot.DrawCard();
		assert newCard == null;
	}
}
