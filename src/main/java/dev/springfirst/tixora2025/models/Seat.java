package dev.springfirst.tixora2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Seat {

    @Id
    private int id;
    private String SeatName;
    private int row;
    private int column;
    private String SeatType;
}
