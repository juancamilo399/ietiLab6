package com.example.ieti.taskplanner.services;

import com.example.ieti.taskplanner.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {

    Set<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}
