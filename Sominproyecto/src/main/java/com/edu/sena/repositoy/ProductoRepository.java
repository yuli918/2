package com.edu.sena.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.sena.models.entity.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
