package dev.springfirst.tixora2025.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Show {

    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    private int time;
    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;
    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;
    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<ShowSeat> showSeats;
    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<ShowSeatType> showSeatTypes;
}
