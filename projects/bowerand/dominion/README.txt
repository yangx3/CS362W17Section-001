The assignment2 folder contains the entire program 
To run the program, make sure you're in the assigment 2 - project directory

--The following should run the program 

All:
	echo "Comands: Clean, Test, Build, Run"

Clean:
	mvn clean

Test: 
	mvn test

Build:
	mvn package

Run:
	java -jar target/bowerand-1.0-SNAPSHOT.jar

--To run the test suite 

mvn compile

mvn evosuite:generate

mvn evosuite:export

mvn test