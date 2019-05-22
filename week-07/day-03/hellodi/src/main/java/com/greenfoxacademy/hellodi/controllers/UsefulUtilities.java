package com.greenfoxacademy.hellodi.controllers;

import com.greenfoxacademy.hellodi.models.Student;
import com.greenfoxacademy.hellodi.services.Caesar;
import com.greenfoxacademy.hellodi.services.StudentServable;
import com.greenfoxacademy.hellodi.services.UtilityService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilities {

  private UtilityService utilityService;
  private Caesar caesar;
  private StudentServable studentServable;

  public UsefulUtilities(UtilityService utilityService, Caesar caesar,
                         @Qualifier("StudentSaver") StudentServable studentServable) {
    this.utilityService = utilityService;
    this.caesar = caesar;
    this.studentServable = studentServable;
  }

  @GetMapping("/useful")
  public String index(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "useful";
  }

  @GetMapping("/useful/email")
  public String email(Model model, @RequestParam String email) {
    if (utilityService.validateEmail(email)) {
      model.addAttribute("text", email + " is a valid email address");
      model.addAttribute("textcolor", "green");
    } else {
      model.addAttribute("text", email + " not_valid_email.com is not a valid email address");
      model.addAttribute("textcolor", "red");
    }
    return "email";
  }

  @GetMapping("/useful/caesar")
  public String coder(Model model, @RequestParam String text, @RequestParam int shiftNumber) {
    model.addAttribute("caesartext", caesar.caesar(text, shiftNumber));
    return "caesar";
  }

  @GetMapping("/gfa")
  public String gfaIndex(Model model) {
    model.addAttribute("numberofstudents", studentServable.countStudents());
    return "gfa";
  }

  @GetMapping("/gfa/studentlist")
  public String listStudents(Model model) {
    model.addAttribute("studentList", studentServable.findAll());
    return "studentlist";
  }

  @GetMapping("/gfa/add")
  public String addStudentForm(Model model) {
    model.addAttribute("student", new Student());
    return "add";
  }

  @GetMapping("/gfa/save")
  public String addStudent(Model model, @ModelAttribute Student student) {
    studentServable.save(student.getName());
    return "redirect:/gfa/studentlist";
  }

  @GetMapping("/gfa/check")
  public String checkStudent() {
    return "check";
  }

  @GetMapping("/gfa/result")
  public String checkStudent(Model model, @RequestParam String name) {
    if (studentServable.findAll().contains(name)) {
      model.addAttribute("text", name + " is already in the list.");
    } else {
      model.addAttribute("text", name + " is not in the list.");
    }
    return "result";
  }
}
