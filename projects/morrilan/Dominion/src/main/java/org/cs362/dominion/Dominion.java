// *********************************************
//  Name: Andrew Morrill        Folder Name:  jDominion
//  CS362, Winter 2017        Assignment #1:  Dominion  
//  Time: Tues, Thurs 8:30 am
//  Date:2/08/2017
//
//   Program Name: Dominion.java
//   Program Description:
//		Creates the JFrame
//		Sends control to GameBoard.java
//		Initially tested Card and Pile, see report.
//
//**********************************************`
// Generate Unit Tests.  
// Fitness Fuction
// Crash Distance, branch Coverage.


//import java.util.*;
import javax.swing.*;

public class Dominion
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame ("Dominion Board");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GameBoard());
		frame.pack();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
	}
	

	// public static void sop(String words)
	// {
	// 	System.out.println(words);
	// }
}
