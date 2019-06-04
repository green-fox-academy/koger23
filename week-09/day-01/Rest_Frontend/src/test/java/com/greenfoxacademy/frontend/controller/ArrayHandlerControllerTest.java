package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.service.ILogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(ArrayHandlerController.class)
public class ArrayHandlerControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  ILogService logService;

  @Test
  public void handleArray_sumOK() throws Exception {
    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"sum\", " +
                    "\"numbers\": [1, 2, 5, 10]}")
                    )
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(18)));
  }

  @Test
  public void handleArray_multiplyOK() throws Exception {
    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"multiply\", " +
                    "\"numbers\": [1, 2, 5, 10]}")
                    )
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(100)));
  }

  @Test
  public void handleArray_doubleOK() throws Exception {
    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"double\", " +
                    "\"numbers\": [1, 2, 5, 10]}")
                    )
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(content().json("{\"result\":[2, 4, 10, 20]}"));
  }
}