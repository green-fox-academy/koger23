package com.greenfoxacademy.books.controllers;

import com.greenfoxacademy.books.items.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class BookController {
  List<Book> books = new ArrayList<>();

  @GetMapping(path = "/books")
  public String showBooks(Model model) {
    model.addAttribute("books", books);
    return "index";
  }

  @GetMapping(path = "/books/{id}/details")
  public String getBookById(Model model, @PathVariable(name="id") Integer id) {
    Book bookById = null;

    for(Book book : books) {
      if (book.getId() == id) {
        bookById = book;
      }
    }

    if (bookById != null) {
      model.addAttribute("book", bookById);
    } else {
      model.addAttribute("error", "No book found");
    }

    return "details";
  }
}
