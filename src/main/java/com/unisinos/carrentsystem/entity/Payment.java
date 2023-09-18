package com.unisinos.carrentsystem.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import com.unisinos.carrentsystem.entity.enums.PaymentMethod;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    PaymentMethod paymentMethod;

    BigDecimal value;

    LocalDate dueDate;

    Boolean paid;

}
