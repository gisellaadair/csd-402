/**
 Name: Gisella Adair
 Date: february 8, 2026
 Assignment: Module 5.2 Arrays & Methods Instructions
 Course: CSD-402 Java For Programmers
*/


public class Fan {

    // ===== Constants =====
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // ===== Private Fields =====
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // ===== No-Argument Constructor =====
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // ===== Argument Constructor =====
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // ===== Getters =====
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // ===== Setters =====
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // ===== toString Method =====
    public String toString() {
        if (on) {
            return "Fan is ON\nSpeed: " + speed +
                   "\nColor: " + color +
                   "\nRadius: " + radius;
        } else {
            return "Fan is OFF\nColor: " + color +
                   "\nRadius: " + radius;
        }
    }

    // ===== Test Code =====
    public static void main(String[] args) {

        // Using default constructor
        Fan fan1 = new Fan();

        // Using argument constructor
        Fan fan2 = new Fan(FAST, true, 10, "blue");

        // Display initial states
        System.out.println("Fan 1:");
        System.out.println(fan1);

        System.out.println("\nFan 2:");
        System.out.println(fan2);

        // Modify fan1 using setters
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("red");

        System.out.println("\nFan 1 After Changes:");
        System.out.println(fan1);
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