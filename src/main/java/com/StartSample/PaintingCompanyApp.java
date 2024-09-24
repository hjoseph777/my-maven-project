package com.StartSample;

import java.util.Scanner; 

// This class is the entry point for the Painting Company application.
public class PaintingCompanyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Data
        double wallArea = PaintingCompany.getRoomDimensions(scanner);
        double doorWindowArea = PaintingCompany.getDoorWindowDimensions(scanner);
        double paintPrice = PaintingCompany.getPaintPrice(scanner);

        // validate input can not never be negative or zero
        if (wallArea <= 0 || doorWindowArea <= 0 || paintPrice <= 0) {
            System.out.println("Cannot proceed with invalid net wall area, door window area, or paint price.");
            scanner.close(); // close scanner
            return;
        }


        // Calculate Areas
        double netWallArea = wallArea - doorWindowArea;
        double gallonsRequired = PaintingCompany.calculateGallonsRequired(netWallArea);
        double laborHoursRequired = PaintingCompany.calculateLaborHoursRequired(gallonsRequired);

        // Calculate Costs
        double paintCost = PaintingCompany.calculatePaintCost(gallonsRequired, paintPrice);
        double laborCost = PaintingCompany.calculateLaborCost(laborHoursRequired);
        double totalCost = PaintingCompany.calculateTotalCost(paintCost, laborCost);

        // Display Results
        PaintingCompany.displayResults(gallonsRequired, laborHoursRequired, paintCost, laborCost, totalCost);

        scanner.close();
    }






















}
