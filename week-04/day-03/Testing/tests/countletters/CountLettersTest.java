package countletters;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountLettersTest {
  CountLetters cntl;

  @Before
  public void setup() {
    cntl = new CountLetters();
  }

  @Test
  public void count() {
    String input = "kappa";
    Map<String, Integer> expectDic = new HashMap<>();
    expectDic.put("k", 1);
    expectDic.put("a", 2);
    expectDic.put("p", 2);
    Map actualDic = cntl.count(input);

    assertThat(actualDic, is(expectDic));
    assertThat(actualDic.size(), is(3));
    assertTrue(actualDic.containsKey("k"));
    assertTrue(actualDic.containsKey("a"));
    assertTrue(actualDic.containsKey("p"));
    assertTrue(actualDic.containsValue(2));
    assertTrue(actualDic.containsValue(1));
    assertFalse(actualDic.containsValue(0));
    assertFalse(actualDic.containsValue(3));
  }

  @Test
  public void checkDic() {
  }
}