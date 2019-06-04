package com.greenfoxacademy.frontend.model.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ArrayObject {
  private String what;
  private int[] numbers;

  public ArrayObject() {
  }
}