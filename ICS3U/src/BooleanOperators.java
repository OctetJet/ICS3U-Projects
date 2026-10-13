/**
 * Author: Lucas Wang
 * Date: Oct 5, 2026
 * File Name: BooleanOperators
 * Description: Practice with boolean operators
 */
import java.util.Scanner;

public class BooleanOperators {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

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

        System.out.println("Please enter your age: ");
        int age = myScanner.nextInt();
        if ((age >= 13) && (age <= 19)) {
            System.out.println("This person is a teenager.");
        }
        else if (age < 13) {
            System.out.println("This person is a child.");
        }
        else {
            System.out.println("This person is an adult.");
        }
    }
}