##Kin-Ho Lam Software Testing Assignment 2

These instructions are intended for compiling and running on **babylon.eecs.oregonstate.edu**. 

To compile all code:
>make all

To run lamki_dom.jar with arguments:
> java -jar lamki_dom.jar < number of players > < number of kingdom cards >  < game seed >

To compile all code and run:
>make run

To compile and run evosuite tests: (Requires Maven 3.1)
>make evo

To compile and run tests:
>make test

To run RandomTestDominion with coverage report:
>make rndtest

To compile and run test with coverage:
>make coverage

Cobertua coverage webpage is stored in subdirectory **target/site/cobertura/**

To clean build and all executibles:
>make clean

note: Running Evosuite requires an updated maven.
