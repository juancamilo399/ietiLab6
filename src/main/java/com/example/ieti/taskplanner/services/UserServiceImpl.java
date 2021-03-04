package com.example.ieti.taskplanner.services;

import com.example.ieti.taskplanner.model.User;
import com.example.ieti.taskplanner.persistence.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserPersistence persistence;

    @Override
    public Set<User> getAll() {
        return persistence.getAll();
    }

    @Override
    public User getById(String userId) {
        return persistence.getUserById(userId);
    }

    @Override
    public User create(User user) {
        return persistence.create(user);
    }

    @Override
    public User update(User user) {
        return persistence.update(user);
    }

    @Override
    public void remove(String userId) {
        persistence.remove(userId);
    }
}
