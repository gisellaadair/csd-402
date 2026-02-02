/**
 Name: Gisella Adair
 Date: February 1st, 2026
 Assignment: Module 4.2 Single-Dimensional Arrays Instructions
 Course: CSD-402 Java For Programmers
*/


public class ReturnAverage {

    // Method for short array
    public static short average(short[] array) {
        int sum = 0; // use int to prevent overflow
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method for int array
    public static int average(int[] array) {
        long sum = 0; // use long for larger sum values
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // Method for long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method for double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {

        // Declare arrays
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 15, 25, 35};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Display each array and its average
        System.out.println("===== Arrays Averages =====\n");

        System.out.println("Short Array: ");
        displayArray(shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println("--------------------------------------");

        System.out.println("Int Array: ");
        displayArray(intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println("--------------------------------------");

        System.out.println("Long Array: ");
        displayArray(longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println("--------------------------------------");

        System.out.println("Double Array: ");
        displayArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
        System.out.println("--------------------------------------");
    }

    public static void displayArray(short[] array) {
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayArray(long[] array) {
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/**
 * REFERENCES 
1. https://www.w3schools.com/java/java_arrays.asp
2. Instructional videos and examples. Basics, Bellevue University,2020
3. Instructional videos and examples. Module_04_Arrays_Methods_Examples.zip
*/