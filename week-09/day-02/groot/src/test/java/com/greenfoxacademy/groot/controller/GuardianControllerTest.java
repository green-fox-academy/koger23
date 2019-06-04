package com.greenfoxacademy.groot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

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
}