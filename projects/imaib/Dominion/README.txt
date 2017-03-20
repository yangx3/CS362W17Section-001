Compiling mvn:
 
mvn compile
mvn package

Running a Program:
java -cp target/Dominion-1.0-SNAPSHOT.jar org.cs362.dominion.PlayDominion

Run test suite:
mvn -Dtest=AllTests test

Run RandomTestDominion:
mvn -Dtest=RandomTestDominion test

Run Randooptest suite:
mvn -Dtest=ErrorTest,RegressionTest test

Run all tests:
mvn test

Code coverage:
mvn cobertura: cobertura

Code coverage Mutations(PITEST:
mvn org.pitest:pitest-maven:mutationCoverage 
