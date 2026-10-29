/**
 * Author: Lucas Wang
 * Date: Oct 28, 2026
 * File Name: EnrichmentTask2
 * Description: The answer to problem J2 of the 2026 Canadian Computing Competition Junior Problems
 * Problem: An athlete participating in an Olympic event is scored by a panel of five judges. Each judge
 *          gives the athlete an integer score from 0 to 10 (inclusive).
 *          To ensure that the scoring is fair, one occurrence of the highest score is removed and one occurrence
 *          of the lowest score is removed. The athlete's overall score is then determined by
 *          summing the three remaining scores and multiplying this total by the event's designated difficulty factor.
 *          Given the scores from the panel of judges and the event's difficulty factor, your job is to determine
 *          the athlete's overall score.
 */

import java.util.Arrays;
import java.util.Scanner;
public class EnrichmentTask2 {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Please enter your score (0 - 10): ");
            scores[i] = myScanner.nextInt();
        }
        System.out.println("Please enter the difficulty of the competition: ");
        int diff = myScanner.nextInt();
        Arrays.sort(scores);
        int totalScores = scores[1] + scores[2] + scores[3];
        int finalScore = totalScores * diff;
        System.out.println("Your overall score is: " + finalScore);
    }
}
