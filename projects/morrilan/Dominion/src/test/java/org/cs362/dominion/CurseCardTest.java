

import static org.junit.Assert.*;

import org.junit.Test;

public class CurseCardTest {
	@Test
	public void test() {
		Card curseCard = new CurseCard("Curse", 0, "Images/Curse.jpg");
		assertEquals("Name is Curse", "Curse", curseCard.getName());
		assertEquals("GetCost must be 0." , 0 ,curseCard.getCost());
		assertEquals("Worth -1 Victory, method inherited from Card" , -1, curseCard.getValue());
		assertEquals("Makes sure image Getting works", "Images/Curse.jpg", curseCard.getImg());
		assertEquals("GetAction is unused. Should return an empty string", "", curseCard.getAction());
		
	}

}