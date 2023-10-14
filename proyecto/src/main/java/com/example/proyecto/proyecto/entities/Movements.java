package com.example.proyecto.proyecto.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "movements")
@Data
public class Movements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "concept")
    private String concept;

    @Column(name = "amount")
    private Float amount;

    @Column(name = "employee_id")
    private String employee;

    @Column(name = "enterprise_id")
    private String enterprise;

    @Column(name = "total")
    private Float total;

    @Column(name = "create_at")
    private Date create_at;

    @Column(name = "update_at")
    private Date update_at;
}
