package dev.springfirst.tixora2025.services;

import dev.springfirst.tixora2025.models.User;
import dev.springfirst.tixora2025.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(String username,String email, String password) {

        //check if user already exists
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            throw new RuntimeException("User already exists");
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setName(username);
        return userRepository.save(user);
        //return new User();

    }

}
