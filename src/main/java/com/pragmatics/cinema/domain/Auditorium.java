package com.pragmatics.cinema.domain;

import java.util.LinkedList;
import java.util.List;

public class Auditorium {
  private String name;
  private int numberOfSeats;
  private final List<Integer> premiumSeats = new LinkedList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public List<Integer> getPremiumSeats() {
    return premiumSeats;
  }
}
