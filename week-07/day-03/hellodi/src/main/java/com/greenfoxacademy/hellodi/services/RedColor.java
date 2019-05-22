package com.greenfoxacademy.hellodi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("RedColor")
public class RedColor implements MyColorAble {
  private String text = "It is red in color...";

  @Override
  public void printColor() {
    System.out.println(text);
  }

  @Override
  public String getColour() {
    return text;
  }
}
