package com.unisinos.carrentsystem.service;

import com.unisinos.carrentsystem.entity.DriverLicense;
import com.unisinos.carrentsystem.repository.DriverLicenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
