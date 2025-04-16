package dev.springfirst.tixora2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Show {

    @Id
    private int id;
    private Movie movie;
    private int time;
    private Screen screen;
    private Theatre theatre;
    private List<ShowSeat> showSeats;
    private List<ShowSeatType> showSeatTypes;
}
