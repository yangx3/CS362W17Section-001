COMPILING

To compile this project, run go to the Dominion directory and run "mvn package"

EXECUTING

To execute the program, run "java -jar target/Dominion-1.0-SNAPSHOT.jar"

TESTING

A code coverage report will be automatically generated with "mvn package", the results located in target/site
To rerun tests, execute the command "mvn jacoco:report"

RANDOM TESTING

To generate a suite of random unit tests, run "mvn eovsuite:generate", then "mvn evosuite:export". The generated
tests will be located in "src/test/java/org/cs362/dominion/".
