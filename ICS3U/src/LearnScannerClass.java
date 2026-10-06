/**
 * Author: Lucas Wang
 * Date: Oct 1, 2026
 * File Name: LearnScannerClass
 * Description: Practice with the scanner function
 */
package ICS3U.src;

import java.util.Scanner;

public class LearnScannerClass {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Asks for Name
        System.out.println("What is your name: ");
        String name = myScanner.nextLine();

        //Asks for Age
        System.out.println("How old are you: ");
        int age = myScanner.nextInt();

        //Asks for shoe size
        System.out.println("What is your shoe size: ");
        float shoeSize = myScanner.nextFloat();

        //Prints out all
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your shoe size is " + shoeSize);

        myScanner.close();
    }
}
