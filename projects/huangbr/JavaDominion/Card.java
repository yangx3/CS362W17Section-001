public abstract class Card
{
	protected enum cardType {Treasure, Victory, Action, Attack, Curse};

	protected String name;
	protected cardType type;
	protected int cost;
	protected int value;
	protected int points;
	protected int actions;
	protected int draw;
	protected int buy;
	
	public abstract void play(Dominion game, Player player);
	public void print()
	{
		System.out.println(name);
	}

	public void discard(Dominion game, Player player)
	{
		for(int i=0; i < game.players[player.playerID].hand.getSize(); i++)
		{
			if(game.players[player.playerID].hand.cards.get(i).name == name)
			{
				game.players[player.playerID].discardCard(i);
				break;
			}
		}
	}


}

