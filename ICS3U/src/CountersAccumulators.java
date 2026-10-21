/**
 * Author: Lucas Wang
 * Date: Oct 20, 2026
 * File Name: CountersAccumulators
 * Description: A simple to add the numbers from 1-5 together with a for loop.
 */
public class CountersAccumulators {
    public static void main (String[] args) {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum = sum +i;
        }
        System.out.println(sum);
    }
}
