/**
 * Author: Lucas Wang
 * Date: Nov 24, 2026
 * File Name: ArraysSortingAndSearching
 * Description: The code to answer the questions in the Sorting and Searching exercises.
 */

import java.util.Scanner;
import java.util.Arrays;
public class ArraysSortingAndSearching {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Question 1
        int[] userNums = new int[10];
        for (int i = 0; i < userNums.length; i++) {
            System.out.println("Please enter a number: ");
            userNums[i] = myScanner.nextInt();
        }
        for (int pass = 0; pass < userNums.length; pass++) {
            for (int i = 0; i < userNums.length - 1 - pass; i++) {
                if (userNums[i] > userNums[i + 1]) {
                    int temp = userNums[i];
                    userNums[i] = userNums[i + 1];
                    userNums[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(userNums));
        System.out.println("Please enter a number to search for: ");
        int num = myScanner.nextInt();
        boolean found = false;
        for (int i = 0; i < userNums.length; i ++) {
            if (userNums[i] == num) {
                System.out.println("The index is: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("The values does not exist in the array.");
        }

        // Question 2
        String[] userNames = new String[5];
        for (int i = 0; i < userNames.length; i++) {
            System.out.println("Please enter a name: ");
            userNames[i] = myScanner.nextLine();
        }
        for (int pass = 0; pass < userNames.length; pass++) {
            for (int i = 0; i < userNames.length - 1 - pass; i++) {
                if (userNames[i].compareToIgnoreCase(userNames[i + 1]) > 0) {
                    String temp = userNames[i];
                    userNames[i] = userNames[i + 1];
                    userNames[i + 1] = temp;
                }
            }
        }
        System.out.println("Please enter a name to search for: ");
        String name = myScanner.nextLine();
        boolean found2 = false;
        for (int i = 0; i < userNames.length; i ++) {
            if (userNames[i].equalsIgnoreCase(name)) {
                System.out.println("The index is: " + i);
                found2 = true;
            }
        }
        if (!found2) {
            System.out.println("The values does not exist in the array.");
        }
    }
}
