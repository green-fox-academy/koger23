package com.greenfoxacademy.hellodi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("RedColor")
public class RedColor implements MyColorAble {
  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}
