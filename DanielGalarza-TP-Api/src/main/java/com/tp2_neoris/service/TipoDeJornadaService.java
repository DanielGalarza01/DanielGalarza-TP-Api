package com.tp2_neoris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp2_neoris.entity.TipoDeJornadaEntity;
import com.tp2_neoris.modelo.TipoDeJornadaModelo;
import com.tp2_neoris.repository.TipoDeJornadaRepository;

@Service
public class TipoDeJornadaService {
	

	
	@Autowired
	private TipoDeJornadaRepository tipoDeJornadaRepository;
	


	public void saveTipoDeJornada(TipoDeJornadaModelo tipoDeJornadaModelo) {
		tipoDeJornadaRepository.save(this.mapearTipo(tipoDeJornadaModelo));
	}
	
	private TipoDeJornadaEntity mapearTipo(TipoDeJornadaModelo tipoDeJornadaModelo) {
		TipoDeJornadaEntity tipoDeJornadaEntity = new TipoDeJornadaEntity();
		tipoDeJornadaEntity.setNombre(tipoDeJornadaModelo.getNombre());
		return tipoDeJornadaEntity;
	}
	
	public TipoDeJornadaEntity getTipoDeJornadaById(Long id) {
		return tipoDeJornadaRepository.getReferenceById(id);
	}
}
