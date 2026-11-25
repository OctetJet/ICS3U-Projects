/**
 * Author: Lucas Wang
 * Date: Nov 25, 2026
 * File Name: Array41
 * Description: The answer to the first question in the 2D arrays exercises document
 */

import java.util.Scanner;
import java.util.Arrays;
public class Array41 {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[][] myTable = new int[3][4];

        // Asks the user to fill the array
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Please enter a number: ");
                myTable[r][c] = myScanner.nextInt();
            }
        }

        // Prints the array in a nice format
        for (int i = 0; i < myTable.length; i++) {
            System.out.println(Arrays.toString(myTable[i]));
        }
        System.out.println();

        // Finds and prints the sums of all the rows
        for (int r = 0; r < 3; r++) {
            int sum = 0;
            for (int c = 0; c < 4; c++) {
                sum = sum + myTable[r][c];
            }
            System.out.println(Arrays.toString(myTable[r]) + " Sum: " + sum);
        }

        // Finds and prints the sums of all the columns
        for (int c = 0; c < 4; c++) {
            int sum2 = 0;
            for (int r = 0; r < 3; r++) {
                sum2 = sum2 + myTable[r][c];
            }
            System.out.println("Column: " + c + " Sum: " + sum2);
        }
        System.out.println();
    }
}
