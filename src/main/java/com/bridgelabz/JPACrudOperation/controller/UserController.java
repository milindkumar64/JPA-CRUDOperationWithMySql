package com.bridgelabz.JPACrudOperation.controller;

import com.bridgelabz.JPACrudOperation.model.User;
import com.bridgelabz.JPACrudOperation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/hello")
    public String message(){
        return "Hello MK";
    }
    @GetMapping("/add-user")
    public User addUser(User user){
        return userService.addUser(user);
    }
    @GetMapping("/add-users")
    public List<User> addUsers(@RequestBody List<User> users){
        return userService.addUsers(users);
    }

    @GetMapping("/get-users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/update-user/{id}/{name}/{city}/{status}")
    public User updateUser(@PathVariable long id,@PathVariable String name, @PathVariable String city, @PathVariable String status) {
        return userService.updateUser(id,name,city,status);
    }

    @GetMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable long id){
        return userService.deleteUser(id);
    }
}
