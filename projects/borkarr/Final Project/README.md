Final project for CS 362. 

Mutation coverage results are inside "randoop coverage" folder. My unit test results are in "target\pit-reports\201703132213"

To regenerate unit test results:

mvn clean

mvn compile

mvn package

mvn org.pitest:pitest-maven:mutationCoverage

To regenerate the mutation coverage for randoop, simply replace the tests in the test directory with RegressionTest.java and RegressionTest0.java and rerun the above commands.
