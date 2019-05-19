package com.greenfoxacademy.books.controllers;

import com.greenfoxacademy.books.items.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class BookController {
  List<Book> books = new ArrayList<>();

  @GetMapping(path = "/books")
  public String showBooks(Model model) {
    model.addAttribute("books", books);
    return "index";
  }
}
