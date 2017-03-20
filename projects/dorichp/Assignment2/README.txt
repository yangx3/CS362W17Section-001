ssuming Maven 3.3.9 is downloaded,
Assuming Java JDK1.8 is downloaded.


in windows cmd line
-Navigate to the "DOMINION V.F" file
-Navigate into "DOMINION"
	pom file should be there, with src
-type "mvn compile"
	"mvn package"

Then either run the jar file for testing or the dominion code. Or run a Maven Test on it with
"mvn test"

*IN ORDER TO VIEW COBERTURA COVERAGE REPORT YOU MUST MANUALLY RUN THE COBERTURA TOOL*
Assuming Cobertura coverage tool is installed:
	To run code coverage:
	"mvn cobertura:cobertura"
	index file is located in
	target->site->cobertura->index.

To run the EvoSuite Tests, manually put all of the tests in the EvoSuiteTests folder into the /src/test/java/ORG... folder with all of the other tests. 

Then in the same directory as the pom file, run:
	mvn test
OR, 

If you want to view the coverage that the evosuite shows, do:
	mvn evosuite:info
and it will show the coverage as it does in my pdf. 

*THESE INSTRUCTIONS ARE EXACTLY WHAT IS ON
THE SLIDES THAT ARE POSTED ON CANVAS.
THERE SHOULD BE NOTHING DIFFERENT ABOUT MY CODE*
