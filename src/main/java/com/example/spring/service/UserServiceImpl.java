package com.example.spring.service;

import com.example.spring.repository.UserRepository;
import com.example.spring.model.User;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository dao;

    public UserServiceImpl(UserRepository dao) {
        this.dao = dao;
    }
    public Optional<User> findById(int id){
        return dao.findById(id);
    }

    public List<User> findAll() {
        return  dao.findAll();
    }
    public void saveUser(User user){
        dao.save(user);
    }
    public void deleteById (int id) {
        dao.deleteById(id);
    }
    public void mergeUser(User userId) {
        User dbUser = findById(userId.getId()).orElse(null);
        if (dbUser != null) {
            dbUser.setName(userId.getName());
            dbUser.setAge(userId.getAge());
            saveUser(dbUser);
        }
    }
}
