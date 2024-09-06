package com.safedog.safedog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safedog.safedog.dto.CuidadorCardDTO;
import com.safedog.safedog.exception.ContactoDeEmergenciaException;
import com.safedog.safedog.exception.CuidadorNotFoundException;
import com.safedog.safedog.exception.PreguntaCerradaNotFoundException;
import com.safedog.safedog.exception.ServicioNotFoundException;
import com.safedog.safedog.model.ContactoDeEmergencia;
import com.safedog.safedog.model.Cuidador;
import com.safedog.safedog.model.PreguntaCerrada;
import com.safedog.safedog.model.Servicios;
import com.safedog.safedog.repository.ContactoDeEmergenciaRepository;
import com.safedog.safedog.repository.CuidadorRepository;
import com.safedog.safedog.repository.PreguntaCerradaRepository;
import com.safedog.safedog.repository.ServicioRepository;

@Service
public class CuidadorService {
	private CuidadorRepository cuidadorRepository;
	
	@Autowired
	private ContactoDeEmergenciaRepository contactoDeEmergenciaRepository;
	
	@Autowired
	public CuidadorService(CuidadorRepository cuidadorRepository) {
		this.cuidadorRepository = cuidadorRepository;
	}
	
	@Autowired
	private PreguntaCerradaRepository preguntaCerradasRepository;
	
	@Autowired
	private ServicioRepository servicioRepository;
	
	public List<Cuidador> getAll(){
		return cuidadorRepository.findAll();
	}
	
	public List<CuidadorCardDTO> getCuidadoresCards(){
		List<Cuidador> cuidadores = cuidadorRepository.findAll();
		return cuidadores.stream()
				.map(cuidador -> new CuidadorCardDTO(cuidador.getIdCuidador(), cuidador.getNombre(), cuidador.getCiudad(), cuidador.getPresentacion(), cuidador.getUrlFotoPerfil()))
				.collect(Collectors.toList());
	}
	
	public Cuidador getById(Long id) {
		return cuidadorRepository.findById(id).orElseThrow(() -> new CuidadorNotFoundException(id));
	}
	
	public ContactoDeEmergencia getContactoDeEmergencia(Long id) {
		return contactoDeEmergenciaRepository.findById(id).orElseThrow(() -> new ContactoDeEmergenciaException(id));
	}
	
	public PreguntaCerrada getPreguntaCerrada(Long id) {
		return preguntaCerradasRepository.findById(id).orElseThrow(() -> new PreguntaCerradaNotFoundException(id));
	}
	
	public Servicios getServicio(Long id) {
		return servicioRepository.findById(id).orElseThrow(() -> new ServicioNotFoundException(id));
	}
	
	public Cuidador createCuidador(Cuidador cuidador) {
		return cuidadorRepository.save(cuidador);
	}
	

}
