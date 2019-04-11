public class StringsAgainAndAgain {

  public static void main(String[] args) {

    /*
    * Given a string, compute recursively a new string where all the adjacent chars are now separated by a *
    */

    System.out.println(stringsAaA("greenfox"));

  }

  private static String stringsAaA(String text) {

    int length = text.length();

    if (length == 1){
      return text;
    } else {
      String subString = text.substring(0, length - 1);
      String lastString = text.substring(length - 1, length);

      lastString = "*" + lastString;
      

      return stringsAaA(subString) + lastString;
    }
  }

}
