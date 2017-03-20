## If you have any troubles please email me at dringb@oregonstate.edu or call at 541-510-5034 everything is working fine on my machine, and school server,I would hate to lose points for something so silly

### I have attached results of custom assert tests to main game look for ```Times passed custom asserts:``` at the bottom when running the game
### Before you clean everything take a look at the cobertura report
## Make sure all commands are ran from where pom.xml is
### Clean maven files 
#### ```mvn clean```

### Compile all maven files 
#### ```mvn compile```

### Test my Junit tests 
#### ```mvn tests```

### Generate new Code report 
#### ``` mvn cobertura:cobertura```

### Play game if it goes into an infinite loop please retry, crazy bug I can't find
#### ```cd src/main/java && java dominion/playDominion```
