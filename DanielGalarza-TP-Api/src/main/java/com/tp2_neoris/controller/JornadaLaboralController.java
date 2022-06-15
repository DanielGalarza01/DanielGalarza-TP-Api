package com.tp2_neoris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp2_neoris.modelo.JornadaLaboralModelo;
import com.tp2_neoris.service.JornadaLaboralService;

@RestController
@RequestMapping(value="Jornada_Laboral")
public class JornadaLaboralController {
	
//	Inyección de dependencia.
	
	@Autowired
	private JornadaLaboralService jornadaLaboralService;
	
//	Método post para guardar un nueva jornada laboral utilizando como parámetro el modelo, indicando mediante 
//	la etiqueta @RequestBody, que el cuerpo de la petición debe cumplir con el formato Json.	
	
	public String saveJornadaLaboral(JornadaLaboralModelo jornadaLaboralModelo) {
		jornadaLaboralService.saveJornadaLaboral(jornadaLaboralModelo);
		return "ok";
	}
}
