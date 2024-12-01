# KSU SWE 3643 Software Testing and Quality Assurance Semester Project: Web-Based Calculator

You will find a web-based calculator that performs calculation such has mean, standard deviations and linear regressions.
It includes back and frontend logic with unit tests, a user interface, end-to-end playwright testing and documentation and videos
to guide usage and testing.

## Table of Contents

-[Team Members](#team-members)<br>

-[Architecture](#architecture)<br>

-[Environment](#environment)<br>

-[Executing the Web Application](#executing-the-web-application)<br>

-[Executing Unit Tests](#executing-unit-tests)<br>

-[Reviewing Unit Test Coverage](#reviewing-unit-test-coverage)<br>

-[Executing End-To-End Tests](#executing-end-to-end-tests)<br>

-[Final Video Presentation](#final-video-presentation-)<br>


## Team Members

Rafay Hassan

## Architecture

The diagram below outlines the architecture of the Web-Based Calculator that incorporates unit testings and end-to-end
testing frameworks that are structured as follows:
<br>
-Calculator End-to-End Tests (Playwright)<br>
-Calculator Logic Unit Tests (JUnit)<br>
-Calculator Logic Package<br>
-Calculator Web Server App<br>
-Browser Integration<br><br>

![Test](images/Architecture.png)

## Environment

To prepare your environment to execute this application:<br>
1. Install Java (version 21+) for your system: https://www.oracle.com/java/technologies/downloads/
<br><br>
To check if you have java installed onto your machine, run this command on the command terminal:
<br><br>
![Test](images/Java%20download.PNG)
<br><br>
2. Install Apache Maven for your system: https://maven.apache.org/download.cgi
<br><br>
To check if you have Maven installed onto your machine, run this command on the command terminal:
<br><br>
![Test](images/Maven%20Downloaded.PNG)

## Executing the Web Application
1. Locate the file path containing the main pom.xml file.<br>
2. Open the command prompt
3. Paste the file path onto the command line like this "cd [file path]"

## Executing Unit Tests

## Reviewing Unit Test Coverage

![Test](images/Coverage.PNG)

## Executing End-To-End Tests

To execute end-to-end testing from the command line. Make sure that:<br>
1. The Web Application is running<br>
2. Copy the file path where the "test" folder is located<br>
3. Open the command prompt and type "cd [Paste File Path]"<br>
4. Finally, type "mvn -Dtest=TestCalculatorLogic test"<br><br>

End result should look like this:<br><br>
![Test](images/e3e%20command%20pass.PNG)

## Final Video Presentation 