package com.unisinos.carrentsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    String name;

    String cpf;

    LocalDate birthDate;

    String email;

//    @OneToOne(fetch = FetchType.LAZY)
////    @MapsId
//    @JoinColumn(name = "driver_license_id",  referencedColumnName = "id")
//    DriverLicense driverLicense;

}
