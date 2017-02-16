package org.thenellb;
import java.util.*;

public class Random {

	public static int getRandomInt(int min, int max){
		return (int) Math.floor(Math.random() * (max - min)) + min;

	}	   
	


}
