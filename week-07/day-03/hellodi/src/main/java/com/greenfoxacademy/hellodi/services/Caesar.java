package com.greenfoxacademy.hellodi.services;

import org.springframework.stereotype.Service;

@Service
public class Caesar {
  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }
    String result = "";
    for (int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }
}
