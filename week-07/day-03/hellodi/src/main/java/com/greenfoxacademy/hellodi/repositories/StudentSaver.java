package com.greenfoxacademy.hellodi.repositories;

import com.greenfoxacademy.hellodi.services.StudentServable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Repository
@Qualifier("StudentSaver")
public class StudentSaver implements StudentServable {
  private List<String> names;
  private String fileName = "names.txt";
  private Path path = Paths.get(fileName);

  public StudentSaver() {
    readFile();
  }

  public void readFile() {
    try {
      names = Files.readAllLines(path);
      System.out.println(names.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public List<String> findAll() {
    return names;
  }

  @Override
  public void save(String student) {
    names.add(student);
    try {
      Files.write(path, names);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public int countStudents() {
    return names.size();
  }
}
