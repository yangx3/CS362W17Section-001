Everything is under the Dominion folder. 
Once there, you should be able to run all maven commands, just like normal.

Generate reports with: mvn cobertura:cobertura.
Run tests (all tests, including EvoSuite ones) with mvn test

There are seperate sub directories within the Dominion folder that
contain the Cobertura reports for:
 
  -Only EvoSuite tests

  -Only my RandomDominionTest

  -All tests (including mine from Assignment 1)


There is also the ESTests subdirectory, which contains my EvoSuite tests. 
Note that the tests are also with my others in the

normal src/tests/java/cs362/dominion folder with my other tests, 
but I put them here for ease of access as well.

Please ignore all other folders in Dominion. I accidentally added them, and am
working on finding a way to delete them without deleting each and every file manually.