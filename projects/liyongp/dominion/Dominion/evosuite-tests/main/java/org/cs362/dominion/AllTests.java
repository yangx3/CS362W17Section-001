package main.java.org.cs362.dominion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Card_ESTest.class, GameState_ESTest.class, PlayDominion_ESTest.class, Player_ESTest.class, RandomTesterDominion_ESTest.class })
public class AllTests {

}
