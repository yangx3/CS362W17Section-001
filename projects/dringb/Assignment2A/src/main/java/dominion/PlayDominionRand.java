package dominion;

public class PlayDominionRand {
	static int timesFailed = 0; 
	static int timePassed = 0; 
	
	static int tempGold = 0; 
	static int tempDeckSize = 0; 
	static int tempHandSize = 0; 
	static int tempDiscardSize = 0; 
	static int tempVPoints = 0; 
	static int tempGoldInHand = 0; 
	static int tempBuyTurns = 0;
	static int tempActionTurns = 0;
	
	static Player temp = null; 
	static Cards cardInPlay = null; 
	
	public static void holdData(Cards hold, Player p){
		temp = p; 
		cardInPlay = hold; 
		temp.Get_Player_Stats();
		tempGold = p.get_Player_Gold();
		tempDeckSize = p.GetDeck().size();
		tempHandSize = p.get_PlayHand().size();
		tempDiscardSize = p.getDiscard().size(); 
		tempVPoints = p.Get_Player_VP();
		tempGoldInHand = p.Get_player_gold_in_hand();
		tempBuyTurns = p.Player_Buy_Turns;
		tempActionTurns = p.Player_Action_Turns;
	}
	
	public static void testCard(Cards inPlay,Player p){
		if (inPlay.getName() == "Adventurer"){
			int cur = timePassed;
			p.Get_Player_Stats();
			int newGoldInHand= p.Get_player_gold_in_hand();
			int newDeck = p.GetDeck().size(); 
			int newHand = p.get_PlayHand().size();
			if (newGoldInHand != tempGoldInHand)
				timePassed++;
			if (newDeck != tempDeckSize)
				timePassed++; 
			if (newHand != tempHandSize)
				timePassed++;
			else{
				timesFailed++; 
				System.out.println("FAILED: fail in the adventurer card");
			}
			if (timePassed == cur + 3)
				System.out.println("PASSED: Adventure Card \n");
		}
		else if (inPlay.getName() == "Ambassador"){
			int cur = timePassed; 
			int newDeck = p.GetDeck().size();
			int newHand = p.get_PlayHand().size();
			if (newDeck != tempDeckSize)
				timePassed++; 
			if (newHand != tempHandSize)
				timePassed++;
			else{
				timesFailed++; 
				System.out.println("FAILED: Fail in ambassador");
			}
			if (timePassed == cur + 2)
				System.out.println("PASSED: Ambassador");
		}
		else if (inPlay.getName() == "Baron"){
			int cur = timePassed; 
			int newBuy = p.Player_Buy_Turns; 
			int newHand = p.get_PlayHand().size();
			if (newBuy != tempBuyTurns)
				timePassed++; 
			if (newHand != tempHandSize)
				timePassed++;
			else {
				timesFailed++; 
				System.out.println("FAILED: Fail in Baron");
			}
			if (timePassed == cur + 2)
				System.out.println("PASSED: Baron");
		}
		else if (inPlay.getName() == "CouncilRoom"){
			int cur = timePassed; 
			int newHand = p.get_PlayHand().size();
			int newDeck = p.GetDeck().size();
			int newBuy = p.Player_Buy_Turns;
			if (newDeck != tempDeckSize)
				timePassed++;
			if (newHand != tempHandSize)
				timePassed++;
			if (newBuy != tempBuyTurns)
				timePassed++;
			else{
				timesFailed++; 
				System.out.println("FAILED: Fail in Council Room");
			}
			if (timePassed == cur + 3)
				System.out.println("PASSED: Council Room");
		}
		else if (inPlay.getName() == "CutPurse"){
			p.Get_Player_Stats();
			int cur = timePassed; 
			int newVal = p.Get_player_gold_in_hand(); 
			if (newVal != tempGoldInHand)
				timePassed++;
			else{
				timesFailed++; 
				System.out.println("FAILED: Fail in Cutpurse");
			}
			if (timePassed == cur + 1)
				System.out.println("PASSED: Cut Purse");
		}
		else if (inPlay.getName() == "Embargo"){
			p.Get_Player_Stats();
			int cur = timePassed; 
			int newGold = p.Get_player_gold_in_hand();
			if (newGold != tempGoldInHand)
				timePassed++; 
			else {
				timesFailed++; 
				System.out.println("FAILED: Fail in Embargo");
			}
			if (timePassed == cur + 1)
				System.out.println("PASSED: Embargo");
		}
		else if (inPlay.getName() == "Garden"){
			int cur = timePassed; 
			int newVP = p.getDiscard().size();
			if (newVP != tempVPoints)
				timePassed++;
			else{
				timesFailed++; 
				System.out.println("FAILED: Fail in Garden");
			}
			if (timePassed == cur + 2)
				System.out.println("PASSED: Garden");
		}
		else if (inPlay.getName() == "GreatHall"){
			int cur = timePassed;
			int newHand = p.get_PlayHand().size();
			int newAction = p.Player_Action_Turns;
			if (newHand != tempHandSize)
				timePassed++;
			else if (newAction != tempActionTurns)
				timePassed++;
			else {
				timesFailed++; 
				System.out.println("FAILED: Fail in Great Hall");
			}
			if (timePassed == cur + 2)
				System.out.println("PASSED: Great Hall");
		}
		else if (inPlay.getName() == "Village"){
			int cur = timePassed; 
			int newHand = p.get_PlayHand().size();
			int newAction = p.Player_Action_Turns;
			if (newHand != tempHandSize)
				timePassed++; 
			if (newAction != tempActionTurns)
				timePassed++;
			else{
				timesFailed++; 
				System.out.println("FAILED: Fail in Village");
			}
			if(timePassed == cur + 2)
				System.out.println("PASSED: Village ");
		}
		else if (inPlay.getName() == "Market"){
			int cur = timePassed; 
			p.Get_Player_Stats();
			int newHand = p.get_PlayHand().size();
			int newBuy = p.Player_Buy_Turns;
			int newAction = p.Player_Action_Turns;
			int newGold = p.Get_player_gold_in_hand();
			if (newHand != tempHandSize)
				timePassed++; 
			if (newBuy != tempBuyTurns)
				timePassed++; 
			if (newAction != tempActionTurns)
				timePassed++; 
			if (newGold != tempGoldInHand)
				timePassed++; 
			else {
				timesFailed++; 
				System.out.println("FAILED: Fail in Market");
			}
			if (timePassed == cur + 4)
				System.out.println("PASSED: Market");
		}
	}
	
	public static void reset(){
		tempGold = 0; 
		tempDeckSize = 0;
		tempHandSize = 0; 
		tempDiscardSize = 0; 
		tempVPoints = 0; 
		tempGoldInHand = 0; 
		temp = null; 
		cardInPlay = null; 
	}
	
	public static void getCount(){
		System.out.println("Times passed custom asserts: " + timePassed);
		System.out.println("Times failed custom asserts: " + timesFailed);
	}
	

}
