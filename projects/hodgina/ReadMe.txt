Austn Hodgin 
HW1
ReadME.txt

NOTE: To see screenshots of the coverage tool Intelaj and the coverage took Cobertura that were in the write up, 
it should be in this directory called "Coverage Screenshots"


To compile and run tests:

Go into the folder called /Dominion 

To compile you will then Type "mvn compile"  That should compile the code 
into the target folder in the current directory. 

To run the code just type "mvn package" This should run the code as is without any tests

To run the tests stay in this directory and just type "mvn test" . This should run the tests contained in the files, Player_Test.java, Card_Test.java 
and GameState_Test.java

To Run Coverage Tool:

Make sure you are still in the directory of Dominion. There should be a pom.xml in the directory that you will need to run the maven commands.

To run the coverage tool just type "mvn cobertura:cobertura" This will generate a website in the target folder under site/index.html This will show the
coverage that was shown in the write up. 








NOTE: The Coverage Tools Used:

The coverage tools used in this project were Cobertura which will out put files into the \target\site\cobertura file path you will then want to 
select index.html and open it with a web browser

The Intelaj tool is located in the intelaj IDE. If you wish to try this you will need to run it from the application that can be downloaded from here
https://www.jetbrains.com/idea/download/#section=windows

Once you have it installed you will need to import the project as a maven project buy selecting the directory with my files and then selecting the pom.xml file
from there you will want to click on the test folder and build the project. 

Onec the project is built you will want to run it using the coverage tool that is built in. You can find this by right clicking each test and selecting
"Run "Which ever file" with Coverage" 

This should pop up with all the outputs and then the coverage of that test that was selected. 

