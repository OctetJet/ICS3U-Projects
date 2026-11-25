/**
 * Author: Lucas Wang
 * Date: Nov 25, 2026
 * File Name: TwoDArrayExitTicket
 * Description: The answer to both the actual questions ans challenge questions
 */

import java.util.Scanner;
import java.util.Arrays;
public class TwoDArrayExitTicket {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Fills in the array row by row
        int[][] myTable = new int [4][7];
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 7; c++) {
                System.out.println("Please enter a number: ");
                myTable[r][c] = myScanner.nextInt();
            }
        }
        for (int i = 0; i < myTable.length; i++){
            System.out.println(Arrays.toString(myTable[i]));
        }
        System.out.println();

        // Fills in the array column by column
        int[][] myTable2 = new int[4][7];
        for (int c = 0; c < 7; c++) {
            for (int r = 0; r < 4; r++) {
                System.out.println("Please enter a number: ");
                myTable2[r][c] = myScanner.nextInt();
            }
        }
        for (int i = 0; i < myTable2.length; i++){
            System.out.println(Arrays.toString(myTable2[i]));
        }
        System.out.println();

        // Challenge question
        for (int r = 0; r < 4; r++) {
            int sum = 0;
            for (int c = 0; c < 7; c++) {
                sum = sum + myTable[r][c];
            }
            System.out.println(Arrays.toString(myTable[r]) + " Sum: " + sum);
        }
        System.out.println();

        for (int c = 0; c < 7; c++) {
            int sum2 = 0;
            for (int r = 0; r < 4; r++) {
                sum2 = sum2 + myTable[r][c];
            }
            System.out.println("Column: " + c + " Sum: " + sum2);
        }
        System.out.println();
    }
}
