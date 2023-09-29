package com.boutique.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boutique.models.entity.estudiante;
import com.boutique.repository.EstudianteRepository;

@Service
 public class EstudianteServiceImpl  implements EstudianteService {

	@Autowired
	EstudianteRepository estudianteRepository;

	@Override
	public Optional<estudiante> findById(Integer id) {
		
		return estudianteRepository.findById(id);
	}

	@Override
	public List<estudiante> findALL() {
		
		return estudianteRepository.findAll();
	}

	@Override
	public estudiante save(estudiante e) {
		
		return estudianteRepository.save(e);
	}

	@Override
	public void deleteById(Integer id) {
		
		estudianteRepository.deleteById(null);
		
	}

}
	


