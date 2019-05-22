package com.greenfoxacademy.hellodi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("BlueColor")
public class BlueColor implements MyColorAble {
  private String text = "It is really really blue colored...";

  @Override
  public void printColor() {
    System.out.println(text);
  }

  @Override
  public String getColour() {
    return text;
  }
}
