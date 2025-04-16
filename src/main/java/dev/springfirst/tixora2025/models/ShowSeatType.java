package dev.springfirst.tixora2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShowSeatType {

    @Id
    private int id;
    private Show show;
    private String seatType;
    private double price;

    
}
