public class StringsAgain {

  public static void main(String[] args) {

    /*
    * Given a string, compute recursively a new string where all the 'x' chars have been removed.
    */

    System.out.println(stringsAgain("axoxoxon"));

  }

  private static String stringsAgain(String text) {

    int length = text.length();

    if (length == 1){
      return text;

    } else {
      String subString = text.substring(0, length - 1);
      String lastString = text.substring(length - 1, length);

      if (lastString.equals("x")){
        lastString = "";
      }

      return stringsAgain(subString) + lastString;

    }
  }

}
