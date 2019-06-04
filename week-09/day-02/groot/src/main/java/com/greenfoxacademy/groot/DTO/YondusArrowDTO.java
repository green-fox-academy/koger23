package com.greenfoxacademy.groot.DTO;

public class YondusArrowDTO {
  private long time;
  private long distance;
  private long speed;

  public YondusArrowDTO() {
    this.speed = distance / time;
  }

  public YondusArrowDTO(long distance, long time) {
    this.time = time;
    this.distance = distance;
    this.speed = distance / time;
  }

  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }

  public long getDistance() {
    return distance;
  }

  public void setDistance(long distance) {
    this.distance = distance;
  }

  public long getSpeed() {
    return speed;
  }

  public void setSpeed(long speed) {
    this.speed = speed;
  }
}
