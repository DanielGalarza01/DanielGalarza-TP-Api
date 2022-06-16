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

	public Long getIdJornadaLaboral() {
		return idJornadaLaboral;
	}

	public void setIdJornadaLaboral(Long idJornadaLaboral) {
		this.idJornadaLaboral = idJornadaLaboral;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraDeIngreso() {
		return horaDeIngreso;
	}

	public void setHoraDeIngreso(LocalTime horaDeIngreso) {
		this.horaDeIngreso = horaDeIngreso;
	}

	public LocalTime getHoraDeEgreso() {
		return horaDeEgreso;
	}

	public void setHoraDeEgreso(LocalTime horaDeEgreso) {
		this.horaDeEgreso = horaDeEgreso;
	}

	public EmpleadoEntity getEmpleadoEntity() {
		return empleadoEntity;
	}

	public void setEmpleadoEntity(EmpleadoEntity empleadoEntity) {
		this.empleadoEntity = empleadoEntity;
	}

	public TipoDeJornadaEntity getTipoDeJornadaEntity() {
		return tipoDeJornadaEntity;
	}

	public void setTipoDeJornadaEntity(TipoDeJornadaEntity tipoDeJornadaEntity) {
		this.tipoDeJornadaEntity = tipoDeJornadaEntity;
	}
	
	
	
	
}












