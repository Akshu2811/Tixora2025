package dev.springfirst.tixora2025.models;

import jakarta.persistence.*;

@Entity
public class ShowSeat {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;
    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
