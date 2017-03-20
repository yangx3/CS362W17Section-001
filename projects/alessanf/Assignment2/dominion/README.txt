This code uses cobertura and evosuite.

While the evosuite test file is already in the test folder, if you want to regenerate it, type:
mvn evosuite:generate
mvn evosuite:export

though, the test files will have errors that state NoClassDefFound error. To fix it, go to all _ESTEST.java file and change seperateClassLoader = True to separateClassLoader = false.

To compile without regenerating, just type:

mvn test

To get the code coverage, type:

mvn cobertura:cobertura

the folder is located in ./target/site/