/*
Example by Thibaud Lutellier for AUCSC 112
Class 4 (Feb 8th)
 */

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        switchTest(1);
        giveFeedback('C');
        Scanner myKeyboard = new Scanner(System.in);
        char output = myKeyboard.next().charAt(0);
        System.out.println(output);


        int[] myArray = {0,1,2,3,4};
        changeArray(myArray);
        for (int i =0; i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
        int number =5;
        changeNumber(number);
        System.out.println(number);
    }

    /**
     * This function doesnt do anything.
     * @param number
     */
    public static void changeNumber(int number){
        number =10;
    }

    /**
     * This function does change the array because the value in
     * array is a reference to the actual array.
     * @param array
     */
    public static void changeArray(int[] array){
        array[0] = 10;
    }

    /**
     * Simple switch test we did in class.
     * @param userChoice
     */
    public static void switchTest(int userChoice) {
        //int case10 =10;
        switch (userChoice) {
            case 10: // if(userChoice == 10)
                System.out.println("Time for class ");
                break;
            case 0: // else if(userChoice == 0)
                System.out.println("Time to go home ");
                break;
            case 1:
                System.out.println("Time to get up ");
                break;
            case 2:
                System.out.println("Time to eat breakfast ");
                break;
            default:
                System.out.println("It’s always coffee time! ");
                break;


        }//switch
    }

    /**
     * Second sample. This switch only work with recent versions of
     * java. You can type test in a switch.
     * Both: "case:" and "case ->" are possible
     * "case ->" doesn't need breaks.
     * @param userChoice
     */
    public static void switchTest2(int userChoice) {
        //int case10 =10;
        String test = "hello";
        switch (test) {
            case String s -> System.out.println("It's a string ");
            case null -> System.out.println("Time to go home ");
        }//switch
    }

    public record Point(int x, int y) {}

    /**
     * Additional example I talked about in class (incorrectly)
     * to show that you can have more complex switches that includes
     * variables and conditions.
     * @param p
     */
    public static void switchTest3(Point p) {
        switch (p) {
            case Point(var x, var y) when x == 0 && y == 0:
                System.out.println("first");
                break;
            default:
                System.out.println("other");
        }
    }

    /**
     *     /
     *      * Write a Java program that display a
     *      * message based on your letter grade.
     *
     */
     public static void giveFeedback(char letterGrade){
         letterGrade = toUpperCase(letterGrade);
         switch (letterGrade) {
             case 'A':
                 System.out.println("Congratulations");
                 break;
             case 'F':
                 System.out.println("Try again next time");
                 break;
             case 'B':
                 System.out.println("You did pretty good in this class");
                 break;
             case 'C':
             case 'D':
                 System.out.println("Well done, you passed the class");
                 break;
             default:
                 System.out.println("Not a valid grade");


         }


     }
}