public enum Card {
    Curse,
    Estate,
    Duchy,
    Province,

    Copper,
    Silver,
    Gold,

    Adventurer,
    /* If no/only 1 treasure found, stop when full deck seen */
    CouncilRoom,
    Feast, /* choice1 is supply # of card gained) */
    Gardens,
    Mine, /* choice1 is hand# of money to trash, choice2 is supply# of
             money to put in hand */
    Remodel, /* choice1 is hand# of card to remodel, choice2 is supply# */
    Smithy,
    Village,

    Baron, /* choice1: boolean for discard of estate */
    /* Discard is always of first (lowest index) estate */
    GreatHall,
    Minion, /* choice1:  1 = +2 coin, 2 = redraw */
    Steward, /* choice1: 1 = +2 card, 2 = +2 coin, 3 = trash 2 (choice2,3) */
    Tribute,

    Ambassador, /* choice1 = hand#, choice2 = number to return to supply */
    Cutpurse,
    Embargo, /* choice1 = supply# */
    Outpost,
    Salvager, /* choice1 = hand# to trash */
    SeaHag,
    TreasureMap
}

