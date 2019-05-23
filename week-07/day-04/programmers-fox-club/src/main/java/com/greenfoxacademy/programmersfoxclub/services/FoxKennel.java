package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxKennel {
  private List<Fox> foxList;

  public FoxKennel() {
    foxList = new ArrayList<>();
  }

  public boolean addFox(Fox fox) {
    if (!checkFoxExists(fox.getName())) {
      foxList.add(fox);
      return true;
    }
    return false;
  }

  public Fox getFoxByName(String name) {
    return foxList.stream()
            .filter(fox -> fox.getName().equals(name))
            .collect(Collectors.toList()).get(0);
  }

  public boolean checkFoxExists(String name) {
    long result = foxList.stream().filter(fox -> fox.getName().equals(name)).count();
    if (result > 0) {
      return true;
    }
    return false;
  }

  public List<Fox> getFoxList() {
    return foxList;
  }

  public void setFoxList(List<Fox> foxList) {
    this.foxList = foxList;
  }
}
