import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    double distanceKm;
    double ratio = 0.62137119224;
    double distanceMiles;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the distance in kilometres: ");
    distanceKm = scanner.nextInt();
    distanceMiles = distanceKm * ratio;
    System.out.println(distanceMiles + " miles");
  }
}