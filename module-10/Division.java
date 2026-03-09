public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    /**
 * Name: Gisella Adair
 * Date: March 8th 2026
 * Assignment: Module 10.2 Abstract Clases and Interfaces Instructions
 * Course: CSD-402 Java For Programmers
 * Division class
 */

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}