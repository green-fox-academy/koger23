package com.greenfoxacademy.listing_todo_mysql.controller;

import com.greenfoxacademy.listing_todo_mysql.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  private TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/todo")
  public String list(Model model, @RequestParam boolean isActive) {
    if (isActive) {
      model.addAttribute("todolist", todoService.findActive());
    } else {
      model.addAttribute("todolist", todoService.findAll());
    }
    return "todo";
  }
}