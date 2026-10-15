/**
 * Author: Lucas Wang
 * Date: Oct 14, 2026
 * File Name: PizzaCalculator
 * Description: A simple program to calculate the cost of a pizza based on the diameter.
 *             It also tells the user the size of the pizza.
 */
import java.util.Scanner;
public class PizzaCalculator {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Takes the user input for the diameter of the pizza
        System.out.println("Please enter the diameter of the pizza in inches: ");
        double pizzaDia = myScanner.nextDouble();

        //Declares variables for the different costs related to the pizza
        double labourCost = 0.75;
        double rentCost = 1.00;
        double materialCost = 0.05 * pizzaDia * pizzaDia;

        //Calculates and tells the user the total cost of the pizza
        double totalCost = labourCost + rentCost + materialCost;
        System.out.println("The total cost of the pizza is " + totalCost + ".");

        //Checks if the pizza is 14 inches or more
        if (pizzaDia >= 14) {
            System.out.println("The pizza falls under the Large category.");
        }
        else {
            System.out.println("The pizza is either a Small or Medium Pizza.");
        }
    }
}