package org.cs362.dominion.RandomTestDominion;
import java.util.*;
//import javafx.collections.ListChangeListener.Change;

//non-action cards
class card{

	enum Type{ ACTION, TREASURE, VICTORY } 

	private String name;
	private Type type1;
	private Type type2;
	private int cost;
	private int treasure_val;
	private int victory_val;
	
	//constructors
	public card(){ //default constructor, should not be used in practice
		name = null;
		type1 = null;
		type2 = null;
		cost = 0;
		treasure_val = 0;
		victory_val = 0;
	}
	public card(String cardname, Type a, int c, int in){ //Single Type card constructor
		name = cardname;
		type1 = a;
		type2 = null;
		cost = c;
		if(a == card.Type.TREASURE){
			treasure_val = in;
			victory_val = 0;
		}
		else{
			treasure_val = 0;
			victory_val = in;
		}

	}
	
	//get methods
	public String getName(){
		return name;
	}
	public Type getType1(){
		return type1;
	}
	public Type getType2(){
		return type2;
	}
	public int getCost(){
		return cost;
	}
	public int getTV(){
		return treasure_val;
	}
	public int getVV(){
		return victory_val;
	}
	
	//set methods
	public void setName(String in){
		name = in;
	}
	public void setType1(Type in){
		type1 = in;
	}
	public void setType2(Type in){
		type2 = in;
	}
	public void setType(Type in){ //can change hybrid to non-hybrid
		type1 = in;
		type2 = null;
	}
	public void setCost(int in){
		cost = in;
	}
	public void setTV(int in){
		treasure_val = in;
	}
	public void setVV(int in){
		victory_val = in;
	}
	
}


//action cards
class action_card extends card{
	//constructor
	public action_card(String in){
		if(in == "ADVENTURER"){
			super.setName("ADVENTURER");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(6);
			super.setTV(0);
			super.setVV(0);	
		}
		else if(in == "AMBASSADOR"){
			super.setName("AMBASSADOR");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(3);
			super.setTV(0);
			super.setVV(0);	
		}
		else if(in == "BARON"){
			super.setName("BARON");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(4);
			super.setTV(0);
			super.setVV(0);	
		}
		else if(in == "COUNCIL_ROOM"){
			super.setName("COUNCIL_ROOM");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(5);
			super.setTV(0);
			super.setVV(0);	
		}
		else if(in == "CUTPURSE"){
			super.setName("CUTPURSE");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(4);
			super.setTV(0);
			super.setVV(0);	
		}
		else if(in == "FEAST"){
			super.setName("FEAST");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(4);
			super.setTV(0);
			super.setVV(0);	
		}
		else if(in == "MINE"){
			super.setName("MINE");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(5);
			super.setTV(0);
			super.setVV(0);	
		}
		else if(in == "GREAT_HALL"){
			super.setName("GREAT_HALL");
			super.setType1(Type.ACTION);
			super.setType2(Type.VICTORY);
			super.setCost(4);
			super.setTV(0);
			super.setVV(1);	
		}
		else if(in == "MINION"){
			super.setName("MINION");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(5);
			super.setTV(0);
			super.setVV(0);	
		}
		else if(in == "SMITHY"){
			super.setName("SMITHY");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(4);
			super.setTV(0);
			super.setVV(0);	
		}
		else if(in == "VILLAGE"){
			super.setName("VILLAGE");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(3);
			super.setTV(0);
			super.setVV(0);	
		}
		else if(in == "TRIBUTE"){
			super.setName("TRIBUTE");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(5);
			super.setTV(0);
			super.setVV(0);	
		}
		else{
			super.setName("STEWARD");
			super.setType1(Type.ACTION);
			super.setType2(null);
			super.setCost(3);
			super.setTV(0);
			super.setVV(0);	
		}
	}
	//action_cards.get(r1).action(this, players, player_num, number_of_players, board1);
	public void action(player p1, player[] players, int player_num, int number_of_players, board b1){
		if(getName() == "ADVENTURER"){
			System.out.println(p1.getName() + " has decided to play ADVENTURER");
			Vector<card> drawn = new Vector<card>();
			boolean has2 = false;
			int hand1 = p1.getHand().size();
			int removed = 0;
			int idx = 0;
			int count;
			int count2 = 0;
			for(int i=0; i< p1.getDeck().size(); i = i+1){
				if(p1.getDeck().get(i).getTV()>0){
					count2 = count2 + 1;
				}
			}
			for(int i=0; i< p1.getDeck().size(); i = i+1){
				if(p1.getDeck().get(i).getTV()>0){
					count2 = count2 + 1;
				}
			}
			//System.out.println("c2: " + count2);
			if((p1.getDeck().size() + p1.getDiscard().size() >= 5) && (count2 > 2)){
				while(!has2){
					if(p1.getDeck().isEmpty()){//if deck is empty
						while(!p1.getDiscard().isEmpty()){//while discard has cards
							p1.getDeck().addElement(p1.getDiscard().lastElement());//add last to deck
							p1.getDiscard().remove(p1.getDiscard().size()-1);//remove from discard
						}
						p1.shuffle_deck();//shuffle
					}
					drawn.addElement(p1.getDeck().lastElement());//draw
					p1.getDeck().remove(p1.getDeck().size()-1);//remove from top of deck
					count = 0;
					for(int i=0; i<drawn.size(); i = i+1){//drawn until 2 are treasure
						if((drawn.get(i).getType1() == card.Type.TREASURE) || (drawn.get(i).getType2() == card.Type.TREASURE)){
							count = count+1;
						}
						if(count == 2){
							has2 = true;
							break;
						}
					}
				}

				for(int i=0; i<drawn.size(); i = i+1){//add to hand
					if((drawn.get(i).getType1() == card.Type.TREASURE) || (drawn.get(i).getType2() == card.Type.TREASURE)){
						//System.out.println("adding " + drawn.get(i).getName() + " to hand");
						p1.getHand().addElement(drawn.get(i));
					}
				}
				while(removed < 2){
					if((drawn.get(idx).getType1() == card.Type.TREASURE) || (drawn.get(idx).getType1() == card.Type.TREASURE)){
						//System.out.println("removing " + drawn.get(idx).getName() + " from  drawn");
						drawn.remove(idx);
						removed = removed+1;
						idx = idx-1;
					}
					idx = idx+1;
				}

				while(!drawn.isEmpty()){//discard rest of drawn cards
					p1.getDiscard().addElement(drawn.lastElement());
					drawn.remove(drawn.size()-1);
				}
			}
			if(p1.getHand().size() <= hand1){
				System.out.println("FAILED ADVENTURER TEST");
			}
			else{
				System.out.println("PASSED ADVENTURER TEST");
			}
		}
		else if(getName() == "AMBASSADOR"){
			System.out.println(p1.getName() + " has decided to play " + getName());
			Random rand = new Random(System.currentTimeMillis());
			int r1 = rand.nextInt(p1.getHand().size());
			int decide = rand.nextInt(2);
			int count = 0;
			int hand1 = players[0].getHand().size();
			String name = p1.getHand().get(r1).getName();
			if(name == "AMBASSADOR"){
				if(p1.getHand().size() > 1){
					if((r1 + 1) < p1.getHand().size()){
						name = p1.getHand().get(r1 + 1).getName();
					}
					else{
						name = p1.getHand().get(r1 - 1).getName();
					}
				}
			}
			if((decide == 1) && (p1.getDeck().size() + p1.getDiscard().size() >= 5)){
				p1.getHand().remove(r1);
				count = 1;
				decide = rand.nextInt(2);
				if(decide == 1){
					for(int i=0; i<p1.getHand().size(); i = i+1){
						if(p1.getHand().get(i).getName() == name){
							p1.getHand().remove(i);
							count = count + 1;
							break;
						}
					}
				}
			}
			if(name == "AMBASSADOR"){
				if(count == 0){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_ambassador().getdc());
					}
//					p2.getDiscard().addElement(b1.get_ambassador().getdc());
//					p2.getDiscard().addElement(b1.get_ambassador().getdc());
					b1.get_ambassador().dec(b1);
				}
				else if(count == 1){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_ambassador().getdc());
					}
//					p2.getDiscard().addElement(b1.get_ambassador().getdc());
//					p2.getDiscard().addElement(b1.get_ambassador().getdc());
				}
				else{
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_ambassador().getdc());
					}
//					p2.getDiscard().addElement(b1.get_ambassador().getdc());
//					p2.getDiscard().addElement(b1.get_ambassador().getdc());
					b1.get_ambassador().setrem(b1.get_ambassador().getrem()+1);
				}
			}
			else if((name == "ADVENTURER")&&(b1.get_adventurer() != null)){
				if(count == 0){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_adventurer().getdc());
					}
//					p2.getDiscard().addElement(b1.get_adventurer().getdc());
//					p2.getDiscard().addElement(b1.get_adventurer().getdc());
					b1.get_adventurer().dec(b1);
				}
				else if(count == 1){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_adventurer().getdc());
					}
//					p2.getDiscard().addElement(b1.get_adventurer().getdc());
//					p2.getDiscard().addElement(b1.get_adventurer().getdc());
				}
				else{
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_adventurer().getdc());
					}
//					p2.getDiscard().addElement(b1.get_adventurer().getdc());
//					p2.getDiscard().addElement(b1.get_adventurer().getdc());
					b1.get_adventurer().setrem(b1.get_adventurer().getrem()+1);
				}
			}
			else if((name == "BARON")&&(b1.get_baron()!=null)){
				if(count == 0){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_baron().getdc());
					}
//					p2.getDiscard().addElement(b1.get_baron().getdc());
//					p2.getDiscard().addElement(b1.get_baron().getdc());
					b1.get_baron().dec(b1);
				}
				else if(count == 1){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_baron().getdc());
					}
//					p2.getDiscard().addElement(b1.get_baron().getdc());
//					p2.getDiscard().addElement(b1.get_baron().getdc());
				}
				else{
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_baron().getdc());
					}
//					p2.getDiscard().addElement(b1.get_baron().getdc());
//					p2.getDiscard().addElement(b1.get_baron().getdc());
					b1.get_baron().setrem(b1.get_baron().getrem()+1);
				}
			}
			else if((name == "COUNCIL_ROOM")&&b1.get_council_room()!=null){
				if(count == 0){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_council_room().getdc());
					}
//					p2.getDiscard().addElement(b1.get_council_room().getdc());
//					p2.getDiscard().addElement(b1.get_council_room().getdc());
					b1.get_ambassador().dec(b1);
				}
				else if(count == 1){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_council_room().getdc());
					}
//					p2.getDiscard().addElement(b1.get_council_room().getdc());
//					p2.getDiscard().addElement(b1.get_council_room().getdc());
				}
				else{
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_council_room().getdc());
					}
//					p2.getDiscard().addElement(b1.get_council_room().getdc());
//					p2.getDiscard().addElement(b1.get_council_room().getdc());
					b1.get_council_room().setrem(b1.get_council_room().getrem()+1);
				}
			}
			else if((name == "CUTPURSE")&&(b1.get_cutpurse()!=null)){
				if(count == 0){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_cutpurse().getdc());
					}
//					p2.getDiscard().addElement(b1.get_cutpurse().getdc());
//					p2.getDiscard().addElement(b1.get_cutpurse().getdc());
					b1.get_cutpurse().dec(b1);
				}
				else if(count == 1){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_cutpurse().getdc());
					}
//					p2.getDiscard().addElement(b1.get_cutpurse().getdc());
//					p2.getDiscard().addElement(b1.get_cutpurse().getdc());
				}
				else{
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_cutpurse().getdc());
					}
//					p2.getDiscard().addElement(b1.get_cutpurse().getdc());
//					p2.getDiscard().addElement(b1.get_cutpurse().getdc());
					b1.get_cutpurse().setrem(b1.get_cutpurse().getrem()+1);
				}
			}
			else if((name == "FEAST")&&(b1.get_feast()!=null)){
				if(count == 0){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_feast().getdc());
					}
//					p2.getDiscard().addElement(b1.get_feast().getdc());
//					p2.getDiscard().addElement(b1.get_feast().getdc());
					b1.get_feast().dec(b1);
				}
				else if(count == 1){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_feast().getdc());
					}
//					p2.getDiscard().addElement(b1.get_feast().getdc());
//					p2.getDiscard().addElement(b1.get_feast().getdc());
				}
				else{
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_feast().getdc());
					}
//					p2.getDiscard().addElement(b1.get_feast().getdc());
//					p2.getDiscard().addElement(b1.get_feast().getdc());
					b1.get_feast().setrem(b1.get_feast().getrem()+1);
				}
			}
			else if((name == "GREAT_HALL")&&(b1.get_great_hall()!=null)){
				if(count == 0){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_great_hall().getdc());
					}
//					p2.getDiscard().addElement(b1.get_great_hall().getdc());
//					p2.getDiscard().addElement(b1.get_great_hall().getdc());
					b1.get_great_hall().dec(b1);
				}
				else if(count == 1){
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_great_hall().getdc());
					}
//					p2.getDiscard().addElement(b1.get_great_hall().getdc());
//					p2.getDiscard().addElement(b1.get_great_hall().getdc());
				}
				else{
					for(int i=0; i<number_of_players; i=i+1){
						if(i == player_num){
							continue;
						}
						players[i].getDiscard().addElement(b1.get_great_hall().getdc());
					}
//					p2.getDiscard().addElement(b1.get_great_hall().getdc());
//					p2.getDiscard().addElement(b1.get_great_hall().getdc());
					b1.get_great_hall().setrem(b1.get_great_hall().getrem()+1);
				}
			}
			else if((name == "MINE")&&(b1.get_mine()!=null)){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_mine().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_mine().getdc());
//					p2.getDiscard().addElement(b1.get_mine().getdc());
					b1.get_mine().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_mine().getdc());
//					p2.getDiscard().addElement(b1.get_mine().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_mine().getdc());
//					p2.getDiscard().addElement(b1.get_mine().getdc());
					b1.get_mine().setrem(b1.get_mine().getrem()+1);
				}
			}
			else if((name == "MINION")&&(b1.get_minion()!=null)){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_minion().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_minion().getdc());
//					p2.getDiscard().addElement(b1.get_minion().getdc());
					b1.get_minion().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_minion().getdc());
//					p2.getDiscard().addElement(b1.get_minion().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_minion().getdc());
//					p2.getDiscard().addElement(b1.get_minion().getdc());
					b1.get_minion().setrem(b1.get_minion().getrem()+1);
				}
			}
			else if((name == "SMITHY")&&(b1.get_smithy()!=null)){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_smithy().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_smithy().getdc());
//					p2.getDiscard().addElement(b1.get_smithy().getdc());
					b1.get_smithy().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_smithy().getdc());
//					p2.getDiscard().addElement(b1.get_smithy().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_smithy().getdc());
//					p2.getDiscard().addElement(b1.get_smithy().getdc());
					b1.get_smithy().setrem(b1.get_smithy().getrem()+1);
				}
			}
			else if((name == "STEWARD")&&(b1.get_steward()!=null)){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_steward().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_steward().getdc());
//					p2.getDiscard().addElement(b1.get_steward().getdc());
					b1.get_steward().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_steward().getdc());
//					p2.getDiscard().addElement(b1.get_steward().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_steward().getdc());
//					p2.getDiscard().addElement(b1.get_steward().getdc());
					b1.get_steward().setrem(b1.get_steward().getrem()+1);
				}
			}
			else if((name == "TRIBUTE")&&(b1.get_tribute()!=null)){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_tribute().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_tribute().getdc());
//					p2.getDiscard().addElement(b1.get_tribute().getdc());
					b1.get_tribute().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_tribute().getdc());
//					p2.getDiscard().addElement(b1.get_tribute().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_tribute().getdc());
//					p2.getDiscard().addElement(b1.get_tribute().getdc());
					b1.get_tribute().setrem(b1.get_tribute().getrem()+1);
				}
			}
			else if((name == "VILLAGE")&&(b1.get_village()!=null)){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_village().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_village().getdc());
//					p2.getDiscard().addElement(b1.get_tribute().getdc());
					b1.get_village().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_village().getdc());
//					p2.getDiscard().addElement(b1.get_tribute().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_village().getdc());
//					p2.getDiscard().addElement(b1.get_tribute().getdc());
					b1.get_village().setrem(b1.get_village().getrem()+1);
				}
			}
			else if(name == "GOLD"){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_gold().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_gold().getdc());
//					p2.getDiscard().addElement(b1.get_gold().getdc());
					b1.get_gold().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_gold().getdc());
//					p2.getDiscard().addElement(b1.get_gold().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_gold().getdc());
//					p2.getDiscard().addElement(b1.get_gold().getdc());
					b1.get_gold().setrem(b1.get_gold().getrem()+1);
				}
			}
			else if(name == "SILVER"){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_silver().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_silver().getdc());
//					p2.getDiscard().addElement(b1.get_silver().getdc());
					b1.get_silver().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_silver().getdc());
//					p2.getDiscard().addElement(b1.get_silver().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_silver().getdc());
//					p2.getDiscard().addElement(b1.get_silver().getdc());
					b1.get_silver().setrem(b1.get_silver().getrem()+1);
				}
			}
			else if(name == "COPPER"){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_copper().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_copper().getdc());
//					p2.getDiscard().addElement(b1.get_copper().getdc());
					b1.get_copper().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_copper().getdc());
//					p2.getDiscard().addElement(b1.get_copper().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_copper().getdc());
//					p2.getDiscard().addElement(b1.get_copper().getdc());
					b1.get_copper().setrem(b1.get_copper().getrem()+1);
				}
			}
			else if(name == "PROVINCE"){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_province().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_province().getdc());
//					p2.getDiscard().addElement(b1.get_province().getdc());
					b1.get_province().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_province().getdc());
//					p2.getDiscard().addElement(b1.get_province().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_province().getdc());
//					p2.getDiscard().addElement(b1.get_province().getdc());
					b1.get_province().setrem(b1.get_province().getrem()+1);
				}
			}
			else if(name == "DUCHY"){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_duchy().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_duchy().getdc());
//					p2.getDiscard().addElement(b1.get_duchy().getdc());
					b1.get_duchy().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_duchy().getdc());
//					p2.getDiscard().addElement(b1.get_duchy().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_duchy().getdc());
//					p2.getDiscard().addElement(b1.get_duchy().getdc());
					b1.get_duchy().setrem(b1.get_duchy().getrem()+1);
				}
			}
			else if(name == "ESTATE"){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_estate().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_estate().getdc());
//					p2.getDiscard().addElement(b1.get_estate().getdc());
					b1.get_estate().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_estate().getdc());
//					p2.getDiscard().addElement(b1.get_estate().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_estate().getdc());
//					p2.getDiscard().addElement(b1.get_estate().getdc());
					b1.get_estate().setrem(b1.get_estate().getrem()+1);
				}
			}
			else if(name == "CURSE"){
				for(int i=0; i<number_of_players; i=i+1){
					if(i == player_num){
						continue;
					}
					players[i].getDiscard().addElement(b1.get_curse().getdc());
				}
				if(count == 0){
//					p2.getDiscard().addElement(b1.get_curse().getdc());
//					p2.getDiscard().addElement(b1.get_curse().getdc());
					b1.get_curse().dec(b1);
				}
				else if(count == 1){
//					p2.getDiscard().addElement(b1.get_curse().getdc());
//					p2.getDiscard().addElement(b1.get_curse().getdc());
				}
				else{
//					p2.getDiscard().addElement(b1.get_curse().getdc());
//					p2.getDiscard().addElement(b1.get_curse().getdc());
					b1.get_curse().setrem(b1.get_curse().getrem()+1);
				}
			}
			else{
				System.out.println("NO SUCH NAME IN ADVENTURER");
			}
			if(players[0].getHand().size() != hand1){
				System.out.println("PASSED AMBASSADOR TEST");
			}
			else{
				if(0 == player_num){
					System.out.println("PASSED AMBASSADOR TEST");
				}
				else{
					System.out.println("FAILED AMBASSADOR TEST");
				}
			}
		}
		else if(getName() == "BARON"){
			System.out.println(p1.getName() + " has decided to play " + getName());
			Random rand = new Random(System.currentTimeMillis()); 
			int buys1 = p1.getBuys();
			int decide = rand.nextInt(2);
			boolean discarded = false;
			p1.setBuys(p1.getBuys()+2);
			if(decide == 1){
				for(int i=0; i<p1.getHand().size(); i = i+1){
					if(p1.getHand().get(i).getName() == "ESTATE"){
						p1.getDiscard().addElement(p1.getHand().get(i));
						p1.getHand().remove(i);
						discarded = true;
						break;
					}
				}
			}
			if(discarded == true){
				p1.setMoney(p1.getMoney()+4);
			}
			else{
				p1.getDiscard().addElement(b1.get_estate().getdc());
				b1.get_estate().dec(b1);
			}
			if(p1.getBuys() != (buys1+1)){
				System.out.println("FAILED BARON TEST");
			}
			else{
				System.out.println("PASSED BARON TEST");
			}
		}
		else if(getName() == "COUNCIL_ROOM"){
			System.out.println(p1.getName() + " has decided to play " + getName());
			int buys1 = p1.getBuys();
			//System.out.println("before play p2: ");
			//p2.print_deck();
			//p2.print_hand();
			p1.draw(4);
			p1.setBuys(p1.getBuys()+2);
			for(int i=0; i<number_of_players; i=i+1){
				if(i == player_num){
					continue;
				}
				players[i].draw(1);
			}
			if(p1.getBuys() != (buys1+1)){
				System.out.println("FAILED COUNCIL_ROOM TEST");
			}
			else{
				System.out.println("PASSED COUNCIL_ROOM TEST");
			}
//			p2.draw(1);
			//System.out.println("after play p2: ");
			//p2.print_deck();
			//p2.print_hand();
		}
		else if(getName() == "CUTPURSE"){
			System.out.println(p1.getName() + " has decided to play " + getName());
			int money1 = p1.getMoney();
			p1.setMoney(p1.getMoney()+1);
			for(int j=0; j<number_of_players; j=j+1){
				if(j==player_num){
					continue;
				}
				for(int i=0; i< players[j].getHand().size(); i = i+1){
					if(players[j].getHand().get(i).getName() == "COPPER"){
						players[j].getDiscard().addElement(players[j].getHand().get(i));
						players[j].getHand().remove(i);
						break;
					}
				}
			}	
			if(p1.getMoney() != (money1+2)){
				System.out.println("FAILED CUTPURSE TEST");
			}
			else{
				System.out.println("PASSED CUTPURSE TEST");
			}
		}
		else if(getName() == "FEAST"){
			System.out.println(p1.getName() + " has decided to play " + getName());
			Random rand = new Random(System.currentTimeMillis());
			int dis = p1.getDiscard().size();
			int idx = 0;
			boolean got = false;
			for(int i=0; i<p1.getActioncards().size(); i = i+1){
				if(p1.getActioncards().get(i).getName() == "FEAST"){
					idx = i;
				}
			}
			//System.out.println("idx: " + idx);
			b1.getTrash().addElement(p1.getActioncards().get(idx));
			//System.out.println("added to trash");
			p1.getActioncards().remove(idx);
			//System.out.println("removed from action_cards");
			for(int i=0; i< p1.getHand().size(); i = i+1){
				if(p1.getHand().get(i).getName() == "FEAST"){
					p1.getHand().remove(i);
					break;
				}
			}
			//System.out.println("removed from hand");
			while(got == false){
				idx = rand.nextInt(5);
				if(idx == 0){
					if(b1.get_copper().getrem() > 0){
							p1.getDiscard().addElement(b1.get_copper().getdc());
							got = true;
					}
					else{
						idx = idx + 1;
					}
				}
				if(idx == 1){
					if(b1.get_duchy().getrem() > 0){
						p1.getDiscard().addElement(b1.get_duchy().getdc());
						got = true;
					}
					else{
						idx = idx + 1;
					}
				}
				if(idx == 2){
					if(b1.get_village().getrem() > 0){
						p1.getDiscard().addElement(b1.get_village().getdc());
						got = true;
					}
					else{
						idx = idx + 1;
					}
				}
				if(idx == 3){
					if((b1.get_baron()!=null)&&(b1.get_baron().getrem() > 0)){
						p1.getDiscard().addElement(b1.get_baron().getdc());
						got = true;
					}
					else{
						idx = idx + 1;
					}
				}
				if(idx == 4){
					if((b1.get_steward()!=null)&&(b1.get_steward().getrem() > 0)){
						p1.getDiscard().addElement(b1.get_steward().getdc());
						got = true;
					}
				}
			}
			if(p1.getDiscard().size() != (dis+1)){
				System.out.println("FAILED FEAST TEST");
			}
			else{
				System.out.println("PASSED FEAST TEST");
			}
			//System.out.println("leaving feast");
		}
		else if(getName() == "GREAT_HALL"){
			System.out.println(p1.getName() + " has decided to play " + getName());
			int acts = p1.getActions();
			p1.setActions(p1.getActions()+2);
			p1.draw(1);
			if(p1.getActions() != (acts+1)){
				System.out.println("FAILED GREAT_HALL TEST");
			}
			else{
				System.out.println("PASSED GREAT_HALL TEST");
			}
		}
		else if(getName() == "MINE"){
			System.out.println(p1.getName() + " has decided to play " + getName());
			boolean got = false;
			int hand = p1.getHand().size();
			int max = 0;
			for(int i=0; i<p1.getHand().size(); i = i+1){
				if((p1.getHand().get(i).getType1() == card.Type.TREASURE) || (p1.getHand().get(i).getType2() == card.Type.TREASURE)){
					max = p1.getHand().get(i).getCost() + 3;
					b1.getTrash().addElement(p1.getHand().get(i));
					p1.getHand().remove(i);
					if(max >= 6){
						//System.out.println("max >= 6");
						if(b1.get_province().getrem() > 0){
							//System.out.println("had gold");
							p1.getHand().addElement(b1.get_gold().getdc());
							b1.get_gold().dec(b1);
							got = true;
						}
					}
					if((max >= 3) && (got == false)){
						if(b1.get_silver().getrem() > 0){
							//System.out.println("had silver");
							p1.getHand().addElement(b1.get_silver().getdc());
							b1.get_silver().dec(b1);
							got = true;
						}
					}
					else{
						//System.out.println("had copper");
						p1.getHand().addElement(b1.get_copper().getdc());
						b1.get_copper().dec(b1);
						//got = true;
					}
					break;
				}
			}
			if(p1.getHand().size() != (hand)){
				System.out.println("FAILED MINE TEST");
			}
			else{
				System.out.println("PASSED MINE TEST");
			}
		}
		else if(getName() == "MINION"){
			System.out.println(p1.getName() + " has decided to play " + getName());
			Random rand = new Random(System.currentTimeMillis());
			int decide;
			int act = p1.getActions();
			p1.setActions(p1.getActions()+1);
			decide = rand.nextInt(2);
			//System.out.println("decide: " + decide);
			if(decide == 1){
				p1.setMoney(p1.getMoney()+2);
			}
			else{
				for(int i=0; i<p1.getHand().size(); i = i+1){
					p1.getDiscard().addElement(p1.getHand().get(i));
				}
				p1.getActioncards().clear();
				p1.getHand().clear();
				p1.draw(4);
				for(int j=0; j<number_of_players; j=j+1){
					if(j==player_num){
						continue;
					}
					if(players[j].getHand().size() >= 5){
						for(int i=0; i<players[j].getHand().size(); i = i+1){
							players[j].getDiscard().addElement(players[j].getHand().get(i));
						}
						players[j].getHand().clear();
						players[j].getActioncards().clear();
						players[j].draw(4);
					}
				}
			}
			if(p1.getActions() != (act+1)){
				System.out.println("FAILED MINION TEST");
			}
			else{
				System.out.println("PASSED MINION TEST");
			}
		}
		else if(getName() == "SMITHY"){
			System.out.println(p1.getName() + " has decided to play " + getName());
			p1.draw(3);
		}
		else if(getName() == "STEWARD"){
			int hand = p1.getHand().size();
			int mon = p1.getMoney();
			System.out.println(p1.getName() + " has decided to play " + getName());
			Random rand = new Random(System.currentTimeMillis());
			int decide;
			decide = rand.nextInt(3);
			if(decide == 0){
				if(p1.getDeck().size() + p1.getDiscard().size() > 2){
					p1.draw(2);
				}
				else{
					p1.setMoney(p1.getMoney()+2);
				}
			}
			else if((decide == 1) && (p1.getHand().size() > 2) && (p1.getDeck().size() + p1.getDiscard().size() > 8)){
				if(p1.getHand().lastElement().getName() == "STEWARD"){
					p1.getDiscard().addElement(p1.getHand().lastElement());
					p1.getHand().remove(p1.getHand().size()-1);
					
					b1.getTrash().addElement(p1.getHand().lastElement());
					p1.getHand().remove(p1.getHand().size()-1);
					b1.getTrash().addElement(p1.getHand().lastElement());
					p1.getHand().remove(p1.getHand().size()-1);
					
					p1.getHand().addElement(p1.getDiscard().lastElement());
					p1.getDiscard().removeElement(p1.getDiscard().size()-1);
				}
				else{
					b1.getTrash().addElement(p1.getHand().lastElement());
					p1.getHand().remove(p1.getHand().size()-1);
					b1.getTrash().addElement(p1.getHand().lastElement());
					p1.getHand().remove(p1.getHand().size()-1);
				}
			}
			else{
				p1.setMoney(p1.getMoney()+2);
			}
			if((p1.getHand().size() == hand+2) || (p1.getMoney() == mon+2) || (p1.getHand().size() == hand-2)){
				System.out.println("PASSED STEWARD TEST");
			}
			else{
				System.out.println("FAILED STEWARD TEST");
			}
		}
		else if(getName() == "TRIBUTE"){
			int left;
			System.out.println(p1.getName() + " has decided to play " + getName());
			card card1;
			card card2;
			int deck;
			if(player_num == (number_of_players-1)){
				left = 0;
			}
			else{
				left = player_num+1;
			}
			if(players[left].getDeck().size() < 2){
				for(int i=0; i < players[left].getDiscard().size(); i = i+1){
					players[left].getDeck().addElement(players[left].getDiscard().get(i));
				}
				players[left].getDiscard().clear();
				players[left].shuffle_deck();
			}
			deck = players[left].getDeck().size();
			card1 = players[left].getDeck().lastElement();//store card
			players[left].getDiscard().addElement(players[left].getDeck().lastElement());//add to discard
			players[left].getDeck().remove(players[left].getDeck().size()-1);//remove from deck
			card2 = players[left].getDeck().lastElement();
			players[left].getDiscard().addElement(players[left].getDeck().lastElement());
			players[left].getDeck().remove(players[left].getDeck().size()-1);
			if(card1.getName() == card2.getName()){//same card
				if((card1.getType1() == card.Type.ACTION) || (card1.getType2() == card.Type.ACTION)){
					p1.setActions(p1.getActions()+2);
				}
				if((card1.getType1() == card.Type.TREASURE) || (card1.getType2() == card.Type.TREASURE)){
					p1.setMoney(p1.getMoney()+2);
				}
				if((card1.getType1() == card.Type.VICTORY) || (card1.getType2() == card.Type.VICTORY)){
					p1.draw(2);
				}
			}
			else{//different cards
				if((card1.getType1() == card.Type.ACTION) || (card1.getType2() == card.Type.ACTION)){
					p1.setActions(p1.getActions()+2);
				}
				if((card1.getType1() == card.Type.TREASURE) || (card1.getType2() == card.Type.TREASURE)){
					p1.setMoney(p1.getMoney()+2);
				}
				if((card1.getType1() == card.Type.VICTORY) || (card1.getType2() == card.Type.VICTORY)){
					p1.draw(2);
				}
				if((card2.getType1() == card.Type.ACTION) || (card2.getType2() == card.Type.ACTION)){
					p1.setActions(p1.getActions()+2);
				}
				if((card2.getType1() == card.Type.TREASURE) || (card2.getType2() == card.Type.TREASURE)){
					p1.setMoney(p1.getMoney()+2);
				}
				if((card2.getType1() == card.Type.VICTORY) || (card2.getType2() == card.Type.VICTORY)){
					p1.draw(2);
				}
			}
			if(players[left].getDeck().size() >= deck){
				System.out.println("FAILED TRIBUTE TEST");
			}
			else{
				System.out.println("PASSED TRIBUTE TEST");
			}
		}
		else if(getName() == "VILLAGE"){
			int act = p1.getActions();
			System.out.println(p1.getName() + " has decided to play " + getName());
			p1.setActions(p1.getActions()+2);
			p1.draw(1);
			if(p1.getActions() != (act+2)){
				System.out.println("FAILED VILLAGE TEST");
			}
			else{
				System.out.println("PASSED VILLAGE TEST");
			}
		}
		else{
			System.out.println("ERROR ON ACTION: " + getName());
		}
	}
}

//held in board, has a card and number of them left
class card_tuple{
	private card deck_card;
	private int remaining;
	
	public card getdc(){
		return deck_card;
	}
	public int getrem(){
		return remaining; 
	}
	//public card(String cardname, Type a, int c, int in)
	public card_tuple(String in){
		if(in == "COPPER"){
			deck_card = new card(in, card.Type.TREASURE, 0, 1);
			remaining = 46;
		}
		else if(in == "SILVER"){
			deck_card = new card(in, card.Type.TREASURE, 3, 2);
			remaining = 40;
		}
		else if(in == "GOLD"){
			deck_card = new card(in, card.Type.TREASURE, 6, 3);
			remaining = 30;
		}
		else if(in == "ESTATE"){
			deck_card = new card(in, card.Type.VICTORY, 2, 1);
			remaining = 12;
		}
		else if(in == "DUCHY"){
			deck_card = new card(in, card.Type.VICTORY, 5, 3);
			remaining = 12;
		}
		else if(in == "PROVINCE"){
			deck_card = new card(in, card.Type.VICTORY, 8, 6);
			remaining = 12;
		}
		else if(in == "CURSE"){
			deck_card = new card(in, card.Type.VICTORY, 0, -1);
			remaining = 30;
		}
		else if (in == "ADVENTURER"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "AMBASSADOR"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "BARON"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "COUNCIL_ROOM"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "CUTPURSE"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "FEAST"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "GREAT_HALL"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "MINE"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "MINION"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "SMITHY"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "STEWARD"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "TRIBUTE"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else if (in == "VILLAGE"){
			deck_card = new action_card(in);
			remaining = 10;
		}
		else{
			System.out.println("NO SUCH CARD TUPLE");
			deck_card = new card();
			remaining = 0;
		}
	}
	public void dec(board b1){
		remaining = remaining - 1;
		if (remaining == 0){
			b1.set_num_out(b1.get_num_out() + 1);
		}
	}
	public void setrem(int in){
		remaining = in;
	}
	
	public card_tuple(){
		deck_card = new card();
		remaining = 0;
	}
}
class player{
	private String name;
	private int actions;
	private int buys;
	private int money;
	//private card[] hand, deck, discard;
	private Vector<card> hand = new Vector<card>();
	private Vector<action_card> action_cards = new Vector<action_card>();
	private Vector<card> deck = new Vector<card>();
	private Vector<card> discard = new Vector<card>();
	private Random rand = new Random(System.currentTimeMillis());
	public player(String in){
			//deck = new card[10];
			//public card(String cardname, Type a, int c, int in)
			name = in;
			actions = 1;
			buys = 1;
			money = 0;
			for(int i=0; i<7; i = i+1){
				deck.addElement(new card("COPPER", card.Type.TREASURE, 0, 1));
			}
			for(int i=7; i<10; i = i+1){
				deck.addElement(new card("ESTATE", card.Type.VICTORY, 2, 1));
			}		
			shuffle_deck();
			draw(5);
			//hand = new card[5];
	}
	public String getName(){
		return name;
	}
	public Vector<card> getDeck(){
		return deck;
	}
	public Vector<card> getDiscard(){
		return discard;
	}
	public Vector<card> getHand(){
		return hand;
	}
	public Vector<action_card> getActioncards(){
		return action_cards;
	}
	public int getMoney(){
		return money;
	}
	public int getActions(){
		return actions;
	}
	public int getBuys(){
		return buys;
	}
	public void setMoney(int in){
		money = in;
	}
	public void setActions(int in){
		actions = in;
	}
	public void setBuys(int in){
		buys = in;
	}
	public void action(player[] players, int player_num, int number_of_players, board board1){
		int decide;
		int r1;
		int i=0;
		while(i<actions){//decides for each action they have
			decide = rand.nextInt(2);
			if(decide == 1){
			//	System.out.println(name + " decided to play an action");
			//	System.out.println(name + "'s number of action cards is: " + action_cards.size());
			}
			else{
			//	System.out.println(name + " decided not to play an action");
			//	System.out.println(name + "'s number of action cards is: " + action_cards.size());
			}
			if((decide == 1) && (action_cards.size() > 0)){ //decided to act and has action cards
				r1 = rand.nextInt(action_cards.size());
				//System.out.println("size of action_cards: " + action_cards.size());
				//System.out.println("r1: " + r1);
				if((action_cards.get(r1).getName() != "FEAST") && (action_cards.get(r1).getName() != "MINION")){
					action_cards.get(r1).action(this, players, player_num, number_of_players, board1);
					discard.add(action_cards.get(r1)); //add to discard
					hand.remove(action_cards.get(r1)); //remove from hand
					action_cards.remove(r1); //remove from action_cards
				}
				else{
					action_cards.get(r1).action(this, players, player_num, number_of_players, board1);
					//action_cards.get(r1).action(this, p2, board1);
				}
			}
			i = i+1;
		}
	//	System.out.println("size of actions: " + action_cards.size() + " at end of action");
	//	for(int j=0; j<action_cards.size(); j = j+1){
	//		System.out.println("action_cards[" + j + "] " + action_cards.get(j).getName());
	//	}
	}
	public void shuffle_deck(){
		Vector<card> temp_vec = new Vector<card>();
		int r1;
		while(!deck.isEmpty()){
			r1 = rand.nextInt(deck.size());
			temp_vec.add(deck.get(r1));
			deck.remove(r1);
		}
		deck = temp_vec;
	}
	//add cards from deck to hand
	public void draw(int in){
	//	System.out.println(name + ": ");
	//	System.out.println("beginning of draw: ");
	//	System.out.println("deck size: " + deck.size());
	//	System.out.println("hand size: " + hand.size());
	//	System.out.println("discard size: " + discard.size());
		int rem;
		if(in <= deck.size()){
			for(int i=0; i<in; i = i+1){
				hand.add(deck.lastElement());
				if(deck.lastElement().getType1() == card.Type.ACTION){
					action_cards.add((action_card)deck.lastElement());
				}
				deck.removeElementAt(deck.size()-1);
			}
			if(deck.isEmpty()){
				for(int i=0; i<discard.size(); i = i+1){
					deck.addElement(discard.get(i));
				}
				discard.clear();
				shuffle_deck();
			}
		}
		else{ //not enough card to draw
			rem = in - deck.size();
			for(int i=0; i<deck.size(); i = i+1){
				hand.addElement(deck.lastElement());
				if(deck.lastElement().getType1() == card.Type.ACTION){
					action_cards.add((action_card)deck.lastElement());
				}
				deck.removeElementAt(deck.size()-1);
			}
	//		for(int i=0; i<discard.size(); i = i+1){
	//			deck.addElement(discard.get(i));
	//		}
			while(!discard.isEmpty()){
				deck.addElement(discard.lastElement());
				discard.remove(discard.size()-1);
			}
			discard.clear();
			shuffle_deck();
			for(int i=0; i<rem; i = i+1){
				hand.add(deck.lastElement());	
				if(deck.lastElement().getType1() == card.Type.ACTION){
					action_cards.add((action_card)deck.lastElement());
				}
				deck.removeElementAt(deck.size()-1);
			}
		}
		//System.out.println("end of draw: ");
		//System.out.println("deck size: " + deck.size());
		//System.out.println("hand size: " + hand.size());
		//System.out.println("discard size: " + discard.size());
	}
	public void buy(board b1){
		int i=0;
		int decide;
		int r1;
		for(int j=0; j<hand.size(); j = j+1){//get money
			if((hand.get(j).getType1() == card.Type.TREASURE) || (hand.get(j).getType2() == card.Type.TREASURE)){
				money = money + hand.get(j).getTV();
			}
		}
		while(i<buys){
			decide = rand.nextInt(2);
			if(decide == 1){//if decide to buy
				//System.out.println(name + " decided to try to buy a card");
				r1 = rand.nextInt(20);
				if((r1 == 0) && (money >= 6) && (b1.get_adventurer() != null)){
					if(b1.get_adventurer().getrem() > 0){
						discard.addElement(b1.get_adventurer().getdc());
						b1.get_adventurer().dec(b1);
						money = money - 6;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 1) && (money >= 3) && (b1.get_ambassador() != null)){
					if(b1.get_ambassador().getrem() > 0){
						discard.addElement(b1.get_ambassador().getdc());
						b1.get_ambassador().dec(b1);
						money = money - 3;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 2) && (money >= 4) && (b1.get_baron() != null)){
					if(b1.get_baron().getrem() > 0){
						discard.addElement(b1.get_baron().getdc());
						b1.get_baron().dec(b1);
						money = money - 4;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 3) && (money >= 5) && (b1.get_council_room() != null)){
					if(b1.get_council_room().getrem() > 0){
						discard.addElement(b1.get_council_room().getdc());
						b1.get_council_room().dec(b1);
						money = money - 5;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 4) && (money >= 4) && (b1.get_cutpurse() != null)){
					if(b1.get_cutpurse().getrem() > 0){
						discard.addElement(b1.get_cutpurse().getdc());
						b1.get_cutpurse().dec(b1);
						money = money - 4;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 5) && (money >= 4) && (b1.get_feast() != null)){
					if(b1.get_feast().getrem() > 0){
						discard.addElement(b1.get_feast().getdc());
						b1.get_feast().dec(b1);
						money = money - 4;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 6) && (money >= 5) && (b1.get_mine() != null)){
					if(b1.get_mine().getrem() > 0){
						discard.addElement(b1.get_mine().getdc());
						b1.get_mine().dec(b1);
						money = money - 5;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 7) && (money >= 4) && (b1.get_great_hall() != null)){
					if(b1.get_great_hall().getrem() > 0){
						discard.addElement(b1.get_great_hall().getdc());
						b1.get_great_hall().dec(b1);
						money = money - 4;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 8) && (money >= 5) && (b1.get_minion() != null)){
					if(b1.get_minion().getrem() > 0){
						discard.addElement(b1.get_minion().getdc());
						b1.get_minion().dec(b1);
						money = money - 5;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 9) && (money >= 4) && b1.get_smithy() != null){
					if(b1.get_smithy().getrem() > 0){
						discard.addElement(b1.get_smithy().getdc());
						b1.get_smithy().dec(b1);
						money = money - 4;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 10) && (money >= 3) && (b1.get_village() != null)){
					if(b1.get_village().getrem() > 0){
						discard.addElement(b1.get_village().getdc());
						b1.get_village().dec(b1);
						money = money - 3;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 11) && (money >= 5) && (b1.get_tribute() != null)){
					if(b1.get_tribute().getrem() > 0){
						discard.addElement(b1.get_tribute().getdc());
						b1.get_tribute().dec(b1);
						money = money - 5;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 12) && (money >= 3) && (b1.get_steward() != null)){
					if(b1.get_steward().getrem() > 0){
						discard.addElement(b1.get_steward().getdc());
						b1.get_steward().dec(b1);
						money = money - 3;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 13) && (money >= 0)){
					if(b1.get_copper().getrem() > 0){
						discard.addElement(b1.get_copper().getdc());
						b1.get_copper().dec(b1);
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 14) && (money >= 3)){
					if(b1.get_silver().getrem() > 0){
						discard.addElement(b1.get_silver().getdc());
						b1.get_silver().dec(b1);
						money = money - 3;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 15) && (money >= 6)){
					if(b1.get_gold().getrem() > 0){
						discard.addElement(b1.get_gold().getdc());
						b1.get_gold().dec(b1);
						money = money - 6;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 16) && (money >= 2)){
					if(b1.get_estate().getrem() > 0){
						discard.addElement(b1.get_estate().getdc());
						b1.get_estate().dec(b1);
						money = money - 2;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 17) && (money >= 5)){
					if(b1.get_duchy().getrem() > 0){
						discard.addElement(b1.get_duchy().getdc());
						b1.get_duchy().dec(b1);
						money = money - 5;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 18) && (money >= 8)){
					if(b1.get_province().getrem() > 0){
						discard.addElement(b1.get_province().getdc());
						b1.get_province().dec(b1);
						money = money - 8;
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
				else if((r1 == 19) && (money >= 0)){
					if(b1.get_curse().getrem() > 0){
						discard.addElement(b1.get_curse().getdc());
						b1.get_curse().dec(b1);
						System.out.println(name + " bought: " + discard.lastElement().getName());
					}
				}
			}
			i = i+1;
		}
		reset();
	}
	public void reset(){
		actions = 1;
		buys = 1;
		money = 0;
		discard_hand();
	}
	public int get_total(){
		int count = 0;
		for(int i=0; i<hand.size(); i = i+1){
			if((hand.get(i).getType1() == card.Type.VICTORY) || (hand.get(i).getType2() == card.Type.VICTORY)){
				count = count + hand.get(i).getVV();
			}
		}
		for(int i=0; i<deck.size(); i = i+1){
			if((deck.get(i).getType1() == card.Type.VICTORY) || (deck.get(i).getType2() == card.Type.VICTORY)){
				count = count + deck.get(i).getVV();
			}
		}
		for(int i=0; i<discard.size(); i = i+1){
			if((discard.get(i).getType1() == card.Type.VICTORY) || (discard.get(i).getType2() == card.Type.VICTORY)){
				count = count + discard.get(i).getVV();
			}
		}
		return count;
	}
	public void discard_hand(){
		for(int i=0; i<hand.size(); i = i+1){
			discard.add(hand.get(i));
		}
	//	print_discard();
	//	print_hand();
		action_cards.clear();
		hand.clear();
	//	print_hand();
		draw(5);
	}
	/*
	public void print_deck(){
		System.out.println("size of deck: " + deck.size());
		for(int i=0; i<deck.size(); i = i+1){
			System.out.println("deck[" + i + "]: " + deck.get(i).getName());
		}
	}
	public void print_discard(){
		for(int i=0; i<discard.size(); i = i+1){
			System.out.println("discard[" + i + "]: " + discard.get(i).getName());
		}
	}
	public void print_hand(){
		for(int i=0; i<hand.size(); i = i+1){
			System.out.println("hand[" + i + "]: " + hand.get(i).getName());
		}
	}
	public void print_action_card(){
	//	System.out.println("size of action_cards: " + action_cards.size());
		for(int i=0; i<action_cards.size(); i = i+1){
			System.out.println("action_cards[" + i + "]: " + action_cards.get(i).getName());
		}
	}
	public void printcap(){
		System.out.println("myhand cap == " + hand.capacity());
	}
	*/
	
}
class game{
	private board b1;
	private player[] players;
	private int number_of_players;

	public game(int playernum){
		b1 = new board();
		players = new player[playernum];
		number_of_players = playernum;
		for(int i=0; i<playernum; i=i+1){
			players[i] = new player("P"+(i+1));
		}
	}
	public boolean is_over(){
		//System.out.println("b1.get_province().getrem()" + b1.get_province().getrem());
		boolean over = false;
		if(b1.get_province().getrem() == 0){
			over = true;
		}
		else if(b1.get_num_out() >= 3){
			over = true;
		}
		return over;
	}
	public int winner(int[] in){//returns index of player with highest points
		if((in[0]>in[1]) && (in[0]>in[2]) && (in[0]>in[3])){
			return 0;
		}
		else if((in[1]>in[0]) && (in[1]>in[2]) && (in[1]>in[3])){
			return 1;
		}
		else if((in[2]>in[1]) && (in[2]>in[0]) && (in[2]>in[3])){
			return 2;
		}
		else{
			return 3;
		}
		
	}
	public void play(){
		int p1_score = 0;
		int p2_score = 0;
		int p3_score = 0;
		int p4_score = 0;
		int[] numbers = new int[4];
		while(!is_over()){
//			p1.action(p2, b1);
//			p1.buy(b1);
//			if(is_over()){
//				break;
//			}
//			p2.action(p1, b1);
//			p2.buy(b1);
			for(int i=0; i<number_of_players; i=i+1){
				players[i].action(players, i, number_of_players, b1);
				players[i].buy(b1);
				if(is_over()){
					break;
				}
			}
		}
		for(int i=0; i<number_of_players; i=i+1){
			if(i==0){
				p1_score = players[i].get_total();
			}
			if(i==1){
				p2_score = players[i].get_total();
			}
			if(i==2){
				p3_score = players[i].get_total();
			}
			if(i==3){
				p4_score = players[i].get_total();
			}
		}
		numbers[0] = p1_score;
		numbers[1] = p2_score;
		numbers[2] = p3_score;
		numbers[3] = p4_score;
		if(number_of_players == 2){
			if(p1_score == p2_score){
				System.out.println("It was a tie!");
			}
			if(p1_score > p2_score){
				System.out.println("P1 Wins!");
			}
			else{
				System.out.println("P2 Wins!");
			}
		}
		else if(number_of_players == 3){
			if(((p1_score == p2_score)&&(p1_score >= p3_score))||((p2_score == p3_score)&&(p2_score >= p1_score))||((p1_score == p3_score)&&(p1_score >= p2_score))){
				System.out.println("It was a tie!");
			}
			else{
				System.out.println(players[winner(numbers)].getName() + " Wins!");
			}
		}
		else{
			if(((p1_score == p2_score)&&(p1_score>p3_score)&&(p1_score>p4_score))||((p1_score == p3_score)&&(p3_score>p2_score)&&(p3_score>p4_score))||((p1_score == p4_score)&&(p1_score>p3_score)&&(p1_score>p2_score))||((p3_score == p2_score)&&(p3_score>p1_score)&&(p3_score>p4_score))||((p3_score == p4_score)&&(p3_score>p1_score)&&(p3_score>p2_score))){
				System.out.println("It was a tie!");
			}
			else{
				System.out.println(players[winner(numbers)].getName() + " Wins!");
			}
		}
		//find winner here
	}
}
class board{
	private int num_out;
	private card_tuple gold, silver, copper, province, duchy, estate, curse;
	private card_tuple adventurer, ambassador, baron, council_room, cutpurse, feast, great_hall, mine, minion, smithy, steward, tribute, village;
	//private great_hall_tuple gh;
	private Vector<card> trash = new Vector<card>();
	public board(){
		Random rand = new Random(10);
		int total = 0;
		num_out = 0;
		gold = new card_tuple("GOLD");
		silver = new card_tuple("SILVER");
		copper = new card_tuple("COPPER");
		province = new card_tuple("PROVINCE");
		duchy = new card_tuple("DUCHY");
		estate = new card_tuple("ESTATE");
		curse = new card_tuple("CURSE");
		ambassador = null;
		baron = null;
		council_room = null;
		cutpurse = null;
		feast = null;
		great_hall = null;
		mine = null;
		minion = null;
		smithy = null;
		steward = null;
		tribute = null;
		village = null;
		while(total < 10){
			if(rand.nextInt(2) == 1){
				if(adventurer == null){
					adventurer = new card_tuple("ADVENTURER");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(ambassador == null){
					ambassador = new card_tuple("AMBASSADOR");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(baron == null){
					baron = new card_tuple("BARON");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(council_room == null){
					council_room = new card_tuple("COUNCIL_ROOM");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(cutpurse == null){
					cutpurse = new card_tuple("CUTPURSE");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(feast == null){
					feast = new card_tuple("FEAST");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(great_hall == null){
					great_hall = new card_tuple("GREAT_HALL");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(mine == null){
					mine = new card_tuple("MINE");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(minion == null){
					minion = new card_tuple("MINION");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(smithy == null){
					smithy = new card_tuple("SMITHY");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(steward == null){
					steward = new card_tuple("STEWARD");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(tribute == null){
					tribute = new card_tuple("TRIBUTE");
					total = total+1;
				}
			}
			if(total == 10){
				break;
			}
			if(rand.nextInt(2) == 1){
				if(village == null){
					village = new card_tuple("VILLAGE");
					total = total+1;
				}
			}
		}
	}
	public Vector<card> getTrash(){
		return trash;
	}
	public int get_num_out(){
		return num_out;
	}
	public void set_num_out(int in){
		num_out = in;
	}
	public card_tuple get_gold(){
		return gold;
	}
	public card_tuple get_silver(){
		return silver;
	}
	public card_tuple get_copper(){
		return copper;
	}
	public card_tuple get_province(){
		return province;
	}
	public card_tuple get_duchy(){
		return duchy;
	}
	public card_tuple get_estate(){
		return estate;
	}
	public card_tuple get_curse(){
		return curse;
	}
	public card_tuple get_adventurer(){
		return adventurer;
	}
	public card_tuple get_ambassador(){
		return ambassador;
	}
	public card_tuple get_baron(){
		return baron;
	}
	public card_tuple get_council_room(){
		return council_room;
	}
	public card_tuple get_cutpurse(){
		return cutpurse;
	}
	public card_tuple get_feast(){
		return feast;
	}
	public card_tuple get_great_hall(){
		return great_hall;
	}
	public card_tuple get_mine(){
		return mine;
	}
	public card_tuple get_smithy(){
		return smithy;
	}
	public card_tuple get_steward(){
		return steward;
	}
	public card_tuple get_tribute(){
		return tribute;
	}
	public card_tuple get_village(){
		return village;
	}
	public card_tuple get_minion(){
		return minion;
	}
}
public class RandomTestDominion{

	public static void main(String []args){
		Random rand = new Random(10);
		int next;
		do{
			next = rand.nextInt(4);
		}while(next<2);
		game MyGame; 
		for(int i=0; i<1; i=i+1){
			do{
				next = rand.nextInt(4);
			}while(next<2);
			MyGame = new game(next);
			//MyGame = new game(3);
			MyGame.play();
		}
		

	}
}