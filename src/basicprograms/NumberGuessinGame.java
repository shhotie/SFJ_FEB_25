package basicprograms;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessinGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create Random class object
        Random random = new Random();
        int randomNo = random.nextInt(100) + 1;

        int guess = 0;
        while (guess != randomNo){
            System.out.println("Guess the number: ");
            guess = sc.nextInt();

            if (guess < randomNo){
                System.out.println("Too low!");
            } else if (guess > randomNo) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! The number was " + randomNo);
            }
        }
        sc.close();
    }
}
