package org.cs362.dominion;



import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class game {
	
		
	public static void printline( String line ){
		
		System.out.println( line );

	}


	public static void printDeck( List<card> deck ) {

		System.out.println("Printing this stack...:");
		int deckSize = deck.size();
		for(int i = 0; i< deckSize;i++){

			System.out.println("Card " + ( i + 1) );
			deck.get(i).displaySimpleInfo();
		}

	}

	public static void takeTurn( player p, board b  ) {
		printline("\n====================");
		printline("**********");
		printline(p.getName() + "'s turn now");
		printline("**********");
		printline("====================\n");
		buyPhase(p, b );
		actionPhase();
		cleanUpPhase(p );

	}

	public static void buyPhase(player p, board b){

			int choice = -1;
			boolean check = true;
			phasePrint("BUY PHASE");

			p.setGold( p.countGold(p.getHand() ) );
			System.out.println("You have " + p.getGold() + " gold");
			System.out.println("There are " + p.getDiscardDeck().size() + " in the discard deck");
			System.out.println("There are " + p.getDrawDeck().size() + " in the draw deck" );
			
			while( check ){
				
				switch( userInterface.readChoice() ){
					case 1: p.addToDiscard( b.takeSilver( ) );
							 check = false;
					default:
							 System.out.println( "invalid Choice, grabbing copper " ); 
							 p.addToDiscard( b.takeCopper() );
						 	 check = false;	 
				}
			}	
						

	}


	public static void actionPhase(){

		phasePrint("ACTION PHASE");
		System.out.println("Currently under development");

	}

	public static void cleanUpPhase( player p){

		phasePrint("CLEAN UP PHASE");
		p.trashHand();
		p.refillHand();
	}

	public static void phasePrint( String line ) {
	
		System.out.println("__________________________________\n");
		System.out.println("~~~~~~~~~~" + line + "~~~~~~~~~~");
		System.out.println("__________________________________");

	}


	public static boolean checkVictoryConditions( board b ){

		if(b.getNumberOfEmptyDecks() == 3 || b.isProvidenceEmpty() == true){
			return false;
		}
		else{
			return true;
		}

	}


	public static void main(String arg[]){

		player p1 = new player("Kevin" );
		player p2 = new player("John");
		board b = new board();
		int counter = 0;

	
		System.out.println("Starting game");
	
		while( counter < 3){
			takeTurn( p1 ,b);
			counter++;
		}

		System.out.println("Ending game");		
		



	}


}
