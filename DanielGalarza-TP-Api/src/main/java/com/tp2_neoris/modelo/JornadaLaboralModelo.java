package com.tp2_neoris.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class JornadaLaboralModelo {
	
	private String tipo;
	private LocalDate fecha;
	private LocalTime horaDeIngreso;
	private LocalTime horaDeEgreso;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	
	
}
