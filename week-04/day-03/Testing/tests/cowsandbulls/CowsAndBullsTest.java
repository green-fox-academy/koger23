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
}