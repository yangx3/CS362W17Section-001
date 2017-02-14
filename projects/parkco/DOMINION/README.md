How to compile the program under test and run the unit tests, with and without code coverage.

To build and run:
	mvn package
	
	java -jar target/DOMINION-1.0-SNAPSHOT.jar

To test (without coverage):
	mvn test

To test (with coverage):
	mvn cobertura:cobertura

To clean: 
	mvn clean
