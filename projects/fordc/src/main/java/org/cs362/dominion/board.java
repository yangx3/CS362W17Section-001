package org.cs362.dominion;

public class board{
	int num_players = 0;

	//kingdom cards
	pile adventurer;
	pile ambassador;
	pile baron;
	pile council_room;
	pile cutpurse;
	pile embargo;
	pile feast;
	pile gardens;
	pile great_hall;
	pile mine;
	pile salvager;
	pile smithy;
	pile village;

	//treasure cards
	pile copper;
	pile gold;
	pile silver;

	//victory cards
	pile estate;
	pile duchy;
	pile province;

	//Curse cards
	pile curse;

	//Trash pile
	deck trash_pile;

	//empty pile counter
	int num_empty;

	public board(){
		//Initiate trash pile
		trash_pile = new deck();

		//Initiate empty pile counter
		num_empty = 0;

		//kingdom cards
		adventurer = new pile();
		adventurer.name = "adventurer";
		adventurer.num_cards = 10;
		adventurer.num_tokens = 0;

		ambassador = new pile();
		ambassador.name = "ambassador";
		ambassador.num_cards = 10;
		ambassador.num_tokens = 0;

		baron = new pile();
		baron.name = "baron";
		baron.num_cards = 10;
		baron.num_tokens = 0;

		council_room = new pile();
		council_room.name = "council room";
		council_room.num_cards = 10;
		council_room.num_tokens = 0;

		cutpurse = new pile();
		cutpurse.name = "cutpurse";
		cutpurse.num_cards = 10;
		cutpurse.num_tokens = 0;

		embargo = new pile();
		embargo.name = "embargo";
		embargo.num_cards = 10;
		embargo.num_tokens = 0;

		feast = new pile();
		feast.name = "feast";
		feast.num_cards = 10;
		feast.num_tokens = 0;

		gardens = new pile();
		gardens.name = "gardens";
		gardens.num_cards = 10;
		gardens.num_tokens = 0;

		great_hall = new pile();
		great_hall.name = "great hall";
		great_hall.num_cards = 10;
		great_hall.num_tokens = 0;

		mine = new pile();
		mine.name = "mine";
		mine.num_cards = 10;
		mine.num_tokens = 0;

		salvager = new pile();
		salvager.name = "salvager";
		salvager.num_cards = 10;
		salvager.num_tokens = 0;

		smithy = new pile();
		smithy.name = "smithy";
		smithy.num_cards = 10;
		smithy.num_tokens = 0;

		village = new pile();
		village.name = "village";
		village.num_cards = 10;
		village.num_tokens = 0;

		//treasure cards
		copper = new pile();
		copper.name = "copper";
		copper.num_cards = 60;
		copper.num_tokens = 0;

		gold = new pile();
		gold.name = "gold";
		gold.num_cards = 30;
		gold.num_tokens = 0;
		
		silver = new pile();
		silver.name = "silver";
		silver.num_cards = 40;
		silver.num_tokens = 0;

		//victory cards
		duchy = new pile();
		duchy.name = "duchy";
		duchy.num_cards = 12;
		duchy.num_tokens = 0;

		estate = new pile();
		estate.name = "estate";
		estate.num_cards = 12;
		estate.num_tokens = 0;

		province = new pile();
		province.name = "province";
		province.num_cards = 24;
		province.num_tokens = 0;

		//curse cards
		curse = new pile();
		curse.name = "curse";
		curse.num_cards = 10;
		curse.num_tokens = 0;
		
	}

	public void print_board(){
		System.out.println("VICTORY");

		//Print estate
		card dummy_estate = new estate();
		System.out.format("01. [%d]%-10s   tokens: %d   cost: %d   victory points: %d\n", estate.num_cards,
				dummy_estate.name, estate.num_tokens, dummy_estate.cost, dummy_estate.victory_points);

		//Print duchy
		card dummy_duchy = new duchy();
		System.out.format("02. [%d]%-10s   tokens: %d   cost: %d   victory points: %d\n", duchy.num_cards,
				dummy_duchy.name, duchy.num_tokens, dummy_duchy.cost, dummy_duchy.victory_points);

		//Print province
		card dummy_province = new province();
		System.out.format("03. [%d]%-10s   tokens: %d   cost: %d   victory points: %d\n\n", province.num_cards,
				dummy_province.name, province.num_tokens, dummy_province.cost, dummy_province.victory_points);

		//Print curses
		card dummy_curse = new curse();
		System.out.format("04. [%d]%-10s   tokens: %d   cost: %d   victory points: %d\n\n", curse.num_cards,
				dummy_curse.name, curse.num_tokens, dummy_curse.cost, dummy_curse.victory_points);

		
		System.out.println("TREASURE");

		//Print copper
		card dummy_copper = new copper();
		System.out.format("05. [%d]%-10s   tokens: %d   cost: %d   currency: %d\n", copper.num_cards,
				dummy_copper.name, copper.num_tokens, dummy_copper.cost, dummy_copper.gold);

		//Print silver
		card dummy_silver = new silver();
		System.out.format("06. [%d]%-10s   tokens: %d   cost: %d   currency: %d\n", silver.num_cards,
				dummy_silver.name, silver.num_tokens, dummy_silver.cost, dummy_silver.gold);

		//Print gold
		card dummy_gold = new gold();
		System.out.format("07. [%d]%-10s   tokens: %d   cost: %d   currency: %d\n\n", gold.num_cards,
				dummy_gold.name, gold.num_tokens, dummy_gold.cost, dummy_gold.gold);

		System.out.println("KINGDOM");
		//Print adventure cards in order of cost and then by alphabetical order

		//Print embargo
		card dummy_embargo = new embargo();
		System.out.format("08. [%d]%-13s   tokens: %d   cost: %d   description: ", embargo.num_cards,
				dummy_embargo.name, embargo.num_tokens, dummy_embargo.cost);
		dummy_embargo.description();

		//Print ambassador
		card dummy_ambassador = new ambassador();
		System.out.format("09. [%d]%-13s   tokens: %d   cost: %d   description: ", ambassador.num_cards,
				dummy_ambassador.name, ambassador.num_tokens, dummy_ambassador.cost);
		dummy_ambassador.description();

		//Print great hall
		card dummy_great_hall = new great_hall();
		System.out.format("10. [%d]%-13s   tokens: %d   cost: %d   description: ", great_hall.num_cards,
				dummy_great_hall.name, great_hall.num_tokens, dummy_great_hall.cost);
		dummy_great_hall.description();

		//Print village
		card dummy_village = new village();
		System.out.format("11. [%d]%-13s   tokens: %d   cost: %d   description: ", village.num_cards,
				dummy_village.name, village.num_tokens, dummy_village.cost);
		dummy_village.description();

		//Print baron
		card dummy_baron = new baron();
		System.out.format("12. [%d]%-13s   tokens: %d   cost: %d   description: ", baron.num_cards,
				dummy_baron.name, baron.num_tokens, dummy_baron.cost);
		dummy_baron.description();

		//Print cutpurse
		card dummy_cutpurse = new cutpurse();
		System.out.format("13. [%d]%-13s   tokens: %d   cost: %d   description: ", cutpurse.num_cards,
				dummy_cutpurse.name, cutpurse.num_tokens, dummy_cutpurse.cost);
		dummy_cutpurse.description();
		
		//Print feast
		card dummy_feast = new feast();
		System.out.format("14. [%d]%-13s   tokens: %d   cost: %d   description: ", feast.num_cards,
				dummy_feast.name, feast.num_tokens, dummy_feast.cost);
		dummy_feast.description();

		//Print gardens
		card dummy_gardens = new gardens();
		System.out.format("15. [%d]%-13s   tokens: %d   cost: %d   description: ", gardens.num_cards,
				dummy_gardens.name, gardens.num_tokens, dummy_gardens.cost);
		dummy_gardens.description();

		//Print salvager
		card dummy_salvager = new salvager();
		System.out.format("16. [%d]%-13s   tokens: %d   cost: %d   description: ", salvager.num_cards,
				dummy_salvager.name, salvager.num_tokens, dummy_salvager.cost);
		dummy_salvager.description();

		//Print smithy
		card dummy_smithy = new smithy();
		System.out.format("17. [%d]%-13s   tokens: %d   cost: %d   description: ", smithy.num_cards,
				dummy_smithy.name, smithy.num_tokens, dummy_smithy.cost);
		dummy_smithy.description();

		//Print council room
		card dummy_council_room = new council_room();
		System.out.format("18. [%d]%-13s   tokens: %d   cost: %d   description: ", council_room.num_cards,
				dummy_council_room.name, council_room.num_tokens, dummy_council_room.cost);
		dummy_council_room.description();

		//Print mine
		card dummy_mine = new mine();
		System.out.format("19. [%d]%-13s   tokens: %d   cost: %d   description: ", mine.num_cards,
				dummy_mine.name, mine.num_tokens, dummy_mine.cost);
		dummy_mine.description();

		//Print adventurer
		card dummy_adventurer = new adventurer();
		System.out.format("20. [%d]%-13s   tokens: %d   cost: %d   description: ", adventurer.num_cards,
				dummy_adventurer.name, adventurer.num_tokens, dummy_adventurer.cost);
		dummy_adventurer.description();
		System.out.println();

	}

	//These are the buy functions for the buying phase of the game
	
	//VICTORY CARDS
	public void buy_estate(player buying_player, board dominion){
		//create a dummy card for accessing card values
		card dummy_estate = new estate();

		//Check if the player has enough money
		if(buying_player.gold >= dummy_estate.cost){
			//If so, reduce the players gold, number of buys, the number in the pile, and add the card
			//to their hand
			buying_player.gold = buying_player.gold - dummy_estate.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_estate);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.estate.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}

			dominion.estate.num_cards -= 1;
			if(dominion.estate.num_cards == 0){
				num_empty += 1;
			}
		}
		//Else print an error and nothing changes
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_duchy(player buying_player, board dominion){
		card dummy_duchy = new duchy();
		if(buying_player.gold >= dummy_duchy.cost){
			buying_player.gold = buying_player.gold - dummy_duchy.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_duchy);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.duchy.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.duchy.num_cards -= 1;
			if(dominion.duchy.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_province(player buying_player, board dominion){
		card dummy_province = new province();
		if(buying_player.gold >= dummy_province.cost){
			buying_player.gold = buying_player.gold - dummy_province.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_province);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.province.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.province.num_cards -= 1;
			if(dominion.province.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	//CURSE CARDS
	public void buy_curse(player buying_player, board dominion){
		card dummy_curse = new curse();
		if(buying_player.gold >= dummy_curse.cost){
			buying_player.gold = buying_player.gold - dummy_curse.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_curse);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			for(int i = 0; i < dominion.curse.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.curse.num_cards -= 1;
			if(dominion.curse.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}


	//TREASURE CARDS
	public void buy_copper(player buying_player, board dominion){
		card dummy_copper = new copper();
		if(buying_player.gold >= dummy_copper.cost){
			buying_player.gold = buying_player.gold - dummy_copper.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_copper);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.copper.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.copper.num_cards -= 1;
			if(dominion.copper.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_silver(player buying_player, board dominion){
		card dummy_silver = new silver();
		if(buying_player.gold >= dummy_silver.cost){
			buying_player.gold = buying_player.gold - dummy_silver.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_silver);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.silver.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.silver.num_cards -= 1;
			if(dominion.silver.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_gold(player buying_player, board dominion){
		card dummy_gold = new gold();
		if(buying_player.gold >= dummy_gold.cost){
			buying_player.gold = buying_player.gold - dummy_gold.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_gold);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.gold.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.gold.num_cards -= 1;
			if(dominion.gold.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}

	//KINGDOM CARDS
	public void buy_embargo(player buying_player, board dominion){
		card dummy_embargo = new embargo();
		if(buying_player.gold >= dummy_embargo.cost){
			buying_player.gold = buying_player.gold - dummy_embargo.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_embargo);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.embargo.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.embargo.num_cards -= 1;
			if(dominion.embargo.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_ambassador(player buying_player, board dominion){
		card dummy_ambassador = new ambassador();
		if(buying_player.gold >= dummy_ambassador.cost){
			buying_player.gold = buying_player.gold - dummy_ambassador.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_ambassador);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.ambassador.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.ambassador.num_cards -= 1;
			if(dominion.ambassador.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_great_hall(player buying_player, board dominion){
		card dummy_great_hall = new great_hall();
		if(buying_player.gold >= dummy_great_hall.cost){
			buying_player.gold = buying_player.gold - dummy_great_hall.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_great_hall);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.great_hall.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.great_hall.num_cards -= 1;
			if(dominion.great_hall.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_village(player buying_player, board dominion){
		card dummy_village = new village();
		if(buying_player.gold >= dummy_village.cost){
			buying_player.gold = buying_player.gold - dummy_village.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_village);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.village.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.village.num_cards -= 1;
			if(dominion.village.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_baron(player buying_player, board dominion){
		card dummy_baron = new baron();
		if(buying_player.gold >= dummy_baron.cost){
			buying_player.gold = buying_player.gold - dummy_baron.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_baron);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.baron.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.baron.num_cards -= 1;
			if(dominion.baron.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_cutpurse(player buying_player, board dominion){
		card dummy_cutpurse = new cutpurse();
		if(buying_player.gold >= dummy_cutpurse.cost){
			buying_player.gold = buying_player.gold - dummy_cutpurse.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_cutpurse);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.cutpurse.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.cutpurse.num_cards -= 1;
			if(dominion.cutpurse.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_feast(player buying_player, board dominion){
		card dummy_feast = new feast();
		if(buying_player.gold >= dummy_feast.cost){
			buying_player.gold = buying_player.gold - dummy_feast.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_feast);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.feast.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.feast.num_cards -= 1;
			if(dominion.feast.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_gardens(player buying_player, board dominion){
		card dummy_gardens = new gardens();
		if(buying_player.gold >= dummy_gardens.cost){
			buying_player.gold = buying_player.gold - dummy_gardens.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_gardens);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.gardens.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.gardens.num_cards -= 1;
			if(dominion.gardens.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_salvager(player buying_player, board dominion){
		card dummy_salvager = new salvager();
		if(buying_player.gold >= dummy_salvager.cost){
			buying_player.gold = buying_player.gold - dummy_salvager.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_salvager);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.salvager.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.salvager.num_cards -= 1;
			if(dominion.salvager.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_smithy(player buying_player, board dominion){
		card dummy_smithy = new smithy();
		if(buying_player.gold >= dummy_smithy.cost){
			buying_player.gold = buying_player.gold - dummy_smithy.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_smithy);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.smithy.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.smithy.num_cards -= 1;
			if(dominion.smithy.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_council_room(player buying_player, board dominion){
		card dummy_council_room = new council_room();
		if(buying_player.gold >= dummy_council_room.cost){
			buying_player.gold = buying_player.gold - dummy_council_room.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_council_room);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.council_room.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.council_room.num_cards -= 1;
			if(dominion.council_room.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_mine(player buying_player, board dominion){
		card dummy_mine = new mine();
		if(buying_player.gold >= dummy_mine.cost){
			buying_player.gold = buying_player.gold - dummy_mine.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_mine);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.mine.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.mine.num_cards -= 1;
			if(dominion.mine.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}
	public void buy_adventurer(player buying_player, board dominion){
		card dummy_adventurer = new adventurer();
		if(buying_player.gold >= dummy_adventurer.cost){
			buying_player.gold = buying_player.gold - dummy_adventurer.cost;
			buying_player.buy = buying_player.buy - 1;
			buying_player.player_discard.add_card(dummy_adventurer);
			//Check if there are tokens. If so, add curse cards equal to the number of tokens.
			card dummy_curse = new curse();
			for(int i = 0; i < dominion.adventurer.num_tokens; i++){
				if(dominion.curse.num_cards > 0){
					buying_player.player_discard.add_card(dummy_curse);
					dominion.curse.num_cards -= 1;
				}
			}
			dominion.adventurer.num_cards -= 1;
			if(dominion.adventurer.num_cards == 0){
				num_empty += 1;
			}

		}
		else{
			System.out.println("You do not have enough money!");
		}
	}

}


