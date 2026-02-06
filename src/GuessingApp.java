import java.util.*;
public class GuessingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.next();
        System.out.println("Welcome to the Guessing App");
        System.out.println("============================");
        GameConfig gcon = new GameConfig();
        gcon.showRule();

        int attempt = 0;
        int hintsUsed = 0;
        boolean guessedCorrect = false;
        while (attempt < gcon.getMax_Attempts()) {
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();
            attempt++;
            String result = GuessValidator.ValidatorGuess(guess, gcon.getTargetNumber());
            if (result.equals("Correct")) {
                System.out.println("Correct! You guessed the number in " + attempt + " Attempts");
                guessedCorrect = true;
                break;
            } else if (result.equals("Low")) {
                System.out.println("Your guess is Low. Try Higher! ");
            } else {
                System.out.println("Your guess is high. Try Lower! ");
            }


//        if(attempt == gcon.getMax_Attempts()){
//            System.out.println("Game Over! Your All Attempts are Failed");
//            System.out.println("Correct Number was: " +gcon.getTargetNumber());
//        }
            if (!guessedCorrect && hintsUsed < gcon.getMax_Hints()) {
                hintsUsed++;
                String hint = HintService.generation(
                        gcon.getTargetNumber(), hintsUsed);
                System.out.println(hint);
            }
        }
        if (!guessedCorrect) {
            System.out.println("Game Over! Attempts finished.");
            System.out.println("Correct number was: "
                    + gcon.getTargetNumber());
        }

    }

    }

