package com.example.flywaydemo.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;

    @Column(precision = 10, scale = 2)  // Optional: Set precision and scale for DECIMAL
    private BigDecimal salary;  // New field corresponding to the "salary" column in DB

}
