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
public class Greeter {
  private ILogService logService;
  @GetMapping("/greeter")
  public JsonNode doubling(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode childNode1 = mapper.createObjectNode();
    if (name == null && title == null) {
      ((ObjectNode) childNode1).put("error", "Please provide a name and a title!");
    } else if (name == null || name.isEmpty()) {
      ((ObjectNode) childNode1).put("error", "Please provide a name!");
    } else if (title == null || title.isEmpty()) {
      ((ObjectNode) childNode1).put("error", "Please provide a title!");
    } else {
      Log log = new Log("/greeter", "Oh, hi there " + name + ", my dear " + title + "!");
      ((ObjectNode) childNode1).put("welcome_message", "Oh, hi there " + name + ", my dear " + title + "!");
    }
    return childNode1;
  }
}
