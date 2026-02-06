public class GuessValidator {
    public static String ValidatorGuess(int guess , int target){
        if(guess == target){
            return "Correct";
        }
        else if (guess < target) {
            return "Low";
        }
        else {
            return "High";
        }
    }
}
