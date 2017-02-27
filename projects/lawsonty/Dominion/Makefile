all:

compile:
	mvn compile

clean:
	mvn clean

test: compile
	mvn test

pack: compile
	mvn package

coverage: 
	mvn jacoco:report 

run: target/Dominion-1.0-SNAPSHOT.jar
	java -jar target/Dominion-1.0-SNAPSHOT.jar
