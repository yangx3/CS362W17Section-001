JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
			 dominion.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
