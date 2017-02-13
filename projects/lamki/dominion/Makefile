ALL_FILES = src/main/java/dominion/Dominion.java src/main/java/dominion/Player.java src/main/java/dominion/Game.java src/main/java/dominion/Card.java src/main/java/dominion/Treasure.java src/main/java/dominion/Adventure.java src/main/java/dominion/Victory.java

default: all
#src/main/java/dominion/
all: $(ALL_FILES)
	mvn compile
	javac -d . $(ALL_FILES)
	echo Main-Class: dominion.Dominion > dominion/manifest.txt
	jar cvfm lamki_dom.jar dominion/manifest.txt dominion/*.class
	chmod +x lamki_dom.jar

run: all
	java -jar lamki_dom.jar

tests:
	mvn test

coverage:
	mvn cobertura:cobertura site

clean:
	mvn clean
	rm -f -rf dominion/
	rm -f lamki_dom.jar