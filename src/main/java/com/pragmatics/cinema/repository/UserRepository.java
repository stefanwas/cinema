package com.pragmatics.cinema.repository;

import com.pragmatics.cinema.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private Map<Integer, User> usersById = new HashMap<>();

    public int saveUser(User user) {
        return usersById.put(user.getId(), user).getId();
    }

    public User getById(int id) {
        return usersById.get(id);
    }
}
