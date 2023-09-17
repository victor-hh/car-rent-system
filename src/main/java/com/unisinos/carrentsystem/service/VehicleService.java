package com.unisinos.carrentsystem.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.unisinos.carrentsystem.entity.Vehicle;
import com.unisinos.carrentsystem.repository.VehicleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository repository;

    public Vehicle save(Vehicle carModel) {
        return repository.save(carModel);
    }

    public List<Vehicle> findAll() {
        return repository.findAll();
    }

    public Vehicle findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

}
