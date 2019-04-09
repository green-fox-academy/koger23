import java.util.*;

public class QuoteSwap {
  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().

    // Also, print the sentence to the output with spaces in between.
    System.out.println(quoteSwap(list));
    // Expected output: "What I cannot create I do not understand."

  }

  public static String quoteSwap(ArrayList<String> arrayList){

    String result = "";

    String word1 = "";
    String word2 = "";

    word1 = "cannot";
    word2 = "do";

    arrayList.set(arrayList.indexOf(word2), word1);
    arrayList.set(arrayList.indexOf(word1), word2);

    for (String word : arrayList){
      result += word + " ";
    }
    return result;

  }
}