package com.unisinos.carrentsystem.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisinos.carrentsystem.entity.Vehicle;
import com.unisinos.carrentsystem.service.VehicleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/vehicle")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService service;

    @PostMapping()
    public ResponseEntity<Vehicle> save(@RequestBody Vehicle vehicle) {
        Vehicle savedVehicle = service.save(vehicle);
        return ResponseEntity.ofNullable(savedVehicle);
    }

    @GetMapping("all")
    public ResponseEntity<List<Vehicle>> findAll() {
        List<Vehicle> vehicles = service.findAll();
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("{uuid}")
    public ResponseEntity<Vehicle> findById(@PathVariable(value = "uuid") UUID uuid) {
        Vehicle vehicle = service.findById(uuid);
        return ResponseEntity.ofNullable(vehicle);
    }

    @DeleteMapping("{uuid}")
    public ResponseEntity<Void> deleteById(@PathVariable(value = "uuid") UUID uuid) {
        service.deleteById(uuid);
        return ResponseEntity.ok().build();
    }

}
