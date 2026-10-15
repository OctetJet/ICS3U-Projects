/**
 * Author: Lucas Wang
 * Date: Oct 15, 2026
 * File Name: SelectionExtraPractice
 * Description: Extra practice questions found in the More Selection Exercises doc
 */

import java.util.Scanner;
public class SelectionExtraPractice {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //Question 1
        System.out.println("Please enter the numerator: ");
        double numerator = myScanner.nextDouble();
        System.out.println("Please enter the denominator: ");
        double denominator = myScanner.nextDouble();
        if (denominator == 0) {
            System.out.println("This is an illegal operation");
        }
        else {
            double fraction = numerator/denominator;
            System.out.println("The final number is " + fraction);
        }

        //Question 2
        System.out.println("Please enter your name: ");
        String userName = myScanner.nextLine();
        //Gets a number for how many hours the user worked
        System.out.println("How many hours did you work this week: ");
        int hoursWorked = myScanner.nextInt();
        //Checks that it is not a negative number
        if (hoursWorked < 0) {
            System.out.println("Invalid Input");
        }
        else {
            //Gets a number for how much the user makes per hour
            System.out.println("How much do you make per hour: ");
            double wage = myScanner.nextDouble();
            //Checks that the user did not input a negative number
            if (wage < 0) {
                System.out.println("Invalid Input");
            }
            else {
                if (hoursWorked <= 40) {
                    //Calculates how much the user made if they did not make overtime
                    double totalMade = hoursWorked * wage;
                    System.out.println(userName + ", You have made " + totalMade + " this week!");
                }
                else {
                    //Calculates how much the user made if they did make overtime
                    int overtimeHours = hoursWorked - 40;
                    double regularPay = wage * 40;
                    double overtimeWage = wage * 1.5;
                    double overtimePay = overtimeHours * overtimeWage;
                    double totalPay = regularPay + overtimePay;
                    System.out.println(userName + ", You have made " + totalPay + " this week!");
                    System.out.println(userName + ", You have made " + regularPay + " from non overtime hours.");
                    System.out.println(userName + ", You have made " + overtimePay + " from overtime hours.");
                }
            }
        }

        //Question 3
        System.out.println("Please enter the temperature in C: ");
        double temp = myScanner.nextDouble();
        if (temp >= 30) {
            System.out.println("You should go swimming.");
        }
        else if (temp >= 10) {
            System.out.println("You should go for a walk.");
        }
        else {
            System.out.println("You should curl up with a good book.");
        }

        //Question 4
        System.out.println("Please enter your age: ");
        double age = myScanner.nextDouble();
        if (age < 0) {
            System.out.println("Error: Human years cannot be a negative number.");
        } else {
            double dogYears;
            if (age <= 2) {
                dogYears = age * 10.5;
            } else {
                dogYears = (2 * 10.5) + ((age - 2) * 4);
            }
            System.out.println(age + " human years is equal to " + dogYears + " dog years.");
        }
    }
}
