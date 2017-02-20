--------------------------------------------------------------------------
If using Maven:

Commands to build:
 mvn compile
 mvn package -DskipTests

Command to run program:
 java -cp target/Dominion-1.0-SNAPSHOT.jar org.cs362.dominion.PlayDominion

Command to run test suite:
 mvn -Dtest=AllTests test

Command to run code coverage:
 mvn cobertura:cobertura
--------------------------------------------------------------------------
If using the Makefile:

Command to build:
 make build

Command to run program:
 make run

Command to run test suite:
 make test

Command to run code coverage:
 make cover
--------------------------------------------------------------------------
