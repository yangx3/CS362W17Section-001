package org.cs362.dominion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestGameStart.class,
	TestAdventurer.class,
	TestAmbassador.class,
	TestBaron.class,
	TestCoins.class,
	TestCouncilRoom.class,
	TestFeast.class,
	TestFestival.class,
	TestGardens.class,
	TestGreatHall.class,
	TestLaboratory.class,
	TestMine.class,
	TestSalvager.class,
	TestSmithy.class,
	TestVillage.class,
	TestTurn.class })
public class AllTests {}
