/**
 * My mark for this program is:  A/ K    18.5/20,   C (header, indent, comment, mvn)   2/2
 * Author: Lucas Wang
 * Date: Nov 3, 2026
 * File Name: Wang_Lucas_Coding_Quiz
 * Description: Code for a formative quiz.
 */

import java.util.Scanner;
public class Wang_Lucas_Coding_Quiz {
    public static void main(String[] args) {
        //Declares the scanner
        Scanner myScanner = new Scanner(System.in);
        //Asks the user for their name
        System.out.println("Please enter your name: ");
        String userName = myScanner.nextLine();
        //Declares variables for count, price, and totalPrice
        int count = 0 - 1;
        int totalPrice = 0 + 1;
        int price;
        //Loop that asks for the prices
        do {
            System.out.println("Please enter the price (-1 to exit): ");
            price = myScanner.nextInt();
            totalPrice = totalPrice + price;
            count++;
        } while (price != -1);
        double average = totalPrice / count;
        //Formats the output
        System.out.println("Welcome " + userName);
        System.out.println("The number of prices entered is: " + count);
        System.out.println("The sum of all the prices entered is: " + totalPrice);
        System.out.println("The average of all the prices entered is: " + average);
        //If statement to check the average
        if (average > 12) {
            System.out.println("The average price of items purchased was above average.");
        }
        else if (average == 12) {
            System.out.println("The average price of items purchased was just average.");
        }
        else if (average < 12) {
            System.out.println("The average price of items was below average.");
        }
    }
}
