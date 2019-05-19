package com.greenfoxacademy.shop.handler;

import com.greenfoxacademy.shop.items.ShopItem;
import com.greenfoxacademy.shop.utils.FileUtils;

import java.util.List;

public class ItemHandler {
  private final String PATH = "/items.csv";
  private final String SEPARATOR = ",";
  private List<String> lines;
  private List<ShopItem> shopItemList;

  public ItemHandler() {
    lines = FileUtils.readFile(PATH);
    populateList();
  }

  public void addItem(ShopItem shopItem) {
    shopItemList.add(shopItem);
  }

  public List<ShopItem> getItemList() {
    return shopItemList;
  }

  public void populateList() {
    if (lines.size() > 0) {
      for (String row : lines) {
        String[] items = row.split(SEPARATOR);
        shopItemList.add(new ShopItem(items[0], items[1], Double.valueOf(items[2]), Integer.valueOf(items[3])));
      }
    }
  }
}
