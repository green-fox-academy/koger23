package com.greenfoxacademy.hellodi.services;

import java.util.List;

public interface StudentServable {
  List<String> findAll();

  void save(String student);

  int countStudents();
}
