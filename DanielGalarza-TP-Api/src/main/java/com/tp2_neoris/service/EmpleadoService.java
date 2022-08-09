package com.tp2_neoris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp2_neoris.dto.RespuestaDto;
import com.tp2_neoris.entity.EmpleadoEntity;
import com.tp2_neoris.modelo.EmpleadoModelo;
import com.tp2_neoris.repository.EmpleadoRepository;
import com.tp2_neoris.repository.JornadaLaboralRepository;


@Service
public class EmpleadoService {
	
//	Inyección de dependencia.

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Autowired
	private JornadaLaboralRepository jornadaLaboralRepository;
	

//	Método saveEmpleado llama al repositorio que se va a encargar mediante su metodo save de guardar,
//	en la base de datos una entidad, razón por la cuál se utiliza el método mapearEmpleado, que recibe 
//	un empleado modelo y devuelve un empleado entidad.
	
	public EmpleadoModelo saveEmpleado(EmpleadoModelo empleadoModelo) {
		empleadoRepository.save(this.mapearEmpleado(empleadoModelo));
		return empleadoModelo;
	}
	
	private EmpleadoEntity mapearEmpleado(EmpleadoModelo empleadoModelo) {
		EmpleadoEntity empleadoEntity = new EmpleadoEntity();
		empleadoEntity.setNombre(empleadoModelo.getNombre());
		empleadoEntity.setApellido(empleadoModelo.getApellido());
		empleadoEntity.setDni(empleadoModelo.getDni());
		empleadoEntity.setEdad(empleadoModelo.getEdad());
		return empleadoEntity;
	}
	
	public EmpleadoEntity getEmpleadoById(Long idEmpleado) {
		return empleadoRepository.getReferenceById(idEmpleado);
	}
	
	public RespuestaDto listarHorasPorEmpleado(Long idEmpleado) {
		RespuestaDto respuestaDto = new RespuestaDto();
		respuestaDto.setCodigo(200);
		respuestaDto.setMensaje("data enviada correctamente");
		respuestaDto.setData(jornadaLaboralRepository.findHorasByIdEmpleado(idEmpleado));
		return respuestaDto;
	}
	
	
}

