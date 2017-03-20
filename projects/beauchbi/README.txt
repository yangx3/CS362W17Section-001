All of the code for Assignment 1 is in the Dominion folder

All of the code for Assignment 2 is in the Dominion_randoop and RandomTestDominion folders

To run program: mvn package

To run tests: mvn test

I used the command java -ea -classpath randoop-3.0.9/randoop-all-3.0.9.jar;Dominion_randoop/target/classes randoop.main.Main gentests --classlist=randoop-3.0.9/test_classes.txt --outputlimit=5000 --junit-output-dir=Dominion_randoop/src/test/java --junit-package-name=dominion.Randoop
to generate the randoop tests

The html files for the code coverage for Assignment 2 can be found in Dominion_randoop/target/site/cobertura/