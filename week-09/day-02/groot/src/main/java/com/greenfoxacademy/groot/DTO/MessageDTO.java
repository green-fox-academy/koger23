package com.greenfoxacademy.groot.DTO;

public class MessageDTO {
  private String received;
  private String translated;

  public MessageDTO(String received) {
    this.received = received;
    this.translated = "I am a Groot";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
