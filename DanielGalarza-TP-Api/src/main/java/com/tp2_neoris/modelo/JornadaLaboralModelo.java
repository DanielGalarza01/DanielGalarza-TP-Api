package com.tp2_neoris.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JornadaLaboralModelo {
		
	private LocalDate fecha;
	private LocalTime horaDeIngreso;
	private LocalTime horaDeEgreso;
	private Long idEmpleado;
	private Long idTipoDeJornada;
}
