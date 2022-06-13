package com.tp2_neoris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp2_neoris.modelo.EmpleadoModelo;
import com.tp2_neoris.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@PostMapping(value="/alta")
	public String saveEmpleado(@RequestBody EmpleadoModelo empleadoModelo) {
		empleadoService.saveEmpleado(empleadoModelo); 
		return "Empleado dado de alta con éxito";
	}
}