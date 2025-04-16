package dev.springfirst.tixora2025.models;

import java.time.LocalDate;
import java.util.List;

public class Booking {

    private int id;
    private LocalDate date;
    private User user;
    private Show show;
    private List<ShowSeat> seats;
    private double amount;
    private List<Payment> payments;

}
