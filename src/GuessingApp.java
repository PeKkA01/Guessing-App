
import java.util.*;

public class GuessingApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Guessing App");
        System.out.println("============================");

        GameConfig gcon = new GameConfig();
        gcon.showRule();

        Scanner sc = new Scanner(System.in);
        int attempt = 0;
        int hintsUsed = 0;
        boolean guessedCorrect = false;

        while (attempt < gcon.getMax_Attempts()) {

            try {
                System.out.print("Enter your guess: ");

                int guess = GuessValidator.getValidGuess(sc, 1, 100);
                attempt++;

                int result = GuessValidator.compareGuess(
                        guess, gcon.getTargetNumber());

                if (result == 0) {
                    System.out.println("Correct! You guessed in "
                            + attempt + " attempts");
                    guessedCorrect = true;
                    break;
                }
                else if (result == -1) {
                    System.out.println("Too LOW! Try higher.");
                }
                else {
                    System.out.println("Too HIGH! Try lower.");
                }


                if (!guessedCorrect && hintsUsed < gcon.getMax_Hints()) {
                    hintsUsed++;
                    String hint = HintService.generation(
                            gcon.getTargetNumber(), hintsUsed);
                    System.out.println(hint);
                }

            } catch (InvalidGuessException e) {
                System.out.println(e.getMessage());
            }
        }

        if (!guessedCorrect) {
            System.out.println("Game Over!");
            System.out.println("Correct number was: "
                    + gcon.getTargetNumber());
        }

        sc.close();
    }
}
