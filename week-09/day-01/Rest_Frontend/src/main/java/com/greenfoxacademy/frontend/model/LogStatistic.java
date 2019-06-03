package com.greenfoxacademy.frontend.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class LogStatistic {
  private List<Log> entries;
  private long count;

  public LogStatistic() {
    entries = new ArrayList<>();
  }
}
