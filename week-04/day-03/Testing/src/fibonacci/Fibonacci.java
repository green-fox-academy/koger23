package fibonacci;

public class Fibonacci {
  public int fibonacciNums(int n) {
    if ((n <= 1)) {
      return n;

    } else {
      return fibonacciNums(n - 1) + fibonacciNums(n - 2);
    }

  }
}
