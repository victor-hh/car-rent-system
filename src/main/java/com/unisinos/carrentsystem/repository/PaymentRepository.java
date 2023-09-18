package com.unisinos.carrentsystem.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unisinos.carrentsystem.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, UUID> {
}
