package sum;

import java.util.ArrayList;

public class Sum {
  public int sum(ArrayList<Integer> numList){
    int sum = 0;
    for (Integer num : numList){
      sum += num;
    }
    return sum;
  }
}
