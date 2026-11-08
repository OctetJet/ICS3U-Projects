/**
 * Author: Lucas Wang
 * Date: Nov 2, 2026
 * File Name: Algorithms
 * Description: Coded versions of all the algorithm questions.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Algorithms {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random myRand = new Random();

        //Question 1
        System.out.println("Please enter the length of the required carpet: ");
        double length = myScanner.nextDouble();
        System.out.println("Please enter the width of the required carpet: ");
        double width = myScanner.nextDouble();
        double area2 = length * width;
        double cost;
        if (area2 > 100) {
            cost = area2 * 10;
        }
        else {
            cost = area2 * 12;
        }
        System.out.println("The area of the carpet is " + area2 + ".");
        System.out.println("The cost of the carpet is $" + cost);
        System.out.println();

        //Question 2
        System.out.println("Please enter how many users there are: ");
        int numUsers =  myScanner.nextInt();
        int[] years = new int[numUsers];
        int[] today = new int[numUsers];
        int[] future = new int[numUsers];
        for (int i = 0; i < numUsers; i++) {
            System.out.println("Please enter your birth year: ");
            years[i] = myScanner.nextInt();
        }
        for (int i = 0; i < numUsers; i++){
            int one = 2026 - years[i];
            today[i] = one;
        }
        for (int i = 0; i < numUsers; i++){
            int one1 = 2030 - years[i];
            future[i] = one1;
        }
        String todayStr = Arrays.toString(today);
        String futureStr = Arrays.toString(future);
        System.out.println("This year each user is " + todayStr + " years old.");
        System.out.println("In 2030 each user will be " + futureStr + " years old.");
        System.out.println();

        //Question 3
        double radius, area;
        System.out.println("Please enter the radius of the circle: ");
        radius = myScanner.nextInt();
        area = Math.PI * (radius * radius);
        System.out.println("The area of the circle is " + area);
        System.out.println();

        //Question 4
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        //Question 5
        double scores = 0;
        for (int i = 0; i < 25; i++) {
            System.out.println("Please enter the first score: ");
            double userNum = myScanner.nextDouble();
            scores = scores + userNum;
        }
        double average = scores / 25;
        System.out.println("The average of all 25 scores is: " + average + ".");
        System.out.println();

        //Question 6
        System.out.println("Please enter a number: ");
        double userNum2 = myScanner.nextDouble();
        if (userNum2 % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }
        System.out.println();

        //Question 7
        boolean stopLoop = false;
        do {
            System.out.println("Please enter a number: ");
            double userNum3 = myScanner.nextDouble();
            if (userNum3 % 2 == 0) {
                System.out.println("The number is even.");
            }
            else {
                System.out.println("The number is odd.");
            }
            myScanner.nextLine();
            System.out.println("Do you want to continue (Yes or No): ");
            String userInput2 =  myScanner.nextLine();
            if (userInput2.equalsIgnoreCase("Yes")) {
                System.out.println("Continue.");
            }
            else {
                stopLoop = true;
            }
        } while (!stopLoop);
        System.out.println();

        //Question 8
        int randomNum = myRand.nextInt(101);
        int userNum4;
        int count = 0;
        do {
            System.out.println("Please enter a number between 0 and 100: ");
            userNum4 = myScanner.nextInt();
            if (userNum4 > randomNum) {
                System.out.println("Too High. Please try again.");
                count++;
            }
            else if (userNum4 < randomNum) {
                System.out.println("Too Low. Please try again.");
                count++;
            }
            else {
                count++;
                System.out.println("Correct!");
                System.out.println("You used " + count + " guesses.");
            }
        } while (userNum4 != randomNum && count != 10);
        if (userNum4 != randomNum) {
            System.out.println("You ran out of guesses.");
            System.out.println("The correct number was: " + randomNum);
        }
    }
}
