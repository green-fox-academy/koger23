public class TakesLonger {

  public static void main(String... args){

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    String textToInsert = "always takes longer than";

    String quotePart_1 = quote.substring(0, quote.indexOf("you expect"));

    String quotePart_2 = quote.substring(quote.indexOf(" you expect"), quote.length());

    quote = quotePart_1 + textToInsert + quotePart_2;

    System.out.println(quote);
  }
}