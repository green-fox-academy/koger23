package com.greenfoxacademy.books.controllers;

import com.greenfoxacademy.books.items.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

  @GetMapping(path = "/books")
  public String queryBooks(Model model, @RequestParam(name = "author", required = false) String author) {

    List<Book> queriedBooks;

    if (author != null) {
      queriedBooks = filterBooksByAuthor(author);
    } else {
      queriedBooks = books;
    }

    model.addAttribute("books", queriedBooks);
    return "index";
  }

  private List<Book> filterBooksByAuthor(String author) {
    return books.stream()
            .filter(book -> book.getAuthor().equals(author))
            .collect(Collectors.toList());
  }
}
