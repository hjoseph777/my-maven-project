# Java using Maven

This is a simple Maven's Java project structured to demonstrate the basic setup of a Java application. scroll down to see the flowchart  and hyerarchy  diagram of the project.

Painting Company Application

## Overview

The Painting Company Application is designed to assist with calculating the amount of paint required for painting a room, as well as the associated labor and cost. It takes into account the dimensions of the room, the dimensions of doors and windows, and the price of paint per gallon. The program then calculates the total paint required, labor hours needed, and the overall cost of the painting job.

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


![image alt](https://github.com/user-attachments/assets/1b200c5f-bec4-4207-938c-595150d30067)
