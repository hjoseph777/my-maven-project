# Java using Maven

This is a simple Maven Java project structured to demonstrate the basic setup of a Java application. Scroll down to see the flowchart and hierarchy  diagram of the project.

Painting Company Application

## Overview

The Painting Company Application is designed to assist with calculating the amount of paint required for painting a room, as well as the associated labor and cost. It takes into account the room's dimensions, the dimensions of doors and windows, and the price of paint per gallon. The program then calculates the total paint required, labor hours needed, and the overall cost of the painting job.

## Files

### src/main/java/com/StartSample/PaintingCompany.java
This file contains the core logic and utility methods for the painting calculations. It includes methods to:

- **Get Room Dimensions**: Prompts the user to enter the height, width, and number of walls in the room and calculates the total wall area.
- **Get Door and Window Dimensions**: Prompts the user to enter the height, width, and number of doors and windows and calculates their total area.

- **Calculate Gallons Required**:
- **Calculate Labor Hours Required**
- **Calculate Costs**
- **Display Results**

### src/main/java/com/StartSample/PaintingCompanyApp.java
This file serves as the entry point for the application. It orchestrates the flow of the program by:

- **Collecting User Inputs**
- **Performing Calculations**
- **Handling Errors**

## Display Output

![image alt](https://github.com/hjoseph777/my-maven-project/blob/9ff872f7cbe92bf67c3e40efbd45dce7752d26b6/resultScreenshot%202024-09-24%20183731.png)

## Flowchart Diagram (double click to expand)

![image alt](https://github.com/hjoseph777/my-maven-project/blob/dd2ca721c8b56dca560fecdabe7d997f7dfc92fc/PaintCompanyFlowchart.png)

## Hierarchy Diagram 

![image alt](https://github.com/hjoseph777/my-maven-project/blob/ae8470bc5bcad8e411b9dda8441a7d487f4d1ab7/hierachyScreenshot%202024-09-24%20192047.png)


## Project Structure
```
my-maven-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── Main.java
│   │   └── resources
│   └── test
│       ├── java
│       └── resources
├── pom.xml
└── README.md




