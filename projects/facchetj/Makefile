all:
	echo "Use clean, assignment1, build, coverage, run, evo or rando."
clean:
	mvn clean
test:
	cp testJunit/* src/test/java/dominion/
	mvn package
	mvn clean 
	clear
	mvn test
	mvn cobertura:cobertura
	xdg-open ./target/site/cobertura/index.html
	rm src/test/java/dominion/*
build:
	mvn package
assignment1: 
	cp testJunit/* src/test/java/dominion/
	mvn package
	mvn clean 
	clear
	mvn test
	mvn cobertura:cobertura
	xdg-open ./target/site/cobertura/index.html
	rm src/test/java/dominion/*
run: 
	mvn package
	clear
	java -jar target/dominion-0.0.1-SNAPSHOT.jar
evo:
	mvn clean
	mvn package
	clear
	mvn evosuite:export
	mvn package
	mvn test
	mvn cobertura:cobertura
	xdg-open ./target/site/cobertura/index.html
	rm src/test/java/dominion/*
	
rando:
	mvn clean
	cp RandomTester/* src/test/java/dominion/
	mvn package
	clear
	mvn test
	mvn cobertura:cobertura
	xdg-open ./target/site/cobertura/index.html
	rm src/test/java/dominion/*
	
newsuite:
	mvn -Dcores=4 -DmemoryInMB=4000 evosuite:generate
	

	
