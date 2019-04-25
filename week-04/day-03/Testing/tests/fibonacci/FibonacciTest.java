package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci fibo;

  @Before
  public void setup(){
    fibo = new Fibonacci();
  }

  @Test
  public void fibonacciNums4th() {
    int elementN = 4;
    int expected = 3;
    int result = fibo.fibonacciNums(elementN);

    assertEquals(expected, result);
  }

  @Test
  public void fibonacciNumsMinus() {
    int elementN = -1;
    int expected = 3;
    int result = fibo.fibonacciNums(elementN);

    assertEquals(expected, result);
  }
}