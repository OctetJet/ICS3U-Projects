/**
 * Author: Lucas Wang
 * Date: Oct 7, 2026
 * File Name: SelectionEx4B
 * Description: This is the second half of the selection practice problems.
 */

import java.util.Scanner;

public class SelectionEx4B {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Question 4
        System.out.println("Please enter a secret number: ");
        double secretNum = myScanner.nextDouble();
        System.out.println("Please enter a new number: ");
        double newNum = myScanner.nextDouble();
        if (secretNum == newNum) {
            System.out.println("You got it!");
        }
        else {
            System.out.println("Wrong Answer!");
        }

        //Question 5
        System.out.println("Please enter your mark: ");
        double mark = myScanner.nextDouble();
        if (mark >= 75) {
            System.out.println("Great Job!");
        }
        else if (mark >= 50 && mark <= 74) {
            System.out.println("You Passed!");
        }
        else if (mark >=0 && mark <= 49) {
            System.out.println("You Failed!");
        }
        else {
            System.out.println("Invalid.");
        }
        myScanner.nextLine();

        //Question 6
        String password;
        password = "happy";
        System.out.println("Please enter the password: ");
        String newPassword = myScanner.nextLine();
        if (password.equals(newPassword)) {
            System.out.println("You are logged in.");
        }
        else {
            System.out.println("Incorrect Password.");
        }

        //Question 7
        System.out.println("Please enter the first mark: ");
        double mark1 = myScanner.nextDouble();
        System.out.println("Please enter the second mark: ");
        double mark2 = myScanner.nextDouble();
        if (mark1 > mark2) {
            System.out.println("The higher mark is " + mark1 + ".");
        }
        else {
            System.out.println("The higher mark is " + mark2 + ".");
        }

        //Question 8
        System.out.println("How many times should I print Hello World (1-5): ");
        int userInput = myScanner.nextInt();
        if (userInput == 1) {
            System.out.println("Hello World!");
        }
        else if (userInput == 2) {
            System.out.println("Hello World!");
            System.out.println("Hello World!");
        }
        else if (userInput ==3) {
            System.out.println("Hello World!");
            System.out.println("Hello World!");
            System.out.println("Hello World!");
        }
        else if (userInput == 4) {
            System.out.println("Hello World!");
            System.out.println("Hello World!");
            System.out.println("Hello World!");
            System.out.println("Hello World!");
        }
        else if (userInput ==5) {
            System.out.println("Hello World!");
            System.out.println("Hello World!");
            System.out.println("Hello World!");
            System.out.println("Hello World!");
            System.out.println("Hello World!");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
