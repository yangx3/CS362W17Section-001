To compile:

mvn compile 

To run tests:

mvn test

To run cobertura:

mvn cobertura:cobertura

If mvn complains junit can not be found:

mvn dependency:list

Instructions:
run compile
then run tests
then run cobertura

html report is inside /target/site/cobertura/index.html
