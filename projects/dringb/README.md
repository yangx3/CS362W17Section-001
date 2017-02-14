# Please let me know if there are any problems making this work properly I spent probably 8 hours screwing with maven 

## To get it to run the simple program I had to copy it to my personal repository
Link to my personal Repo that has the Dominion files : https://github.com/El-Dringo-Brannde/CS362_SoftwareEngineeringII/tree/master/TurnInHW1




Brandon Dring implementation of Dominion CS 362

Run commands from here (where pom.xml is currently)

Compile: mvn compile 
Clean(Please do before any commands): mvn clean 
Build it all together: mvn package
Run Tests: mvn test 

Run program: COULDN'T GET TO RUN ON MY SIDE
Constantly got errors such as ```no main manifest attribute, in ./target/Dominion-1.0-SNAPSHOT.jar```

or 
```Error: Could not find or load main class org.cs362.dominion.PlayDominion``` 

from what I am told it is as simple as 
java -jar ./target/dominion-1.0-SNAPSHOT.jar
or ```java -cp target/Dominion-1.0-SNAPSHOT.jar org.cs362.dominion.YourMainFileName```
or ```Java -cp ./target/classes/  org.cs362.dominion.YourMainFileName```


Generate code coverage using: mvn cobertura:cobertura
