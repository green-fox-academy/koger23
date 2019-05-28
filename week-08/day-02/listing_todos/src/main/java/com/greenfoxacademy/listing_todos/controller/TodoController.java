package com.greenfoxacademy.listing_todos.controller;

import com.greenfoxacademy.listing_todos.repository.TodoRepository;
import com.greenfoxacademy.listing_todos.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  private TodoRepository todoRepository;
  private TodoService todoService;

  public TodoController(TodoRepository todoRepository, TodoService todoService) {
    this.todoRepository = todoRepository;
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
