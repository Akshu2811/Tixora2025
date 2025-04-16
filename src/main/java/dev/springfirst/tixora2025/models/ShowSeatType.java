package dev.springfirst.tixora2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ShowSeatType {

    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;
    private String seatType;
    private double price;

    
}
