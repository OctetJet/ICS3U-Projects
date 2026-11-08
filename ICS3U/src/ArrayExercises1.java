/**
 * Author: Lucas Wang
 * Date: Nov 8, 2026
 * File Name: ArrayExercises1
 * Description: The code to answer the questions in the Array Exercises 1 document
 */

import java.util.Scanner;
import java.util.Arrays;
public class ArrayExercises1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Question 1
        int[] values = new int[20];
        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;
        }
        System.out.println(Arrays.toString(values));
        int totalValues = 0;
        for (int Nums : values) {
            totalValues += Nums;
        }
        System.out.println(totalValues);
        System.out.println();

        // Question 2
        // Part a
        int[] userNums = new int[10];
        for (int i = 0; i < userNums.length; i++) {
            System.out.println("Please enter a number: ");
            userNums[i] = myScanner.nextInt();
        }
        System.out.println(Arrays.toString(userNums));
        // Part b
        for (int i = 0; i < userNums.length / 2; i++) {
            int temp = userNums[i];
            userNums[i] = userNums[userNums.length -1 -i];
            userNums[userNums.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(userNums));
        // Part c
        int count = 0;
        for (int i = 0; i < userNums.length; i++) {
            if (userNums[i] % 2 == 0) {
                count++;
            }
        }
        int[] positiveNums = new int[count];
        int index = 0;
        for (int i = 0; i < userNums.length; i++) {
            if (userNums[i] > 0) {
                positiveNums[index] = userNums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(positiveNums));
        // Part d
        int count2 = 0;
        for (int i = 0; i < userNums.length; i++) {
            if (userNums[i] < 0) {
                count2++;
            }
        }
        int[] negativeNums = new int[count2];
        int index2 = 0;
        for (int i = 0; i < userNums.length; i++) {
            if (userNums[i] < 0) {
                negativeNums[index2] = userNums[i];
                index2++;
            }
        }
        System.out.println(Arrays.toString(negativeNums));
        // Part e
        System.out.println("Please enter a limit: Greater than _____ ");
        int limit = myScanner.nextInt();
        int count3 = 0;
        for (int i = 0; i < userNums.length; i++) {
            if (userNums[i] >= limit) {
                count3++;
            }
        }
        int[] limitNums = new int[count3];
        int index3 = 0;
        for (int i = 0; i < userNums.length; i++) {
            if (userNums[i] >= limit) {
                limitNums[index3] = userNums[i];
                index3++;
            }
        }
        System.out.println(Arrays.toString(limitNums));
        System.out.println();

        // Question 3
        myScanner.nextLine();
        String[] userWords = new String[10];
        for (int i = 0; i < userWords.length; i++) {
            System.out.println("Please enter a word: ");
            userWords[i] = myScanner.nextLine();
        }
        System.out.println(Arrays.toString(userWords));
        System.out.println();

        // Question 4
        String[] lastNames = new String[10];
        String[] firstNames = new String[10];
        double[] marks = new double[10];
        String[] outcome = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter the last name: ");
            lastNames[i] = myScanner.nextLine();
            System.out.println("Please enter the first name: ");
            firstNames[i] = myScanner.nextLine();
            System.out.println("Please enter the mark 0-100: ");
            marks[i] = myScanner.nextDouble();
            myScanner.nextLine();
            System.out.println("Please enter if they have passed (50 >) or failed (50 < ): ");
            outcome[i] = myScanner.nextLine();
        }
        for (int i = 0; i < marks.length ; i++) {
            if (outcome[i].equalsIgnoreCase("pass")) {
                System.out.println("This student passed: ");
                System.out.println(lastNames[i]);
                System.out.println(firstNames[i]);
                System.out.println(marks[i]);
            }
            else {
                System.out.println("This student failed: ");
                System.out.println(lastNames[i]);
                System.out.println(firstNames[i]);
                System.out.println(marks[i]);
            }
        }

        // Question 5
        int count4 = 0;
        int[] userNums2 = new int[10];
        for (int i = 0; i < userNums.length; i++) {
            count4++;
            System.out.println("Please enter an integer: ");
            userNums2[i] = myScanner.nextInt();
        }
        int[] positiveNums2 = new int[count4];
        int index4 = 0;
        for (int i = 0; i < userNums.length; i++) {
            if (userNums2[i] > 0) {
                positiveNums2[index4] = userNums2[i];
                index4++;
            }
        }
        System.out.println(Arrays.toString(positiveNums2));
        int[] negativeNums2 = new int[count4];
        int index5 = 0;
        for (int i = 0; i < userNums.length; i++) {
            if (userNums2[i] < 0) {
                negativeNums2[index5] = userNums2[i];
                index5++;
            }
        }
        System.out.println(Arrays.toString(negativeNums2));
        // Question 6
        int maxValues = 10;
        String[] lastNames2 = new String[maxValues];
        String[] firstNames2 = new String[maxValues];
        double[] marks2 = new double[maxValues];
        int count5 = 0;
        do {
            System.out.println("Please enter the last name: ");
            lastNames2[count5] = myScanner.nextLine();
            System.out.println("Please enter the first name: ");
            firstNames2[count5] = myScanner.nextLine();
            System.out.println("Please enter the mark: ");
            double inputMark = myScanner.nextDouble();
            myScanner.nextLine();
            if (inputMark < 0) {
                System.out.println("Negative mark entered.");
                break;
            }
            marks2[count5] = inputMark;
            count5++;
        } while (count5 < maxValues);
        for (int i = 0; i < marks2.length; i++) {
            System.out.println(lastNames2[i]);
            System.out.println(firstNames2[i]);
            System.out.println(marks2[i]);
            System.out.println();
        }
        double sum = 0;
        for (int i = 0; i < count5; i++) {
            sum =+ marks2[i];
        }
        double average = sum / marks2.length;
        System.out.println("The class average is: " + average);
    }
}
