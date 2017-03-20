// Last Updated 2/08/2017
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameBoard extends JPanel
{
	private int sizeX, sizeY, numPlayers, n;
	private JButton soloStartBtn, phaseBtn;
	//private JLabel supplyLabel, phaseLabel;
	private JTextArea phaseText;
	private Player[] player;
	// Major Error 5, Both Players may be pointing to the same leftover cards
	// Player 1 ends up with extra victory cards than they have
	// May be here.
	private Card[][] startCards;
	private Card[] deck;
	//protected DrawPile[] drawPile;
	//private DiscardPile[] discardPile;
	public SupplyPile gameSupply;
	public double SCALE_X, SCALE_Y;
	private PhaseListener phaseListener;
	//private CardActions actions;

	public GameBoard()
	{
		// curse = 0, treasure 1-3, province 4-6, kingdom 7-32
		// defines all cards in the deck, for later referencing
		// Create CardAction to hold all the action methods for the cards? May not work? Save for the end
		setLayout(new BorderLayout());
		deck = new Card[17];
		deck[0] = new CurseCard("Curse", 0, "images/Curse.jpg");
		deck[1] = new TreasureCard("Copper", 0, "images/Copper.jpg", 1);
		deck[2] = new TreasureCard("Silver", 3, "images/Silver.jpg", 2);
		deck[3] = new TreasureCard("Gold", 6, "images/Gold.jpg", 3);

		deck[4] = new VictoryCard("Estate", 2, "images/Estate.jpg", 1);
		deck[5] = new VictoryCard("Duchy", 5, "images/Duchy.jpg", 3);
		deck[6] = new VictoryCard("Province", 8, "images/Province.jpg", 5);

		// *******************
		//	    The Deck
		// *******************
		
		// deck[7] = new KingdomCard("Cellar", 2, "images/Cellar.jpg", "+1 Action  Discard any number of cards, then draw that many."); 
		// deck[8] = new KingdomCard("Chapel", 2, "images/Chapel.jpg", "Trash up to 4 cards from your hand."); 
		// deck[9] = new KingdomCard("Moat", 2, "images/Moat.jpg", "+2 Cards  When another player plays an Attack card, you may first reveal this from your hand, to be unaffected by it."); 
		// deck[10] = new KingdomCard("Harbinger", 3, "images/Harbinger.jpg", "+1 Card, +1 Action,  Look through your discard Pile. You may put a card from it onto your deck."); 
		// deck[11] = new KingdomCard("Merchant", 3, "images/Merchant.jpg", "+1 Card, +1 Action,  The first time you play a Silver this turn: +1 Treasure"); 
		// deck[12] = new KingdomCard("Vassal", 3, "images/Vassal.jpg", "+2 Treasure,  Discard the top of your deck. If it's an Action card, you may play it."); 
		// deck[13] = new KingdomCard("Village", 3, "images/Village.jpg", "+1 Card, +2 Actions"); 
		// deck[14] = new KingdomCard("Workshop", 3, "images/Workshop.jpg", "Gain a card costing up to 4 Treasure."); 
		// deck[15] = new KingdomCard("Bureaucrat", 4, "images/Bureaucrat.jpg", "Gain a Silver onto your deck. Each other player reveals a Victory card from their hand and puts it onto their deck (or reveals a hand with no Victory cards)."); 
		// deck[16] = new KingdomCard("Gardens", 4, "images/Gardens.jpg", "Worth 1 Victory per 10 cards you have (rounded down)."); 
		// deck[17] = new KingdomCard("Militia", 4, "images/Militia.jpg", "+2 Treasure, Each other players discards down to 3 cards in hand."); 
		// deck[18] = new KingdomCard("Moneylender", 4, "images/Moneylender.jpg", "You may trash a Copper from your hand for +3 Treasure."); 
		// deck[19] = new KingdomCard("Poacher", 4, "images/Poacher.jpg", "+1 Card, +1 Action, +1 Treasure,  Discard a card per empty Supply pile."); 
		// deck[20] = new KingdomCard("Remodel", 4, "images/Remodel.jpg", "Trash a card from your hand. gain a card costing up to 2 Treasure more than it."); 
		// deck[21] = new KingdomCard("Smithy", 4, "images/Smithy.jpg", "+3 Cards"); 
		// deck[22] = new KingdomCard("Throne_Room", 4, "images/Throne_Room.jpg", "You may play an Action card from your hand twice."); 
		// deck[23] = new KingdomCard("Bandit", 5, "images/Bandit.jpg", "Gain a Gold. Each other player reveals the top 2 cards of the deck, trashes a revealed Treasure other than Copper, and discards the rest."); 
		// deck[24] = new KingdomCard("Council_Room", 5, "images/Council_Room.jpg", "+4 Cards, +1 Buy,  Each other player draws a card."); 
		// deck[25] = new KingdomCard("Festival", 5, "images/Festival.jpg", "+2 Actions, +1 Buy, +2 Treasure"); 
		// deck[26] = new KingdomCard("Laboratory", 5, "images/Laboratory.jpg", "+2 Cards, +1 Action"); 
		// deck[27] = new KingdomCard("Library", 5, "images/Library.jpg", "Draw until you have 7 cards in hand, skipping and Action cards you choos to; set those aside, discarding them afterwards."); 
		// deck[28] = new KingdomCard("Market", 5, "images/Market.jpg", "+1 Card, +1 Action, +1 Buy, +1 Treasure"); 
		// deck[29] = new KingdomCard("Mine", 5, "images/Mine.jpg", "You may trash a Treasure from your hand. Gain a Treasure to your hand costing up to 3 Treasure more than it."); 
		// deck[30] = new KingdomCard("Sentry", 5, "images/Sentry.jpg", "+1 Card, +1 Action,  Look at the top 2 cards of your deck. Trash and/or discard any number of them.  Put the rest back on the top in any order."); 
		// deck[31] = new KingdomCard("Witch", 5, "images/Witch.jpg", "+2 Cards,  Each other player gains a Curse."); 
		// deck[32] = new KingdomCard("Artisan", 6, "images/Artisan.jpg", "Gain a card to your hand costing up to 5 Treasure. Put a card from your hand onto your deck."); 
		

		// Partial Deck
		deck[7] = new KingdomCard("Militia", 4, "images/Militia.jpg", "+2 Treasure, Each other players discards down to 3 cards in hand."); 
		deck[8] = new KingdomCard("Cellar", 2, "images/Cellar.jpg", "+1 Action  Discard any number of cards, then draw that many.");
		deck[9] = new KingdomCard("Chapel", 2, "images/Chapel.jpg", "Trash up to 4 cards from your hand.");
		deck[10] = new KingdomCard("Merchant", 3, "images/Merchant.jpg", "+1 Card, +1 Action,  The first time you play a Silver this turn: +1 Treasure"); 
		deck[11] = new KingdomCard("Village", 3, "images/Village.jpg", "+1 Card, +2 Actions");
		deck[12] = new KingdomCard("Market", 5, "images/Market.jpg", "+1 Card, +1 Action, +1 Buy, +1 Treasure");
		deck[13] = new KingdomCard("Witch", 5, "images/Witch.jpg", "+2 Cards,  Each other player gains a Curse."); 
		deck[14] = new KingdomCard("Artisan", 6, "images/Artisan.jpg", "Gain a card to your hand costing up to 5 Treasure. Put a card from your hand onto your deck."); 
		deck[15] = new KingdomCard("Council_Room", 5, "images/Council_Room.jpg", "+4 Cards, +1 Buy,  Each other player draws a card.");
		deck[16] = new KingdomCard("Smithy", 4, "images/Smithy.jpg", "+3 Cards"); 

		startCards = new Card[4][10];
		for (int j = 0; j < 4; j++) // Max number of possible players, possible temperary fix
		{
			for(int i = 0; i < 7; i++)
			{
				// Treasure Card Copper
				startCards[j][i] = deck[1]; 
			}
			for(int i = 0; i < 3; i++)
			{
				// Victory Card Estate
				startCards[j][i + 7] = deck[4];
			}
		}
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		
		soloStartBtn = new JButton("SoloTests!");
		StartListener startListener = new StartListener();
		phaseListener = new PhaseListener();
		soloStartBtn.addActionListener(startListener);
		phaseText = new JTextArea("Welcome to Dominion! It is Player 1's Turn!");

		add(soloStartBtn, BorderLayout.NORTH);
		setPreferredSize(new Dimension(sizeX, sizeY));
		setBackground(Color.green);
	}

	public void playerSetup(int num)
	{
		

		// Major Test #2
		// startCards[3] = null;
		// System.out.println("" + startCards[2].getValue());
		// System.out.println("" + startCards[3].getValue());
		// Worked as expected. Removed address reference to slot 3 and slot 2 still works.
		// Slot 3 actions of course give a null pointer exception. 


		sop("Printing Starting Cards...\n");
		for(int i = 0; i < 10; i++)
		{
			sop("Name: " + startCards[num][i].getName());
			sop("Cost: " + startCards[num][i].getCost());
			sop("Value: " + startCards[num][i].getValue() + "\n");
		}
		
		player[num] = new Player(startCards[num]);

		if (num == 0)
		{
			add(player[num], BorderLayout.SOUTH);
		}
		else
		{
			add(player[num], BorderLayout.NORTH);
		}
		revalidate();
	}

	public void supplySetup()
	{
		// Create a JLabel to hold the StockPile
		//	then create seperate JLabels inside for 
		//	each cardusing the ImageIcon.
		//  Better organization and to implement click events.
		gameSupply = new SupplyPile(deck, 2);
		add(gameSupply, BorderLayout.CENTER);
		revalidate();
	}

	// Keeps track of player turns
	public void GameStart()
	{
		phaseBtn = new JButton("Next Phase");
		phaseBtn.addActionListener(phaseListener);
		add(phaseBtn, BorderLayout.EAST);
		n = 0;

		phaseText.setLineWrap(true);
		phaseText.setWrapStyleWord(true);
		phaseText.setEditable(false);
		phaseText.setPreferredSize(new Dimension(200, 100));
		add(phaseText, BorderLayout.WEST);
		revalidate();

	}


	// *******************************
	//		Turns and Phases Here!
	// *******************************
	
	// Checks which phase is next after clicking the NextPhase button
	public void turn()
	{
		if (player[n].getActionCount() > 0)
		{
			actionPhase();
		}
		else if (player[n].getBuyCount() > 0)
		{
			buyPhase();
		}
		else
		{
			cleanupPhase();
			n = (n + 1) % numPlayers;
			sop("It is now Player " + (n + 1) + "'s turn!");
		}

		if (player[n].getActionCount() > 0)
		{
			phaseText.setText("It is Player " + (n + 1) + "'s Turn!" + "\n You have " + player[n].getActionCount() + " more Actions remaining!"); 
		}
		else if (player[n].getBuyCount() > 0)
		{
			phaseText.setText("It is Player " + (n + 1) + "'s Turn!" + "\n You have " + player[n].getBuyCount() + " more Buys remaining!"); 
		}
		else
		{
			phaseText.setText("It is Player " + (n + 1) + "'s Turn!" + "\n Click to Finish CleanUp Phase!");
		}
		phaseText.setText(phaseText.getText() + "\n You have " + player[n].getCoins() + " Coins");
	}
	// Begins actionPhase
	public void actionPhase()
	{
		// attempt to play selected Card
		Card selected = player[n].getSelected();
		if (selected instanceof KingdomCard)
		{
			KingdomCardActions(selected.getName());
			player[n].discard();
		}
		player[n].removeActionCount();
		// if not an action card then send error message and redo phase if time remaining
		
	}
	public void buyPhase()
	{	
		// attempt to buy card
		if (gameSupply.getSelected() != null)
		{
			Card selected = gameSupply.getSelected();
			int cost = selected.getCost();
			int playerCoins = player[n].getCoins();
			if (playerCoins >= cost)
			{
				gameSupply.buy();
				player[n].addCard(selected);
				player[n].setCoins(cost * (-1));
				player[n].removeBuyCount();
			}	
		}
		else
		{
			player[n].removeBuyCount();
		}
		gameSupply.unselect();
		
	}
	public void cleanupPhase()
	{
		player[n].cleanup();
	}

	// *******************************
	//	  Listeners and Components!
	// *******************************

	public class StartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Object source = event.getSource();

			// Initializes the selected players and sets up the game.
			if(source == soloStartBtn)
			{
				numPlayers = 2;				
			}
			player = new Player[numPlayers];
			//drawPile = new DrawPile[numPlayers];
			//discardPile = new DiscardPile[numPlayers];
			soloStartBtn.setVisible(false);
			for(int i = 0; i < numPlayers; i++)
			{
				

				playerSetup(i);
				//player[i] = new Player(drawPile[i], discardPile[i]);
				
				
			}
			supplySetup();
			//playerTurn(player[0]);
			sop("" + getSize());
			SCALE_X = getWidth()/1920.0;
			SCALE_Y = getHeight()/1001.0;
			sop("Width Scale: " + SCALE_X + ", Height Scale: " + SCALE_Y); 
			// After everything is setup, this puts everything in motion :)
			GameStart();
		}
	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);

	}	


	//Shortcuts make life easier!
	public static void sop(String words)
	{
		System.out.println(words);
	}

	public class PhaseListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			turn();
			repaint();
			sop("Revalidated");
		}
	}
	// *******************************
	// 		KingdomCard Actions
	// *******************************
	// Uses unique identifier to nicely organize the actions



	public void KingdomCardActions(String name) 
	{
		switch(name)
		{
			case "Artisan":	//Gain a card to your hand costing up to 5 Treasure. Put a card from your hand onto your deck. 
				//player[n].g

				break; 

				// Need to finish
			case "Cellar":	//+1 Action  Discard any number of cards, then draw that many.
				player[n].addActionCount();

				break;
			case "Chapel": //Trash up to 4 cards from your hand.


				break;
			case "Council_Room": //+4 Cards, +1 Buy,  Each other player draws a card.
				player[n].drawCard(4);
				player[n].addBuyCount();

				break;	
			case "Market": //+1 Card, +1 Action, +1 Buy, +1 Treasure
				player[n].drawCard();
				player[n].addActionCount();
				player[n].addBuyCount();
				player[n].setCoins(1);

				break;
			case "Merchant": //+1 Card, +1 Action,  The first time you play a Silver this turn: +1 Treasure
				player[n].drawCard();
				player[n].addActionCount();
				if (player[n].hasCard(deck[2]))
				{
					player[n].setCoins(1);
				}

				break;
			case "Militia": //Each other players discards down to 3 cards in hand.
				for (int i = 0; i < numPlayers; i++)
				{
					if (i != n)
					{
						while(player[i].getNumCards() > 3)
						{
							player[i].discardRandom();
						}
					}
				}

				break;	
			case "Smithy": //+3 Cards
				player[n].drawCard(3);

				break;
			case "Village": //+1 Card, +2 Actions
				player[n].drawCard();
				player[n].addActionCount(2);

				break;
			case "Witch": //+2 Cards,  Each other player gains a Curse.
				player[n].drawCard(2);
				for (int i = 0; i < numPlayers; i++)
				{
					if (i != n)
					{
						player[i].addCard(deck[0]);
					}
				}

				break;	
			default :	System.out.println("ACTION DOES NOT EXIST");
		}
	}
	// I used listeners so I got a crap ton of set and get methods for testing purposes
	// most of the code is outside the listeners so it shouldn't be too big a problem
	// methods will duplicate the actions of the listener methods and set numbers that
	//  would otherwise be impossible.

	// Mock GameStartListener
	public void Setup(int nP)
	{
		// Initializes the selected players and sets up the game.
	
		numPlayers = nP;				
		player = new Player[numPlayers];
		//drawPile = new DrawPile[numPlayers];
		//discardPile = new DiscardPile[numPlayers];
		soloStartBtn.setVisible(false);

		for(int i = 0; i < numPlayers; i++)
		{
			playerSetup(i);
			//player[i] = new Player(drawPile[i], discardPile[i]);
		}
		supplySetup();
		//playerTurn(player[0]);
		sop("" + getSize());
		SCALE_X = getWidth()/1920.0;
		SCALE_Y = getHeight()/1001.0;
		sop("Width Scale: " + SCALE_X + ", Height Scale: " + SCALE_Y); 
		// After everything is setup, this puts everything in motion :)
		GameStart();
	}
	// Mock phaseListener
	// Is called at least 3 times for each turn. Once for each phase
	public void nextPhase()
	{
		turn();
		repaint();
		//sop("Revalidated");
	}
	// Allows AI to make choices on the player.
	public Player player(int pN)
	{
		return player[pN];
	}
	public SupplyPile supply()
	{
		return gameSupply;
	}
	
}