package com.tp2_neoris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp2_neoris.entity.EmpleadoEntity;
import com.tp2_neoris.modelo.EmpleadoModelo;
import com.tp2_neoris.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	public void saveEmpleado(EmpleadoModelo empleadoModelo) {
		empleadoRepository.save(this.mapearEmpleado(empleadoModelo));
	}
	
	private EmpleadoEntity mapearEmpleado(EmpleadoModelo empleadoModelo) {
		EmpleadoEntity empleadoEntity = new EmpleadoEntity();
		empleadoEntity.setNombre(empleadoModelo.getNombre());
		empleadoEntity.setApellido(empleadoModelo.getApellido());
		empleadoEntity.setDni(empleadoModelo.getDni());
		empleadoEntity.setEdad(empleadoModelo.getEdad());
		return empleadoEntity;
	}
}


