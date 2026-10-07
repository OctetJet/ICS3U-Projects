/**
 * Author: Lucas Wang
 * Date: Oct 6, 2026
 * File Name: SelectionEx4A
 * Description: Part A of the selection exercises. These questions mainly use if statements.
 */

import java.util.Scanner;

public class SelectionEx4A {
    public static void main (String[] args) {

        //Question 1
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1-10: ");
        int num = myScanner.nextInt();
        if (num >= 5) {
            System.out.println("You Won!");
        }
        else {
            System.out.println("You Lost!");
        }

        //Question 2
        System.out.println("Please enter your mark: ");
        double mark = myScanner.nextDouble();
        if (mark >= 50) {
            System.out.println("You Passed!");
        }
        else {
            System.out.println("You Failed!");
        }

        //Question 3
        System.out.println("Please enter the temperature in °C: ");
        double tempC = myScanner.nextDouble();
        if (tempC <= 9){
            System.out.println("It is really cold outside.");
        }
        else if (tempC >= 10 && tempC < 20){
            System.out.println("It is getting pretty cool outside");
        }
        else if (tempC >= 20 && tempC <= 30){
            System.out.println("It is comfortable outside");
        }
        else if (tempC > 30){
            System.out.println("It is hot outside");
        }
    }
}