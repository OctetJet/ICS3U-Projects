/**
 * Author: Lucas Wang
 * Date: Oct 13, 2026
 * File Name: Oct14ExitTicket
 * Description: A basic program that calculates how much a worker makes from user inputs.
 */

import java.util.Scanner;
public class Oct14ExitTicket {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
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
    }
}
