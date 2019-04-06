import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {


  private static class Player {

    private int lives = 5;

    public Player(int lives) {

      this.lives = lives;

    }

    public void decreaseLives() {

      if (lives != 0) {
        System.out.println("You have only " + --lives + " lives left.");
      } else {
        System.out.println("This is your last chance...");
      }

    }

    public int getLives() {
      return this.lives;
    }

    public void setLives(int lives) {

      this.lives = lives;

    }
  }

  public static void main(String[] args) {

    guessing();

  }

  public static void guessing() {

    int min;
    int max;

    Player player;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // set range
    System.out.println("Please give the range: ");
    System.out.print("From: ");
    min = scanner.nextInt();

    do {
      System.out.print("To (higher than " + min + "): ");
      max = scanner.nextInt();

      if (max <= min) {
        System.out.println("The upper limit must be higher than the lower one (from < to). Try again.");
      }

    } while (min >= max);

    // set lives
    System.out.println("Please give the number of maximum lives (tries):");

    int lives;
    do {
      lives = scanner.nextInt();

      if (lives < 1){
        System.out.println("It must be minimum 1. Try again.");
      }

    } while (lives < 1);
    player = new Player(lives);

    int randomNumber = random.nextInt(max - min) + min;
    int guessNumber;


    System.out.print("Guess a number between " + min + " and " + max + ": ");
    guessNumber = scanner.nextInt();



    do {

      if (player.lives != 0) {

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
        System.out.println("The number was: " + randomNumber);
        break;
      }

      System.out.println("Guess again between 1-100: ");
      guessNumber = scanner.nextInt();

    } while ((player.lives > 0) && (guessNumber != randomNumber));
    System.out.println("Congratulations. You won!");
  }
}