package com.tp2_neoris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp2_neoris.entity.JornadaLaboralEntity;
import com.tp2_neoris.modelo.JornadaLaboralModelo;
import com.tp2_neoris.repository.JornadaLaboralRepository;

@Service
public class JornadaLaboralService {
	
	@Autowired
	private JornadaLaboralRepository jornadaLaboralRepository;
	
	public void saveJornadaLaboral(JornadaLaboralModelo jornadaLaboralModelo) {
		jornadaLaboralRepository.save(this.mapearJornadaLaboral(jornadaLaboralModelo));
	}
	
	private JornadaLaboralEntity mapearJornadaLaboral(JornadaLaboralModelo jornadaLaboralModelo) {
		JornadaLaboralEntity jornadaLaboralEntity = new JornadaLaboralEntity();
		jornadaLaboralEntity.setFecha(jornadaLaboralModelo.getFecha());
		jornadaLaboralEntity.setHoraDeIngreso(jornadaLaboralModelo.getHoraDeIngreso());
		jornadaLaboralEntity.setHoraDeEgreso(jornadaLaboralModelo.getHoraDeEgreso());
		
		return jornadaLaboralEntity;
	}
}