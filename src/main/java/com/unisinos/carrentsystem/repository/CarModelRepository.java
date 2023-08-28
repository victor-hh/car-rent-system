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

    @Query(value = "select car.id, plate, car_model.name, year from (car join car_model on car.model = car_model.id) where car_model.name = :model", nativeQuery = true)
    List<String> getByModel(@Param("model")String model);
}
// where car_model.name = :model