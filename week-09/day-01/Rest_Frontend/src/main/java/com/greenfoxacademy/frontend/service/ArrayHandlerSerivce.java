package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.ArrayObject;
import com.greenfoxacademy.frontend.model.ArrayResult;
import com.greenfoxacademy.frontend.model.ArrayResultDoubled;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class ArrayHandlerSerivce {

  private ArrayResult arrayResult;
  private ArrayObject arrayObject;
  private ArrayResultDoubled arrayResultDoubled;

  public ArrayHandlerSerivce() {
    this.arrayResult = new ArrayResult();
    this.arrayResultDoubled = new ArrayResultDoubled();
  }

  public void calculate() {
    if (arrayObject.getWhat().equals("sum")) {
      int result = 0;

      for (int i = 0; i < arrayObject.getNumbers().length; i++) {
        result += arrayObject.getNumbers()[i];
      }
      arrayResult.setResult(result);
    } else if (arrayObject.getWhat().equals("multiply")) {
      int result = 1;

      for (int i = 1; i <= arrayObject.getNumbers().length - 1; i++) {
        result *= arrayObject.getNumbers()[i];
      }
      arrayResult.setResult(result);
    } else if (arrayObject.getWhat().equals("double")) {
      int[] array = new int[arrayObject.getNumbers().length];
      for (int i = 0; i < array.length; i++) {
        array[i] = arrayObject.getNumbers()[i] * 2;
      }
      arrayResultDoubled.setResult(array);
    }
  }
}
