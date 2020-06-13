# Automation PoC - Selenium + Cucumber

This repository contains the proof of concept related to the usage of Selenium (Java) with Cucumber, this PoC shows how are implemented these automation tools with a couple of simple test scenarios.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for testing purposes. Make sure to read the code, understand how it's implemented and play around, add, delete or modify steps to learn the capabilities of these tools. 
Note: This repository tested under Windows 10 OS requirements, all the software should be installed according this system to make it run properly. 

### Prerequisites

It is necessary to install below softwares to build the project:

- [Java 8 (JDK current verions 14.0.1)](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- [Git](https://git-scm.com/downloads)
- [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/)
- If there is a issue with the dependencies of cucumber or selenium (in the pom.xml file), add these external JARs:
	- [Cucumber Jars (the latest one on this date of creation)](https://mvnrepository.com/)
		- cucumber-core-6.0.0-RC2.jar
		- cucumber-java-6.0.0-RC2.jar
		- cucumber-junit-6.0.0-RC2.jar
		- cucumber-jvm-deps-1.0.6.jar
		- gherkin-13.0.0.jar
		- junit-4.13
		- mockito-all-1.10.19.jar
		- selenium-java
	- [Selenium Jars - Selenium Client & WebDriver Language Bindings](https://www.selenium.dev/downloads/)
Note: The dependencies version listed for cucumber and selenium might vary in the future of the upload if this PoC. Feel free to leave all the dependencies are they are to make the project run, and then update them all with the current stable versions at the time you are running this PoC.

### Run the Project
- Open a Windows Terminal
- Clone this repository or download the zip with the source code in to your local system
	- `$ git clone git@github.com:usersadok/selenium_cucumber.git`
- Navigate to this project
	- `$ cd selenium_cucumber`
- Run the command
	- `$ mvn test`

If everything is working correctly, you will see a browser window opening and doing some stuff. The output of the console will be something like this:
```
1 Scenarios (1 passed)
4 Steps (4 passed)
0m10.824s


Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 11.098 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  12.835 s
[INFO] Finished at: 2020-05-20T22:15:18-05:00
[INFO] ------------------------------------------------------------------------

```

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors
* **Israel G.** - *Initial work*