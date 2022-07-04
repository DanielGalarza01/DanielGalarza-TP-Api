package com.tp2_neoris.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Entity
@Table(name="EMPLEADOS")
public class EmpleadoEntity implements Serializable{

	private static final long serialVersionUID = -3544940705513721993L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="EMPLEADO_ID",nullable = false, insertable=false)
	private Long idEmpleado;
	@Column(name="NOMBRE", length=50)
	private String nombre;
	@Column(name="APELLIDO", length=50)
	private String apellido;
	@Column(name="DNI", length=50)
	private String dni;
	@Column(name="EDAD", length=10)
	private int edad;
}
