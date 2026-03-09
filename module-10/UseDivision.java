
    /**
 * Name: Gisella Adair
 * Date: March 8th 2026
 * Assignment: Module 10.2 Abstract Clases and Interfaces Instructions
 * Course: CSD-402 Java For Programmers
 * Division class
 */

public class UseDivision {
    public static void main(String[] args) {

        InternationalDivision intDiv1 = new InternationalDivision(
                "Global Tech", 1001, "Germany", "German");

        InternationalDivision intDiv2 = new InternationalDivision(
                "Asia Operations", 1002, "Japan", "Japanese");


        DomesticDivision domDiv1 = new DomesticDivision(
                "East Coast Sales", 2001, "Pennsylvania");

        DomesticDivision domDiv2 = new DomesticDivision(
                "West Coast Sales", 2002, "California");

        // Display all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}