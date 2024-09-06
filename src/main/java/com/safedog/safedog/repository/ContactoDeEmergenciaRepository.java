package com.safedog.safedog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.safedog.safedog.model.ContactoDeEmergencia;

public interface ContactoDeEmergenciaRepository extends JpaRepository<ContactoDeEmergencia, Long> {
	@Query(value = "SELECT id_contacto_emergencia FROM Contactos_Emergencia ORDER BY id_contacto_emergencia DESC LIMIT 1", nativeQuery = true)
    Long findLastId();
}


