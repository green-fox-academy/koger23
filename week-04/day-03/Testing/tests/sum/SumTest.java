package sum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  Sum sumObj;

  @Before
  public void setup() {
    sumObj = new Sum();
  }

  @Test
  public void sumMore() {
    ArrayList<Integer> intList = new ArrayList<>();
    intList.add(1);
    intList.add(2);
    intList.add(3);
    intList.add(4);
    intList.add(6);
    intList.add(7);
    intList.add(8);
    intList.add(9);
    int actual = sumObj.sum(intList);
    int expect = 40;
    assertEquals(expect, actual);

  }

  @Test
  public void sumOne() {
    ArrayList<Integer> intList = new ArrayList<>();
    intList.add(11);
    int actual = sumObj.sum(intList);
    int expect = 11;
    assertEquals(expect, actual);
  }

  @Test
  public void sumEmpty() {
    ArrayList<Integer> intList = new ArrayList<>();
    int actual = sumObj.sum(intList);
    int expect = 0;
    assertEquals(expect, actual);
  }
}