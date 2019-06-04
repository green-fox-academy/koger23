package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.DTO.MessageDTO;
import com.greenfoxacademy.groot.DTO.NoMessageError;
import com.greenfoxacademy.groot.DTO.YondusArrowDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

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

  @ExceptionHandler(ArithmeticException.class)
  public ResponseEntity<?> dividingByZero() {
    return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Error: dividing by zero. Time cannot be zero!");
  }
}
