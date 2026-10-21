/**
 * Author: Lucas Wang
 * Date: Oct 20, 2026
 * File Name: WhileLoopPB
 * Description: 4 questions to practice combining while loops and user inputs.
 */

import java.util.Scanner;
public class WhileLoopPB {
    public static void main (String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //Question 5
        System.out.println("Please enter a word: ");
        String userWord = myScanner.nextLine();
        System.out.println("How many times should that word be printed: ");
        int userNum = myScanner.nextInt();
        int count = 0;
        while (count < userNum) {
            System.out.println(userWord);
            count++;
        }

        //Question 6
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum = sum +i;
        }
        System.out.println(sum);

        //Question 7
        int sum2 = 0;
        for (int i = 0; i < 11; i++) {
            sum2 = sum2 +i;
        }
        double average = (double) sum2 / 10;
        System.out.println(sum2);
        System.out.println("The average is " + average);

        //Question 8
        String password = "password";
        int count2 = 0;
        System.out.println("Please enter the secret word:");
        String userWord2 = myScanner.nextLine();
        while (!userWord2.equals(password)) {
            System.out.println("Incorrect please try again.");
            userWord2 = myScanner.nextLine();
            count2++;
        }
        System.out.println("The word was " + password);
        System.out.println("You got it in " + count2 + " guesses!");
    }
}
