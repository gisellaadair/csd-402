import java.util.ArrayList;
import java.util.Scanner;

/**
 * Name: Gisella Adair
 * Date: March 1st 2026
 * Assignment: Module 9.2 Exception Handling & Text I/O
 * Course: CSD-402 Java For Programmers
 * Program 1
 */

public class Program1 {
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Dragonfruit");
        items.add("Elderberry");
        items.add("Fig");
        items.add("Grapes");
        items.add("Honeydew");
        items.add("Kiwi");
        items.add("Lemon");
        items.add("Mango"); // 11th item

        System.out.println("ArrayList contents (index : value):");
        int i = 0;
        for (String s : items) {
            System.out.println(i + " : " + s);
            i++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the index of the element you'd like to see (0 - " + (items.size()-1) + "):");
        String userInput = sc.nextLine().trim();

        try {
            Integer indexObject = Integer.valueOf(userInput); // String -> Integer
            int index = indexObject; // Integer -> int (auto-unboxing)

            // Attempt to access the ArrayList at that index
            String value = items.get(index);
            System.out.println("Element at index " + index + " is: " + value);
        } catch (NumberFormatException nfe) {
            // If the user didn't enter a valid integer
            System.out.println("Invalid input: not a valid integer.");
        } catch (IndexOutOfBoundsException iobe) {
            // If index is invalid/out of bounds
            System.out.println("Exception thrown: Out of Bounds");
        } finally {
            sc.close();
        }
    }
}