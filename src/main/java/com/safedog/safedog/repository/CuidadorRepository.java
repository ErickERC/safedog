package com.safedog.safedog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.safedog.safedog.model.Cuidador;

public interface CuidadorRepository extends JpaRepository<Cuidador, Long> {
	
}