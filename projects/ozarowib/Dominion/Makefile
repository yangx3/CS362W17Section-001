default:
	echo "Use 'build' to compile then 'run', 'test', or 'cover' to execute."

all: build

build: compile package

compile:
	mvn compile

package:
	mvn package -DskipTests

run:
	java -cp target/Dominion-1.0-SNAPSHOT.jar org.cs362.dominion.PlayDominion

test:
	mvn -Dtest=AllTests test

cover: clean
	mvn cobertura:cobertura

clean:
	mvn clean
