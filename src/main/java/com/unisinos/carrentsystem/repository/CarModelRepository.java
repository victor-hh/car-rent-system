package com.unisinos.carrentsystem.repository;

import com.unisinos.carrentsystem.entity.Car;
import com.unisinos.carrentsystem.entity.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface CarModelRepository extends JpaRepository<CarModel, UUID> {

    CarModel getCarModelById(UUID id);

    @Query(value = "select id, plate, model, year from car where model = :uuid", nativeQuery = true)
    List<String> getByModel(@Param("uuid")UUID uuid);
}
// where car_model.name = :model