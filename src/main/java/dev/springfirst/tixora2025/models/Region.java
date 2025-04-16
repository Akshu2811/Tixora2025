package dev.springfirst.tixora2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Region {

    @Id
    private int id;
    private String name;
    private List<Theatre> theatres;
}
