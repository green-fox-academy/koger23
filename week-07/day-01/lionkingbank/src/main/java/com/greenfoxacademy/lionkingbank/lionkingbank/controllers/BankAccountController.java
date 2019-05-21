package com.greenfoxacademy.lionkingbank.lionkingbank.controllers;

import com.greenfoxacademy.lionkingbank.lionkingbank.models.AccountWrapper;
import com.greenfoxacademy.lionkingbank.lionkingbank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BankAccountController {
//  List<BankAccount> bankAccountList = new ArrayList<>();
  AccountWrapper accountWrapper;

  public BankAccountController() {
    accountWrapper = new AccountWrapper();
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
    model.addAttribute("accountList", accountWrapper);
    return "accountlist";
  }

  @GetMapping("/raisethebalance")
  public String showList(Model model) {
    model.addAttribute("accountWrapper", accountWrapper);
    return "raisethebalance";
  }

  @PostMapping("/raisethebalance")
  public String showList(Model model, AccountWrapper accountWrapper) {
    for (int i = 0; i < this.accountWrapper.getBalanceList().size(); i++) {
      this.accountWrapper.getBalanceList().get(i).setBalance(accountWrapper.getBalanceList().get(i).getBalance());
    }

    System.out.println(accountWrapper.getBalanceList().toString());
    model.addAttribute("accountWrapper", this.accountWrapper);
    return "raisethebalance";
  }

  public void populateBankAccountList() {
    accountWrapper.addItem(new BankAccount("Simba", 2000, "lion", true, false));
    accountWrapper.addItem(new BankAccount("Pumbaa", 3333.33, "boar", false, false));
    accountWrapper.addItem(new BankAccount("Timon", 15, "meerkats", false, false));
    accountWrapper.addItem(new BankAccount("Mufasa", 111.11, "lion", true, true));
    accountWrapper.addItem(new BankAccount("Zazu", 2535.21, "bird", false, false));
  }
}
