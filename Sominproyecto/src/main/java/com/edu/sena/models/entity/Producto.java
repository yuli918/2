package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Valor")
	private int valor;
	
	@Column(name = "Existencias")
	private int existencias;
	
	
	public Producto(int id, String nombre, int valor, int existencias) {
		
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
		this.existencias = existencias;
	}


	public Producto() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public int getExistencias() {
		return existencias;
	}


	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	
	
	
}

