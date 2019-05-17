package com.greenfoxacademy.shop.items;

import java.util.ArrayList;
import java.util.List;

public class ShopItem {
  String name;
  String description;
  Double price;
  int quantity;

  public ShopItem() {
  }

  public ShopItem(String name, String description, Double price, int quantity) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public List<ShopItem> toList() {
    List<ShopItem> shopItemList = new ArrayList<>();
    shopItemList.add(this);
    return shopItemList;
  }
}
