# Please let me know if there are any problems making this work properly I spent probably 8 hours screwing with maven 
# Send me an email at dringb@oregonstate.edu and I can help you with any confusion

# ---------------------------------------------------------


Brandon Dring implementation of Dominion CS 362

Run commands from here (where pom.xml is currently)

### Compile: mvn compile 
### Clean(Please do before any commands): mvn clean 
### Build it all together: mvn package
### Run Tests: mvn test 
### Generate code coverage using: mvn cobertura:cobertura (Doesn't show code coverage files for some reason)
### To run the command line game: move from the dominion folder to src folder so 
```cd src``` then ```java RunMe/PlayDominion```



Or since I CAN get it to work in Eclipse 
```mvn eclipse:eclipse```  then run the RunMe version as PlayDominion

Then open eclipse and select File, Import and General, Existing projects to workspace, go to
the Dominion folder and press OK    


