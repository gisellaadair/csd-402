/**
 * Name: Gisella Adair
 * Date: March 1st 2026
 * Assignment: Module 9.2 Exception Handling & Text I/O
 * Course: CSD-402 Java For Programmers
 * Program 2
 */
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;



public class Program2 {
    public static void main(String[] args) {
        String filename = "data.file";
        File file = new File(filename);

        // Create file if it does not exist
        try {
            if (file.createNewFile()) {
                System.out.println(filename + " did not exist; created new file.");
            } else {
                System.out.println(filename + " already exists; will append 10 numbers.");
            }
        } catch (IOException e) {
            System.err.println("Error creating the file: " + e.getMessage());
            return;
        }

        // Append 10 random integers separated by spaces
        Random rand = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(100); // random 0-99
                writer.write(Integer.toString(num));
                if (i < 9) writer.write(" ");
            }
            // Optionally add a newline at the end
            writer.newLine();
            System.out.println("Appended 10 random integers to " + filename + ".");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            return;
        }

        // Reopen the file and display its contents
        System.out.println("\nContents of " + filename + ":");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}