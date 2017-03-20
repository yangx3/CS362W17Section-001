To build the package, simply use the following commands:
mvn clean
mvn compile
mvn package

To generate the randoop test:
java -ea -classpath target/classes:randoop-all-3.0.9.jar randoop.main.Main gentests --classlist=testClasses.txt

To generate the html report:
mvn jacoco:report

To run RandomDominionTest:
java -cp target/dominion-1.0-SNAPSHOT.jar dominion.RandomTestDominion
