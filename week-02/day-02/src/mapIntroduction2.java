import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapIntroduction2 {

  public static void main(String[] args) {

    Map<String, String> hm = new HashMap<>();

    hm.put("978-1-60309-452-8","A Letter to Jo");
    hm.put("978-1-60309-459-7","Lupus");
    hm.put("978-1-60309-444-3","Red Panda and Moon Bear");
    hm.put("978-1-60309-461-0","The Lab");


    for (String key : hm.keySet()){

      System.out.println(key + " (" + hm.get(key) + ")");

    }

    String returnedVal = hm.remove("978-1-60309-444-3");
    System.out.println("Returned: " + returnedVal);
    System.out.println(hm);


    String valToRemove = "The Lab";

    for(String key : hm.keySet()){

      if (hm.get(key).equals(valToRemove)){

        hm.remove(key);

      }

    }

    hm.put("978-1-60309-450-4", "They Called Us Enemy");
    hm.put("978-1-60309-453-5", "Why Did We Trust Him?");

    System.out.println(hm.containsKey("478-0-61159-424-8"));

    System.out.println(hm.get("978-1-60309-453-5"));

  }
}
