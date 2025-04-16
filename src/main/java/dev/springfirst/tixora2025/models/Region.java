package dev.springfirst.tixora2025.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Region {

    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
    private List<Theatre> theatres;
}
