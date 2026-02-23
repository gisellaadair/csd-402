import java.util.ArrayList;
import java.util.Scanner;

/**
 * Name: Gisella Adair
 * Date: February 22, 2026
 * Assignment: Module 8.2 Array List Test
 * Course: CSD-402 Java For Programmers
 */

public class GisellaArrayListTest {


    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer max = list.get(0);

        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            int value = input.nextInt();
            numbers.add(value);

            if (value == 0) {
                break;
            }
        }

        Integer largest = max(numbers);

        System.out.println("Numbers entered: " + numbers);
        System.out.println("Largest value: " + largest);
    }
}

/** REFERENCES
 1 Oracle. (n.d.). Defining classes (The Java™ Tutorials). Oracle.
https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html

 2 Oracle. (n.d.). Encapsulation (The Java™ Tutorials). Oracle.
https://docs.oracle.com/javase/tutorial/java/javaOO/encapsulation.html

 3 Oracle. (n.d.). Constructors (The Java™ Tutorials). Oracle.
https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html

4 Oracle. (n.d.). Objects and classes (The Java™ Tutorials). Oracle.
https://docs.oracle.com/javase/tutorial/java/javaOO/object.html

5 Deitel, P., & Deitel, H. (2017). Java: How to program (11th ed.). Pearson. */