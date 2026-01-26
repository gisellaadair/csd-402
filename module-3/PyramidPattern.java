/**
 Name: Gisella Adair
 Date: January 25, 2026
 Assignment: Module 3 – Nested for Loops, Pyramid
 Course: CSD-402 Java For Programmers
 Description: This program uses nested for loops to display
 a numeric pyramid pattern ending with an '@' symbol.
*/

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 7; // # of pyramid rows

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces for alignment
            for (int s = rows - i; s > 0; s--) {
                System.out.print("  ");
            }

            // Print left side numbers
            int value = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2; 
            }

            // Print right side numbers
            value /= 4; 
            for (int j = 1; j < i; j++) {
                System.out.print(value + " ");
                value /= 2;
            }

            // '@' symbol at the end of each line
            System.out.println("@");
        }
    }
}