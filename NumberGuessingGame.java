import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
        // System.out.println("Random number is: " + randomNumber);

        int tryCount = 0;
        while (true) {
            System.out.println("Enter your guess (1 - 100): ");

            int plyareGuess = scanner.nextInt();
            tryCount++; //to count how many tries the user took to guess the correct number...

            if (plyareGuess == randomNumber) { //if the guessedNumber is equal to randomNuber condition will run...
                System.out.println("Correct.. You Win...!");
                System.out.println("It took you " + tryCount + " tries to guess the correct number");
                break;
            } else if (randomNumber > plyareGuess) {
                System.out.println("Nope! your guess is lower than RandomNumber, guess higher number...");
            } else {
                System.out.println("Nope! your guess is higher than RandomNumber, guess lower number...");
            }
        }
        scanner.close(); //to protect the code from leaking...
    }
}