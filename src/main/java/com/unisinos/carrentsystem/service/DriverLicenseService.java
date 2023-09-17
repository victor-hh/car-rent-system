package com.unisinos.carrentsystem.service;

import com.unisinos.carrentsystem.entity.DriverLicense;
import com.unisinos.carrentsystem.repository.DriverLicenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DriverLicenseService {

    private final DriverLicenseRepository repository;

    public List<DriverLicense> findAll() {
        return repository.findAll();
    }

    public DriverLicense save(DriverLicense driverLicense) {
        return repository.save(driverLicense);
    }

    public boolean validate(UUID uuid) {
        DriverLicense driverLicense = repository.findById(uuid).orElse(null);
        LocalDate expirationDate = driverLicense.getExpiration();
        return expirationDate.compareTo(java.time.LocalDate.now()) > 0;
    }
}
