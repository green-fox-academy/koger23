package countletters;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  Map<String, Integer> dic = new HashMap();

  public Map count(String word){
    char[] charList = word.toCharArray();

    for (char c : charList){
      String curString = String.valueOf(c);
      if (checkDic(curString)){
        int prevVal = dic.get(curString);
        dic.put(curString, prevVal + 1);
      } else {
        dic.put(curString, 1);
      }
    }
    return dic;
  }

  public boolean checkDic(String c){
    if (dic.containsKey(c)){
      return true;
    } else {
      return false;
    }
  }
}
