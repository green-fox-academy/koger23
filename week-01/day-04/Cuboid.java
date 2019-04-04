import java.util.Scanner;

public class Cuboid {
  // Write a program that stores 3 sides of a cuboid as variables (doubles)
  // The program should write the surface area and volume of the cuboid like:
  //
  // Surface Area: 600
  // Volume: 1000

  public static void main(String[] args) {

    double a, b, c, area, volume;

    a = 20;
    b = 30;
    c = 40;

    area = 2*(a * b + b * c + a * c);
    System.out.println("Surface Area: " + area);


    volume = a * b * c;
    System.out.println("Volume: " + volume);

  }

}
