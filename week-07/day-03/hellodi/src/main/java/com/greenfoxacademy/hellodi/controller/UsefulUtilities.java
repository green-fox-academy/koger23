package com.greenfoxacademy.hellodi.controller;

import com.greenfoxacademy.hellodi.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulUtilities {

  UtilityService utilityService;

  public UsefulUtilities(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String index(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "useful";
  }
}
