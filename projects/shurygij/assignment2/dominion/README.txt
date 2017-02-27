/\/\/\/\/ Building \/\/\/\/\
Within dominion directory type the following:
	mvn clean
	mvn compile
	mvn package

/\/\/\/\/ Playing \/\/\/\/\
Within dominion directory type the following:

For playing:
	java -cp target/dominion-1.0-SNAPSHOT.jar dominion.RandomDominionTest

For testing:
	java -ea -classpath target/classes:randoop-all-3.0.9.jar randoop.main.Main gentests --classlist=subjects.txt
	cp *.java src/test/java/com/mycompany/app/
	mvn test
	
For coverage:
	mvn jacoco:report
	(Coverage can be found in dominion\target\site\jacoco\*.html)