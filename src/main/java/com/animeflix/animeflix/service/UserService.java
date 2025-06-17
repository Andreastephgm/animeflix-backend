package com.animeflix.animeflix.service;

import com.animeflix.animeflix.model.User;
import com.animeflix.animeflix.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> listUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }

    public User updateUser(User user, Long id){
        return userRepository.findById(id).map(newUser ->{
            newUser.setUsername(user.getUsername());
            newUser.setEmail(user.getEmail());
            newUser.setDateOfBirth(user.getDateOfBirth());
            newUser.setPassword(user.getPassword());
            return userRepository.save(newUser);
        }).orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

    public void deleteUser(Long id){
        if(userRepository.findById(id).isPresent()){
            userRepository.deleteById(id);
        }else throw new IllegalArgumentException("User not found with ID: " + id);
    }
}
