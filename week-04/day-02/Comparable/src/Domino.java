import java.util.Arrays;

public class Domino implements Comparable<Domino>, Printable {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Domino o) {
    return toString().compareTo(o.toString());
  }

  public void printAllFields() {
    System.out.println(toString());
  }
}

