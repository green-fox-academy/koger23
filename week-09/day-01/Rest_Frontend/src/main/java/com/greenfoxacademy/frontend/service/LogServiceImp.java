package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.entitiy.Log;
import com.greenfoxacademy.frontend.repository.LogRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class LogServiceImp implements ILogService {
  private LogRepository logRepository;

  public LogServiceImp(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void save(Log log) {
    logRepository.save(log);
  }
}
