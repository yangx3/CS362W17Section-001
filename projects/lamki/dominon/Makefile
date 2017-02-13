ALL_FILES = Dominion.java Player.java Game.java Card.java Treasure.java Adventure.java Victory.java

default: all

all: $(ALL_FILES)
	javac -d . $(ALL_FILES)
	echo Main-Class: dominion.Dominion > dominion/manifest.txt
	jar cvfm lamki_dom.jar dominion/manifest.txt dominion/*.class
	chmod +x lamki_dom.jar

run: all
	java -jar lamki_dom.jar

tests: all
	cp -R dominion/*.class tests/
	#cp -R *.java tests/
	javac -cp .:tests/lib/junit-4.12.jar:tests/lib/hamcrest-core-1.3.jar tests/*.java
	java -cp .:tests/lib/junit-4.12.jar:tests/:. org.junit.runner.JUnitCore DominionTest

clean:
	rm -f -rf dominion/
	rm -f *.class
	rm -f tests/*.class
	rm -f tests/Dominion.java
	rm -f tests/Player.java
	rm -f tests/Game.java
	rm -f tests/Card.java
	rm -f tests/Treasure.java
	rm -f tests/Adventure.java
	rm -f tests/Victory.java
	rm -f lamki_dom.jar