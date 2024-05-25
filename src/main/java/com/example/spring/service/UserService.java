package com.example.spring.service;

import com.example.spring.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public Optional<User> findById(int id);
    public List<User> findAll();
    public void saveUser(User user);
    public void deleteById (int id);
    public void mergeUser(User userId);
}
