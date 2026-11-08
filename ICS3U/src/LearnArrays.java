/**
 * Author: Lucas Wang
 * Date: Nov 5, 2026;
 * File Name: LearnArrays
 * Description: A program for the Arrays exit ticket and the notes from the Arrays Lesson.
 */

import java.util.Scanner;
import java.util.Arrays;
public class LearnArrays {
    public static void main(String[] args) {
        //Exit Ticket
        Scanner myScanner = new Scanner(System.in);
        //Declares the array
        int[] userNums = new int[5];
        //Asks for the user to enter a number 5 times
        for (int i = 0; i < userNums.length; i++) {
            System.out.println("Please enter a number: ");
            userNums[i] = myScanner.nextInt();
        }
        //Prints the contents of the array in a formatted way
        System.out.println(Arrays.toString(userNums));
        //Adds all the numbers in the array together
        int totalNums = 0;
        for (int Nums : userNums) {
            totalNums += Nums;
        }
        System.out.println("The total of the numbers you entered is: " + totalNums);
        System.out.println();

        // Arrays Lesson
        int[] numArray = new int[5];
        // Index
        //   0 | 1 |  2 |  3 | 4
        // 123 |   | 12 | 98 |
        numArray[0] = 123;
        numArray[2] = 12;
        numArray[3] = 98;
        System.out.println(numArray[0]);
        System.out.println(numArray[2]);

        int [] numArray2 = new int[5];
        for (int i = 0; i < numArray2.length; i++) {
            numArray2[i] = i + 1;
        }
        for (int i = 0; i < numArray2.length; i++) {
            System.out.println(numArray2[i]);
        }
        // 5 is not a valid value in the array
        System.out.println(numArray2[5-1]);
        System.out.println("Number of items " + numArray2.length);

        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter name " + (i + 1) + ": ");
            names[i] = myScanner.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
