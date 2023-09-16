package com.unisinos.carrentsystem.repository;

import com.unisinos.carrentsystem.entity.DriverLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DriverLicenseRepository extends JpaRepository<DriverLicense, UUID> {
}
