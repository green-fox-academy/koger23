public class Gnirts implements CharSequence {
  String word;
  public Gnirts(String word) {
    this.word = word;
  }

  public int length() {
    return word.length();
  }

  public char charAt(int i) {
    int lastIndex = word.length() - 1;
    return word.charAt(lastIndex - i);
  }

  public CharSequence subSequence(int i, int i1) {
    int lastIndex = word.length() - 1;
    return word.subSequence(lastIndex - i, lastIndex - i1);
  }

  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));
    // should print out: l

    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
    // should print out: a
  }
}
