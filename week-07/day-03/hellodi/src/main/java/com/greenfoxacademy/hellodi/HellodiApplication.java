package com.greenfoxacademy.hellodi;

import com.greenfoxacademy.hellodi.services.MyColorAble;
import com.greenfoxacademy.hellodi.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellodiApplication implements CommandLineRunner {

  Printer printer;
  @Autowired
  @Qualifier("BlueColor")
  MyColorAble colorAble;

  public HellodiApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(HellodiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("This is the log from the run() method");
    colorAble.printColor();
  }
}
