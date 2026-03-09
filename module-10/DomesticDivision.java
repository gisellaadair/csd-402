public class DomesticDivision extends Division {
    private String state;

        /**
 * Name: Gisella Adair
 * Date: March 8th 2026
 * Assignment: Module 10.2 Abstract Clases and Interfaces Instructions
 * Course: CSD-402 Java For Programmers
 * Domestic Division
 */
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}