/**
 * Author: Lucas Wang
 * Date: Nov 11, 2026
 * File Name: ArrayProcessing2
 * Description: Practice using the arrays techniques taught in class
 */

import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayProcessing2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Part A
        // Question 1
        double[] userNums = new double[10];
        for (int i = 0; i < userNums.length; i++) {
            System.out.println("Please enter a number with a decimal: ");
            userNums[i] = myScanner.nextDouble();
        }
        Arrays.sort(userNums);
        System.out.println("The maximum number is: " + userNums[9]);
        System.out.println("The minimum number is: " + userNums[0]);
        double sum = 0;
        for (int i = 0; i < userNums.length; i++) {
            sum += userNums[i];
        }
        System.out.println("The total of all the numbers is " + sum);
        System.out.println();

        // Question 2
        double[] userNums2 = new double[10];
        for (int i = 0; i < userNums2.length; i++) {
            System.out.println("Please enter a number with a decimal: ");
            userNums2[i] = myScanner.nextDouble();
        }
        System.out.println("Please enter a search value: ");
        double searchValue = myScanner.nextDouble();
        for (int i = 0; i < userNums2.length; i++) {
            if (userNums2[i] == searchValue) {
                System.out.println("The index number where your value was stored is: " + i);
            }
        }
        System.out.println();

        // Question 3
        double[] values = {2.3, 8.5, 4.5, 6.7, 3.2, 7.0, 6.5, 13.6, 9.7, 2.8};
        values[2] = 7.0;
        System.out.println(values[2]);
        values[5] = values[5] + 2;
        System.out.println(values[5]);
        values[4] = values[3] - values[0];
        System.out.println(values[4]);
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 7.0) {
                count++;
            }
        }
        System.out.println("There are " + count + " index numbers with a value of 7.0");
        values[0] = values[9];
        values[9] = 2.3;
        System.out.println();

        // Question 4
        String[] words = {"apple", "banana", "strawberry", "blueberry", "tomato", "watermelon", "banana", "avocado", "grapefruit"};
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "banana")) {
                System.out.println("The index is " + i);
                words[i] = "pear";
            }
        }
        System.out.println();

        // Part B
        // Question 1
        String[] namesList1 = {"Tom", "Sandy", "Flora", "Tony"};
        String[] namesList2 = {"Prosper", "Patrick", "Ryan", "Amy", "Susan"};
        String[] studentNames = new String[namesList1.length + namesList2.length];
        int index = 0;
        for (int i = 0; i < namesList1.length; i++) {
            studentNames[index] = namesList1[i];
            index++;
        }
        for (int i = 0; i < namesList2.length; i++) {
            studentNames[index] = namesList2[i];
            index++;
        }
        System.out.println();

        // Question 2
        // a)
        int[] values2 = {1, 3, 5, 4, 7};
        int temp = values2[3];
        values[3] = values[4];
        values[4] = temp;
        System.out.println(Arrays.toString(values2));
        // b)
        int[] values3 = {1, 3, 5, 4, 7};
        int temp2 = values3[0];
        values[0] = values[1];
        values[1] = temp2;
        System.out.println(Arrays.toString(values3));
        System.out.println();

        // Question 3
        String[] values4 = {"one", "two", "five", "seven", "six", "nine"};
        String temp3 = values4[4];
        values4[4] = values4[5];
        values4[5] = temp3;
        System.out.println(Arrays.toString(values4));
        System.out.println();

        // Part C
        // Question 1
        int[] userNums3 = new int[5];
        for (int i = 0; i < userNums3.length; i++) {
            System.out.println("Please enter a number: ");
            userNums3[i] = myScanner.nextInt();
        }
        // Part A
        for (int pass = 0; pass < userNums3.length; pass++) {
            for (int i = 0; i < userNums3.length - 1; i++) {
                if (userNums3[i] > userNums3[i + 1]) {
                    int temp4 = userNums3[i];
                    userNums3[i] = userNums3[i + 1];
                    userNums3[i + 1] = temp4;
                }
            }
        }
        System.out.println(Arrays.toString(userNums3));
        // Part B
        for (int pass = 0; pass < userNums3.length; pass++) {
            for (int i = 0; i < userNums3.length - 1; i++) {
                if (userNums3[i] < userNums3[i + 1]) {
                    int temp5 = userNums3[i];
                    userNums3[i] = userNums3[i + 1];
                    userNums3[i + 1] = temp5;
                }
            }
        }
        System.out.println(Arrays.toString(userNums3));
        System.out.println();
        myScanner.nextLine();

        // Question 2
        String[] userNames = new String[5];
        for (int i = 0 ; i < userNames.length; i++) {
            System.out.println("Please enter a name: ");
            userNames[i] = myScanner.nextLine();
        }
        for (int pass = 0; pass < userNames.length; pass++) {
            for (int i = 0; i < userNames.length - 1 - pass; i++) {
                if (userNames[i].compareToIgnoreCase(userNames[i + 1]) > 0) {
                    String temp6 = userNames[i];
                    userNames[i] = userNames[i + 1];
                    userNames[i + 1] = temp6;
                }
            }
        }
        System.out.println(Arrays.toString(userNames));
        System.out.println();

        // Question 3
        System.out.println("How many names would you like to enter: ");
        int numNames = myScanner.nextInt();
        String[] userNames2 = new String[numNames];
        myScanner.nextLine();
        for (int i = 0; i < userNames2.length; i++) {
            System.out.println("Please enter a name: ");
            userNames2[i] = myScanner.nextLine();
        }
        for (int pass = 0; pass < userNames2.length; pass++) {
            for (int i = 0; i < userNames2.length - 1 - pass; i++) {
                if (userNames2[i].compareToIgnoreCase(userNames2[i + 1]) > 0) {
                    String temp6 = userNames2[i];
                    userNames2[i] = userNames2[i + 1];
                    userNames2[i + 1] = temp6;
                }
            }
        }
        System.out.println(Arrays.toString(userNames2));
        System.out.println();

        // Question 4
        String[] userNames3 = new String[5];
        double[] marks2 = new double[5];
        for (int i = 0; i < marks2.length; i ++) {
            System.out.println("Please enter the student's name: ");
            userNames3[i] = myScanner.nextLine();
            System.out.println("Please enter the student's mark: ");
            marks2[i] = myScanner.nextDouble();
            myScanner.nextLine();
        }
        for (int pass = 0; pass < marks2.length; pass++) {
            for (int i = 0; i < marks2.length - 1 - pass; i++) {
                if (marks2[i] < marks2[i + 1]) {
                    double temp7 = marks2[i];
                    marks2[i] = marks2[i + 1];
                    marks2[i + 1] = temp7;
                    String temp8 = userNames3[i];
                    userNames3[i] = userNames3[i + 1];
                    userNames3[i + 1] = temp8;
                }
            }
        }
        for (int i = 0; i < userNames3.length; i ++) {
            System.out.println("Student Name: " + userNames3[i]);
            System.out.println("Student Mark: " + marks2[i]);
            System.out.println();
        }
    }
}