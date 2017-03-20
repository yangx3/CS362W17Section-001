To compile and run tests:

Navigate to CS362W17Section-001/projects/masseyt/

Execute "mvn compile" and "mvn package"

All tests will run and succeed


ASSIGNMENT 2 ADDITIONS:

"index.html" is updated coverage report. A picture (Coverage Report.png) is provided as well.

EvoSuite Tests are provided in .../masseyt/evosuite-tests/com/tris/

To run Random Tester:

After "mvn package," navigate to .../masseyt/target/

EXECUTE THE FOLLOWING COMMAND:

java -cp dominion-1.0-SNAPSHOT.jar com.tris.App

The Random Tester (called App.java) program will run and the winner will be declared. (Random seed is set to 10, but if the seed line is commented out, it generates a different game each time)

FINAL PROJECT:

All PITest results are in the masseyt/PITestResults/ folder. There are unit test results and EvoSuite results (All EvoSuite results are separate html files, so the real coverage is all of them added together).
