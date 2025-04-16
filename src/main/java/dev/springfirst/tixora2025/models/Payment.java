package dev.springfirst.tixora2025.models;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Payment {

    @Id
    private int id;
    private LocalTime paymentTime;
    private double amount;
    private String referenceNumber;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
