package com.example.proyecto.proyecto.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String rol;

    @Column(name = "enterprise")
    private String enterprise;

    @Column(name = "profile")
    private String profile;

    @Column(name = "password")
    private String password;

}
