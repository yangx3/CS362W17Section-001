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
instructions above.




