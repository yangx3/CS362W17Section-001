program files: Dominion\src\main\java\org\cs362\dominion
tests: Dominion\src\test\java\org\cs362\dominion

To run Dominion:
mvn clean
mvn package -DskipTests
java -cp target/Dominion-1.0-SNAPSHOT.jar org.cs362.dominion.PlayDom

To run tests:
mvn clean
mvn package
mvn test

To run random tester:
mvn clean
mvn package
mvn exec:java -Dexec.mainClass="org.cs362.dominion.RandomTestDominion" -Dexec.args="10" 