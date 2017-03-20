#Directory for Ryan Murphy - CS 362

Path to Dominion Game: Dominion -> src -> main -> java -> org -> cs362 -> dominion
Path to test code: Dominion -> src -> test -> java -> org -> cs362 -> dominion
Path to Cobertura report: Dominion -> target -> site -> cobertura -> index
Path to EvoSuite generated reports: Dominion -> target -> surefire-reports
Path to Random Tester: Dominion -> src -> test -> java -> org -> cs362 -> dominion -> RandomTestDominionTest.java

Test code generated using search based testing tool: EvoSuite

Sources used for creating pom.xml file and configuring EvoSuite:

http://www.evosuite.org/documentation/tutorial-part-2/
https://piazza.com/class/ixh12gm0sow2i9

PLEASE DO NOT GENERATE NEW TESTS FROM EVOSUITE. They will most likely be incompatible with
Maven when initially created. 

The following line in Card_ESTest.java was causing a BUILD FAILURE so I commented it out:
import org.evosuite.testcase.execution.CodeUnderTestException;

The EvoSuite test ran successfully after that

To run with Maven:

-mvn compile
-mvn test
-mvn cobertura:cobertura

