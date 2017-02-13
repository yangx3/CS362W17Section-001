import java.util.*

public class Embargo extends Card
{
	public Embargo()
	{
		name = "Embargo";
		Type = Action;
		cost = 2;
		value = 0;
		points = 0;
		actions = 0;
		draw = 0;
		buy = 0;
	}
	public void play(Dominion game, Player player)
	{
		player.money += 2;
		game.getRandomKingdomCard().embargo++;

		player.trashCard(player.getCardIndexbyName(player.hand, "Embargo");
	}
}







