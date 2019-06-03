package com.greenfoxacademy.frontend.model;

public class DoUntilInput {
  private int until;

  public DoUntilInput() {
  }

  public DoUntilInput(int until) {
    this.until = until;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getSum() {
    int num = 0;
    for (int i = 1; i <= until; i++) {
      num += i;
    }
    return num;
  }

  public int getFactor() {
    int num = 1;
    for (int i = 1; i <= until; i++) {
      num *= i;
    }
    return num;
  }
}
