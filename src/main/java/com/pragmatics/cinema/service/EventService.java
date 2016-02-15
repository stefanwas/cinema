package com.pragmatics.cinema.service;

import com.pragmatics.cinema.domain.Event;
import com.pragmatics.cinema.repository.EventRepository;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EventService {

  @Resource
  private EventRepository eventRepository;

  public void createEvent(Event event){
    eventRepository.createEvent(event);
  }

  public Event getById(int id) {
    return eventRepository.getById(id);
  }
}
