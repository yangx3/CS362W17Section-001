package dominion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class RandomTestDominionTest {

	@Test
	public void playRandom() {
		Random myrand = new Random(10);
		int rando = myrand.nextInt(3) + 2;
		Board plateau = new Board(rando); // between 2 and 4
		Player[] listJoueur = new Player[4];
		int i;
		for (i = 0; i < rando; i++) {
			listJoueur[i] = new Player(plateau, i);
		}
		for (i = rando; i < 4; i++) {
			listJoueur[i] = new Player(plateau, -1);
		}
		List<Card> cartes = new ArrayList<Card>();
		for (i = 7; i < 17; i++) {
			rando = myrand.nextInt(14) + 7;
			while (cartes.contains((new Card(rando)))) {
				rando = myrand.nextInt(14) + 7;
			}
			plateau.pioche_card[i] = new Card(rando);
		}
		i = 0;
		while (plateau.gameDone() != true) {
			i++;
			listJoueur[0].gameTurn();
			listJoueur[1].gameTurn();
			if (listJoueur[2].id != -1) {
				listJoueur[2].gameTurn();
			}
			if (listJoueur[3].id != -1) {
				listJoueur[3].gameTurn();
			}

		}
		System.out.println(i);
		System.out.println(plateau.gameDone());
	}
}