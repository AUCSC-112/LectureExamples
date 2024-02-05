/*
Example by Thibaud Lutellier for AUCSC 112
Feb 1st 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        multiplyExample();

    }


    /**
     * Write a program that ask the user for two integers as input, multiplies them,
     *  and print the results.
     */
    public static void multiplyExample(){
        System.out.println("PLease write two integers separated by space.");
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        System.out.println(number1*number2);

        System.out.println(calculateBill(45.6, 10));
    }

    /**
     * This method calculate the bill, including a tipping percentage
     * @param bill the bill without tipping
     * @param tip a tipping percentage
     * @return the final bill to pay
     */
    public static float calculateBill(double bill, int tip){
        double tipDecimal = tip / 100.0;
        double finalBill = bill * tipDecimal + bill;
        return (float) finalBill;
    }

}