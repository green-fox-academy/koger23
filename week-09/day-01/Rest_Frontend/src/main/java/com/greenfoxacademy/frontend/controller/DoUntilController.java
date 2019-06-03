package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.DoUntilResult;
import com.greenfoxacademy.frontend.model.DoUntilInput;
import com.greenfoxacademy.frontend.model.Log;
import com.greenfoxacademy.frontend.service.ILogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {
  private ILogService logService;

  public DoUntilController(ILogService logService) {
    this.logService = logService;
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable("action") String action, @RequestBody DoUntilInput doUntilInput) {
    DoUntilResult doUntilResult;
    if (action.equals("sum")) {
      doUntilResult = new DoUntilResult(doUntilInput.getSum());
      Log log = new Log("/dountil/" + action, String.valueOf(doUntilInput.getSum()));
      logService.save(log);
      return new ResponseEntity<>(doUntilResult, HttpStatus.OK);
    } else if (action.equals("factor")) {
      Log log = new Log("/factor/" + action, String.valueOf(doUntilInput.getFactor()));
      logService.save(log);
      return new ResponseEntity<>(new DoUntilResult(doUntilInput.getFactor()), HttpStatus.OK);
    } else {
      return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
    }
  }

  @ExceptionHandler(NullPointerException.class)
  public ResponseEntity<?> notFoundException() {
    return new ResponseEntity<>("not found", HttpStatus.NOT_FOUND);
  }
}
