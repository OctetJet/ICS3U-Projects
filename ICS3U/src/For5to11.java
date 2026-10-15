/**
 * Author: Lucas Wang
 * Date: Oct 15, 2026
 * File Name: For1to4
 * Description: The last 6 for loop questions in the Exercise 5: For Loop file
 */
import java.util.Scanner;
public class For5to11 {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //For 5
        System.out.println("Please enter a word: ");
        String word = myScanner.nextLine();
        System.out.println("How many times should the word be printed: ");
        int printNum = myScanner.nextInt();
        for (int i = 0; i < printNum; i++) {
            System.out.println(word);
        }

        //For 6
        for (int i = 0; i < printNum; i++) {
            System.out.println(i + ". " + word);
        }

        //For 7
        System.out.println("What number should I start counting up from: ");
        int numCountup = myScanner.nextInt();
        System.out.println("What number should I stop counting at: ");
        int numCounted = myScanner.nextInt();
        for (int i = numCountup; i <= numCounted; i++) {
            System.out.println(i);
        }

        //For 8
        int newSum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number: ");
            int userNum = myScanner.nextInt();
            newSum += userNum;
        }
        System.out.println("The sum of all the numbers you entered are " + newSum);

        //For 9
        double totalMarks = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter a mark: ");
            double newMark = myScanner.nextDouble();
            totalMarks += newMark;
        }
        double averageMark = totalMarks / 3;
        System.out.println("The average mark is " + averageMark);

        //For 10
        double high = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a mark: ");
            double mark = myScanner.nextDouble();

            if (mark > high) {
                high = mark;
            }
        }
        System.out.println("The highest mark is: " + high);

        //For 11
        double low = 1000;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a mark: ");
            double mark2 = myScanner.nextDouble();

            if (mark2 < low) {
                low = mark2;
            }
        }
        System.out.println("The lowest mark is:" + low);
    }
}
