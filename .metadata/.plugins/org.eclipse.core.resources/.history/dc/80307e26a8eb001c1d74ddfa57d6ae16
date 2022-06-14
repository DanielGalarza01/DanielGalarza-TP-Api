package com.tp2_neoris.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@Entity
@Table(name="Empleados")
public class EmpleadoEntity implements Serializable{

	private static final long serialVersionUID = -3544940705513721993L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Empleado_ID")
	private Long id;
	@Column(name="Nombre", length=50)
	private String nombre;
	@Column(name="Apellido", length=50)
	private String apellido;
	@Column(name="DNI", length=50)
	private String dni;
	@Column(name="Edad", length=10)
	private int edad;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
