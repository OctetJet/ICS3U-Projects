/**
 * Author: Lucas Wang
 * Date: Oct 20, 2026
 * File Name: EnrichmentTask
 * Description: One CCC problem to practice problem-solving.
 */

import java.util.Scanner;
public class EnrichmentTask {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many packages were delivered: ");
        int p = myScanner.nextInt();
        System.out.println("How many collisions occurred: ");
        int c = myScanner.nextInt();
        int totalPoints = 0;
        int pp = p * 50;
        int numC = c * (-10);
        totalPoints = pp + numC;
        if (p > c) {
            totalPoints = totalPoints + 500;
        }
        System.out.println("The total points earned are " + totalPoints);
    }
}