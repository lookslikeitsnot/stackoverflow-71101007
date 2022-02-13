package com.stackoverflow.answers.controllers;

import com.stackoverflow.answers.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
  @Autowired
  private NameService nameService;

  @PostMapping("/triggerError")
  public ResponseEntity<Void> trigger() {
    nameService.trigger();

    return ResponseEntity.ok().build();
  }
}
