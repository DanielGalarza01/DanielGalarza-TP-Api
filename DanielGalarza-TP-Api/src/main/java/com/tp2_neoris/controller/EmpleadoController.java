package com.tp2_neoris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tp2_neoris.dto.RespuestaDto;
import com.tp2_neoris.modelo.EmpleadoModelo;
import com.tp2_neoris.service.EmpleadoService;

@RestController
@RequestMapping(value="/empleado")
public class EmpleadoController {
	
//	Inyección de dependencia.
	
	@Autowired      
	private EmpleadoService empleadoService;
	
//	Método post para guardar un nuevo empleado utilizando como parámetro el modelo, indicando mediante la etiqueta
//	@RequestBody, que el cuerpo de la petición debe cumplir con el formato Json.

	@PostMapping(value="/alta") 
	public String saveEmpleado(@RequestBody EmpleadoModelo empleadoModelo) { 
		empleadoService.saveEmpleado(empleadoModelo);                      
		return "Empleado dado de alta con éxito";
	}
	
	@GetMapping(value="/listaDeHorasPorEmpleado")
	public @ResponseBody RespuestaDto listarHorasPorEmpleado() { 
		 RespuestaDto respuestaDto = empleadoService.listarHorasPorEmpleado();
		 return respuestaDto;
	}
}	






