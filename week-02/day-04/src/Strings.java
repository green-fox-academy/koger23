public class Strings {

  public static void main(String[] args) {

    /*
    * Given a string, compute recursively (no loops) a new string
    * where all the lowercase 'x' chars have been changed to 'y' chars.
    * */

    System.out.println(stringChange("axon"));

  }

  private static String stringChange(String text) {

    int length = text.length();

    if (length == 1){
      return text;

    } else {
      String subString = text.substring(0, length - 1);
      String lastString = text.substring(length - 1, length);

      if (lastString.equals("x")){
        lastString = "y";
      }

      return stringChange(subString) + lastString;


    }
  }

}
