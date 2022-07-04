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
@Table(name="TIPO_DE_JORNADA")
public class TipoDeJornadaEntity implements Serializable{

	private static final long serialVersionUID = -8159443146086890282L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="TIPO_DE_JORNADA_ID",nullable = false, insertable=false)
	private Long idTipoDeJornada;
	@Column(name="NOMBRE")
	private String nombre;
}
