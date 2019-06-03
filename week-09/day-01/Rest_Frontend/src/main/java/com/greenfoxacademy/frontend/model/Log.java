package com.greenfoxacademy.frontend.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Temporal(TemporalType.TIMESTAMP)
  private Date sqlTimestamp;

  private String endpoint;
  private String data;

  public Log() {
    sqlTimestamp = new Date();
  }

  public Log(String endpoint, String data) {
    sqlTimestamp = new Date();
    this.endpoint = endpoint;
    this.data = data;
  }
}
