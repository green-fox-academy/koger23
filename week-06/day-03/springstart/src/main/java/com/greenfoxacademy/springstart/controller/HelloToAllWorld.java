package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloToAllWorld {

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, " +
          "Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn",
          "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua",
          "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/helloworld")
  public String greetTheWorld(Model model) {
    model.addAttribute("hellos", helloBuilder());
    return "helloworld";
  }

  public List<HelloObject> helloBuilder() {
    List<HelloObject> helloObjects = new ArrayList<>();

    for (String word : hellos) {
      helloObjects.add(new HelloObject(word, randomStyle()));
    }
    return helloObjects;
  }

  public String randomStyle() {
    String wordsWithParams = "";

    wordsWithParams += "color:" + randomRGBColor() + "; font-size:" + (int) (Math.random() * 30 + 12) + "px;";

    return wordsWithParams;
  }

  public String randomRGBColor() {
    return "rgb(" +
            randomColorNumber() + ", " +
            randomColorNumber() + ", " +
            randomColorNumber() + ")";
  }

  public String randomAlign() {
    String[] directions = {"left", "center", "right"};
    return directions[(int) (Math.random() * 4)];
  }

  public int randomColorNumber() {
    return (int) (Math.random() * 255);
  }
}
