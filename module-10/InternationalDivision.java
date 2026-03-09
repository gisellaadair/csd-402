public class InternationalDivision extends Division {
    private String country;
    private String language;

        /**
 * Name: Gisella Adair
 * Date: March 8th 2026
 * Assignment: Module 10.2 Abstract Clases and Interfaces Instructions
 * Course: CSD-402 Java For Programmers
 * Internation Division
 */


    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}