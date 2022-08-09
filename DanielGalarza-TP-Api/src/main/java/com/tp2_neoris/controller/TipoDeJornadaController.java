package com.tp2_neoris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp2_neoris.modelo.TipoDeJornadaModelo;
import com.tp2_neoris.service.TipoDeJornadaService;

@RestController
@RequestMapping(value="/Tipo_de_jornada")
public class TipoDeJornadaController {

	@Autowired
	private TipoDeJornadaService tipoDeJornadaService;
	
	@PostMapping(value="/alta")
	public ResponseEntity<?> saveTipoDeJornada(@RequestBody TipoDeJornadaModelo tipoDeJornadaModelo) {
		tipoDeJornadaService.saveTipoDeJornada(tipoDeJornadaModelo);
		return ResponseEntity.status(HttpStatus.CREATED).body(tipoDeJornadaModelo);
	}
}
