package com.greenfoxacademy.groot.DTO;

import com.greenfoxacademy.groot.model.Ship;

public class CargoDTO {
  private long caliber25;
  private long caliber30;
  private long caliber50;
  private String shipstatus;
  private boolean ready;

  public CargoDTO(Ship ship) {
    caliber25 = ship.getCaliber25();
    caliber30 = ship.getCaliber30();
    caliber50 = ship.getCaliber50();
    shipstatus = ship.getShipstatus();
    ready = ship.isReady();
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
}
