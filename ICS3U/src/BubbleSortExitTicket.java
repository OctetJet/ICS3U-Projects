/**
 * Author: Lucas Wang
 * Date: Nov 16, 2026
 * File Name: BubbleSortExitTicket
 * Description: The coded version of the code I wrote on the bubble sort worksheet.
 */

import java.util.Arrays;
import java.util.Scanner;
public class BubbleSortExitTicket {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] userNums = new int[5];
        for (int i = 0; i < userNums.length; i++) {
            System.out.println("Please enter a number without decimals: ");
            userNums[i] = myScanner.nextInt();
        }
        System.out.println(Arrays.toString(userNums));
        for (int pass = 0; pass < userNums.length; pass++) {
            // - 1 and - pass ensure that the loop does not make unnecessary comparisons
            for (int i = 0; i < userNums.length - 1 - pass; i++) {
                if (userNums[i] > userNums[i + 1]) {
                    int temp = userNums[i];
                    userNums[i] = userNums[i + 1];
                    userNums[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(userNums));
    }
}