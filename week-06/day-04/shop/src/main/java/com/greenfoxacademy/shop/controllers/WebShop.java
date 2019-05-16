package com.greenfoxacademy.shop.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebShop {
  @RequestMapping("/webshop")
  public String webShop() {
    return "Hello World";
  }
}
