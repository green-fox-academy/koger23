public class Exercise6 {
  public static void main(String[] args) {
    String initialString = "Write a Stream Expression to find the uppercase characters in a string!";
    initialString.chars()
            .filter(Character::isUpperCase)
            .forEach(l -> System.out.println(((char) l)));
  }
}
