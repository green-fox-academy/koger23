package com.greenfoxacademy.lionkingbank.lionkingbank.controllers;

import com.greenfoxacademy.lionkingbank.lionkingbank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {
  @GetMapping("/show")
  public String show(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute(bankAccount);
    return "account";
  }
}
