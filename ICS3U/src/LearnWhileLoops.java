/**
 * Author: Lucas Wang
 * Date: Oct 21, 2026
 * File Name: LearnWhileLoop
 * Description: Programs that were taught through the While loop lesson slides
 */

import java.util.Scanner;
public class LearnWhileLoops {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num = 0;
        while (num < 11) {
            System.out.println("Enter a number higher than 10: ");
            num = myScanner.nextInt();
        }

        int num1 = 0;
        while ((num1 < 1 ) || (num1 > 10)) {
            System.out.println("enter a number between 1 and 10: ");
            System.out.println("INCLUSIVE!!!");
            num1 = myScanner.nextInt();
        }
    }
}
