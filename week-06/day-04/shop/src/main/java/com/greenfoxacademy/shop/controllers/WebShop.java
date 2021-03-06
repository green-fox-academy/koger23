package com.greenfoxacademy.shop.controllers;

import com.greenfoxacademy.shop.handler.LoginHandler;
import com.greenfoxacademy.shop.items.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class WebShop {
  LoginHandler loginHandler;
  List<ShopItem> shopItemList = new ArrayList<>();

  public WebShop() {
    populateList();
    loginHandler = new LoginHandler();
  }

  @RequestMapping("/webshop")
  public String webShop(Model model) {
    model.addAttribute("items", shopItemList);
    return "index";
  }

  @RequestMapping("/webshop/login")
  public String login() {
    return "loginform";
  }

  @RequestMapping(value="/webshop/admin", method = RequestMethod.POST)
  public String login(Model model, @RequestParam("username") String userName, @RequestParam("password") String password) {
    if (!userName.isEmpty()) {
      if (loginHandler.checkUser(userName, password)) {
        model.addAttribute("items", shopItemList);
        model.addAttribute("newshopitem", new ShopItem());
        return "additem";
      }
    }
    return "loginform";
  }

  @GetMapping("/webshop/added")
  public String add(Model model) {
    model.addAttribute("items", shopItemList);
    model.addAttribute("newshopitem", new ShopItem());
    return "additem";
  }

  @RequestMapping(value="/webshop/search", method = RequestMethod.POST)
  public String search(Model model, @RequestParam("search_input") String search_input) {
    if (search_input.length() > 0) {
      model.addAttribute("items", searchItems(search_input));
    }
    return "index";
  }

  @RequestMapping("/webshop/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("items", filterOnStock());
    return "index";
  }

  @RequestMapping("/webshop/cheapest-first")
  public String cheapestFirst(Model model) {
    model.addAttribute("items", orderByPriceAscending());
    return "index";
  }

  @RequestMapping("/webshop/contains-nike")
  public String containsNike(Model model) {
    model.addAttribute("items", filterContainsNike());
    return "index";
  }

  @RequestMapping("/webshop/avg-stock")
  public String averageStock(Model model) {
    model.addAttribute("average", getAverageStock());
    return "avgstock";
  }

  @RequestMapping("/webshop/most-expensive-available")
  public String mostExpensiveAvailable(Model model) {
    model.addAttribute("items", filterMostExpensiveAvailable());
    return "index";
  }

  @GetMapping(path = "/webshop/add")
  public String addBookForm(Model model) {
    model.addAttribute("newshopitem", new ShopItem());
    return "newshopitem";
  }

  @PostMapping(path = "/webshop/add")
  public String addBook(@ModelAttribute(name="newshopitem") ShopItem shopItem) {
    shopItemList.add(shopItem);
    return "redirect:added";
  }

  public List<ShopItem> orderByPriceAscending() {
    return shopItemList.stream()
            .sorted(Comparator.comparing(ShopItem::getPrice)).collect(Collectors.toList());
  }

  public List<ShopItem> filterOnStock() {
    return shopItemList.stream()
            .filter(items -> items.getQuantity() != 0)
            .collect(Collectors.toList());
  }

  public List<ShopItem> filterContainsNike() {
    return shopItemList.stream()
            .filter(items -> {
              CharSequence nike = "Nike";
              if (items.getName().contains(nike) || items.getDescription().contains(nike)) {
                return true;
              } else {
                return false;
              }
            })
            .collect(Collectors.toList());
  }

  public Double getAverageStock() {
    Double avg;
    long quantity = filterOnStock().stream().mapToInt(o -> o.getQuantity()).sum();
    long availableItemQuantitiy = filterOnStock().stream()
            .count();
    avg = Double.valueOf(quantity / availableItemQuantitiy);
    return avg;
  }

  public List<ShopItem> filterMostExpensiveAvailable() {
    return shopItemList.stream()
            .filter(items -> items.getQuantity() > 0)
            .max(Comparator.comparingDouble(items -> items.getPrice()))
            .get().toList();
  }

  public List<ShopItem> searchItems(String text) {
    return shopItemList.stream()
            .filter(items -> {
              CharSequence searchText = text.toLowerCase();
              if (items.getName().toLowerCase().contains(searchText) || items.getDescription().toLowerCase().contains(searchText)) {
                return true;
              } else {
                return false;
              }
            })
            .collect(Collectors.toList());
  }

  public void populateList() {
    shopItemList.clear();
    shopItemList.add(new ShopItem("Shoe", "Nike shoes", 150d, 25));
    shopItemList.add(new ShopItem("T-Shirt", "Nike T-shirts in several colours", 45.5, 13));
    shopItemList.add(new ShopItem("Shoe", "Adidas shoes", 119.95, 2));
    shopItemList.add(new ShopItem("Notebook", "Asus GL552", 499.99, 5));
    shopItemList.add(new ShopItem("Notebook", "Asus GL553", 799.99, 0));
    shopItemList.add(new ShopItem("Water", "Naturaqua 1L", 1.99, 500));
    shopItemList.add(new ShopItem("Printer", "HP LaserJet 5520", 199.99, 1));
    shopItemList.add(new ShopItem("Printer", "HP PhotoSmart 5520", 255.99, 1));
    shopItemList.add(new ShopItem("Printer", "HP PhotoSmart 5720", 1999.99, 0));
  }
}
