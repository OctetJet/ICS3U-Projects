/**
 * Author: Lucas Wang
 * Date: Oct 2, 2026
 * File Name: Ex2Variables
 * Description: Practice questions with input and output
 */
package ICS3U.src;

import java.util.Scanner;

public class Ex2Variables {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Question 1
        System.out.println("What is your age: ");
        double userAge = myScanner.nextDouble();
        System.out.println("Your age is: " + userAge);

        //Question 2
        System.out.println("Please input a number: ");
        float userNum = myScanner.nextFloat();
        for (float i = 0; i < 5; i++){
            System.out.println("Your number is: " + userNum);
        }

        //Question 3
        int length = 5;
        System.out.println("The length is: " + length);

        //Question 4
        int num1 = 10;
        int num2 = 20;
        int num3 = num1 * num2;
        System.out.println("10 x 20 is " + num3);

        //Question 5
        System.out.println("Please enter a number: ");
        float userNum1 = myScanner.nextFloat();
        System.out.println("Please enter a second number: ");
        float userNum2 = myScanner.nextFloat();
        float userNum3 = userNum1 + userNum2;
        float userNum4 = userNum1 - userNum2;
        float userNum5 = userNum1 * userNum2;
        float userNum6 = userNum1 / userNum2;
        System.out.println(userNum1 + " + " + userNum2 + " = " + userNum3);
        System.out.println(userNum1 + " - " + userNum2 + " = " + userNum4);
        System.out.println(userNum1 + " * " + userNum2 + " = " + userNum5);
        System.out.println(userNum1 + " / " + userNum2 + " = " + userNum6);

        //Question 6
        double cmPerIn = 2.54;
        System.out.println("Please enter the length of a door in inches: ");
        float doorLen = myScanner.nextFloat();
        double totalLen = doorLen * cmPerIn;
        System.out.println("The total length of the door in CM is " + totalLen);
        myScanner.nextLine();

        //Question 7
        System.out.println("Please enter a school subject: ");
        String schoolSub = myScanner.nextLine();
        System.out.println("Please enter the total amount of marks on the test: ");
        double totalMarks = myScanner.nextDouble();
        System.out.println("Please enter the amount of marks you got on that same test: ");
        double userMarks = myScanner.nextDouble();
        double percentage = (userMarks / totalMarks) * 100.0;
        System.out.println("Your subject is: " + schoolSub);
        System.out.println("Your mark is: " + percentage + "%");

        //Question 8
        System.out.println("Please enter the radius of a circle (accurate to 2 decimal places): ");
        double radius = myScanner.nextDouble();
        double diameter = 2 * radius;
        double circumference = diameter * 3.14;
        System.out.printf("The circumference of the circle is %.3f%n", circumference);

        //Question 9
        System.out.println("Enter the principal amount ($): ");
        double principal = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.println("Enter the interest rate: ");
        String inputRate = myScanner.nextLine().trim();
        if (inputRate.endsWith("%")) {
            inputRate = inputRate.substring(0, inputRate.length() -1).trim();
        }
        double rate = Double.parseDouble(inputRate) / 100.0;
        System.out.println("Enter the number of years: ");
        double time = myScanner.nextDouble();
        double interest = principal * rate * time;
        double finalInterest = Math.round(interest * 100.0) / 100.0;
        System.out.println("The final interest earned is: " + finalInterest);
    }
}
