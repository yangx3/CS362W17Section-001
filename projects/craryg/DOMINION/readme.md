README.md

Run in this order from the DOMINION/ folder.

# TO GET THE DOMINION JAR:
- "mvn dependency:list"
- "mvn compile"
- "mvn package"

# TO RUN THE JAR
- "java -jar target/DOMINION-1.0-SNAPSHOT.jar"

Note: It will blast through the game. Pipe the output to a file if you want to inspect it.

# Generating Extended EvoSuite TESTS
Note: This will take like 5 minutes.
mvn -DmemoryInMB=2000 -Dcores=2 evosuite:generate evosuite:export  test

# TO RUN THE TESTS
- "mvn test"

# TO GENERATE THE COBERTURA REPORT AND LOOK AT It
- "mvn cobertura:cobertura"
- "open target/site/cobertura/index.html"

Note: Replace open with whatever browser you want. Idk.
