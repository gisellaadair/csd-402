
/**
 * Name: Gisella Adair
 * Date: January 18, 2026
 * Assignment: Module 1 – Java and JavaFX Setup
 * Course: CSD-402 Java For Programmers
 * Description: This program calculates the energy required to heat water.
 */

import java.util.Scanner;

public class EnergyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user inputs
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (°C): ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature (°C): ");
        double finalTemp = input.nextDouble();

        // Calculate energy in Joules
        double Q = waterMass * (finalTemp - initialTemp) * 4184;

        // Display result
        System.out.println("\nThe energy required to heat the water is " + Q + " joules.");

        input.close();
    }
}
