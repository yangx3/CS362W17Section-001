# CS362 W17 - Liv Vitale

## Running program
1) mvn install
2) mvn build
3) mvn package
4) mvn exec:java

## Generating EvoSuite Tests
1) mvn -Dcores=4 -DmemoryInMB=6000 -Duse_separate_classloader=false evosuite:generate
2) mvn evosuite:export
3) Set separateClassLoader = false in each *_ESTest file

## Running tests
1) mvn test
2) mvn cobertura:cobertura