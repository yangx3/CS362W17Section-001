This is the project folder for Henry Fowler


Assignment 1 (In Assignment1 directory):
Instructions for compiling and running dominion game:

1) Navigate to directory that contains maven src folder
2) mvn package (This will run the unit tests)
3) After doing mvn package use java -cp target/dominion-1.0-SNAPSHOT.jar PlayDominion to run the game without the unit tests
4) To get code coverage use mvn jacoco:report and the html file will be located in target\site\jacoco folder

Assignment 2 (In Assignment2 directory):

In the assignment 2 folder there is a dominion folder and a code coverage folder. 
In the dominion folder is a maven src directory which contains all of the code files for the dominion project.

To run tests:
1) Navigate to directory that contains maven src folder
2) mvn package (This will run the unit tests)

To execute RandomTestDominion:
3) After doing mvn package use java -cp target/dominion-1.0-SNAPSHOT.jar RandomTestDominion to run the random tester

For Code Coverage:
4) To get code coverage use mvn jacoco:report and the html file will be located in target\site\jacoco folder
