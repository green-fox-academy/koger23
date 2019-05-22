package com.greenfoxacademy.hellodi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("BlueColor")
public class BlueColor implements MyColorAble {
  @Override
  public void printColor() {
    System.out.println("It is really really blue colored...");
  }
}
