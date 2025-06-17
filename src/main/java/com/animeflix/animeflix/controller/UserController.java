package com.animeflix.animeflix.controller;

import com.animeflix.animeflix.model.User;
import com.animeflix.animeflix.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> listUser(){
        return  userService.listUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable Long id){
        return  userService.findUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Long id){
        return userService.updateUser(user, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
         userService.deleteUser(id);
    }

}
