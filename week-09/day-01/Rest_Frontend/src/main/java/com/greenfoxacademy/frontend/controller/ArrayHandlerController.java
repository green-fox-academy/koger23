package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.ArrayObject;
import com.greenfoxacademy.frontend.model.Log;
import com.greenfoxacademy.frontend.service.ArrayHandlerSerivce;
import com.greenfoxacademy.frontend.service.ILogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class ArrayHandlerController {
  private ILogService logService;

  public ArrayHandlerController(ILogService logService) {
    this.logService = logService;
  }

  @GetMapping("/arrays")
  public ResponseEntity<?> handleArray(@RequestBody ArrayObject arrayObject) {
    ArrayHandlerSerivce arrayHandlerSerivce = new ArrayHandlerSerivce();
    arrayHandlerSerivce.setArrayObject(arrayObject);
    arrayHandlerSerivce.calculate();
    Log log = new Log("/arrays", Arrays.toString(arrayObject.getNumbers()));
    if (arrayObject.getWhat().equals("double")) {
      logService.save(log);
      return ResponseEntity.status(HttpStatus.OK).body(arrayHandlerSerivce.getArrayResultDoubled());
    } else if (!arrayObject.getWhat().equals("double")) {
      logService.save(log);
      return ResponseEntity.status(HttpStatus.OK).body(arrayHandlerSerivce.getArrayResult());
    } else {
      logService.save(log);
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request");
    }
  }
}
