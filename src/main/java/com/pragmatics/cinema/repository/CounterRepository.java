package com.pragmatics.cinema.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CounterRepository {

    private final Map<Integer, Integer> countersByEventId = new HashMap<>();

    public Integer incrementCounter(int eventId) {
        Integer counter = countersByEventId.get(eventId);
        counter = (counter != null) ? ++counter : 1;
        countersByEventId.put(eventId, counter);
        return counter;
    }

    public Integer getCounterForEvent(int eventId) {
        return countersByEventId.get(eventId);
    }


}
