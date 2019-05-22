package com.greenfoxacademy.hellodi.repositories;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ColorProvider {
  List<String> colorList = Arrays.asList("red", "blue", "lime", "orange", "magenta");

  public List<String> getColorList() {
    return colorList;
  }
}
