package Anagram;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram anag;

  @Before
  public void setup(){
     anag = new Anagram();
  }

  @Test
  public void anagramTrue() {
    String inputWord_1 = "greenfox";
    String inputWord_2 = "foxgreen";

    boolean result = anag.anagram(inputWord_1, inputWord_2);
    boolean expect = true;

    assertEquals(expect, result);
  }
}