package com.greenfoxacademy.shop.handler;


import com.greenfoxacademy.shop.items.User;

import java.util.ArrayList;
import java.util.List;

public class LoginHandler {
  private User currentUser;
  private List<User> userList = new ArrayList<>();

  public LoginHandler() {
    userList.add(new User("admin", "admin", "admin@example.com"));
  }

  public boolean checkUser(String userName, String password) {
    for (User user : userList) {
      if (user.getUserName().equals(userName)) {
        if (user.getPassword().equals(password)) {
          this.currentUser = user;
          return true;
        }
      }
    }
    return false;
  }

  public User getCurrentUser() {
    return currentUser;
  }

  public void setCurrentUser(User currentUser) {
    this.currentUser = currentUser;
  }

  public List<User> getUserList() {
    return userList;
  }

  public void setUserList(List<User> userList) {
    this.userList = userList;
  }
}
