package com.unisinos.carrentsystem.entity;

import jakarta.persistence.*;
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
public class DriverLicense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    LocalDate expiration;

}
