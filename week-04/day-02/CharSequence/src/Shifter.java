public class Shifter implements CharSequence {
  String stringToBeShifted;
  int shift;

  public Shifter(String stringToBeShifted, int shift) {
    this.shift = shift;
    this.stringToBeShifted = stringToBeShifted;
  }

  public int length() {
    return stringToBeShifted.length();
  }

  public char charAt(int i) {
    return stringToBeShifted.charAt(i + shift);
  }

  public CharSequence subSequence(int i, int i1) {
    return stringToBeShifted.subSequence(i + shift, i1 + shift);
  }
}
