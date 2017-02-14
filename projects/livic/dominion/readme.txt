#########
Compiling and running without code coverage:
- mvn compile
- mvn test-compile
- mvn package

Testing (no code coverage tool):
-- mvn test -Dtest=CardTest
-- mvn test -Dtest=PlayerTest

##########

Compiling and running WITH code coverage tool:
- chmod +x run.sh
- ./run.sh test

OR

- mvn test-compile
- mvn cobertura:cobertura


##########
CODE COVERAGE HTML is located in CODE_COVERAGE_REPORT, open index.html.
This code coverage HTML was generated with Cobertura.
