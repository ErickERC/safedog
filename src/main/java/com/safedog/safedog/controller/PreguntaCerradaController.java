package com.safedog.safedog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.safedog.safedog.model.PreguntaCerrada;
import com.safedog.safedog.service.PreguntaCerradaService;

@RestController
@RequestMapping("/api/safedog/preguntas_cerradas")
@CrossOrigin(origins="*", methods= {RequestMethod.POST})
public class PreguntaCerradaController {
	private PreguntaCerradaService preguntaCerradaService;

	@Autowired
	public PreguntaCerradaController(PreguntaCerradaService preguntaCerradaService) {
		this.preguntaCerradaService = preguntaCerradaService;
	}
	
	@PostMapping
	public PreguntaCerrada newPreguntaCerrada(@RequestBody PreguntaCerrada preguntaCerrada) {
		return preguntaCerradaService.createPreguntaCerrada(preguntaCerrada);
	}
}
