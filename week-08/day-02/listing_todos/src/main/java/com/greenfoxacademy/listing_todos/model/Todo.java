package com.greenfoxacademy.listing_todos.model;

import javax.persistence.*;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  @Column(nullable = false, name = "Title")
  private String title;
  @Column(nullable = false, name = "Urgent")
  private boolean urgent;
  @Column(nullable = false, name = "Done")
  private boolean done;

  public Todo(){
  }

  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
