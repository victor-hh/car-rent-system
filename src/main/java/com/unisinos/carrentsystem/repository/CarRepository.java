package com.unisinos.carrentsystem.repository;

import com.unisinos.carrentsystem.entity.Car;
import com.unisinos.carrentsystem.entity.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID> {

    Car getCarById(UUID id);

}
