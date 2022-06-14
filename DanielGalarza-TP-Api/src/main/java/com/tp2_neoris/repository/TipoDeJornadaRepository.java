package com.tp2_neoris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp2_neoris.entity.TipoDeJornadaEntity;

@Repository
public interface TipoDeJornadaRepository extends JpaRepository<TipoDeJornadaEntity, Long>{

}
