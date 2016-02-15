package com.pragmatics.cinema.domain;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private final List<Ticket> bookedTickets = new LinkedList<>();

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasBirthdayOn(Date date) {
        return true;
    }

    public List<Ticket> getBookedTickets() {
        return bookedTickets;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + '\'' + '}';
    }
}
