### ASSIGNMENT 2 ###

The Randoop test suite report has been pregenerated and can be found in the Randoop_Cobertura_Report folder.
The random tester test suite code report has been pregenerated and can be found in the Random_Test_Report folder.

Running the random testing apparatus WITH randoop RegressionTests:

While within the “dominion” folder
- mvn clean
- mvn cobertura:cobertura

Testing the random tester by itself will require the RegressionTests to be deleted from the src/test/java/cs362/dominion folder before running “mvn clean” described above. Running cobertura will test and generate the code coverage report in one go.

