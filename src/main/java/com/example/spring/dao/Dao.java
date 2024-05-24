package com.example.spring.dao;

import com.example.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Dao extends JpaRepository<User, Integer> {

}
