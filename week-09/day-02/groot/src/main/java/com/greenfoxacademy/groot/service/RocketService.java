package com.greenfoxacademy.groot.service;

import com.greenfoxacademy.groot.DTO.CargoDTO;
import com.greenfoxacademy.groot.DTO.FillStatusDTO;
import com.greenfoxacademy.groot.model.Ship;
import org.springframework.stereotype.Service;

@Service
public class RocketService {
  private Ship ship;

  public RocketService() {
    ship = new Ship();
  }

  public FillStatusDTO fillShip(String caliber, long amount) {
    switch (caliber) {
      case ".25":
        ship.addCaliber25(amount);
      case ".30":
        ship.addCaliber30(amount);
      case ".50":
        ship.addCaliber50(amount);
    }
    ship.checkStatus();
    return new FillStatusDTO(ship, caliber, amount);
  }

  public CargoDTO cargoStatus() {
    return new CargoDTO(ship);
  }
}
