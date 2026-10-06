import java.util.Scanner;

public class SelectionEx4B {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a secret number: ");
        double secretNum = myScanner.nextDouble();
        System.out.println("Please enter a new number: ");
        double newNum = myScanner.nextDouble();
        if (secretNum == newNum) {
            System.out.println("You got it!");
        }
        else {
            System.out.println("Guess Again!");
        }

        String password;
        password = "happy";
        System.out.println("Please enter the password: ");
        String newPassword = myScanner.nextLine();
        if (password.equals(newPassword)) {
            System.out.println("You are logged in.");
        }
        else {
            System.out.println("Incorrect Password.");
        }

        

    }
}
