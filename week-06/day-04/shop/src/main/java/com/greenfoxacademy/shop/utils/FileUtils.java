package com.greenfoxacademy.shop.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
  public static List<String> readFile(String filepath) {
    Path src = Paths.get(filepath);
    List<String> lines = new ArrayList<>();
    try {
      if (!checkFileExist(filepath)) {
        System.out.println(filepath);
        initializeFile(filepath);
      }
      lines = Files.readAllLines(src);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }

  public static void initializeFile(String filepath) {
    Path path = Paths.get(filepath);
    File file = new File(filepath);
    try {
      System.out.println(path.getParent());
      Files.createDirectories(path.getParent());
      file.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static boolean checkFileExist(String filepath) {
    File file = new File(filepath);
    if (file.exists() && !file.isDirectory()) {
      return true;
    }
    return false;
  }
}
