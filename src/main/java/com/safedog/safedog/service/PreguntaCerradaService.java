package com.safedog.safedog.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safedog.safedog.model.PreguntaCerrada;
import com.safedog.safedog.repository.PreguntaCerradaRepository;

@Service
public class PreguntaCerradaService {
	private PreguntaCerradaRepository preguntaCerradaRepository;
	
	@Autowired
	public PreguntaCerradaService(PreguntaCerradaRepository preguntaCerradaRepository) {
		this.preguntaCerradaRepository = preguntaCerradaRepository;
	}
	
	public PreguntaCerrada createPreguntaCerrada(PreguntaCerrada newPreguntaCerrada) {
		return preguntaCerradaRepository.save(newPreguntaCerrada);
	}
}

