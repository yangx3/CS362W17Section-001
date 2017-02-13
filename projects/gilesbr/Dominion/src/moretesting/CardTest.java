package moretesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest extends player {

	@Test
	public void test() {
		card card = new card();
		assertTrue(1 == 1);
		assertTrue(card.num == -1);
		
		card.num = 1;
		card.category = "copper";
		card.value = 1;
		card.cost = 1;
		card.cardadd = 1;
		card.actionadd = 1;
		card.buyadd = 1;
		card.coinadd = 1;
		card.description = "+1 coin";
		
		//cards work
		card[] copperpile = new card[1];
		copperpile[1] = card;
		assertTrue(copperpile[1].num == 1);
		assertTrue(copperpile[1].category == "copper");
		assertTrue(copperpile[1].value == 1);
		assertTrue(copperpile[1].cost == 1);
		assertTrue(copperpile[1].cardadd == 1);
		assertTrue(copperpile[1].actionadd == 1);
		assertTrue(copperpile[1].buyadd == 1);
		assertTrue(copperpile[1].coinadd == 1);
		assertTrue(copperpile[1].description == "+1 coin");
		
		
		
	}

}
