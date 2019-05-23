package com.greenfoxacademy.programmersfoxclub.repositories;


import com.greenfoxacademy.programmersfoxclub.models.Nutrition;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class Logger {
  List<String> actionList = new ArrayList<>();

  public Logger() {
  }

  public String getDatetime() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);
  }

  public void saveNutritionChange(Nutrition nutrition, String before, String after) {
    String message = getDatetime() + ": " + nutrition.getType() + " changed from " + before + " to " + after;
    actionList.add(message);
  }

  public void saveTrickAction(String trick) {
    String message = getDatetime() + ": " + "Learned to " + trick;
    actionList.add(message);
  }

  public List<String> getActionList() {
    return actionList;
  }

  public void setActionList(List<String> actionList) {
    this.actionList = actionList;
  }
}
