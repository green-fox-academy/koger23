import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase2 {

  public static void main(String[] args) {

    Map<String, Integer> products = new HashMap<>();

    products.put("Eggs", 200);
    products.put("Milk", 200);
    products.put("Fish", 400);
    products.put("Apples", 150);
    products.put("Bread", 50);
    products.put("Chicken", 550);

    System.out.println("Which products cost less than 201?"); // (just the name)
    printProductsLessThan(201, products);

    System.out.println("Which products cost more than 150? ");
    printProductsMoreThan(150, products); // (name + price)

  }

  private static void printProductsLessThan(int price, Map<String, Integer> products) {

    for(String key : products.keySet()){

      if(products.get(key) < price){

        System.out.println("\t" + key);
      }
    }

  }

  private static void printProductsMoreThan(int price, Map<String, Integer> products) {

    for(String key : products.keySet()){

      if(products.get(key) > price){

        System.out.println("\t" + key + " " + products.get(key));
      }
    }

  }

}
