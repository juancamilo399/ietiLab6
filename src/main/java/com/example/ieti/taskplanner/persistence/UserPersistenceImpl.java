package com.example.ieti.taskplanner.persistence;

import com.example.ieti.taskplanner.model.User;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class UserPersistenceImpl implements  UserPersistence{


    private HashMap<String ,User> users;


    public UserPersistenceImpl() {
        users = new HashMap<>();
        User user1 = new User("juan","juan@mail.com","1","hola");
        User user2 = new User("carlos","carlos@mail.com","2","hola");
        users.put("1",user1);
        users.put("2",user2);

    }

    @Override
    public User getUserById(String id) {
        User user = users.get(id);
        return user;
    }

    @Override
    public Set<User> getAll() {
        return new HashSet(users.values());
    }

    @Override
    public User create(User user) {
        users.put(user.getId(),user);
        return user;
    }

    @Override
    public User update(User user) {
        User newUser = getUserById(user.getId());
        if (user.getEmail()!=null) newUser.setEmail(user.getEmail());
        if (user.getName()!=null) newUser.setName(user.getName());
        if (user.getPassword()!=null) newUser.setPassword(user.getPassword());
        return user;
    }

    @Override
    public void remove(String userId) {
        users.remove(userId);
    }


}
