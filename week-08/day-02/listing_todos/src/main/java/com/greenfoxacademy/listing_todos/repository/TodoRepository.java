package com.greenfoxacademy.listing_todos.repository;

import com.greenfoxacademy.listing_todos.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
