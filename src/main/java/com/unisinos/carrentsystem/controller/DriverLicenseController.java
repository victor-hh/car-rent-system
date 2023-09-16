package com.unisinos.carrentsystem.controller;

import com.unisinos.carrentsystem.entity.DriverLicense;
import com.unisinos.carrentsystem.service.DriverLicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver-license")
@RequiredArgsConstructor
public class DriverLicenseController {

    private final DriverLicenseService service;

    @PostMapping
    public ResponseEntity<DriverLicense> save(@RequestBody DriverLicense driverLicense) {
        DriverLicense savedDriverLicence = service.save(driverLicense);
        return ResponseEntity.ok(savedDriverLicence);
    }

    @GetMapping("all")
    public ResponseEntity<List<DriverLicense>> findAll() {
        List<DriverLicense> driverLicenses = service.findAll();
        return ResponseEntity.ok(driverLicenses);
    }


}
