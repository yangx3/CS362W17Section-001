Maven project that uses pitest to run a random tester on the dominion code. It generates mutations for the code that should be caught by
the tests, assuming they are thorough. It generates a report that describes mutation coverage, which shows how many mutations were caught
and how many were not. This ratio is also known as mutation coverage.

To run the code:
Code can be run using standard Maven commands. 
To run tests: mvn test
To run mutation coverage tool: mvn org.pitest:pitest-maven:mutationCoverage
