import java.util.ArrayList;
import java.util.List;

/**
 * Name: Gisella Adair
 * Date: February 15, 2026
 * Assignment: Module 7.2 Oriented Classes and Thinking
 * Course: CSD-402 Java For Programmers
 */

public class UseFans {
    public static void displayFan(Fan fan) {
        System.out.println("---- Fan Details ----");
        System.out.println("Power: " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println();
    }

    public static void displayFans(List<Fan> fans) {
        System.out.println("===== Displaying All Fans =====");
        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1));
            displayFan(fans.get(i)); 
        }
    }

    public static void main(String[] args) {

        List<Fan> fanList = new ArrayList<>();

        fanList.add(new Fan(Fan.SLOW, true, 7, "green"));
        fanList.add(new Fan(Fan.MEDIUM, false, 9, "white"));
        fanList.add(new Fan(Fan.FAST, true, 12, "blue"));
        fanList.add(new Fan()); 

        displayFans(fanList);

        Fan modifiedFan = fanList.get(3);
        modifiedFan.setOn(true);
        modifiedFan.setSpeed(Fan.FAST);
        modifiedFan.setColor("red");
        modifiedFan.setRadius(10);

        System.out.println("===== After Modifying Fan #4 =====");
        displayFan(modifiedFan);
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