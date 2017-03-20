Maven project that uses EvoSuite to generate random tests to attempt to gain more code coverage. 

To run the code: Code can be run using standard Maven commands.

To run tests, including unit tests: mvn test

To get code coverage for EvoSuite's tests: 
mvn evosuite:generate
mvn evosuite:export 
mvn test (cobertura:cobertura) to generate report
