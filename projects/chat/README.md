Touku Cha CS 362 Dominion Instructions:

mvn clean install

mvn package

mvn test

mvn cobertura:cobertura

If running Evosuite for the first time:

Where x = amount of ram, and y = number of cores.  Specify how much resources (fast) you want to generate and run the test.
mvn -DmemoryInMB=<x> -Dcores=<y> evosuite:generate evosuite:export test

Can run coverage with the suite again with: mvn cobertura:cobertura

Note: If you have Evosuite setup differently and can't run the suite please contact me: chat@oregonstate.edu
