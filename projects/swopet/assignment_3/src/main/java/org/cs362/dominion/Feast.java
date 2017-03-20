package org.cs362.dominion;
public class Feast extends Card {
    public Feast(){
        name = "Feast";
        description = "Action: Trash this card. Gain a card costing up to 5$";
        cost = 4;
        action = true;
    }
    public Boolean play(GameState game){
        Player player = game.players[game.whoseTurn];
        if (game.phase != 0) return false;
        else{
            player.trash(this,game);
            if (player.isBot){
                player.discard.add(player.gainFrom(game.treasureCards.get(1)));
            }
            else {
                //TODO: get input from player
            }
            return true;
        }
    }
}