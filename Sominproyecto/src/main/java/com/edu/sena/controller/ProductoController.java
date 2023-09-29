package com.edu.sena.controller;
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
import com.edu.sena.models.entity.Producto;
import com.edu.sena.models.service.ProductoService;

@RestController
@RequestMapping("/api/productos")


public class ProductoController {
	
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/{id}")
	public Optional<Producto> buscarPorId(@PathVariable Integer id){
		
		return productoService.findById(id);
		
	}
	
	@GetMapping("/listar")
	public List<Producto> ListarTodos(){
		
		return productoService.findAll();
		
	}
	
	
	@PostMapping
	
	public Producto guardar(@RequestBody  Producto p) {
		
		return productoService.save(p);
	}
	
	@DeleteMapping("/{id}")
	public void  eliminar(@PathVariable Integer id) {
		
		productoService.deleteById(id);
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Producto actualizar(@RequestBody Producto p, @PathVariable Integer id) {
		
		Producto pEnBD=productoService.findById(id).get();
				
				pEnBD.setNombre(p.getNombre());
				pEnBD.setId(p.getId());
				pEnBD.setValor(p.getValor());
				pEnBD.setExistencias(p.getExistencias());
				
				
				return productoService.save(pEnBD);
	}
		
	}
	
	

