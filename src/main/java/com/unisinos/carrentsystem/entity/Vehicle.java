package com.unisinos.carrentsystem.entity;

import com.unisinos.carrentsystem.entity.enums.AgencySpot;
import com.unisinos.carrentsystem.entity.enums.VehicleCategory;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.UUID;

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
