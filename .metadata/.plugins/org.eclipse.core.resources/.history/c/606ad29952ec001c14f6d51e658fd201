package com.tp2_neoris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp2_neoris.modelo.TipoDeJornadaModelo;
import com.tp2_neoris.service.TipoDeJornadaService;

@RestController
@RequestMapping(value="/Tipo de jornada")
public class TipoDeJornadaController {

	@Autowired
	private TipoDeJornadaService tipoDeJornadaService;
	
	@PostMapping(value="/alta")
	public String saveTipoDeJornada(@RequestBody TipoDeJornadaModelo tipoDeJornadaModelo) {
		tipoDeJornadaService.saveTipoDeJornada(tipoDeJornadaModelo);
		return "Tipo de jornada dada de alta con exito";
	}
}
