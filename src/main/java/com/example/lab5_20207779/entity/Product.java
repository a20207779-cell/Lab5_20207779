package com.example.lab5_20207779.entity;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private int id;

    @Column(nullable = false)
    @Size(max = 40,message = "Solo se soportan 40 caractéres")
    @NotBlank
    private String name;

    @Digits(integer = 10, fraction = 4)
    @Positive
    private BigDecimal price;

    @Digits(integer = 5,fraction = 0)
    @Min(value = 0)
    @Max(value = 32767,message = "el valor máximo es 32767")
    private int stock;



}
