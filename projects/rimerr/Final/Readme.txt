Meant to be ran with maven 3.1 or higher

Run pitest mutation testing:
mvn org.pitest:pitest-maven:mutationCoverage

coverage will be in target/pit-reports

compile with mvn package

the jar will be in the target directory
run with java -jar Dominion-1.0-SNAPSHOT.jar
This will run RandomTestDominion

run the evosuite tests with mvn cobertura:cobertura
the code coverage file is /target/site/cobertura/index.html

