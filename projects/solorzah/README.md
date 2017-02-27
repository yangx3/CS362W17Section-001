To compile and run tests:

	Navigate to the directory with the pom file:
	do `mvn compile`
	do `mvn test`
To run the game:

	Go to src/main/java
	do `javac dominion/*.java`
	do `java dominion/PlayDominion`
To run RandomTestDominion:

	Navigate to the directory with the pom file:
	do `mvn package`
	Go into target/
	do `java -cp hsolorza-1.0-SNAPSHOT.jar dominion/RandomTestDominion`
To compile new code coverage:

	Navigate to the directory with the pom file:
	do `mvn coburtura:coburtura`
