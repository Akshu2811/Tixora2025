package dev.springfirst.tixora2025.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Theatre {

    @Id
    private int id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
    private List<Screen> screens;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
