package org.cs362.dominion;

import java.util.List;
import java.util.ArrayList;


public class board {

	private List<card> t1;
	private List<card> t2;
	private List<card> t3;

	private List<card> v1;
	private List<card> v2;
	private List<card> v3;

	private int emptyPiles;
	private boolean providenceEmpty;

	board() {

		this.t1 = card.initCopperStock();
		this.t2 = card.initSilverStock();
		this.t3 = card.initGoldStock();
		
		this.v1 = card.initVictoryStock(1);
		this.v2 = card.initVictoryStock(2);
		this.v3 = card.initVictoryStock(3);

		this.emptyPiles = 0;
		this.providenceEmpty = false;

	}
	
	//treasure getters
	public card takeCopper(){

		if( this.t1.size() == 0){
			System.out.println("Out of Copper!");
			return null;
		}
		else{
			card temp = t1.get(0);
			t1.remove(0);
			return temp;
		}
	}
	public card takeSilver() {
	
		if(this.t2.size() == 0){
			System.out.println("Out of Silver!");
			return null;
		}
		else{
			card temp = t2.get(0);
			t2.remove(0);
			return temp;
		}

	}

	public card takeGold() {

		if(this.t3.size() == 0){
			System.out.println("Out of Gold!");
			return null;
		}
		else{
			card temp = t3.get(0);
			t3.remove(0);
			return temp;			
		}
	}
			

	//victory getters
	public card takeEstate() {
		
		if( this.v1.size() == 0 ) {
			System.out.println("Out of Estates!");
			return null;
		}
		else{
			card temp = v1.get(0);
			v1.remove(0);
			return temp;

		}
	}
	public card takeDuchy() {

		if( this.v2.size() == 0 ) {
			System.out.println("Out of Duchies!");
			return null;
		}
		else{
			card temp = v2.get(0);
			v2.remove(0);
			return temp;

		}


	}

	public card takeProvidence() {

		if(this.v3.size() == 1){
			this.providenceEmpty = true;
		}

		if(this.v3.size() == 0){
			System.out.println("Out of Providences!");
			return null;
		}
		else {
			card temp = v3.get(0);
			v3.remove(0);
			return temp;
		}
	}

	public int getNumberOfEmptyDecks(){

		int counter = 0;

		if( this.v1.size() == 0){
			counter++;
		}
		if( this.v2.size() == 0){
			counter++;
		}
		if( this.v3.size() == 0){
			counter++;
		}
		if( this.t1.size() == 0 ){
			counter++;
		}
		if( this.t2.size() == 0 ){
			counter++;
		}
		if( this.t3.size() == 0){
			counter++;
		}

		this.emptyPiles = counter;
		return counter;

	}

	public boolean isProvidenceEmpty(){
		return this.providenceEmpty;
	}


	public static void main (String args[] ){




	}

}
