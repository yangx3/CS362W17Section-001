Source files:
	found in src/main/java/com/mycompany/dimc_dominion
Test files:
	src/test/java/com/mycompany/dimc_dominion
To compile:
	mvn compile

To generate Randoop tests:
	for all classes
	java -ea -cp target/classes:randoop-all-3.0.8.jar randoop.main.Main gentests --classlist=myclasses.txt --junit-output-dir=src/test/java/com/mycompany/dimc_dominion --timelimit=20

	for testing one class, replace --classlist=myclasses.txt with
	--testclass=com.mycompany.dimc_dominion.PlayDominion

	to use chosen literals in TestValues.txt, add this option
	--literals-file=TestValues.txt


To run tests:
	mvn test
To see coverage:
	mvn cobertura:cobertura site
HTML reports:
	found in folder "CoverageSummaries" or target/site/cobertura
