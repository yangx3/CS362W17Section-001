The Index html files are teh Code Coverage for my tests (I used Maven through the IntelliJ IDE)
I decided to combine all of my Tests into One big TestSuite Java file under src/test/java/org/cs362/dominion

How to Run the code on Unix System:
1. Copy All Files and Folders over. 
2. cd your way into this folder (Where the readme.txt and the pom.xml is)
3. mvn compile
^^^^^^^ Compiles maven
4. mvn test
^^^^^^^^ Runs the Unit tests for Dominion
5. Code should exit with 8 unit tests, 0 failures, 0 erros and 0 skips.

6. In order to run just the Dominion Game:

7. From the Source Folder (Inside src/main/java/org/cs362/dominion where the java files are)
8. javac *.java
// Compile all java files
9. java org.cs362.dominion.PlayDominion
// Run PlayDominion Using the shared org package.
10. Play Dominion Should now run through a short 3 turn game.
