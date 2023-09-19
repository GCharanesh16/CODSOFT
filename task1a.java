import java.util.Random;
import java.util.Scanner;

public class task1a {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        System.out.println("Random number: " + randomNumber);
        random = new Random();
        randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        System.out.println("Your guess: " + userGuess);


        randomNumber = random.nextInt(100) + 1;

        scanner = new Scanner(System.in);
            int attempts = 0;

            while (true) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();

                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! Your guess is correct.");
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (attempts >= 3) {
                    System.out.println("You have reached the maximum number of attempts.");
                    break;
                }
            }
        {
            int minRange = 1;
            int maxRange = 100;
            int generatedNumber;
            int maxAttempts = 3;
            attempts = 0;
            boolean guessedCorrectly = false;

            random = new Random();
            scanner = new Scanner(System.in);

            generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;

            while (!guessedCorrectly && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == generatedNumber) {
                    System.out.println("Congratulations! Your guess is correct.");
                    guessedCorrectly = true;
                } else if (guess < generatedNumber) {
                    System.out.println("Too low. Try guessing a higher number.");
                } else {
                    System.out.println("Too high. Try guessing a lower number.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts. The correct number was: " + generatedNumber);
            }

            scanner.close();
        }
        {
            random = new Random();
            randomNumber = random.nextInt(100) + 1;
            System.out.println("Random number: " + randomNumber);

            scanner = new Scanner(System.in);
            attempts = 0;
            int score = 0; // User's score

            while (attempts < 3) {
                System.out.print("Enter your guess: ");
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! Your guess is correct.");
                    score = 100 - (attempts * 10); // Calculate score based on attempts
                    break;
                } else {
                    System.out.println("Oops! Your guess is incorrect.");
                }
            }

            System.out.println("Score: " + score);
        }

        }

    }