package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.DTO.MessageDTO;
import com.greenfoxacademy.groot.DTO.NoMessageError;
import com.greenfoxacademy.groot.DTO.YondusArrowDTO;
import com.greenfoxacademy.groot.service.RocketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  RocketService rocketService;

  public GuardianController(RocketService rocketService) {
    this.rocketService = rocketService;
  }

  @GetMapping("/groot")
  public ResponseEntity<?> groot(@RequestParam(value = "message", required = false) String message) {
    if (message != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new MessageDTO(message));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new NoMessageError());
    }
  }

  @GetMapping("/yondu")
  public ResponseEntity<?> yondu(Long distance, Long time) {
    if (distance != null && time != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new YondusArrowDTO(distance, time));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: missing parameter time or distance.");
    }
  }

  @GetMapping("/rocket")
  public ResponseEntity<?> cargo() {
    return ResponseEntity.status(HttpStatus.OK).body(rocketService.cargoStatus());
  }

  @GetMapping("/rocket/fill")
  public ResponseEntity<?> fill(String caliber, long amount) {
    return ResponseEntity.status(HttpStatus.OK).body(rocketService.fillShip(caliber, amount));
  }

  @ExceptionHandler(NullPointerException.class)
  public ResponseEntity<?> customNullPointer() {
    return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Error: null pointer exception");
  }

  @ExceptionHandler({ArithmeticException.class})
  public ResponseEntity<?> dividingByZero() {
    return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Error: dividing by zero. Time cannot be zero!");
  }

  @ExceptionHandler({IllegalStateException.class, NumberFormatException.class})
  public ResponseEntity<?> parameterError() {
    return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Error: Parameter is not valid or missing.");
  }


}
