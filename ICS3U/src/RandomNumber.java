/**
 * Author: Lucas Wang
 * Date: Oct 25, 2026
 * File Name: RandomNUmber
 * Description: A classic number guessing game using a do while loop and the Random class.
 */

import java.util.Scanner;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random myRand = new Random();

        int randomNum = myRand.nextInt(100);
        int userNum;
        int count = 0;
        do {
            System.out.println("Please enter a number between 0 and 100: ");
            userNum = myScanner.nextInt();
            if (userNum > randomNum) {
                System.out.println("Too High. Please try again.");
                count++;
            }
            else if (userNum < randomNum) {
                System.out.println("Too Low. Please try again.");
                count++;
            }
            else {
                count++;
                System.out.println("Correct!");
                System.out.println("You used " + count + " guesses.");
            }
        } while (userNum != randomNum && count != 10);
    }
}