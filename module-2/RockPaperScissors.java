/**
Name: Gisella Adair
Date: January 25, 2026
Module 2.2: Assignment Rock-Paper-Scissors Instructions
Course: CSD-402 Java For Programmers
GitHub Repository: https://github.com/gisellaadair/csd-402
Description: This program plays Rock-Paper-Scissors: the computer
randomly chooses 1-3 and the user types 1-3. Then the program shows
both choices and prints the result.
*/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Generate the computer choice (1 = Rock, 2 = Paper, 3 = Scissors)
        int computerChoice = rand.nextInt(3) + 1;

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Our favorite game to play when we were kids.");
        System.out.println("You know the rules.");
        System.out.println("Enter your choice:");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Your choice: ");

        // Read the user's choice as an integer
        int userChoice = input.nextInt();

        System.out.println();
        System.out.println("You chose: " + choiceName(userChoice));
        System.out.println("Computer chose: " + choiceName(computerChoice));
        System.out.println();

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Yay!! You win");
        } else {
            System.out.println("Sorry, You've Lost!");
        }
        input.close();
    }

    // Convert numeric choice to readable word
    public static String choiceName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}
