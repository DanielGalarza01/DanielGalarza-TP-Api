package com.tp2_neoris.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tp2_neoris.entity.JornadaLaboralEntity;



@Repository
public interface JornadaLaboralRepository extends JpaRepository<JornadaLaboralEntity, Long> {
	
	@Query(value="SELECT * FROM jornada_laboral WHERE empleado_entity_empleado_id= :idEmpleado", nativeQuery=true)
	public List<JornadaLaboralEntity> findHorasByIdEmpleado(Long idEmpleado);
}
