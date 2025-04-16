package dev.springfirst.tixora2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Booking {

    @Id
    private int id;
    private LocalDate date;
    private User user;
    private Show show;
    private List<ShowSeat> seats;
    private double amount;
    private List<Payment> payments;

}
