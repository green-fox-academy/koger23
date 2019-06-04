package com.greenfoxacademy.frontend.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.greenfoxacademy.frontend.model.entitiy.Log;
import com.greenfoxacademy.frontend.service.ILogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {
  private ILogService logService;

  public DoublingController(ILogService logService) {
    this.logService = logService;
  }

  @GetMapping("/doubling")
  public String doubling(@RequestParam(value = "input", required = false) Integer input) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode childNode1 = mapper.createObjectNode();
    if (input == null) {
      ((ObjectNode) childNode1).put("error", "Please provide an input!");
    } else {
      ((ObjectNode) childNode1).put("received", input);
      ((ObjectNode) childNode1).put("result", input*2);
      Log log = new Log("/doubling", String.valueOf(input));
      logService.save(log);
    }
    return childNode1.toString();
  }
}
