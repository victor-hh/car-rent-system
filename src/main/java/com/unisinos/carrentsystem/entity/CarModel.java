package com.unisinos.carrentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    //@OneToMany(mappedBy="model")
    //private List<Car> cars;

    private String name;
}
