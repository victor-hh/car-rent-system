package com.unisinos.carrentsystem.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.unisinos.carrentsystem.entity.Payment;
import com.unisinos.carrentsystem.repository.PaymentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;

    public Payment save(Payment payment) {
        return repository.save(payment);
    }

    public List<Payment> findAll() {
        return repository.findAll();
    }

    public Payment findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

    public void pay(UUID id) {
        Payment payment = repository.findById(id).orElse(null);
        payment.setPaid(true);
        repository.save(payment);
    }

}
