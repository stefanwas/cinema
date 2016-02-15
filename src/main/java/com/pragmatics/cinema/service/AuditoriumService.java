package com.pragmatics.cinema.service;

import com.pragmatics.cinema.domain.Auditorium;
import com.pragmatics.cinema.repository.AuditoriumRepository;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AuditoriumService {

  @Resource
  private AuditoriumRepository repository;

  public Auditorium getByName(String name) {
    return repository.getByName(name);
  }
}
