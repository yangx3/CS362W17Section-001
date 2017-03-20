Used randoop as my test generator. It doesn't create any tests for some reason.

To run randoop:

java -ea - classpath target/classes:randoop-all-3.0.9.jar randoop.main.Main gentests --classlist=myclasses.txt
