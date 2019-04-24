public class Shifter implements CharSequence {
  String stringToBeShifted;
  int shiftIndex;

  public Shifter(String stringToBeShifted, int shiftIndex) {
    this.stringToBeShifted = stringToBeShifted;
    this.shiftIndex = shiftIndex;
  }

  public int length() {
    return 0;
  }

  public char charAt(int i) {
    return 0;
  }

  public CharSequence subSequence(int i, int i1) {
    return null;
  }
}
