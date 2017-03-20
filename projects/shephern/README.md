Maven Compiling:

mvn compile
mvn package

For running Base Dominion:
java -jar ./target/PlayDominion.jar

For running RandomTestDominion:
java -jar ./target/RandomTestDominion.jar

For coverage, will include Evosuite Generated:
mvn cobertura:cobertura

HTML will be in target/site/cobertura as index.html
