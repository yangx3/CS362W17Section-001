To compile for maven, go to directory CS362-SE2/projects/magenhej and run the following: 
	mvn clean 
	mvn compile
To generate random tests, run the following:
	mvn evosuite:generate
	mvn evosuite:export
To get code coverage, run the following:
	mvn cobertura:cobertura
The html test coverage will be placed in the directory CS362-SE2/projects/magenhej/target/site/cobertura
The evosuite will be placed in the directory CS362-SE2/projects/magenhej/.evosuite/best-tests/dominion