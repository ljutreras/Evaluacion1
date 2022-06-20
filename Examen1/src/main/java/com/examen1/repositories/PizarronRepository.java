package com.examen1.repositories;

import com.examen1.models.Pizarron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizarronRepository extends JpaRepository<Pizarron,Long> {
}
