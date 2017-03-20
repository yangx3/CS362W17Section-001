package org.cs325.dominion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
//import java.util.Random;


public class Player
{
	public List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int
	List<Card> discard = new ArrayList<Card>(); // int
	List<Card> playedCards = new ArrayList<Card>();

	String player_username;

	int numActions;
	int numBuys;
	int coins;

	final GameState gameState;

	/////////////////////////////////////////////////////////////////
	public Player(GameState gameState,String player_username)
	{
		this.player_username = player_username;
		this.gameState=gameState;
	}

	/////////////////////////////////////////////////////////////////
	final public Card drawCard()
	{
		if (deck.isEmpty())
		{// Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			System.out.println("reshuffle the deck of the player "
					+ player_username + " to draw FIVE cards");
			while (discard.size() > 0)
			{
				int ndx = (int) Randomness.nextRandomInt(discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
		}

		Card toDraw = deck.poll();
		hand.add(toDraw);// Add card to hand and hand count automatically will
		// be incremented since we use List
		System.out.println("draw " + toDraw);
		Collections.sort(hand);
		return toDraw;
	}

	/////////////////////////////////////////////////////////////////
	final public void initializePlayerTurn()
	{
		numActions = 1;
		coins = 0;
		numBuys = 1;
		for (int i = 0; i < 5; i++)
		{
			drawCard();
		}
	}


	//card goes in discard,
	/////////////////////////////////////////////////////////////////
	final public boolean gain(Card card)
	{
		discard.add(card);
		System.out.println("dominion.Player: "+this.player_username+" gains "+card);
		return true;
	}


	//Discard hand
	/////////////////////////////////////////////////////////////////
	public void discard(Card card)
	{
		hand.remove(card);
		discard.add(card);
		System.out.println("dominion.Player:  "+player_username+" discards "+card);
	}

	/////////////////////////////////////////////////////////////////
	public void playKingdomCard()
	{
		while (numActions > 0)
		{
			List<Card> actionCards = Card.filter(hand, Card.Type.ACTION);

			if (actionCards.size() == 0)
				return;

			Card c = (Card)actionCards.get(0);
			if (c == null)
				return;
			System.out.println("dominion.Player.actionPhase Card:" + c.toString());

			playedCards.add(c);
			numActions -= 1;

			c.play(this, gameState);
		}
	}

	/////////////////////////////////////////////////////////////////
	final public int scoreFor()
	{
		int score = 0;
		//score from hand
		for (Card c : hand)
			score += c.score(this);
		//score from discard
		for (Card c : discard)
			score += c.score(this);
		//score from deck
		for (Card c : deck)
			score += c.score(this);

		return score;
	}

	/////////////////////////////////////////////////////////////////
	public void playTtreasureCard()
	{
		System.out.println("---------------------------------");
		System.out.println("playTtreasureCard ");
		System.out.println("---------------------------------");
	}

	/////////////////////////////////////////////////////////////////
	public void buyCard()
	{
		System.out.println("---------------------------------");
		System.out.println("buyCard ");
		System.out.println("---------------------------------");
	}

	/////////////////////////////////////////////////////////////////
	final void endTurn()
	{
		System.out.println("--------------------------------");;
		System.out.println("endTurn ");
		System.out.println("--------------------------------");
	}

	/////////////////////////////////////////////////////////////////
	public void printStateGame()
	{
		System.out.println("--" + this.player_username + "--");
		System.out.println("=================================");
		System.out.println(this.gameState.toString());
		System.out.println("---------------------------------");
	}


	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append("=================================");
		sb.append("--" + this.player_username + "--");
		sb.append("=================================");

		sb.append("Hand: " + this.hand);
		sb.append("Discard: " + this.discard);
		sb.append("Deck: " + this.deck);
		sb.append("Played Cards: " + this.playedCards);
		sb.append("NumActions: " + this.numActions);
		sb.append("Coins: " + this.coins);
		sb.append("NumBuys: " + this.numBuys);
		sb.append("\n");

		return sb.toString();

	}

}