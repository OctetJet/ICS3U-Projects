/**
 * Author: Lucas Wang
 * Date: Oct 21, 2026
 * File Name: LearnDoWhileLoop
 * Description: The practice problem in the do while loop lesson
 */

import java.util.Scanner;
public class LearnDoWhileLoop {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int total = 0;
        int value;
        do {
            System.out.println("Enter values to sum and 0 to quit: ");
            value = myScanner.nextInt();
            total = total + value;
        } while (value != 0);
            System.out.println("Your total is: " + total);
    }
}
