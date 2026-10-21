/**
 * Author: Lucas Wang
 * Date: Oct 20, 2026
 * File Name: WhileLoopPA
 * Description: A set of 4 questions to practice how to use while loops
 */

import java.util.Scanner;
public class WhileLoopPA {
    public static void main (String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //Question 1
        int num = 0;
        System.out.println("Please enter your name: ");
        String userName = myScanner.nextLine();
        while (num < 10) {
            System.out.println("Your name is " + userName);
            num++;
        }

        //Question 2
        int num2 = 0;
        while (num2 <= 99) {
            System.out.println(num2);
            num2++;
        }

        //Question 3
        int num3 = 0;
        while (num3 <= 99) {
            System.out.println(num3);
            num3++;
        }
        int num4 = 100;
        while (num4 >= 0) {
            System.out.println(num4);
            num4--;
        }

        //Question 4
        int num5 = 1;
        System.out.println("Please enter your name: ");
        String userName2 = myScanner.nextLine();
        while (num5 < 11) {
            System.out.println(num5 + ". " + userName2);
            num5++;
        }
    }
}