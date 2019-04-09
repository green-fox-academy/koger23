import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {

  public static void main(String[] args) {

    Map<String, String> phoneBook = new HashMap<>();

    phoneBook.put("William A. Lathan", "405-709-1865");
    phoneBook.put("John K. Miller", "402-247-8568");
    phoneBook.put("Hortensia E. Foster", "606-481-6467");
    phoneBook.put("Amanda D. Newland", "319-243-5613");
    phoneBook.put("Brooke P. Askew", "307-687-2982");

    System.out.println("John K. Miller's phone number is: " + phoneBook.get("John K. Miller"));

    System.out.println("\nThe 307-687-2982 phone number belongs to " + whosePhoneNumber(phoneBook, "307-687-2982"));

    System.out.println("\nDo we know Chris E. Myers' phone number?");
    if (phoneBook.containsKey("Chris E. Myers")){
      System.out.println("Yes");
    } else {
      System.out.println("No.");
    }

  }

  private static String whosePhoneNumber(Map<String, String> phoneBook, String phoneNum) {

    String result = "nobody";

    for(String key : phoneBook.keySet()){

      if(phoneBook.get(key).equals(phoneNum)){
        result = key;
      }

    }

    return result;
  }

}
