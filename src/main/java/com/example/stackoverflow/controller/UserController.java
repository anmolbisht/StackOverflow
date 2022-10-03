package com.example.stackoverflow.controller;

import com.example.stackoverflow.model.User;
import com.example.stackoverflow.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user){
            try{
                userDao.save(user);
                return new ResponseEntity<>("Created User successfully", HttpStatus.OK);
            }
            catch (Exception e) {
                return new ResponseEntity<>("User already exists", HttpStatus.CONFLICT);
            }


    }


}
