package com.boutique.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 


@Entity
@Table (name="estudiantes")

public class estudiante {
	
	@Id
	@Column (name="cod_est")
	

    private int codigo;
    
	@Column (name="nom_est")
	private String nombre;
	
	@Column (name="ape_est")
	private String apellido;
	
	@Column (name= "edad_est")
	private int edad;
 
	public estudiante(int codigo, String nombre, String apellido, int edad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
	}

	public estudiante() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	


	
}









