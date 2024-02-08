/*
Example by Thibaud Lutellier for AUCSC 112
Class 3
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int iterator = 5;
        while(iterator < 10) {
            System.out.println(iterator);
            iterator++;
        }
        blastOff();
        testIncrements();
        testStringEquality();
    }

    /**
     * Write a program that asks a positive integer from the
     * user and prints a triangular count down to 1,
     * followed by “BLAST OFF”
     *
     * E.g.:
     * 4 4 4 4
     * 3 3 3
     * 2 2
     * 1
     * BLAST OFF
     */
    public static void blastOff(){
        System.out.println("Enter a positive integer");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();

        while(number >= 1){
            int counter =0;
            while(counter < number) {
                System.out.print(number);
                System.out.print(" ");
                counter++;
            }
            System.out.println();
            number --;
        }
        System.out.println("BLAST OFF");
    }

    public static void testIncrements(){
        int x = 10;
        x++;
        int y = x++ + 3;
        System.out.println("x= " + x); // x = 12
        System.out.println("y= " + y); //y = 14
        int z = --y + x--;
        System.out.println(z);

    }

    public static void testStringEquality(){
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = "Hell";
        String string4 = "o";
        //System.out.println(string2);
        //System.out.println(string1);

        if (string1.equals(string3 + string4)){
            System.out.println("The string are equals");
        }
        else{
            System.out.println("strings are different");
        }
    }
}