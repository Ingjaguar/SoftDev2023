package com.example.proyecto.proyecto.repository;

import com.example.proyecto.proyecto.entities.Movements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementsRepository extends JpaRepository<Movements, Long> {
}
