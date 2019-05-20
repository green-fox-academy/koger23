package com.greenfoxacademy.lionkingbank.lionkingbank.controllers;

import com.greenfoxacademy.lionkingbank.lionkingbank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
  List<BankAccount> bankAccountList = new ArrayList<>();

  public BankAccountController() {
    populateBankAccountList();
  }

  @GetMapping("/show")
  public String show(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("bankAccount", bankAccount);
    return "account";
  }
  @GetMapping("/ception")
  public String ception(Model model) {
    model.addAttribute("msg", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
    return "ception";
  }

  @GetMapping("/accountlist")
  public String showAccounts(Model model) {
    model.addAttribute("accountList", bankAccountList);
    return "accountlist";
  }

  public void populateBankAccountList() {
    bankAccountList.add(new BankAccount("Simba", 2000, "lion", true, false));
    bankAccountList.add(new BankAccount("Pumbaa", 3333.33, "boar", false, false));
    bankAccountList.add(new BankAccount("Timon", 15, "meerkats", false, false));
    bankAccountList.add(new BankAccount("Mufasa", 111.11, "lion", false, true));
    bankAccountList.add(new BankAccount("Zazu", 2535.21, "bird", false, false));
  }
}
