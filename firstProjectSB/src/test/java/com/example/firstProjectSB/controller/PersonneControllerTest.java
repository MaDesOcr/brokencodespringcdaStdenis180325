package com.example.firstProjectSB.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.service.PersonneService;


@SpringBootTest
@AutoConfigureMockMvc
class GreetingControllerCombinedTest {
 
  @Autowired
  private MockMvc mockMvc;
 
  
}
