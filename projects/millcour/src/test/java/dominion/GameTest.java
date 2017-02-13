package dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void playSmithy(){
		Game game = new Game();
		game.setGame();
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Smithy, Card.Type.ACTION, 4, 0, 0));
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Smithy, Card.Type.ACTION, 4, 0, 0));
		game.invokeAction(0);
		assertEquals(game.getPlayers().get(0).getHand().getPile().size(), 4);
		
	}

	@Test
	public void playVillage(){
		Game game = new Game();
		game.setGame();
		while(game.getPlayers().get(0).getDraw().getPile().size() > 0){
			game.getPlayers().get(0).getDraw().getPile().remove(0);
		}
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Village, Card.Type.ACTION, 5, 0, 0));
		int compare = game.getPlayers().get(0).getHand().getPile().size();
		game.invokeAction(0);
		int compare2 = game.getPlayers().get(0).getHand().getPile().size();
		assertEquals(game.getPlayers().get(0).getNumActions(), 2);
		assertEquals(compare, compare2);
		game.getPlayers().get(0).getDraw().getPile().add(new Card(Card.CardName.Village, Card.Type.ACTION, 5, 0, 0));
		game.getPlayers().get(0).getDraw().getPile().add(new Card(Card.CardName.Village, Card.Type.ACTION, 5, 0, 0));
		compare = game.getPlayers().get(0).getHand().getPile().size();
		game.invokeAction(0);
		compare2 = game.getPlayers().get(0).getHand().getPile().size();
		assertEquals(compare, compare2);
	}
	
	@Test
	public void playTribute(){
		Game game = new Game();
		game.setGame();
		game.getPlayers().get(1).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1));
		while(game.getPlayers().get(1).getDraw().getPile().size() > 0){
			game.getPlayers().get(1).getDraw().getPile().remove(0);
		}
		int compare = game.getPlayers().get(0).getDraw().getPile().size();
		game.runAction(Card.CardName.Tribute, 0);
		int compare2 = game.getPlayers().get(0).getDraw().getPile().size();
		assertEquals(compare, compare2);
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1));
		while(game.getPlayers().get(0).getDraw().getPile().size() > 0){
			game.getPlayers().get(0).getDraw().getPile().remove(0);
		}
		compare = game.getPlayers().get(1).getDraw().getPile().size();
		game.runAction(Card.CardName.Tribute, 1);
		compare2 = game.getPlayers().get(1).getDraw().getPile().size();
		assertEquals(compare, compare2);
	}
	
	@Test
	public void playMine(){
		Game game = new Game();
		game.setGame();
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1));
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1));
		game.runAction(Card.CardName.Mine, 0);
		for(int i=game.getPlayers().get(0).getHand().getPile().size()-1; i>=0; i--){
				game.getPlayers().get(0).getHand().getPile().remove(i);
		}
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Baron, Card.Type.ACTION, 0, 0, 0));
		game.runAction(Card.CardName.Mine, 0);
		for(int i=game.getPlayers().get(0).getHand().getPile().size()-1; i>=0; i--){
			if(game.getPlayers().get(0).getHand().getPile().get(i).getCardName() == Card.CardName.Copper){
				game.getPlayers().get(0).getHand().getPile().remove(i);
			}
			game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Silver, Card.Type.TREASURE, 0, 0, 0));
		}
		game.runAction(Card.CardName.Mine, 0);
	}
	
	@Test
	public void playGreatHall(){
		Game game = new Game();
		game.setGame();
		int compare = game.getPlayers().get(0).getHand().getPile().size();
		int compare2 = game.getPlayers().get(0).getNumActions();
		game.runAction(Card.CardName.GreatHall, 0);
		assertEquals(compare, compare);
		assertEquals(compare2, 1);
		while(game.getPlayers().get(0).getDraw().getPile().size() >  0){
			game.getPlayers().get(0).getDraw().getPile().remove(0);
		}
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		compare = game.getPlayers().get(0).getHand().getPile().size();
		compare2 = game.getPlayers().get(0).getNumActions();
		game.runAction(Card.CardName.GreatHall, 0);
		assertEquals(compare, 1);
		assertEquals(compare2, 2);
	}
	
	@Test
	public void playFeast(){
		Game game = new Game();
		game.setGame();
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Feast, Card.Type.ACTION, 0, 0, 0));
		int compare = game.getPlayers().get(0).getDiscard().getPile().size();
		game.runAction(Card.CardName.Feast, 0);
		int compare2 = game.getPlayers().get(0).getDiscard().getPile().size();
		assertEquals(compare, compare2);
	}
	
	@Test
	public void playEmbargo(){
		Game game = new Game();
		game.setGame();
		game.runAction(Card.CardName.Embargo, 0);
		assertEquals(game.getPlayers().get(0).getCoins(), 2);
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1));
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1));
		game.getPlayers().get(0).setCoins(0);
		game.runAction(Card.CardName.Embargo, 0);
		assertEquals(game.getPlayers().get(0).getCoins(), 2);
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Embargo, Card.Type.TREASURE, 0, 0, 1));
		game.getPlayers().get(0).setCoins(0);
		game.runAction(Card.CardName.Embargo, 0);
		assertEquals(game.getPlayers().get(0).getCoins(), 2);
	}
	
	@Test
	public void playCutpurse(){
		Game game = new Game();
		game.setGame();
		int numCopper = 0;
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		game.runAction(Card.CardName.Cutpurse, 0);
		for(int i=0; i<game.getPlayers().get(1).getHand().getPile().size(); i++){
			if(game.getPlayers().get(0).getHand().getPile().get(i).getCardName() == Card.CardName.Copper){
				numCopper++;
			}
		}
		assertEquals(numCopper, 0);
		assertEquals(game.getPlayers().get(0).getCoins(), 2);
		game.runAction(Card.CardName.Cutpurse, 1);
		assertEquals(game.getPlayers().get(0).getCoins(), 2);
	}
	
	@Test
	public void playCouncilRoom(){
		Game game = new Game();
		game.setGame();
		int compare;
		int compare2;
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		for(int i=0; i<game.getPlayers().get(0).getDraw().getPile().size(); i++){
			game.getPlayers().get(0).getDraw().getPile().remove(0);
		}
		compare = game.getPlayers().get(0).getHand().getPile().size();
		game.runAction(Card.CardName.CouncilRoom, 0);
		compare2 = game.getPlayers().get(0).getHand().getPile().size()-4;
		assertEquals(compare, compare2);
		game.runAction(Card.CardName.CouncilRoom, 1);
	}
	
	@Test
	public void playBaron(){
		Game game = new Game();
		game.createPlayers();
		int numEstate = 0;
		game.getPlayers().get(0).setNumBuys(0);
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Estate, Card.Type.VICTORY, 0, 0, 0));
		game.runAction(Card.CardName.Baron, 0);
		assertEquals(game.getPlayers().get(0).getNumBuys(), 1);
		for(int i=0; i<game.getPlayers().get(0).getHand().getPile().size(); i++){
			numEstate++;
		}
		assertEquals(numEstate, 0);
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		//game.runAction(Card.CardName.Baron, 0);
	}
	
	@Test
	public void playAmbassador(){
		Game game = new Game();
		game.setGame();
		for(int i=0; i<game.getPlayers().get(0).getHand().getPile().size(); i++){
			game.getPlayers().get(0).getHand().getPile().remove(0);
		}
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		game.runAction(Card.CardName.Ambassador, 0);
		assertEquals(game.getPlayers().get(0).getHand().getPile().size(), 0);
	}
	
	@Test
	public void playAdventurer(){
		Game game = new Game();
		game.setGame();
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 0));
		game.runAction(Card.CardName.Adventurer, 0);
		assertEquals(game.getPlayers().get(0).getHand().getPile().size(), 2);
		for(int i=0; i<game.getPlayers().get(0).getDraw().getPile().size(); i++){
			game.getPlayers().get(0).getDraw().getPile().remove(0);
		}
		game.runAction(Card.CardName.Adventurer, 0);
	}
	
	@Test
	public void checkingForEnd(){
		Game game = new Game();
		game.setGame();
		System.out.println("SIZE: " + game.getBoard().get(2).getPile().size());
		for(int i=game.getBoard().get(2).getPile().size()-1; i<=0 ; i--){
			System.out.println("REMOVING");
			game.getBoard().get(2).getPile().remove(i);
		}
		assertEquals(game.getBoard().get(2).getPile().size(), 0);
		assertEquals(game.checkForEnd(), true);
	}
}
