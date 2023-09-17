package com.unisinos.carrentsystem.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.unisinos.carrentsystem.entity.DriverLicense;
import com.unisinos.carrentsystem.repository.DriverLicenseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DriverLicenseService {

    private final DriverLicenseRepository repository;

    public DriverLicense save(DriverLicense driverLicense) {
        return repository.save(driverLicense);
    }

    public List<DriverLicense> findAll() {
        return repository.findAll();
    }

    public DriverLicense findById(UUID uuid) {
        return repository.findById(uuid).orElse(null);
    }

    public boolean validate(UUID uuid) {
        DriverLicense driverLicense = repository.findById(uuid).orElse(null);
        return driverLicense.isValid();
    }
}
