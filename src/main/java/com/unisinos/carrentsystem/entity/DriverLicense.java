package com.unisinos.carrentsystem.entity;

import java.time.LocalDate;
import java.util.UUID;

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
public class DriverLicense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    String registry_number;

    LocalDate expiration;

    public boolean isValid() {
        return expiration.compareTo(java.time.LocalDate.now()) > 0;
    }

}
