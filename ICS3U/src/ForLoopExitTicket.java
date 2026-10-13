/**
 * Author: Lucas Wang
 * Date: Oct 13, 2026
 * File Name: ForLoopExitTicket
 * Description: A basic for loop that will print numbers from 1-500 that are divisible by 3, 4, and 5
 */
public class ForLoopExitTicket {
    public static void main (String[] args) {
        //Makes the loop check until the number 500 is reached
        for (int i = 1; i < 500; i++) {
           //Checks if the value of i is divisible by all 3 numbers
            if(i%3==0 && i%4==0 && i%5==0) {
                System.out.println(i);
            }
        }
    }
}
