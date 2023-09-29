package com.boutique.models.service;

import java.util.List;
import java.util.Optional;

import com.boutique.models.entity.estudiante;

public interface EstudianteService {

	
	public Optional<estudiante>findById(Integer id);
	public List<estudiante>findALL();
	public estudiante save(estudiante e);
	public void deleteById(Integer id);
	
}
