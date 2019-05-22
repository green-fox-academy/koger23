package com.greenfoxacademy.hellodi.services;

import com.greenfoxacademy.hellodi.repositories.ColorProvider;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UtilityService {
  private ColorProvider colorProvider;
  private Random random;

  public UtilityService(ColorProvider colorProvider) {
    this.colorProvider = colorProvider;
    this.random = new Random();
  }

  public String randomColor() {
    return colorProvider.getColorList().get(random.nextInt(colorProvider.getColorList().size()));
  }

  public boolean validateEmail  (String emailAddress) {
    if (emailAddress.contains("@") && emailAddress.contains(".")) {
      return true;
    }
    return false;
  }
}
