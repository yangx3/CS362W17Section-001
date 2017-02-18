

public class PlayTest {

	public static void main(String[] args) {
		CardSupply supply=new CardSupply();
		Player player1=new Player(supply);
		Player player2=new Player(supply);
		int player1Victory, player2Victory;
		Turn takeTurn;
		
		while(!supply.endgame())
		{
			takeTurn=new Turn(player1, supply);
			System.out.println("Player one:");
			takeTurn.takeTurn(player1, player2, supply);
			takeTurn=new Turn(player2, supply);
			System.out.println("Player two:");
			takeTurn.takeTurn(player2, player1, supply);

		}

		player1Victory = player1.countPoints();
		player2Victory = player2.countPoints();
		
		if(player1Victory>=player2Victory) System.out.println("Player 1 wins with "+player1Victory+ " points");
		else System.out.println("Player 2 wins with "+player2Victory+ " points");


	}

}
