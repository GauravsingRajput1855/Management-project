package com.example.management.Controller;

import com.example.management.Entity.User;
import com.example.management.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@Service
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
  private   UserRepository userRepository;

    @PostMapping("/insert")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    //here you are getting all the information
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


}
