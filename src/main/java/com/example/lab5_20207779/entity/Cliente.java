package com.example.Lab5_20207779.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer")
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerid")
    private int id;
    @Column(nullable = false)
    private String nombre;

    private String document;
    private String document_type;


}
