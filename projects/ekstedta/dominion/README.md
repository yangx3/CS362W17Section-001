To compile dominion and run the tests:

    mvn compile test

To run the random tester:

    mvn compile java:exec

To generate a coverage report:

    mvn site

(The generated report will be in the target/site/cobertura directory)

To generate evosuite tests:
    
    mvn evosuite:generate
    mvn evosuite:export

(You must have Maven 3.1 or greater.)
