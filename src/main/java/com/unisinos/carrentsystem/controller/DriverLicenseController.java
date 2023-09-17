package com.unisinos.carrentsystem.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisinos.carrentsystem.entity.DriverLicense;
import com.unisinos.carrentsystem.service.DriverLicenseService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/person/{uuid}/driver-license")
@RequiredArgsConstructor
public class DriverLicenseController {

    private final DriverLicenseService service;

    @PostMapping()
    public ResponseEntity<DriverLicense> save(@RequestBody DriverLicense driverLicense) {
        DriverLicense savedDriverLicense = service.save(driverLicense);
        return ResponseEntity.ok(savedDriverLicense);
    }

    @GetMapping("all")
    public ResponseEntity<List<DriverLicense>> findAll() {
        List<DriverLicense> driverLicenses = service.findAll();
        return ResponseEntity.ok(driverLicenses);
    }

    @GetMapping()
    public ResponseEntity<DriverLicense> findById(@PathVariable(value = "uuid") UUID uuid) {
        DriverLicense driverLicense = service.findById(uuid);
        return ResponseEntity.ok(driverLicense);
    }

    @GetMapping("validate")
    public ResponseEntity<Boolean> validate(@PathVariable(value = "uuid") UUID uuid) {
        Boolean isValid = service.validate(uuid);
        return ResponseEntity.ok(isValid);
    }

}
