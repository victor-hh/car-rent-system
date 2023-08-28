package com.unisinos.carrentsystem.service;

import com.unisinos.carrentsystem.entity.Car;
import com.unisinos.carrentsystem.entity.CarModel;
import com.unisinos.carrentsystem.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository repository;

    public Car save(Car car) {
        return repository.save(car);
    }

    public Car findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public List<Car> findAll() {
        return repository.findAll();
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
