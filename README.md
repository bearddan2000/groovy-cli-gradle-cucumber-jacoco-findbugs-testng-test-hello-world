# groovy-cli-gradle-cucumber-jacoco-findbugs-testng-test-hello-world

## Description
Analyze source code for potential bugs.
A POC for gradle app using TestNG.
Uses cucumber plugin that publishes
report online. Jacoco dumps to `reports`.

## Tech stack
- groovy
- gradle
	- spotbugs
  - testng
  - jacoco 
  - cucumber

## Docker stack
- gradle:jdk11

## To run
`sudo ./install.sh -u`

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
[Build code](https://github.com/eugenp/tutorials/blob/master/gradle/gradle-cucumber/build.gradle)
