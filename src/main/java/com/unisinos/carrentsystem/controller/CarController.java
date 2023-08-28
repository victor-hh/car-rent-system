package com.unisinos.carrentsystem.controller;

import com.unisinos.carrentsystem.entity.Car;
import com.unisinos.carrentsystem.entity.CarModel;
import com.unisinos.carrentsystem.service.CarService;
import com.unisinos.carrentsystem.controller.CarController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService service;

    @PostMapping()
    private ResponseEntity<Car> save (@RequestBody Car car) {
        Car savedCar = service.save(car);
        return ResponseEntity.ofNullable(savedCar);
    }

    @GetMapping("/all")
    private ResponseEntity<List<Car>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{uuid}")
    private ResponseEntity<Car> findById(@PathVariable(value = "uuid") UUID uuid) {
        return ResponseEntity.ofNullable(service.findById(uuid));
    }

    @DeleteMapping("/{uuid}")
    private void deleteById(@PathVariable(value = "uuid") UUID uuid) {
        service.deleteById(uuid);
    }

}
