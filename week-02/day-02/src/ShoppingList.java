import java.util.Arrays;
import java.util.List;

public class ShoppingList {

  public static void main(String[] args) {

    List<String> shoppingList = Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken");

    System.out.println("Do we have milk on the list?");
    if(shoppingList.contains("milk")){
      System.out.println("Yes.");
    } else {
      System.out.println("No.");
    }

    System.out.println("Do we have milk on the list?");
    if(shoppingList.contains("bananas")){
      System.out.println("Yes.");
    } else {
      System.out.println("No.");
    }

  }
}
