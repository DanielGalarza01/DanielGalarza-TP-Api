package com.tp2_neoris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp2_neoris.dto.RespuestaDto;
import com.tp2_neoris.entity.EmpleadoEntity;
import com.tp2_neoris.modelo.EmpleadoModelo;
import com.tp2_neoris.repository.EmpleadoRepository;


@Service
public class EmpleadoService {
	
//	Inyección de dependencia.

	@Autowired
	private EmpleadoRepository empleadoRepository;
	

//	Método saveEmpleado llama al repositorio que se va a encargar mediante su metodo save de guardar,
//	en la base de datos una entidad, razón por la cuál se utiliza el método mapearEmpleado, que recibe 
//	un empleado modelo y devuelve un empleado entidad.
	
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
	
	public EmpleadoEntity getEmpleadoById(Long id) {
		return empleadoRepository.getReferenceById(id);
	}
	
	public RespuestaDto listarHorasPorEmpleado() {
		RespuestaDto respuestaDto = new RespuestaDto();
		//Hasta acá llegué.!!!!!!!!!!!!!!!!!!!!!!
		return respuestaDto;
	}
	
	
}


