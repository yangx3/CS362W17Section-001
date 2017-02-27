##Assignment 2 for CS362

###About
The purpose of this assignment was to:
    * Generate some code using a testing suite
    * Compare that to the testing suite we wrote in Assignment 1
    * Write a *RandomTestDominion.java* to randomly test our dominion game

###File structure
The assignment is organized as follows:
    * assignment1
        1. screen shots of assignment 1 cobertura output included on the writeup
        2. dominion folder containing all the code from assignment 1

    * evosuite
        1. screen shots of the evosuite cobertura output included on the writeup
        2. dominion folder containing all the code generated from evosuite

    * manualRandomTests
        1. dominion folder containing all the tests from assignment 1 with the addition of the *RandomTestDominion.java*

    * coberturaOutput *(contains the cobertura output of the following:)*
        1. assignment1
        2. evosuite
        3. manualRandomTests

###Building instructions
For the assignment1, evosuite and manualRandomTests folders, the contents are only the *pom.xml* and the src folder containing the code needed to compile new versions

To build those versions, enter any of the folders and type *mvn test* to run the test
If you would like to build the cobertura output, type *mvn cobertura:cobertura* and it will build the html files. The web file will be found in *target/site/cobertura/index.html*
