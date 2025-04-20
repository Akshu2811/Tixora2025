package dev.springfirst.tixora2025.controllers;

import dev.springfirst.tixora2025.dtos.ResponseStatus;
import dev.springfirst.tixora2025.dtos.SignUpUserRequestDTO;
import dev.springfirst.tixora2025.dtos.SignUpUserResponseDTO;
import dev.springfirst.tixora2025.models.User;
import dev.springfirst.tixora2025.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    public SignUpUserResponseDTO signUpUser(SignUpUserRequestDTO signUpUserRequestDTO) {
        SignUpUserResponseDTO signUpUserResponseDTO = new SignUpUserResponseDTO();
        try{
            User user = userService.signUp(signUpUserRequestDTO.getUsername(), signUpUserRequestDTO.getEmail(), signUpUserRequestDTO.getPassword());

            signUpUserResponseDTO.setUserId(user.getId());
            signUpUserResponseDTO.setMessage("User successfully registered!");
            signUpUserResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }
        catch(Exception e){
            signUpUserResponseDTO.setMessage("Failed to create user :" +e.getMessage());
            signUpUserResponseDTO.setResponseStatus(ResponseStatus.FAILURE);

        }
        return signUpUserResponseDTO;
    }
}
// BookTicket
// controllers

//  Service : what code ?
// validate showId / userId
// get the details about the selected seats
// check if all the seats are available
// yes
// block all the seats , blocked at
// creating a booking object and return it
// no : Something went wrong / try again

// input ?
// userId , showID, seats ?
// output
// temporary booking id


// Homework : Complete Book ticket functionality
// raise a Pull request