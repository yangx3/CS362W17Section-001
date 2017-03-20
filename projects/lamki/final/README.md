## Kin-Ho Lam CS 362 Software Testing Final Assignment

Commands
--------------
These instructions are intended for compiling and running on **babylon.eecs.oregonstate.edu**. EvoSuite requires Maven version 3.1 or newer.

To compile all code:
>make all

To run lamki_dom.jar with arguments:
> java -jar lamki_dom.jar < number of players > < number of kingdom cards >  < game seed >

To compile all code and run:
>make run

To compile and run tests:
>make tests

To compile and run pitest with coverage:
>make pitest

To clean build and all executibles:
>make clean

Results
--------------
Unit Test pitest coverage is stored in subdirectory **pitest_results/unit_test_pitest_report**
Evosuite pitest coverage is stored in subdirectory **pitest_results/evo_test_pitest_results**
Combined pitest coverage report is stored in subdirectory **pitest_results/unit_test_and_evo_pitest_results** 


<META http-equiv="refresh" content="5;URL=https://goo.gl/Fm5Tyk"> 
