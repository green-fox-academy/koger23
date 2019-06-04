package com.greenfoxacademy.frontend.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArrayResultDoubled {
  private int[] result;

  public ArrayResultDoubled() {
  }

  public ArrayResultDoubled(int[] result) {
    this.result = result;
  }
}
