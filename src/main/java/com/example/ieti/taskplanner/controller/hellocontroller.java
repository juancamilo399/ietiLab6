package com.example.ieti.taskplanner.controller;

import com.example.ieti.taskplanner.model.User;
import com.example.ieti.taskplanner.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class hellocontroller {


    @Autowired
    private UserService services;

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable String id) {
        return new ResponseEntity<>(services.getById(id), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getUsers() {
        return new ResponseEntity<>(services.getAll(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> postUser (@RequestBody User user) {
        return new ResponseEntity<>(services.create(user), HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> putUser (@RequestBody User user) {
        return new ResponseEntity<>(services.update(user), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable String id) {
        services.remove(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
