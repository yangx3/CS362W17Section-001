ALL_FILES = card.java player.java main.java 

default: all

all: $(ALL_FILES) gilesbr 		#compile all items
	mvn compile
	
	

gilesbr: $(ALL_FILES) 		#compile game into executable 
	javac -d . $(ALL_FILES)
	echo Main-Class: dominion.Dominion > manifest.txt
	jar cvfm gilesbr.jar manifest.txt
	chmod +x gilesbr.jar

run: gilesbr_go #run game
	java -jar gilesbr.jar

tests: all #run tests
	mvn test

coverage: all 				#run tests with coverage
	mvn cobertura:cobertura site

clean: 					#clean dir
	mvn clean
	rm -f gilesbr.jar
