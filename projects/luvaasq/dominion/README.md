mvn clean //Clean up
mvn compile //Compile
mvn package //Package
java -cp target/dominion-1.0-SNAPSHOT.jar dominion.PlayGame //Play game
mvn test //Run unit tests
To get coverage:
mvn jacoco:report
Open file "index.html" in /target/site/jacoco

Or run this line:
mvn clean; mvn compile; mvn package; java -cp target/dominion-1.0-SNAPSHOT.jar dominion.PlayGame; mvn jacoco:report 