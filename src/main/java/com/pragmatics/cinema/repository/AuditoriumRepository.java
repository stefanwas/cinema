package com.pragmatics.cinema.repository;

import com.pragmatics.cinema.domain.Auditorium;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

@Repository
public class AuditoriumRepository {

  private final Map<String, Auditorium> auditoriums = new HashMap<>();

  @PostConstruct
  public void initRepository() {
  //TODO read from file
  }

  public Auditorium getByName(String name) {
    return auditoriums.get(name);
  }
}
