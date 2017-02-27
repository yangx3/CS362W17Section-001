/\/\/\/\/ Building \/\/\/\/\
Within dominion directory type the following:
	mvn clean
	mvn compile
	mvn package

/\/\/\/\/ Playing \/\/\/\/\
Within dominion directory type the following:

For playing:
Plays random game with 2-4 people and 10 random cards
	java -cp target/dominion-1.0-SNAPSHOT.jar dominion.RandomDominionTest

For testing:
Generate randoop files then move them into the test directory and run the test
	java -ea -classpath target/classes:randoop-all-3.0.9.jar randoop.main.Main gentests --classlist=subjects.txt
	mv -f *.java src/test/java/com/mycompany/app/ 
	mvn test
	
For coverage:
	mvn jacoco:report
	(Coverage can be found in dominion\target\site\jacoco\*.html)
