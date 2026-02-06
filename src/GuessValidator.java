
import java.util.Scanner;

class GuessValidator {


    public static int getValidGuess(Scanner sc, int min, int max)
            throws InvalidGuessException {

        if (!sc.hasNextInt()) {
            sc.next();
            throw new InvalidGuessException(
                    "Invalid input! Enter numbers only.");
        }

        int guess = sc.nextInt();

        if (guess < min || guess > max) {
            throw new InvalidGuessException(
                    "Enter number between " + min + " and " + max);
        }

        return guess;
    }


    public static int compareGuess(int guess, int target) {

        if (guess == target)
            return 0;
        else if (guess < target)
            return -1;
        else
            return 1;
    }
}

