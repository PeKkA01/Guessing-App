import java.io.*;

class StorageService {

    private static final String FILE_NAME = "gameresult.txt";

    // save result to file
    public static void saveResult(String playerName, int attempts, boolean win) {

        try {
            FileWriter fw = new FileWriter(FILE_NAME, true); // append mode
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Player: " + playerName +
                    " | Attempts: " + attempts +
                    " | Result: " + (win ? "WIN" : "LOSE"));
            bw.newLine();

            bw.close();
            System.out.println("Game result saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving result.");
        }
    }

    // read previous results
    public static void showResults() {

        System.out.println("\n---- Previous Game Records ----");

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("No previous records found.");
        }
    }
}
