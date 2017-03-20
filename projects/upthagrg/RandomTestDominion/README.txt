The project is clean and will need to be compiled.
The implementation is a maven project, thus it can be compiled and packaged with mvn package, it can be cleaned with mvn clean, it can have a coverage report generated with mvn cobertura:cobertura and the test run through mvn test. The correct way to run the main program is:
i.	mvn package
ii.	java -cp target/RandomTestDominion-1.0.jar org.cs362.dominion.RandomTestDominion.RandomTestDominion 
The Dominion folder is a folder containing a copy of assignment 1. there is a coverage report in target/site/cobertura called index.html 
The test cases are in src/test/java/org/cs362/dominion. 