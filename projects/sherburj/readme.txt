In order to generate the tests you need to run:

mvn clean      //Cleans and gathers packages

mvn compile

mvn evosuite:help   //Gathers dependency packages


mvn evosuite:generate    //Generates cases. I would highly recomend skipping this step

mvn evosuite:export    //Also unnecessary, these take time, and are already generated


mvn test   //usually results in a build failure, but still generates code coverage. See fixes below.




In Card_ESTest  you must comment out the import line that is:

    import org.evosuite.testcase.execution.CodeUnderTestException;
        (if you generated new ones)

    

Additionally, you must change this line in every generated file:

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)

    

change: separateClassLoader = true      to: separateClassLoader = false





Homework 2 is the whole projects/sherburj directory you are in. There is a 
randomTestDominion file in the
repository. It literally does nothing because
the random functionality is built into the original game. 
Both will accomplish 
the same goal, so just run it as normal. (I'm just satisfying the assignment specifications)






Code coverage was generated using intellij. You install it, import the project, 
and click run dominion
with code coverage.....



after that if you want a HTML, click analyze, and generate coverage report....






The generated report is in /CODE COVERAGE INDEX HTML
to view the HTML dub-click on index.html


Good luck, have an awesome day!




::::FINAL PROJECT::::


For the final project you will need to open up your command prompt and navigate to this here folder. 
Make sure your Maven path is set up correctly, there are directions in Maven for this, additionally:

set PATH="c:\program files\apache-maven-3.x.y\bin";%PATH%

  

Change 3.x.y to your maven version........


Onward to PiTest! Run these commands:

mvn clean      
mvn compile

mvn test
mvn org.pitest:pitest-maven:mutationCoverage

The resulting coverage should output to CS362W17Section-001\projects\sherburj\target\pit-reports

Additionally, you may veiw my two PiTests which correlate to:
testing w/ assignement 1 parameters        and
testing w/ evosuite + enhanced tests.

