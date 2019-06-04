package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.entitiy.Log;
import com.greenfoxacademy.frontend.service.ILogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {
  private ILogService logService;

  public AppendAController(ILogService logService) {
    this.logService = logService;
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<String> append(@PathVariable(value = "appendable", required = false) String appendable) {
    if (appendable == null) {
      return new ResponseEntity<>("No parameter given.",
              HttpStatus.NOT_FOUND);
    } else {
      Log log = new Log("/appenda/" + appendable, appendable);
      logService.save(log);
      return new ResponseEntity<>(appendable.concat("a"),
              HttpStatus.OK);
    }
  }
}
