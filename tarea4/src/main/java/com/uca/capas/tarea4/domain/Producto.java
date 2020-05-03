package com.uca.capas.tarea4.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	//Usando anotaciondes de hibernate para validaciones
	@Pattern(regexp="\\d{12}", message = "El campo Código de Producto Universal debe tener 12 dígitos.")
	private String codigo;
	
	@Size(min = 1, max = 10, message = "El campo Nombre Producto debe tener entre 1 y 100 caracteres.")
	private String nombre;
	
	@Size(min = 1, max = 10, message = "El campo Marca debe tener una longitud entre 1 y 100 caracteres.")
	private String marca;
	
	@Size(min = 1, max = 5, message = "El campo Descripción debe tener una longitud entre 1 y 500 caracteres.")
	private String descripcion;
	
	@Digits(integer = 5, fraction = 0, message = "El campo Existencias no puede tener números con decimales")
	private String existencias;
	
	@Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", 
			 message = "El campo Fecha de Ingreso debe estar en formato dd/mm/yyyy")
	private String fIngreso;
	
	//Constructor 
	public Producto() {
		
	}
	
	//Constructor
	public Producto(String codigo, String nombre, String marca, String descripcion, String existencias,
			String fIngreso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.existencias = existencias;
		this.fIngreso = fIngreso;
	}

	//Getters y Setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public String getfIngreso() {
		return fIngreso;
	}

	public void setfIngreso(String fIngreso) {
		this.fIngreso = fIngreso;
	}
	
	
	

}
