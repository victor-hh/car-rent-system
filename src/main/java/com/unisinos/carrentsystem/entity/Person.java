package com.unisinos.carrentsystem.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.*;
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

    @Column(nullable = false)
    String name;

    @Column(unique = true, length = 13, nullable = false)
    String cpf;

    LocalDate birthDate;

    String email;

}
