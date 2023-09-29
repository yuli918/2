package com.boutique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boutique.models.entity.estudiante;

@Repository
public interface EstudianteRepository  extends JpaRepository<estudiante, Integer>{

}
