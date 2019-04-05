import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {


  private static class Player {

    private int lives = 5;

    public Player() {
    }

    public void decreaseLives() {

      System.out.println("You have only " + --lives + " lives left.");

    }

  }

  public static void main(String[] args) {

    guessing();

  }

  public static void guessing() {

    Player player = new Player();

    Random random = new Random();

    int randomNumber = random.nextInt(100 - 1);
    int guessNumber;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Guess a number between 1 and 100: ");
    guessNumber = scanner.nextInt();

    do {

      if (player.lives != 1) {

        if (guessNumber < randomNumber) {

          System.out.println("Too low...");
          player.decreaseLives();

        } else if (guessNumber > randomNumber) {

          System.out.println("Too high...");
          player.decreaseLives();

        } else {
          System.out.println("Congratulations. You won!");
          break;
        }
      } else {
        System.out.println("You died. Game over.");
        break;
      }

      System.out.println("Guess again between 1-100: ");
      guessNumber = scanner.nextInt();

    } while (guessNumber != randomNumber);
  }
}