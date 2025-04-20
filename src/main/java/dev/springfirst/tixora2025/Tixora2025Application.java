package dev.springfirst.tixora2025;

import dev.springfirst.tixora2025.controllers.UserController;
import dev.springfirst.tixora2025.dtos.SignUpUserRequestDTO;
import dev.springfirst.tixora2025.dtos.SignUpUserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Tixora2025Application  implements CommandLineRunner {

    @Autowired
    private UserController userController;

    public void run(String... args) throws Exception {
        SignUpUserRequestDTO request = new SignUpUserRequestDTO();
        request.setUsername("Hiranya Pappu");
        request.setPassword("1579243");
        request.setEmail("hpappu@gmail.com");

        SignUpUserResponseDTO response = userController.signUpUser(request);
        System.out.println(response.getMessage());
    }


    public static void main(String[] args) {
        SpringApplication.run(Tixora2025Application.class, args);
    }

}
