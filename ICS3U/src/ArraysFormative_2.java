/**
 * Author: Lucas Wang
 * Date: Nov 19, 2026
 * File Name: ArraysFormative_2
 * Description: The programmed solution for the coding question in the second arrays formative test.
 */
import java.util.Scanner;
import java.util.Arrays;
class ArraysFormative_2 {
    //This main is the entry point for the program to run
    public static void main(String args[]) {
    // Declares a new scanner and array
        Scanner myScanner = new Scanner(System.in);
        int[] userNums = new int[10];
        // Asks the user to enter values to fill the array
        for (int i = 0; i < userNums.length; i++) {
            System.out.println("Please enter an integer: ");
            userNums[i] = myScanner.nextInt();
        }
        // Uses bubble sort code to sort the values in the array in ascending order
        for (int pass = 0; pass < userNums.length; pass++) {
            for (int i = 0; i < userNums.length - 1 - pass; i++) {
                if (userNums[i] > userNums[i + 1]) {
                    int temp = userNums[i];
                    userNums[i] = userNums[i + 1];
                    userNums[i + 1] = temp;
                }
            }
        }
        // An alternative way to sort values in an array
        // Arrays.sort(userNums);

        // Prints the max num in the array
        System.out.println("The max num in the array is: " + userNums[9]);

        // Uses a for loop and if statement to print the values in the array that are > 0
        for (int i = 0; i < userNums.length; i++) {
            if (userNums[i] > 0) {
                System.out.println(userNums[i]);
            }
        }
        // Prints the values in the array in a well formatted way
        System.out.println(Arrays.toString(userNums));
    }
}
