package com.example.ieti.taskplanner.persistence;

import com.example.ieti.taskplanner.model.User;

import java.util.List;
import java.util.Set;

public interface UserPersistence {

    User getUserById(String id);

    Set<User> getAll();

    User create(User user);

    User update(User user);

    void remove(String userId);
}
