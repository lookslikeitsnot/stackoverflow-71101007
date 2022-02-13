package com.stackoverflow.answers.controllers;

import com.stackoverflow.answers.entities.Name;
import com.stackoverflow.answers.repositories.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class MyController {
  @Autowired
  private NameRepository nameRepository;

  @PostMapping("/triggerError")
  public ResponseEntity<Void> trigger() {

    Name newName = new Name("Chris");
    nameRepository.save(newName);

    return ResponseEntity.ok().build();
  }
}
