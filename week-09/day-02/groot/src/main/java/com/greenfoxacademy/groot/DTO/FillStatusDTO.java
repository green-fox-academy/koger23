package com.greenfoxacademy.groot.DTO;

import com.greenfoxacademy.groot.model.Ship;

public class FillStatusDTO {
  private String received;
  private long amount;
  private String shipstatus;
  private boolean ready;

  public FillStatusDTO() {
  }

  public FillStatusDTO(Ship ship, String caliber, long amount) {
    received = caliber;
    this.amount = amount;
    this.shipstatus = ship.getShipstatus();
    this.ready = ship.isReady();
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
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
