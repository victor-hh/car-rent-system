package com.unisinos.carrentsystem.controller;

import com.unisinos.carrentsystem.entity.Vehicle;
import com.unisinos.carrentsystem.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/vehicle")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService service;

    @PostMapping()
    public ResponseEntity<Vehicle> save (@RequestBody Vehicle vehicle) {
        Vehicle savedVehicle = service.save(vehicle);
        return ResponseEntity.ofNullable(savedVehicle);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Vehicle>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<Vehicle> findById(@PathVariable(value = "uuid") UUID uuid) {
        return ResponseEntity.ofNullable(service.findById(uuid));
    }

    @DeleteMapping("/{uuid}")
    public void deleteById(@PathVariable(value = "uuid") UUID uuid) {
        service.deleteById(uuid);
    }

//    @GetMapping("/get-cars/{model}")
//    private ResponseEntity<List<String>> getByModel(@PathVariable(value = "model") String model) {
//        return ResponseEntity.ofNullable(service.getByModel(model));
//    }
}
