#!/bin/bash

if [ "$1" == "game" ]
then
	mvn compile
	clear
	mvn exec:java
fi

if [ "$1" == "test" ]
then
	mvn test-compile
	mvn cobertura:cobertura
fi

exit 0
