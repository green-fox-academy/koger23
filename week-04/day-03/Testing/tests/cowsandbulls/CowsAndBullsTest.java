package cowsandbulls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CowsAndBullsTest {
  CowsAndBulls cab;

  @Before
  public void setUp() {
    cab = new CowsAndBulls();
  }

  @Test
  public void guess() {
  }

  @Test
  public void initNumberDigit4() {
    int initNumber = cab.initNumber();

    assertTrue(String.valueOf(initNumber).length() == 4);
  }

  @Test
  public void setState() {
    String expect = "playing";
    assertEquals(expect, cab.getState());

    expect = "isitwork?";
    cab.setState(expect);
    assertEquals(expect, cab.getState());
  }

  @Test
  public void isValidNumberTrue(){
    int expect = 7898;

    boolean result = cab.isValidNumber(expect);

    assertTrue(result);

  }

  @Test
  public void isValidNumberFalse(){
    int expect = 789;

    boolean result = cab.isValidNumber(expect);

    assertFalse(result);

  }
}