package com.boutique.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boutique.models.entity.estudiante;
import com.boutique.models.service.EstudianteService;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteControllers {
	
	@Autowired
	EstudianteService estudianteServices;

	@GetMapping("/{id)")
	public Optional<estudiante> buscarporId(@PathVariable Integer id){
		
		
		return estudianteServices.findById(id);
	}
	
	@GetMapping("/listar")
	public List<estudiante> ListarTodos(){
		
		return estudianteServices.findALL();
	}
	
	@PostMapping
	public estudiante guardar(@RequestBody estudiante e) {
	
		return estudianteServices.save(e);
	
}
	@DeleteMapping("/{id)")
	public void eliminar(@PathVariable Integer id) {
		
		
		estudianteServices.deleteById(id);
		
	}
	
	@PutMapping("/actualizar/{id)")
	public estudiante actualizar(@RequestBody estudiante e,@PathVariable Integer id) {
	
	estudiante eEnBD=estudianteServices.findById(id).get();
	
	eEnBD.setCodigo(e.getCodigo());
	eEnBD.setNombre(e.getNombre());
	eEnBD.setApellido(e.getApellido());
	eEnBD.setEdad(e.getEdad());

	estudianteServices.save(eEnBD);

	return e;
}
	
}
	
	
	
	
	
	
	
	
