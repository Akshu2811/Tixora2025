package dev.springfirst.tixora2025.models;

import java.util.List;

public class Show {
    private int id;
    private Movie movie;
    private int time;
    private Screen screen;
    private Theatre theatre;
    private List<ShowSeat> showSeats;
    private List<ShowSeatType> showSeatTypes;
}
