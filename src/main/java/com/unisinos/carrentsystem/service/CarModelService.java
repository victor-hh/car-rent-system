package com.unisinos.carrentsystem.service;

import com.unisinos.carrentsystem.entity.Car;
import com.unisinos.carrentsystem.entity.CarModel;
import com.unisinos.carrentsystem.repository.CarModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarModelService {

    private final CarModelRepository repository;

    public CarModel save(CarModel carModel) {
        return repository.save(carModel);
    }

    public CarModel findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

    public List<String> getByModel(UUID uuid) {
        return repository.getByModel(uuid);
    }

    public List<CarModel> findAll() {
        return repository.findAll();
    }
}
