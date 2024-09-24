package com.StartSample;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double netWallArea = PaintingCompany.getRoomDimensions(scanner);
        double doorWindowArea = PaintingCompany.getDoorWindowDimensions(scanner);
        double totalArea = netWallArea - doorWindowArea;
        double gallonsRequired = PaintingCompany.calculateGallonsRequired(totalArea);

        boolean isInvalidArea = gallonsRequired == 0 || netWallArea == 0;
        if (isInvalidArea) {
            System.out.println("Cannot proceed with invalid net wall area.");
            return;

        } 
        else {
            System.out.println("Gallons required: " + gallonsRequired);
        }

        scanner.close();
    }}