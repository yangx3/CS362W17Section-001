
ALL_FILES = src/main/java/com/mycompany/marksprousedominion/boardState.java  src/main/java/com/mycompany/marksprousedominion/kingdomCard.java  src/main/java/com/mycompany/marksprousedominion/playDominion.java  src/main/java/com/mycompany/marksprousedominion/treasureCard.java  src/main/java/com/mycompany/marksprousedominion/victoryCard.java  src/main/java/com/mycompany/marksprousedominion/Card.java  src/main/java/com/mycompany/marksprousedominion/main.java  src/main/java/com/mycompany/marksprousedominion/Player.java  src/main/java/com/mycompany/marksprousedominion/turnState.java 

default: all

all: $(ALL_FILES) sprousem_dom #compile all items
	mvn compile



sprousem_dom: $(ALL_FILES) #compile game into executable 
	javac -d . $(ALL_FILES)
	echo Main-Class: com.mycompany.marksprousedominion.main > com/mycompany/marksprousedominion/manifest.txt
	jar cvfm sprousem_dom.jar com/mycompany/marksprousedominion/manifest.txt com/mycompany/marksprousedominion/*.class
	chmod +x sprousem_dom.jar

run: sprousem_dom #run game
	java -jar sprousem_dom.jar 2 10

evo: mvn_comp
	mvn -Dtest=RandomTestDominion test cobertura:cobertura site

tests: all #run tests
	mvn test
pitest: 
	mvn org.pitest:pitest-maven:mutationCoverage

coverage: all #run tests with coverage
	mvn cobertura:cobertura site

clean: #clean dir
	rm -f -rf dominion/
	rm -f sprousem_dom.jar
	mvn clean
#	mvn evosuite:clean

