import java.util.List;

public class GetIndex {
  public GetIndex() {
  }

  public int getIndex(List<Integer> numberList, int value) {
    for (int i = 0; i < numberList.size(); i++) {
      if (numberList.get(i) == value) {
        return i;
      }
    }
    return -1;
  }
}
