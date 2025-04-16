package dev.springfirst.tixora2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShowSeat {

    @Id
    private int id;
    private Show show;
    private Seat seat;
    private SeatStatus seatStatus;
}
