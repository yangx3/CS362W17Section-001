Maven project that uses EvoSuite to generate random tests to attempt to gain more code coverage. index.html contains the coverage report.

To run the code:
Code can be run using standard Maven commands. 

To run tests, including unit tests: mvn test 

To get code coverage for EvoSuite's tests: mvn evosuite:export
                                            mvn test (optionally add cobertura:cobertura here for coverage)

To run/get code coverage for RandomTestDominion: mvn -Dtest=RandomTestDominion cobertura:cobertura
