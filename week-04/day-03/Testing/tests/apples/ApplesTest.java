package apples;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplesTest {
  Apples apple;

  @Before
  public void setup() {
    apple = new Apples();
  }

  @Test
  public void getApple() {
    String actual = apple.getApple();
    String expected = "apple";

    assertEquals(expected, actual);
  }
}