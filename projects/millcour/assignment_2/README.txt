Structure of files:

The Evosuite file contains:
	-the src file for a maven project
		-the code can be found in main/java/dominion
		-the tests can be found in test/java/dominion
	-the pom file necessary to run the code
	 this folder will run the evosuite tests that were generated
	
The Dominion file contains:
	-the src file for a maven project
		-the code can be found in main/java/dominion
		-the tests can be found in test/java/dominion
	-the pom file necessary to run the code
	-this folder will run the unit tests from the first assignment
	 as well as the random tester that was written for this assignment
	

RUNNING THE CODE:

To run unit and random tests:
	-be in the millcour/assignment_2/Dominion folder
	-compile with --mvn compile and then --mvn package
	-run tests with --mvn test
	-create code coverage with mvn cobertura:cobertura
	
	-if you want to generate more evosuite tests for this folder:
		-generate with --mvn compile evosuite:generate evosuite:export
		-run with --mvn test
		
To run the already generated evosuite tests:
	-change into the millcour/assignment_2/EvosuiteDominion folder
	-compile with --mvn compile and then --mvn package
	-run tests with --mvn test
	-create code coverage with mvn cobertura:cobertura
		-the output will be found in target/site/cobertura\index.html


CODE COVERAGE
	-the code coverage of the unit tests alone can be found in
       the folder millcour/assignment_2/CodeCoverageUnit
	-the code coverage of the evosuite tests alone can be found
       in the folder millcour/assignment_2/CodeCoverageEvosuite
	-the code coverage of the random tester along can be found
       in the folder millcour/assignment_2/CodeCoverageRandom
	-the code coverage of all the tests together can be found
       in the folder millcour/assignment_2/CodeCoverageAll

	-open the index.html file in each of these folders to view coverage


**In the Dominion folder, the mvn package will show build failure due to 
  the five errors left in the code from assignment 1 that are causing the
  unit tests to fail.  