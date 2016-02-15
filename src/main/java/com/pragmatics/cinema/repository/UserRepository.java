package com.pragmatics.cinema.repository;

import com.pragmatics.cinema.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private final Map<Integer, User> usersById = new HashMap<>();

    public void saveUser(User user) {
        usersById.put(user.getId(), user);
    }

    public User getById(int id) {
        return usersById.get(id);
    }
}
