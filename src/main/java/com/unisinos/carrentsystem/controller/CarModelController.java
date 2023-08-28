package com.unisinos.carrentsystem.controller;

import com.unisinos.carrentsystem.entity.Car;
import com.unisinos.carrentsystem.entity.CarModel;
import com.unisinos.carrentsystem.service.CarModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/car-model")
@RequiredArgsConstructor
public class CarModelController {

    private final CarModelService service;

    @PostMapping()
    private ResponseEntity<CarModel> save (@RequestBody CarModel carModel) {
        CarModel savedCar = service.save(carModel);
        return ResponseEntity.ofNullable(savedCar);
    }

    @GetMapping("/all")
    private ResponseEntity<List<CarModel>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{uuid}")
    private ResponseEntity<CarModel> findById(@PathVariable(value = "uuid") UUID uuid) {
        return ResponseEntity.ofNullable(service.findById(uuid));
    }

    @DeleteMapping("/{uuid}")
    private void deleteById(@PathVariable(value = "uuid") UUID uuid) {
        service.deleteById(uuid);
    }

    @GetMapping("/get-cars/{model}")
    private ResponseEntity<List<String>> getByModel(@PathVariable(value = "model") String model) {
        return ResponseEntity.ofNullable(service.getByModel(model));
    }
}
