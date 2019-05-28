package com.greenfoxacademy.listing_todos.service;

import com.greenfoxacademy.listing_todos.model.Todo;
import com.greenfoxacademy.listing_todos.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

  TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todo -> todoList.add(todo));
    return todoList;
  }

  public void add(String title) {
    todoRepository.save(new Todo(title));
  }
}
