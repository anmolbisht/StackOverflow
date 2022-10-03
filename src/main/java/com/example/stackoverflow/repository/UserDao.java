package com.example.stackoverflow.repository;

import com.example.stackoverflow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {


}
