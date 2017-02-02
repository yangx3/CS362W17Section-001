/*
 * This enum holds the different types of cards that are in a game of
 * Dominion. It is meant to be stored as many times as needed to fully
 * represent the types a card is.
 *  Example:
 *   - garden has both Action and Victory type
 *   
 *   Robert Rosenberger
 *   Last modified: 1/31/2017
 */

public enum CardType{
	Action, Treasure, Victory, Attack, Reaction;
}