package com.tp2_neoris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp2_neoris.entity.JornadaLaboralEntity;

@Repository
public interface JornadaLaboralRepository extends JpaRepository<JornadaLaboralEntity, Long> {

}
