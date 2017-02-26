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
	xdg-open ./target/site/cobertura/index.html
run: 
	mvn package
	clear
	java -jar target/dominion-0.0.1-SNAPSHOT.jar
