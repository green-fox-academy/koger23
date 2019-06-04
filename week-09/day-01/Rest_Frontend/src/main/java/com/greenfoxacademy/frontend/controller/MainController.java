package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.entitiy.Log;
import com.greenfoxacademy.frontend.service.ILogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  private ILogService logService;

  public MainController(ILogService logService) {
    this.logService = logService;
  }

  @GetMapping("/")
  public String renderIndex() {
    Log log = new Log("/", null);
    logService.save(log);
    return "index";
  }
}
