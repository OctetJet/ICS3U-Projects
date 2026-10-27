/**
 * Author: Lucas Wang
 * Date: Oct 25, 2026
 * File Name: DoLoopPB
 * Description: The practice problem in the do while loop lesson
 */

import java.util.Scanner;
public class DoLoopPB {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Question 5
        System.out.println("Please enter a word: ");
        String word = myScanner.nextLine();
        System.out.println("How many time should I print that word: ");
        int time = myScanner.nextInt();
        do {
            System.out.println(word);
            time--;
        } while (time != 0);
        System.out.println();

        //Question 6
        int count = 0;
        int sum = 0;
        do {
            sum = sum + count;
            count++;
        } while (count <= 10);
        System.out.println(sum);
        System.out.println();

        //Question 7
        double chipCost = 1.25;
        int totalBags = 0;
        double totalCost = 0;
        boolean loop = true;
        do {
            System.out.println("How many bags of chips would you like to buy: ");
            int bags = myScanner.nextInt();
            myScanner.nextLine();
            double currentCost = bags * chipCost;
            totalBags += bags;
            totalCost += currentCost;

            System.out.println("You have bought " + bags + " bags of chips");
            System.out.println("Your total cost is $" + totalCost);

            System.out.println("Would you like to make another purchase (Y or N): ");
            String choice = myScanner.nextLine().trim();
            if (!choice.equalsIgnoreCase("Y")) {
                loop = false;
            }
        } while (loop);
    }
}
