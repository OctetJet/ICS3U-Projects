/**
 * Author: Lucas Wang
 * Date: Oct 19, 2026
 * File Name: ProblemSolvingChallenges
 * Description: 3 practice problems with for loops.
 */

import java.util.Scanner;
public class ProblemSolvingChallenges {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Question 1
        System.out.println("Please input a number: ");
        int userNum = myScanner.nextInt();
        for (int rows = 1; rows <= userNum; rows++) {
            for (int count = 1; count <= rows; count++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Question 2
        System.out.println("Please input a number: ");
        int userNum2 = myScanner.nextInt();
        for (int rows = 1; rows <= userNum2; rows++) {
            for (int count = 1; count <= rows; count++) {
                System.out.print(count);
            }
            System.out.println();
        }

        //Question 3
        System.out.println("Please input a number: ");
        int userNum3 = myScanner.nextInt();
        for (int rows = 1; rows <= userNum; rows++) {
            for (int count = 1; count <= rows; count++) {
                System.out.print(rows);
            }
            System.out.println();
        }
    }
}
