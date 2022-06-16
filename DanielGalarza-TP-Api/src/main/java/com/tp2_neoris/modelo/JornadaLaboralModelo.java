package com.tp2_neoris.modelo;

import java.time.LocalDate;
import java.time.LocalTime;


public class JornadaLaboralModelo {
	
	
	private LocalDate fecha;
	private LocalTime horaDeIngreso;
	private LocalTime horaDeEgreso;
	private Long idEmpleado;
	private Long idTipoDeJornada;
	
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
	public Long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public Long getIdTipoDeJornada() {
		return idTipoDeJornada;
	}
	public void setIdTipoDeJornada(Long idTipoDeJornada) {
		this.idTipoDeJornada = idTipoDeJornada;
	}
	
	
	
	
}
