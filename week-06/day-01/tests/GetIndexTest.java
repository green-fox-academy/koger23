import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GetIndexTest {
  GetIndex getIndex;
  List<Integer> numberList;

  @Before
  public void setUp() {
    getIndex = new GetIndex();
    numberList = new ArrayList<>();
    numberList.add(12);
    numberList.add(13);
    numberList.add(23);
    numberList.add(33);
  }

  @org.junit.Test
  public void getIndex() {

    // value not in the list
    int value = 8;
    int expected = -1;
    assertEquals(expected, getIndex.getIndex(numberList, value));

    // value is in the list
    value = 12;
    expected = 0;
    assertEquals(expected, getIndex.getIndex(numberList, value));
  }
}