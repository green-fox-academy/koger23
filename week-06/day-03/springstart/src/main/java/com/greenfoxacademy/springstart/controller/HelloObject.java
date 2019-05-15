package com.greenfoxacademy.springstart.controller;

public class HelloObject {
  String word;
  String style;

  public HelloObject(String word, String style) {
    this.word = word;
    this.style = style;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }
}
