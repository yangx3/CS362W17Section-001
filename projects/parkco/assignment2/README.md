Maven:
	
	To compile:
		mvn package

	To run:
		java -jar target/DOMINION-1.0-SNAPSHOT.jar

	To run test suite: 
		mvn test

	To run tests with coverage and generate a report:
		mvn cobertura:cobertura
		mvn cobertura:cobertura
	*may have to be run twice to generate a report

	To clean: 
		mvn clean

Evosuite:
	
	Generate test suite:
		mvn evosuite:generate
	
	Export tests to src/test/java:
		mvn evosuite:export
	
	To clean:
		mvn evosuite:clean
	
	To get info:
		mvn evosuite:info

