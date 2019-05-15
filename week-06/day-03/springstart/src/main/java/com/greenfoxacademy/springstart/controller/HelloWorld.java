package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it is better, than simple Controller because we do not need responsebody everytime
public class HelloWorld {

  @RequestMapping("/hello") // this is the endpoint "/" - not specified
  // @ResponseBody // it will ignore the template file with this, it will return the object which I am returning
  public String index() {
    return "Hello World!";
  }
}
