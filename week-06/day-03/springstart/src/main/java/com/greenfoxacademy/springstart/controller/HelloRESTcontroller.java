package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTcontroller {
  AtomicLong counter = new AtomicLong();
  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam String name) {
    return new Greeting(counter.incrementAndGet(), "Hello " + name);
  }
}
