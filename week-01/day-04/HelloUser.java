import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your username: ");
    String userName = scanner.next();
    System.out.println("Hello, " + userName + "!");
  }
}