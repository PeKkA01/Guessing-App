import java.util.*;
public class GuessingApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing App");
        System.out.println("============================");
        GameConfig gcon = new GameConfig();
        gcon.showRule();
        Scanner sc = new Scanner(System.in);
        int attempt = 0;
        while(attempt < gcon.getMax_Attempts()){
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();
            attempt ++;
            String result = GuessValidator.ValidatorGuess(guess,gcon.getTargetNumber());
            if(result.equals("Correct")){
                System.out.println("Correct! You guessed the number in " +attempt+ " Attempts");
                break;
            } else if (result.equals("Low")) {
                System.out.println("Your guess is Low. Try Higher! ");
            }
            else {
                System.out.println("Your guess is high. Try Lower! ");
            }

        }
        if(attempt == gcon.getMax_Attempts()){
            System.out.println("Game Over! Your All Attempts are Failed");
            System.out.println("Correct Number was: " +gcon.getTargetNumber());
        }

    }
}
