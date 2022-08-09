package com.tp2_neoris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp2_neoris.modelo.JornadaLaboralModelo;
import com.tp2_neoris.service.JornadaLaboralService;

@RestController
@RequestMapping(value="jornada_laboral")
public class JornadaLaboralController {
	
//	Inyección de dependencia.
	
	@Autowired
	private JornadaLaboralService jornadaLaboralService;
	
//	Método post para guardar un nueva jornada laboral utilizando como parámetro el modelo, indicando mediante 
//	la etiqueta @RequestBody, que el cuerpo de la petición debe cumplir con el formato Json.	
	
	@PostMapping(value="/cargar_jornada")
	public ResponseEntity<?> cargarJornada(@RequestBody JornadaLaboralModelo jornadaLaboralModelo) {
		jornadaLaboralService.saveJornadaLaboral(jornadaLaboralModelo);
		return ResponseEntity.status(HttpStatus.CREATED).body(jornadaLaboralModelo);
	}
}
