package com.greenfoxacademy.listing_todos.controller;

import com.greenfoxacademy.listing_todos.repository.TodoRepository;
import com.greenfoxacademy.listing_todos.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  private TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
    todoService.add("Finish this task");
    todoService.add("Finish all task");
  }

  @GetMapping("/todo")
  public String list(Model model) {
    model.addAttribute("todolist", todoService.findAll());
    return "todo";
  }
}
