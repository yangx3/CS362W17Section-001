clean:
	mvn clean
test:
	mvn test
compile: 
	mvn compile
build:
	mvn package
coverage: clean
	mvn cobertura:cobertura
run2bot:
	java -cp target/Dominion-1.0-SNAPSHOT.jar goertzel.Main
runRandTester:
	mvn test -Dtest=RandomTestDominion