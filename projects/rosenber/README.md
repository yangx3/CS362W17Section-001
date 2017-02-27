Project folder for Robert Rosenberger, CS362 Winter 2017


The following instructions assume Maven is installed with
the current version.


Assignment 1:

This folder contains all of the information for the first
assignment in the course. The instructions below will
describe how to compile, test, and generate a code
coverage report.

compile:
	mvn compile
	
test:
	mvn test
	
	- this will compile and run the tests for the program
	
coverage report:
	mvn cobertura:cobertura
	
	- this will compile, run tests, and generate the coverage
	- the coverage report is found in the following file
	target/site/cobertura/index.html
	
	
Assignment 2:

This folder contains all of the information for the second
assignment in the course. The instructions for working with
the program in this assignment are the same as the
instructions above. Inside this directory are two working
Dominion directories. One of these contains all of the tests
created by the Evosuite test generation tool. The other
contains the RandomTestDominion as well as the other manual
tests written during the last assignment. The code coverage
in the coverage directory is the coverage from the Evosuite
testing suite.

To access each portion of the program, you must go to the
subdirectory for each of the Dominion implementations. Each
contain their own POM to be run with Maven. To see the
Evosuite tests, enter the Dominion_Evosuite direction and
run Maven there. To see the RandomTestDominion with other
manual tests written, enter the other directory and use
Maven.




