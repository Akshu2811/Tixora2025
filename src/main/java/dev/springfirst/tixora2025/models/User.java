package dev.springfirst.tixora2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class User {

    @Id
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private List<Booking> bookings;

}
