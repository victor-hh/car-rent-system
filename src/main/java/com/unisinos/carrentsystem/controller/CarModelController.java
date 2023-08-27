package com.unisinos.carrentsystem.controller;

import com.unisinos.carrentsystem.entity.CarModel;
import com.unisinos.carrentsystem.service.CarModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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




}
