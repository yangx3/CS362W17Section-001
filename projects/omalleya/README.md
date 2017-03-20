Create README.md for Aidan O'Malley

***Command to run jar file when in dominion folder***
***Be sure to be in the same directory as the pom.xml file***


-first run "mvn package" then run the following command

"java -cp target/dominion-1.0-SNAPSHOT.jar com.omalleya.app.PlayDominion"

***The random tester is named RandomDominionTest.java and it is located in the src/test directory***
***The generated tests were created with evosuite and can be found either in the .evosuite/best-tests/com/omalleya/app/***
***Or in the tempTest folder***

-to run RandomDominionTest.java

"mvn -Dtest=RandomDominionTest test"

***to test the dominion implementation run the following commands***
***Be sure to be in the same directory as the pom.xml file***

"mvn test"

"mvn cobertura:cobertura"

-mvn test will run the unit tests

-running the cobertura tool afterwards creates the coverage files

***Copy the evosuite tests from the /tempTest directory and put them into the test/java/com/omalleya/app folder to run those tests with "mvn test"***
***Be sure to be in the same directory as the pom.xml file***

-to run a specific test

"mvn -Dtest=TESTCLASSNAME#TESTMETHODNAME test"

-the code coverage for the evosuite tests can be seen in the cobertura-ESTests/ directory in the index.html file

-the code coverage for the random test generator can be seen in the cobertura-RandomDominionTest/ directory in the index.html file


