/\/\/\/\/ Building \/\/\/\/\
Within dominion directory type the following:
	mvn clean
	mvn compile
	mvn package

/\/\/\/\/ Testing \/\/\/\/\

For generating random tests:
	java -ea -classpath target/classes:randoop-all-3.0.9.jar randoop.main.Main gentests --classlist=subjects.txt
	cp *.java src/test/java/com/mycompany/app/
	mvn test
	
For mutation testing:
	mvn org.pitest:pitest-maven:mutationCoverage
	coverage is found in /target/pit-reports