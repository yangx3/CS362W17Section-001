My dominion file

Main in src contains the files for the game logic.
Test in src contains the handmade junit tests and the evosuite generated tests.

The code is compiled using:
  mvn clean
  mvn compile
  mvn package
  
The code coverage is made by using:
  mvn cobertura:cobertura
