package com.unisinos.carrentsystem.entity;

import java.math.BigDecimal;
import java.util.UUID;

import com.unisinos.carrentsystem.entity.enums.AgencySpot;
import com.unisinos.carrentsystem.entity.enums.VehicleCategory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    String plate;

    String model;

    VehicleCategory category;

    AgencySpot agencySpot;

    BigDecimal pricePerDay;

}
