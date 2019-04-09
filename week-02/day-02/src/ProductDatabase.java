import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase {

  public static void main(String[] args) {

    Map<String, Integer> products = new HashMap<>();

    products.put("Eggs", 200);
    products.put("Milk", 200);
    products.put("Fish", 400);
    products.put("Apples", 150);
    products.put("Bread", 50);
    products.put("Chicken", 550);

    System.out.println("How much is the fish?: " + products.get("Fish"));

    System.out.println("What is the most expensive product? " + getMoreExpensive(products));

    System.out.println("What is the average price? " + getAveragePrice(products));

    System.out.println("How many products' price is below 300? " + getProductsBelowPrice(300, products));

    System.out.println("Is there anything we can buy for exactly 125? " + isProductForPrice(125, products));

    System.out.println("What is the cheapest product? " + getCheapestProduct(products));

  }

  private static int getProductsBelowPrice(int price, Map<String, Integer> products) {

    int counter = 0;

    for(String productKey : products.keySet()){

      if (products.get(productKey) < price){

        counter++;

      }

    }
    return counter;
  }

  private static List<String> isProductForPrice(int price, Map<String, Integer> products){

    List<String> filteredProducts = new ArrayList<>();

    for (String productKey : products.keySet()){

      if (products.get(productKey) == price){

        filteredProducts.add(productKey);
      }

    }

    if (filteredProducts.size() == 0){
      filteredProducts.add("There is nothing for this price");
    }

    return filteredProducts;
  }

  private static String getCheapestProduct(Map<String, Integer> products){

    String cheapest = "";
    Integer lowestPrice;
    List<Integer> prices = new ArrayList<>();

    for (String product : products.keySet()){

      prices.add(products.get(product));

      }

    lowestPrice = prices.get(0);

    for (int i : prices){

      if (lowestPrice > i){

        lowestPrice = i;
      }

    }

    for(String product : products.keySet()){

      if(lowestPrice == products.get(product)){

        cheapest = product;

      }

    }

    return cheapest;
  }

  private static double getAveragePrice(Map<String, Integer> products){

    int sum = 0;
    double avg;

    for (String product : products.keySet()){

      sum += products.get(product);

    }

    avg = sum / products.size();

    return avg;
  }

  private static String getMoreExpensive(Map<String, Integer> products){

    String moreExpensiveProduct = "";
    int lastPrice = 0;

    for (String product : products.keySet()){

      if (lastPrice < products.get(product)){

        lastPrice = products.get(product);
        moreExpensiveProduct = product;

      }

    }
    return moreExpensiveProduct;
  }
}
