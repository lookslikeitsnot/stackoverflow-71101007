package com.stackoverflow.answers.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "NAMES")
public class Name {
  @Id
  @GeneratedValue
  public Long id;

  @Column(nullable = false)
  public String name;

  public Name(String name) {
    this.name = name;
  }
}
