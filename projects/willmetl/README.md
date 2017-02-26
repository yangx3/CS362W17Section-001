Project folder for Levi Willmeth, CS372 Winter 2017.

Run commands from projects/willmetl (where pom.xml lives)

mvn compile
mvn clean
mvn package
mvn test
mvn validate

Run only a specific test:
mvn -Dtest=RandomTestDominion.java test

Generate new code coverage report using:
mvn cobertura:cobertura
