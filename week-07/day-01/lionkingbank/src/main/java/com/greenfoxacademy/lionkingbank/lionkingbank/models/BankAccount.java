package com.greenfoxacademy.lionkingbank.lionkingbank.models;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean king = false;
  private boolean bad = false;
  private int step;

  public BankAccount() {
    initStep();
  }

  public BankAccount(String name, double balance, String animalType, boolean king, boolean bad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
    this.bad = bad;
    initStep();
  }

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    initStep();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }

  public boolean getSide() {
    return bad;
  }

  public void setSide(boolean bad) {
    this.bad = bad;
  }

  public boolean isBad() {
    return bad;
  }

  public void setBad(boolean bad) {
    this.bad = bad;
  }

  public int getStep() {
    return step;
  }

  public void setStep(int step) {
    this.step = step;
  }

  public void initStep() {
    if (this.king) {
      step = 100;
    } else {
      step = 10;
    }
  }
}
