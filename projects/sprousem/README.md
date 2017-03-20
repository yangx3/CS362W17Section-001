(Sprouse, Mark Mark) Winter 2017

Directory Structure:

src/main/.../ contains source code
src/test/.../ contains all tests {evosuite tests, randomtest, manualtests}
target/site/cobertura/index.html coverage report of tests

How to Compile:

In the same file as Makefile:

Compile all of the code:

>make all

Compile the code and run it:

>make run

Compile and run the tests:

>make tests

Compile and run the tests along with coverage:

>make coverage

NOTE: Cobertua coverage index.html is stored in subdirectory target/site/cobertura

Clean build and all of the executables:

>make clean

