import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {

  public static void main(String[] args) {
    calc();
  }

  public static void calc() {

    Scanner scanner = new Scanner(System.in);

    int inputNumber, lastItemIndex;
    boolean isOdd = false;

    List seats = new ArrayList<Integer>();
    List survivors = new ArrayList<Integer>();

    System.out.print("Please enter the number of seats: ");
    inputNumber = scanner.nextInt();

    // populating seat numbers
    for (int i = 0; i < inputNumber; i++) {
      seats.add(i + 1);
    }

    if (seats.size() % 2 != 0){
      isOdd = true;
    }
    System.out.println(seats.toString() +  " Len: " + seats.size());
    while (seats.size() > 1){

      for (int i=0; i<seats.size(); i+=2){
        survivors.add(seats.get(i));
      }

      if (isOdd){
        lastItemIndex = survivors.size() - 1;
        survivors.add(0, survivors.get(lastItemIndex));
        survivors.remove(survivors.size() - 1);
        isOdd = false;
      }

      seats = new ArrayList<Object>(survivors);

      if (seats.size() % 2 != 0){
        isOdd = true;
      }

      survivors.clear();
      System.out.println(seats.toString() + " Len: " + seats.size());
    }

    System.out.println("The winning seat is: " + seats.get(0));
  }
}
