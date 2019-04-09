import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {

  public static void main(String[] args) {

    Map<String, Double> products = new HashMap<>();
    Map<String, Integer> listBob = new HashMap<>();
    Map<String, Integer> listAlice = new HashMap<>();

    products.put("Milk", 1.07);
    products.put("Rice", 1.59);
    products.put("Eggs", 3.14);
    products.put("Cheese", 12.60);
    products.put("Chicken Breasts", 9.40);
    products.put("Apples", 2.31);
    products.put("Tomato", 2.58);
    products.put("Potato", 1.75);
    products.put("Onion", 1.10);

    listBob.put("Milk", 3);
    listBob.put("Rice", 2);
    listBob.put("Eggs", 2);
    listBob.put("Cheese", 1);
    listBob.put("Chicken Breasts", 4);
    listBob.put("Apples", 1);
    listBob.put("Tomato", 2);
    listBob.put("Potato", 1);

    listAlice.put("Rice", 1);
    listAlice.put("Eggs", 5);
    listAlice.put("Chicken Breasts", 2);
    listAlice.put("Apples", 1);
    listAlice.put("Tomato", 10);

    System.out.println("How much does Bob pay? " + getHowMuchToPay(products, listBob));

    System.out.println("\nHow much does Alice pay? " + getHowMuchToPay(products, listAlice));

    System.out.println("\nWho buys more Rice? " + whoBuysMore(listAlice, listBob, "Rice"));

    System.out.println("\nWho buys more Potato? " + whoBuysMore(listAlice, listBob, "Potato"));

    System.out.println("\nWho buys more different products? " + whoBuysMoreDiffProduct(listAlice, listBob));

    System.out.println("\nWho buys more products? (piece) " + whoBuysMoreProduct(listAlice, listBob));

  }

  private static String whoBuysMoreProduct(Map<String, Integer> aliceList, Map<String, Integer> bobList){

    String result = "They bought the same quantity.";

    int aliceQty = 0;
    int bobQty = 0;


    for (int i : aliceList.values()){

      aliceQty += i;

    }

    for (int i : bobList.values()){

      bobQty += i;

    }

    if (aliceQty > bobQty){

      result = "Alice";

    } else if (aliceQty > bobQty){

      result = "Bob";

    }

    return result;
  }

  private static String whoBuysMoreDiffProduct(Map<String, Integer> aliceList, Map<String, Integer> bobList){

    String result = "The variants of products are the same.";

    if (aliceList.size() > bobList.size()){

      result = "Alice";

    } else if (aliceList.size() < bobList.size()){

      result = "Bob";

    }
    return result;
  }

  private static String whoBuysMore(Map<String, Integer> aliceList, Map<String, Integer> bobList, String product){

    String result = "";
    int aliceQty = 0;
    int bobQty = 0;

    if (aliceList.containsKey(product)){
      aliceQty = aliceList.get(product);
    }

    if (bobList.containsKey(product)){
      bobQty = bobList.get(product);
    }

    if (aliceQty > bobQty){

      result = "Alice";

    } else if (aliceQty == bobQty){

      result = "They bought the same quantity";

    } else {

      result = "Bob";

    }

    return result;
  }

  private static double getHowMuchToPay(Map<String, Double> products, Map<String, Integer> shoppingList){

    double sum = 0;

    for (String key : shoppingList.keySet()){

      sum += products.get(key) * shoppingList.get(key);

    }

    return sum;
  }

}
