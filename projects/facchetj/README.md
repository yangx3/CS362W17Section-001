files for software engineering 2

DO NOT REMOVE ANY FOLDER
DO NOT REMOVE ANY FOLDER
DO NOT REMOVE ANY FOLDER
DO NOT REMOVE ANY FOLDER
DO NOT REMOVE ANY FOLDER

To create the coverage report, just use the following commands, the report will be open with the default browser in linux, if you dont use linux, it will be in target/site/cobertura/index.html

To clean use "make clean"

To build use "make build"

To run use "make run"

To test with the classics tests (assignment 1) use "make test"

To run the random test use "make rando"

To run the evosuite generated test suite use "make evo"

To run the tests from assignment 1 use "make assignment1" 

To build a new test suite use "make newsuite" OR "mvn -Dcores=5 -DmemoryInMB=12000 evosuite:generate" if your computer has more than 12G of RAM

The coverage report will be in ./target/site/cobertura/index.html

With LINUX :
	the report will be automatically open in the browser
