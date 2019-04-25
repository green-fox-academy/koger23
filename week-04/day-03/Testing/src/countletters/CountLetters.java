package countletters;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  Map<String, Integer> dic = new HashMap();

  public void count(String word){
    char[] charList = word.toCharArray();

    for (char c : charList){
      if (checkDic(c)){
        int prevVal = dic.get(c);
        dic.put(String.valueOf(c), prevVal + 1);
      } else {
        dic.put(String.valueOf(c), 0);
      }
    }
  }

  public boolean checkDic(char c){
    if (dic.containsKey(c)){
      return true;
    } else {
      return false;
    }
  }
}
