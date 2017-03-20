## If you have any troubles please email me at dringb@oregonstate.edu or call at 541-510-5034 everything is working fine on my machine, and school server,I would hate to lose points for something so silly

### To look at produced EvoSuite Files type ```cd src/test/java/dominion``` then look for EST files

### Before you clean everything take a look at the cobertura report
## Make sure all commands are ran from where pom.xml is
### Clean maven files 
#### ```mvn clean```

### Compile all maven files 
#### ```mvn compile```

### Test my Junit tests && EvoSuite tests
#### ```mvn tests```

### Generate new Code report 
#### ``` mvn cobertura:cobertura```

### Play game if it goes into an infinite loop please retry, crazy bug I can't find
#### ```cd src/main/java && java dominion/playDominion```
