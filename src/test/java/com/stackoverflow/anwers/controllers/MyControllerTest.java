package com.stackoverflow.anwers.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.stream.StreamSupport;
import com.stackoverflow.answers.AnwersApplication;
import com.stackoverflow.answers.repositories.NameRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@SpringBootTest(classes = {AnwersApplication.class})
@AutoConfigureMockMvc
public class MyControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private NameRepository nameRepository;

  @Test
  void trigger_validBody_savesName() throws Exception {
    assertEquals(2, StreamSupport.stream(nameRepository.findAll().spliterator(), false).count());
    
    mockMvc.perform(post("/triggerError")).andDo(MockMvcResultHandlers.print())
        .andExpect(status().isOk());

    assertEquals(3, StreamSupport.stream(nameRepository.findAll().spliterator(), false).count());
  }
}
