package com.greenfoxacademy.groot.model;

import org.springframework.context.annotation.Bean;

public class Ship {
  private long caliber25;
  private long caliber30;
  private long caliber50;
  private String shipstatus;
  private boolean ready;
  private final long MAX_AMOUNT = 12500;

  public Ship() {
    caliber25 = 0;
    caliber30 = 0;
    caliber50 = 0;
    shipstatus = "0%";
    ready = false;
  }

  public void checkStatus() {
//    double status = 100 *  5000 / 12500;
    double status = 100 *  ((caliber50 + caliber25 + caliber30) / (double) MAX_AMOUNT);
    shipstatus = String.valueOf( status + "%");
    if (status == 100) {
      ready = true;
    }
  }

  public void addCaliber25(long amount) {
    if (caliber25 + caliber30 + caliber50 < 12500) {
      if (12500 - (caliber25 + caliber30 + caliber50) < amount) {
        caliber25 += 12500 - (caliber25 + caliber30 + caliber50);
      } else {
        caliber25 += amount;
      }
    }
  }
  public void addCaliber30(long amount) {
    if (caliber25 + caliber30 + caliber50 < 12500) {
      if (12500 - (caliber25 + caliber30 + caliber50) < amount) {
        caliber30 += 12500 - (caliber25 + caliber30 + caliber50);
      } else {
        caliber30 += amount;
      }
    }
  }
  public void addCaliber50(long amount) {
    if (caliber25 + caliber30 + caliber50 < 12500) {
      if (12500 - (caliber25 + caliber30 + caliber50) < amount) {
        caliber50 += 12500 - (caliber25 + caliber30 + caliber50);
      } else {
        caliber50 += amount;
      }
    }
  }

  public long getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(long caliber25) {
    this.caliber25 = caliber25;
  }

  public long getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(long caliber30) {
    this.caliber30 = caliber30;
  }

  public long getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(long caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public long getMAX_AMOUNT() {
    return MAX_AMOUNT;
  }
}
