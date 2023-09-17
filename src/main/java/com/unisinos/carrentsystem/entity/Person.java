package com.unisinos.carrentsystem.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    DriverLicense driverLicense;

    String name;

    String cpf;

    LocalDate birthDate;

    String email;

}
