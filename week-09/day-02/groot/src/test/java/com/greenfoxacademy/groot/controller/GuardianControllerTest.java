package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.DTO.CargoDTO;
import com.greenfoxacademy.groot.DTO.FillStatusDTO;
import com.greenfoxacademy.groot.model.Ship;
import com.greenfoxacademy.groot.service.RocketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  RocketService rocketService;

  @Test
  public void groot_shoudReturnOK() throws Exception {
    String message = "Test message";
    mockMvc.perform(get("/groot/?message=" + message))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received", is(message)));

  }

  @Test
  public void groot_shoudReturnNotOK() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isBadRequest())
            .andExpect(jsonPath("$.error", is("I am a Groot!")));

  }

  @Test
  public void yondu_shouldReturnOK() throws Exception {
    long distance = 1000;
    long time = 100;
    mockMvc.perform(get("/yondu?distance=" + distance + "&time=" + time))
            .andExpect(status().isOk())
            .andExpect(jsonPath("speed", is(10)));
  }

  @Test
  public void yondu_shouldReturnNotOK_MissingParameter() throws Exception {
    mockMvc.perform(get("/yondu"))
            .andExpect(status().isBadRequest())
            .andExpect(content().string("Error: missing parameter time or distance."));
  }

  @Test
  public void yondu_shouldReturnNotOK_DivisionByZero() throws Exception {
    long distance = 1000;
    long time = 0;
    mockMvc.perform(get("/yondu?distance=" + distance + "&time=" + time))
            .andExpect(status().isNotAcceptable())
            .andExpect(content().string("Error: dividing by zero. Time cannot be zero!"));
  }

  @Test
  public void rocket_fillShip_Status_Ok() throws Exception {
    GuardianController controller = new GuardianController(rocketService);
    ResponseEntity<?> result = controller.fill(".50", 500);

    FillStatusDTO responseStatus = new FillStatusDTO();
    responseStatus.setAmount(500);
    responseStatus.setReceived(".50");

    when(rocketService.fillShip(".50", 500)).thenReturn(responseStatus);
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=500"))
            .andExpect(jsonPath("$.received", is(".50")))
            .andExpect(jsonPath("$.amount", is(500)));
  }

  @Test
  public void rocket_CargoStatus_Ok_WhenShipEmpty() throws Exception {
    GuardianController controller = new GuardianController(rocketService);
    ResponseEntity<?> result = controller.cargo();
    Ship ship = new Ship();

    CargoDTO expectedResponse = new CargoDTO(ship);

    when(rocketService.cargoStatus()).thenReturn(expectedResponse);
    mockMvc.perform(get("/rocket"))
            .andExpect(jsonPath("$.shipstatus", is("empty")));
  }

  @Test
  public void rocket_CargoStatus_Ok_WhenShipFull() throws Exception {
    GuardianController controller = new GuardianController(rocketService);
    ResponseEntity<?> result = controller.cargo();
    Ship ship = new Ship();
    ship.setCaliber25(12500);
    ship.checkStatus();

    CargoDTO expectedResponse = new CargoDTO(ship);

    when(rocketService.cargoStatus()).thenReturn(expectedResponse);
    mockMvc.perform(get("/rocket"))
            .andExpect(jsonPath("$.shipstatus", is("full")))
            .andExpect(jsonPath("$.ready", is(true)));
  }

  @Test
  public void rocket_CargoStatus_Ok_WhenShip40Procent() throws Exception {
    GuardianController controller = new GuardianController(rocketService);
    ResponseEntity<?> result = controller.cargo();
    Ship ship = new Ship();
    ship.setCaliber25(5000);
    ship.checkStatus();

    CargoDTO expectedResponse = new CargoDTO(ship);

    when(rocketService.cargoStatus()).thenReturn(expectedResponse);
    mockMvc.perform(get("/rocket"))
            .andExpect(jsonPath("$.shipstatus", is("40.0%")))
            .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void rocket_CargoStatus_Nok_IfDivisionByZero() throws Exception {
    GuardianController controller = new GuardianController(rocketService);
    ResponseEntity<?> result = controller.cargo();
    Ship ship = new Ship();
    ship.setCaliber25(5000);
    ship.checkStatus();

    CargoDTO expectedResponse = new CargoDTO(ship);

    when(rocketService.cargoStatus()).thenReturn(expectedResponse);
    mockMvc.perform(get("/rocket"))
            .andExpect(jsonPath("$.shipstatus", is("40.0%")))
            .andExpect(jsonPath("$.ready", is(false)));
  }

}