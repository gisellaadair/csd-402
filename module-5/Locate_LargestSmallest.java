/**
 Name: Gisella Adair
 Date: february 8, 2026
 Assignment: Module 5.2 Arrays & Methods Instructions
 Course: CSD-402 Java For Programmers
*/

public class Locate_LargestSmallest {
    // ===== LARGEST =====

    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // ===== SMALLEST =====

    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }
    public static void main(String[] args) {

    int[][] numbers = {
        {3, 5, 9},
        {1, 7, 2},
        {4, 8, 6}
    };

    double[][] decimals = {
        {2.5, 9.1, 3.4},
        {7.8, 1.2, 6.6}
    };

    int[] largestInt = locateLargest(numbers);
    int[] smallestInt = locateSmallest(numbers);

    int[] largestDouble = locateLargest(decimals);
    int[] smallestDouble = locateSmallest(decimals);

    System.out.println("Largest int at: " + largestInt[0] + ", " + largestInt[1]);
    System.out.println("Smallest int at: " + smallestInt[0] + ", " + smallestInt[1]);

    System.out.println("Largest double at: " + largestDouble[0] + ", " + largestDouble[1]);
    System.out.println("Smallest double at: " + smallestDouble[0] + ", " + smallestDouble[1]);
}
}

/**
 REFERENCES
 1. Liang, Y. D. (2019). Introduction to Java programming and data structures (12th ed.). Pearson.
 2. Oracle. (n.d.). Arrays (The Java™ Tutorials). Oracle.
     https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

 3. Oracle. (n.d.). Defining Methods (The Java™ Tutorials). Oracle.
     https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
 */