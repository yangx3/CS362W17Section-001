Chris Vlessis 
CS 362 Assignment #1

GENERAL: 
 - All commands should be ran in the /CS362W17Section-001/projects/vlessisc/dominion directory
 - Maven Version: 3.3.9
 - Java Version: 1.8.0_65
 - Pre-compiled cobertura coverage report is available in coverage-report/index.html

BUILD PROJECT:
 - mvn clean
 - mvn compile
 - mvn package

RUN GAME SIMULATION:
 - *build project*
 - java -jar ./target/dominion-1.0-SNAPSHOT.jar 

RANDOOP TEST GENERATION
- *build project* 
- Run the following command from the vlessisc directory:
- java -ea -classpath ./dominion/target/*:./randoop-3.0.8/randoop-all-3.0.8.jar randoop.main.Main gentests --classlist=./randoop-3.0.8/test_classes.txt --outputlimit=5000 --junit-output-dir=./dominion/src/test/java --junit-package-name=cs362.dominion.Randoop

BUILD COBERTURA REPORT:
 - *build project*
 - mvn cobertura:cobertura
 - html reports can be viewed in the file: target/site/cobertura/index.html



 