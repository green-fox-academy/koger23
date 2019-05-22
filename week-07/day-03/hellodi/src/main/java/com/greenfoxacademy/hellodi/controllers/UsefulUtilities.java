package com.greenfoxacademy.hellodi.controllers;

import com.greenfoxacademy.hellodi.services.Caesar;
import com.greenfoxacademy.hellodi.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilities {

  UtilityService utilityService;
  Caesar caesar;

  public UsefulUtilities(UtilityService utilityService, Caesar caesar) {
    this.utilityService = utilityService;
    this.caesar = caesar;
  }

  @GetMapping("/useful")
  public String index(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "useful";
  }

  @GetMapping("/useful/email")
  public String email(Model model, @RequestParam String email) {
    if (utilityService.validateEmail(email)) {
      model.addAttribute("text", email + " is a valid email address");
      model.addAttribute("textcolor", "green");
    } else {
      model.addAttribute("text", email + " not_valid_email.com is not a valid email address");
      model.addAttribute("textcolor", "red");
    }
    return "email";
  }

  @GetMapping("/useful/caesar")
  public String coder(Model model, @RequestParam String text, @RequestParam int shiftNumber) {
    System.out.println(text + " " + shiftNumber);
    model.addAttribute("caesartext", caesar.caesar(text, shiftNumber));
    return "caesar";
  }
}
