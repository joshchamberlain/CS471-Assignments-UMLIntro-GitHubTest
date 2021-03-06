[![Build Status](https://travis-ci.com/joshchamberlain/CS471-Assignments-UMLIntro-GitHubTest.svg?branch=master)](https://travis-ci.com/joshchamberlain/CS471-Assignments-UMLIntro-GitHubTest)
[![Maintainability](https://api.codeclimate.com/v1/badges/8cf468943cd5ac233366/maintainability)](https://codeclimate.com/github/joshchamberlain/CS471-Assignments-UMLIntro-GitHubTest/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/8cf468943cd5ac233366/test_coverage)](https://codeclimate.com/github/joshchamberlain/CS471-Assignments-UMLIntro-GitHubTest/test_coverage)
[![Test status](http://teststatusbadge.azurewebsites.net/api/status/joshchamberlain/cs471-assignments-umlintro-githubtest)](https://ci.appveyor.com/project/joshchamberlain/cs471-assignments-umlintro-githubtest/build/tests)
[![Coverity Scan](https://scan.coverity.com/projects/16430/badge.svg)](https://scan.coverity.com/projects/joshchamberlain-cs471-assignments-umlintro-githubtest)
[![Sonar Code Smells](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=code_smells)](https://sonarcloud.io/component_measures?id=edu.boisestate.cs471%3Asorting&metric=code_smells)
[![Sonar LOC](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=ncloc)](https://sonarcloud.io/component_measures?id=edu.boisestate.cs471%3Asorting&metric=ncloc)
[![Sonar Maintainability](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=sqale_rating)](https://sonarcloud.io/component_measures?id=edu.boisestate.cs471%3Asorting&metric=sqale_rating)
[![Sonar Build Status](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=alert_status)](https://sonarcloud.io/dashboard?id=edu.boisestate.cs471%3Asorting)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=security_rating)](https://sonarcloud.io/component_measures?id=edu.boisestate.cs471%3Asorting&metric=security_rating)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=vulnerabilities)](https://sonarcloud.io/component_measures?id=edu.boisestate.cs471%3Asorting&metric=vulnerabilities)


# CS471-Assignments-UMLSorting
This Java GUI application visualizes various sorting algorithms.

## Building and Running
This repository is an Eclipse project and should be easily imported and build within the [Eclipse Oxygen IDE](https://www.eclipse.org/oxygen/).

The project is configured to use [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html).

### 1. Get the Code
Clone this repository to your local computer in the folder `<CS471-Assignments-UMLSorting>`.

### 2. Import the Project into Eclipse
 * Open Eclipse
 * From the main menu bar, select `File > Import...` to open the import wizard (see below).

 ![Import Wizard](./doc/screenshots/eclipse-import-wizard.png)

 * Select the directory you created when cloning the code in Step 1 (i.e., `<CS471-Assignments-UMLSorting>`).
 * Click `Finish`
 
Refer to the offical Eclipse [help documentation](http://help.eclipse.org/oxygen/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2Ftasks%2Ftasks-importproject.htm) for more details about importing a project into Eclipse.

### 3. Build
If you do not have Eclipse configured to automatically build projects, then use the menu option `Project > Build Project` to build it.

### 4. Run
A [run configuration](./CS471-Assignments-UMLSorting.launch) is included. It allows you to use the use the toolbar to launch the program.

![RunToolbar](./doc/screenshots/eclipse-toolbar.png)

Click the dropdown on the toolbar to click the configuration to launch the program.

![RunConfiguration](./doc/screenshots/eclipse-run-program.jpg)

Once the program is ran successfully, you should see a window similar to the following:

![Screenshot](./doc/screenshots/bubble-sort.png)

## Documentation
### JavaDoc
You can build the JavaDoc using complicated options in Eclipse, or simply run the provided ant script ([javadoc.xml](./javadoc.xml)) using:
```bash
ant -f javadoc.xml
```
This command creates the documentation in `<CS471-Assignments-UMLSorting>/doc/javadoc/`. To view the documentation, open the following file in a browser:
    `<CS471-Assignments-UMLSorting>/doc/javadoc/index.html`
    
### Sequence Diagrams
See the [sequence diagram README](./doc/sequence-diagrams/README.md) for examples and instructions for creating sequence diagrams.
