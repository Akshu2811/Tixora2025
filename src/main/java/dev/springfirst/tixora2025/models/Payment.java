package dev.springfirst.tixora2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalTime;

@Entity
public class Payment {

    @Id
    private int id;
    private LocalTime paymentTime;
    private double amount;
    private String referenceNumber;
    private PaymentMode paymentMode;
    private Booking booking;
    private PaymentStatus paymentStatus;
}
