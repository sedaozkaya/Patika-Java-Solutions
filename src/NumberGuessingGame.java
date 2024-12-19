import java.util.Scanner;
import java.util.ArrayList;

public class NumberGuessingGame {
    static int remainingTries = 5;
    static ArrayList<Integer> wrongAnswers = new ArrayList<>();

    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");

        while (remainingTries > 0) {
            int guess = getGuess(scanner);

            if (guess < 0 || guess >= 100) {
                System.out.println("Invalid input! Please enter a number between 0 and 99.");
                remainingTries--;
                if (remainingTries == 0) {
                    break;
                }
                System.out.println("If you enter another invalid input, you will lose a chance.");
                continue;
            }

            if (number == guess) {
                System.out.println("Congratulations! You guessed correctly.");
                break;
            }

            wrongAnswers.add(guess);
            remainingTries--;

            if (guess < number) {
                System.out.println("Think of a larger number.");
            } else {
                System.out.println("Think of a smaller number.");
            }

            if (remainingTries > 0) {
                System.out.println("Remaining tries: " + remainingTries);
            } else {
                System.out.println("You lost! The correct number was: " + number);
            }
        }

        if (remainingTries == 0) {
            System.out.println("Your wrong guesses: " + wrongAnswers);
        }
    }

    public static int getGuess(Scanner scanner) {
        System.out.print("Enter a guess (between 0 and 99): ");
        return scanner.nextInt();
    }
}
