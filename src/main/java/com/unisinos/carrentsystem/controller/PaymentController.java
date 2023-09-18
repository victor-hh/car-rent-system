package com.unisinos.carrentsystem.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisinos.carrentsystem.service.PaymentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/book/{uuid}")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService service;

    @PostMapping("pay")
    public ResponseEntity<Void> pay(@PathVariable(value = "uuid") UUID uuid) {
        service.pay(uuid);
        return ResponseEntity.ok().build();
    }

}
