The main directory structure is the same as the last assignment. All of my code is in the src. 
To run the test suite, if you do not have maven 3.1 or newer installed, run the evosuite from my 
maven directory (Cunardr\apache-maven-3.3.9\bin) and run mvn evosuite:generate. From the same directory,
run mvn evosuite:export. Finally run cobertura (mvn cobertura:cobertura) for code coverage.