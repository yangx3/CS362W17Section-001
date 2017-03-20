#Make sure to remove random tests (RegressionTest.java and RegressionTest0.java) from /src/test/ before getting mutation coverage for unit tests!
#For testing my mutation coverage from unit tests, "testCards.java" should be only /src/test/ file.
mvn clean #Clean up
mvn compile #Compile
mvn package #Package
mvn test #Run unit tests

#Get mutation coverage
mvn clean; mvn compile; mvn package; mvn org.pitest:pitest-maven:mutationCoverage
Open file "index.html" in /target/pit-reports/***/index.html

#To get coverage:
mvn jacoco:report
Open file "index.html" in /target/site/jacoco

#Create random tests and copy them to the Jacoco test directory:
java -classpath target/classes:randoop-all-3.0.9.jar randoop.main.Main gentests --classlist=myTests.txt --timelimit=60; cp RegressionTest* src/test/java/com/cs362/dominion/
mvn org.pitest:pitest-maven:mutationCoverage
