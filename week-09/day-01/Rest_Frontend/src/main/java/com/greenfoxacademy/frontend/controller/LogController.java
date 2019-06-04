package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.dto.LogStatistic;
import com.greenfoxacademy.frontend.repository.LogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
  private LogRepository logRepository;

  public LogController(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @GetMapping("/log")
  public ResponseEntity<?> getLog() {
    LogStatistic logStatistic = new LogStatistic();
    logRepository.findAll().forEach(log -> logStatistic.getEntries().add(log));
    logStatistic.setCount(logRepository.count());
    return ResponseEntity.status(HttpStatus.OK).body(logStatistic);
  }
}
