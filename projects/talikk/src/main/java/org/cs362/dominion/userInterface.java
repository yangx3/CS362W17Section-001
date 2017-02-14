package org.cs362.dominion;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class userInterface {

	//Just gives a random integer, thats what the user buys
	public static int readChoice() {
		Random rand = new Random();
		int choice = rand.nextInt(6) + 1;
		return choice;
	
	}

	public static void main (String args[] ){

		System.out.println("Random Number 1-6: " + readChoice() );
	
	}
}
