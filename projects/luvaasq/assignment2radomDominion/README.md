
mvn clean #Clean up
mvn compile #Compile
mvn package #Package

#Create random tests and copy them to the Jacoco test directory:
java -classpath target/classes:randoop-all-3.0.9.jar randoop.main.Main gentests --classlist=myTests.txt --timelimit=60; rm -r src/test/java/com/cs362/dominion/*; cp RegressionTest* src/test/java/com/cs362/dominion/


java -cp target/dominion-1.0-SNAPSHOT.jar dominion.RandomTestDominion #Play game with random number of players
mvn test //Run unit tests

#To get coverage:
mvn jacoco:report
Open file "index.html" in /target/site/jacoco

#Or just run this line!
 mvn clean; mvn compile; mvn package; java -classpath target/classes:randoop-all-3.0.9.jar randoop.main.Main gentests --classlist=myTests.txt --timelimit=60; rm -r src/test/java/com/cs362/dominion/*; cp RegressionTest* src/test/java/com/cs362/dominion/; java -cp target/dominion-1.0-SNAPSHOT.jar dominion.RandomTestDominion; mvn jacoco:report 