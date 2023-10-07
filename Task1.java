package Task1;
import java.util.*;

public class Task1  {
     private int minrange; 
     private int maxrange;
     private int maxAttempts;
     private int score;
     private int targetNumber;
     private int i;
     private Scanner scanner;

public Task1() {
     scanner = new Scanner(System.in);
     System.out.println ("Enter lower limit of range: ");
     minrange = scanner. nextInt () ;
     System.out.println("Enter upper limit of range: ");
     maxrange = scanner.nextInt () ;
     System.out.println ("Enter maximum attempts: ");
     maxAttempts = scanner.nextInt();
     score = 0;
     targetNumber = new Random ().nextInt (maxrange - minrange + 1) + minrange;
     i = 0;
}

public void play () {
     for (i = 0; i < maxAttempts; i++) {
          System.out.println("I'm thinking of a number between " + minrange + " and " + maxrange +".");
          System.out.print ("What is your guess? ");
          int guess = scanner.nextInt ();
          
          if (guess == targetNumber) {
              System.out.println ("Hurray!!!!! Your guess is right."); 
              score++;
              break;
          } else if (guess < targetNumber) {
                 System.out.println("I think the number is greater than this.");
          } else {      
              System.out.println("I think the number is less than this!");
          }
     }
     
     if (i == maxAttempts ) {
    	 System.out.println("Out of attempts");
    	 System.out.println("The correct number was: " + targetNumber);
     }
     
     System.out.println("Your score is: " + score);
     System.out.println ("Do you want to continue playing? (yes/no) ");
     String choice = scanner. next () ;
     if (choice.equalsIgnoreCase ("yes")) {
    	 resetGame();
    	 play();
    	 
     } else {
    	 System.out.println("Thank you for playing!");
     }
}

private void resetGame () {
     targetNumber = new Random().nextInt (maxrange - minrange + 1) + minrange;
     i = 0;
}

public static void main (String [] args) {
     Task1 game = new Task1 ();
     game.play();
     game.scanner.close();
    }
}