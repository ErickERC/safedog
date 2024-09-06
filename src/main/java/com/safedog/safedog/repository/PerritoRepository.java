package com.safedog.safedog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.safedog.safedog.model.Perrito;

public interface PerritoRepository extends JpaRepository<Perrito, Long> {
	
	@Query(value = "SELECT id_perrito FROM Perritos ORDER BY id_perrito DESC LIMIT 1", nativeQuery = true)
    Long findLastId();
}
