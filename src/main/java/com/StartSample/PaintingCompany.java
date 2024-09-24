
package com.StartSample; // com.example;

import java.util.Scanner;



public class PaintingCompany {
    // Constants
    private static final int SQUARE_FEET_PER_GALLON = 300;
    private static final int LABOR_HOURS_PER_GALLON = 8;
    private static final double LABOR_RATE_PER_HOUR = 20.0;

    public static double getRoomDimensions(Scanner scanner) {
        System.out.println("Enter height and width of room walls in feet, and number of walls");
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Number of walls: ");
        int numberOfWalls = scanner.nextInt();
        return height * width * numberOfWalls;
    }

    public static double getDoorWindowDimensions(Scanner scanner) {
        // Door dimensions
        System.out.println("Enter height and width of door in feet, and number of doors");
        System.out.print("Door Height: ");
        double doorHeight = scanner.nextDouble();
        System.out.print("Door Width: ");
        double doorWidth = scanner.nextDouble();
        System.out.print("Number of doors: ");
        int numberOfDoors = scanner.nextInt();

        // Window dimensions
        System.out.println("Enter height and width of window in feet, and number of windows");
        System.out.print("Window Height: ");
        double windowHeight = scanner.nextDouble();
        System.out.print("Window Width: ");
        double windowWidth = scanner.nextDouble();
        System.out.print("Number of windows: ");
        int numberOfWindows = scanner.nextInt();

        double doorArea = doorHeight * doorWidth * numberOfDoors;
        double windowArea = windowHeight * windowWidth * numberOfWindows;
        return doorArea + windowArea;
    }

    public static double getPaintPrice(Scanner scanner) {
        System.out.print("Price of paint per gallon? ");
        return scanner.nextDouble();
    }

    public static double calculateGallonsRequired(double netWallArea) {
        return Math.ceil(netWallArea / SQUARE_FEET_PER_GALLON);
    }

    public static double calculateLaborHoursRequired(double gallonsRequired) {
        return gallonsRequired * LABOR_HOURS_PER_GALLON;
    }

    public static double calculatePaintCost(double gallonsRequired, double paintPrice) {
        return gallonsRequired * paintPrice;
    }

    public static double calculateLaborCost(double laborHoursRequired) {
        return laborHoursRequired * LABOR_RATE_PER_HOUR;
    }

    public static double calculateTotalCost(double paintCost, double laborCost) {
        return paintCost + laborCost;
    }

    public static void displayResults(double gallonsRequired, double laborHoursRequired, double paintCost,
                                      double laborCost, double totalCost) {
        System.out.printf("The number of gallons of paint required: %.0f%n", gallonsRequired);
        System.out.printf("The hours of labor required: %.0f%n", laborHoursRequired);
        System.out.printf("The cost of the paint: $%.2f%n", paintCost);
        System.out.printf("The labor charges: $%.2f%n", laborCost);
        System.out.printf("The total cost of the paint job: $%.2f%n", totalCost);
    }
}
