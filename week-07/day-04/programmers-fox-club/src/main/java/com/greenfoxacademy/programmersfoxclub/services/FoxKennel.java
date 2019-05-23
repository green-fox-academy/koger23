package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxKennel {
  private List<Fox> foxList;

  public FoxKennel() {
    foxList = new ArrayList<>();
  }
}
