package com.safedog.safedog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.safedog.safedog.dto.CuidadorCardDTO;
import com.safedog.safedog.dto.CuidadorDTO;
import com.safedog.safedog.model.ContactoDeEmergencia;
import com.safedog.safedog.model.Cuidador;
import com.safedog.safedog.model.PreguntaCerrada;
import com.safedog.safedog.model.Servicios;
import com.safedog.safedog.service.CuidadorService;

@RestController
@RequestMapping("/api/safedog/cuidadores")
@CrossOrigin(origins="*", methods = {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class CuidadorController {
	private CuidadorService cuidadorService;
	
	@Autowired
	public CuidadorController(CuidadorService cuidadorService) {
		this.cuidadorService = cuidadorService;
	}
	
	@GetMapping("/listado")
	public List<Cuidador> getMappingAll(){
		return cuidadorService.getAll();
	}

	@GetMapping("/cards")
	public ResponseEntity<List<CuidadorCardDTO>> getCuidadoresCards(){
		List<CuidadorCardDTO> cuidadores = cuidadorService.getCuidadoresCards();
		return ResponseEntity.ok(cuidadores);
	}
	
	@GetMapping("/cuidador/{id}")
	public Cuidador getById(@PathVariable(name = "id") Long id) {
		return cuidadorService.getById(id);
	}
	
	@PostMapping
	public Cuidador createCuidador(@RequestBody CuidadorDTO cuidadorDTO){
		ContactoDeEmergencia contactoDeEmergencia = cuidadorService.getContactoDeEmergencia(cuidadorDTO.getContactoEmergencia());
		PreguntaCerrada preguntaCerrada = cuidadorService.getPreguntaCerrada(cuidadorDTO.getPreguntaCerrada());
		Servicios servicio = cuidadorService.getServicio(cuidadorDTO.getServicio());
		
		Cuidador cuidador = new Cuidador();
		cuidador.setIdCuidador(cuidadorDTO.getIdCuidador());
		cuidador.setNombre(cuidadorDTO.getNombre());
		cuidador.setApellido(cuidadorDTO.getApellido());
		cuidador.setTelefono(cuidadorDTO.getTelefono());
		cuidador.setCorreo(cuidadorDTO.getCorreo());
		cuidador.setCiudad(cuidadorDTO.getCiudad());
		cuidador.setFechaNacimiento(cuidadorDTO.getFechaNacimiento());
		cuidador.setUrlFotoTrabajo(cuidadorDTO.getUrlFotoTrabajo());
		cuidador.setUrlIne(cuidadorDTO.getUrlIne());
		cuidador.setUrlFotoPerfil(cuidadorDTO.getUrlFotoPerfil());
		cuidador.setPresentacion(cuidadorDTO.getPresentacion());
		cuidador.setExperiencia(cuidadorDTO.getExperiencia());
		cuidador.setUrlCertificacion(cuidadorDTO.getUrlCertificacion());
		cuidador.setUrlCartaPresentacion(cuidadorDTO.getUrlCartaPresentacion());
		cuidador.setUrlReferencia(cuidadorDTO.getUrlReferencia());
		cuidador.setEspecificacion(cuidadorDTO.getEspecificacion());
		cuidador.setContactoEmergencia(contactoDeEmergencia);
		cuidador.setPreguntaCerrada(preguntaCerrada);
		cuidador.setServicio(servicio);
		
		return cuidadorService.createCuidador(cuidador); 
		
	}
}
