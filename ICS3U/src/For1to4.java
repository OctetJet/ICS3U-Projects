/**
 * Author: Lucas Wang
 * Date: Oct 15, 2026
 * File Name: For1to4
 * Description: The first 4 for loop questions in the Exercise 5: For Loop file
 */
import java.util.Scanner;
public class For1to4 {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //For 1
        System.out.println("Please enter your name: ");
        String userName = myScanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println("Your name is " + userName);
        }

        //For 2
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        //For 3
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }

        //For 4
        for (int i = 0; i <10; i++) {
            System.out.println(i +". " + userName);
        }
    }
}
