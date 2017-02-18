/\/\/\/\/ Building \/\/\/\/\
Within dominion directory type the following:
	mvn clean
	mvn compile
	mvn package

/\/\/\/\/ Playing \/\/\/\/\
Within dominion directory type the following:

For playing:
	java -cp target/dominion-1.0-SNAPSHOT.jar dominion.PlayDominion

For testing:
	mvn test
	
For coverage:
	mvn jacoco:report
	(Coverage can be found in dominion\target\site\jacoco\*.html)