import java.util.*;
 class GameConfig {
     private final int MIN = 1;
     private final int MAX = 100;
     private final int Max_Attempts = 7;
     private final int Max_Hints = 3;
     private int targetNumber;
     public  GameConfig(){
      Random r  = new Random();
      this.targetNumber = r.nextInt(MAX - MIN + 1) + MIN;
     }

  public int getTargetNumber() {
   return targetNumber;
  }

  public int getMax_Attempts() {
   return Max_Attempts;
  }

  public int getMax_Hints() {
   return Max_Hints;
  }

  public void showRule(){
   System.out.println("Guess a number between " + MIN + " and " + MAX );
   System.out.println("You have " + Max_Attempts + " attempts");
   System.out.println("Hints will be provided after wrong guesses");
   System.out.println();
  }

 }
