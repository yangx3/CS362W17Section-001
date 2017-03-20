all:
	echo "Use clean, test, build, coverage, or run."
clean:
	mvn clean
test:
	mvn test
build:
	mvn package
coverage: clean
	mvn cobertura:cobertura
run:
	java -jar target/willmetl-1.0-SNAPSHOT.jar
pit:
	mvn org.pitest:pitest-maven:mutationCoverage
evosuite:
	mvn -DmemoryInMB=2000 -Dcores=2 evosuite:generate evosuite:export  test

# Run a specific test:
#	mvn -Dtest=PlayerTest#testActionPhase test

# Test a specific class:
# mvn clean test -Dtest=classname
