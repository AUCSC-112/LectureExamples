/*
Example by Thibaud Lutellier for AUCSC 112
Jan 29 2024
This program provides an example of Scanner, basic data types, assignment and printing.
 */

import java.util.Scanner; // Get the Scanner class from the package (or library) java.util

public class Class1Examples {

    /**
     * This is the main function. This is the first function executed by a Java program.
     */
    public static void main(String[] args) {  // Main function. Note the keywords public, static, and void
        System.out.println("Hello out there."); // Sends output to screen
        System.out.println("I will add two numbers for you.");
        System.out.println("Enter two whole numbers on a line:");
        int n1, n2; // Declare that the variables n1 and n2 are integers (whole numbers)
        Scanner keyboard = new Scanner(System.in); // Define a scanner called keyboard that will read input
        n1 = keyboard.nextInt(); //Reads the program for keyboard input
        n2 = keyboard.nextInt(); //Reads the second number

        System.out.println("The sum of those two numbers is:");
        System.out.println(n1+n2);
    }
}

