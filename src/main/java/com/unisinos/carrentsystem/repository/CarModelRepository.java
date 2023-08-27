package com.unisinos.carrentsystem.repository;

import com.unisinos.carrentsystem.entity.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarModelRepository extends JpaRepository<CarModel, UUID> {

    CarModel getCarModelById(UUID id);

}
