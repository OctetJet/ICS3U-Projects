/**
 * Author: Lucas Wang
 * Date: Sep 30, 2026
 * File Name: OutputExercises1
 * Description: Output Exercises Practice
 */
package ICS3U.src;

import java.util.Scanner;

public class OutputEx1 {
    public static void main(String[] args) {
        //Question 1
        System.out.println("Hello World");

        //Question 2
        int startingNum;
        startingNum = 12;
        for (int i = 0; i < 4; i++) {
            System.out.println(startingNum + i);
        }

        //Question 3
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your first name: ");
        String firstName = myScanner.next();

        System.out.println("What is your last name: ");
        String lastName = myScanner.next();

        System.out.println(firstName + " " + lastName);

        myScanner.close();

        //Question 4
        int num;
        num = 3*5;
        System.out.println(num);

        //Question 5
        float num2;
        num2 = 5%2;
        System.out.println(num2);

        //Question 6
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}