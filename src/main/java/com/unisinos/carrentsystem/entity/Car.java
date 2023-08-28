package com.unisinos.carrentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String plate;

    @ManyToOne
    @JoinColumn(name = "model", foreignKey = @ForeignKey(name = "name"))
    private CarModel model;

    private String year;
}
