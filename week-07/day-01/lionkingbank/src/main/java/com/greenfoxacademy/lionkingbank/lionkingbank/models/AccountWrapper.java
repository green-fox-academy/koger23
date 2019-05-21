package com.greenfoxacademy.lionkingbank.lionkingbank.models;

import java.util.ArrayList;

public class AccountWrapper {
  private ArrayList<BankAccount> balanceList = new ArrayList<>();

  public ArrayList<BankAccount> getBalanceList() {
    return balanceList;
  }

  public void setBalanceList(ArrayList<BankAccount> balance) {
    this.balanceList = balance;
  }

  public void addItem(BankAccount bankAccount) {
    balanceList.add(bankAccount);
  }
}
