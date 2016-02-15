package com.pragmatics.cinema.repository;

import com.pragmatics.cinema.domain.Event;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EventRepository {

  private final Map<Integer, Event> eventsById = new HashMap<>();

  public void createEvent(Event event) {
    eventsById.put(event.getId(), event);
  }

  public Event getById(int id) {
    return eventsById.get(id);
  }
}
