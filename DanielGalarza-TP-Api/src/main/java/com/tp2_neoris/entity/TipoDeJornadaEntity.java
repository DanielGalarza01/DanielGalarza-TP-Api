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
@Table(name="Tipo_de_Jornada")
public class TipoDeJornadaEntity implements Serializable{

	private static final long serialVersionUID = -8159443146086890282L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Tipo_de_Jornada_ID",nullable = false, insertable=false)
	private Long idTipoDeJornada;
	@Column(name="Nombre")
	private String nombre;
	
	
	public Long getIdTipoDeJornada() {
		return idTipoDeJornada;
	}
	public void setIdTipoDeJornada(Long idTipoDeJornada) {
		this.idTipoDeJornada = idTipoDeJornada;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}