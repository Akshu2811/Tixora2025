package dev.springfirst.tixora2025.models;

import java.time.LocalTime;

public class Payment {

    private int id;
    private LocalTime paymentTime;
    private double amount;
    private String referenceNumber;
    private PaymentMode paymentMode;
    private Booking booking;
    private PaymentStatus paymentStatus;
}
