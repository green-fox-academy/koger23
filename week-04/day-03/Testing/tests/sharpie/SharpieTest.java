package sharpie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
  Sharpie sp;

  @Before
  public void setUp() {
    sp = new Sharpie("red", 0.5);
  }

  @Test
  public void use() {
    sp.use();
    assertNotEquals(100, sp.getInkAmount());
    assertEquals(99.0, sp.getInkAmount(), 1.0);
  }

  @Test
  public void getColor() {
    assertEquals("red", sp.getColor());
    assertNotEquals("der", sp.getColor());
  }

  @Test
  public void setColor() {
    sp.setColor("green");
    assertNotEquals("red", sp.getColor());
    assertEquals("green", sp.getColor());
  }

  @Test
  public void getWidth() {
    assertEquals(0.5, sp.getWidth(), 0.0);
    assertEquals(1.0, sp.getWidth(), 0.5);
  }

  @Test
  public void setWidth() {
    sp.setWidth(0.7);
    assertNotEquals(0.5, sp.getWidth(), 0.);
    assertEquals(0.5, sp.getWidth(), 0.2);
  }

  @Test
  public void getInkAmount() {
    assertEquals(100, sp.getInkAmount(), 0);
  }

  @Test
  public void setInkAmount() {
    sp.setInkAmount(50);
    assertEquals(50, sp.getInkAmount(), 0);
    assertNotEquals(100, sp.getInkAmount());
  }
}