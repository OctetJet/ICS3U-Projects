/**
 * Author: Lucas Wang
 * Date: Oct 22, 2026
 * File Name: DoLoopPA
 * Description: The practice problem in the do while loop lesson
 */

import java.util.Scanner;
public class DoLoopPA {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //Question 1
        System.out.println("Please enter your name: ");
        String userName = myScanner.nextLine();
        int count = 0;
        do {
            System.out.println(userName);
            count++;
        } while (count < 10);
        System.out.println();

        //Question 2
        int count2 = 0;
        do {
            System.out.println(count2);
            count2++;
        } while (count2 < 100);
        System.out.println();

        //Question 3
        int count3 = 0;
        do {
            System.out.println(count3);
            count3++;
        } while (count3 < 100);
        int count4 = 99;
        do {
            System.out.println(count4);
            count4--;
        } while (count4 >= 0);
        System.out.println();

        //Question 4
        int count5 = 1;
        do {
            System.out.println(count5 + ". " + userName);
            count5++;
        } while (count5 < 11);
        System.out.println();
    }
}
