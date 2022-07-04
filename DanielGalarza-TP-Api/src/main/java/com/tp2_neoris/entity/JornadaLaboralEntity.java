package com.tp2_neoris.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Entity
@Table(name="JORNADA_LABORAL")
public class JornadaLaboralEntity implements Serializable{

	private static final long serialVersionUID = 2308032431396844994L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="JORNADA_LABORAL_ID",nullable = false, insertable=false)
	private Long idJornadaLaboral;
	@Column(name="FECHA")
	private LocalDate fecha;
	@Column(name="HORA_DE_INGRESO")
	private LocalTime horaDeIngreso;
	@Column(name="HORA_DE_EGRESO")
	private LocalTime horaDeEgreso;
	
	@ManyToOne
	private EmpleadoEntity empleadoEntity;
	
	@ManyToOne
	private TipoDeJornadaEntity tipoDeJornadaEntity;
}












