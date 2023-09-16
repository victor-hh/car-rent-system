package com.unisinos.carrentsystem.service;

import com.unisinos.carrentsystem.entity.Vehicle;
import com.unisinos.carrentsystem.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository repository;

    public Vehicle save(Vehicle carModel) {
        return repository.save(carModel);
    }

    public Vehicle findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

//    public List<String> getByModel(String model) {
//        return repository.getByModel(model);
//    }

    public List<Vehicle> findAll() {
        return repository.findAll();
    }
}
