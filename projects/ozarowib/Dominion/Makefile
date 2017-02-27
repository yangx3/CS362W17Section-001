default:
	echo "Use 'build' to compile then 'run', 'test', 'randomtest', 'myrandom', or 'cover'"

build: compile package

compile:
	mvn compile

package:
	mvn package -DskipTests

run:
	java -cp target/Dominion-1.0-SNAPSHOT.jar org.cs362.dominion.PlayDominion

test:
	mvn -Dtest=AllTests test

randomtest:
	mvn -Dtest=ErrorTest,RegressionTest test

myrandom:
	mvn -Dtest=RandomTestDominion test

testall:
	mvn test

cover: clean
	mvn cobertura:cobertura

clean:
	mvn clean
