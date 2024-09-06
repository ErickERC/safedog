package com.safedog.safedog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.safedog.safedog.model.Perrito;
import com.safedog.safedog.service.PerritoService;



@RestController
@RequestMapping("/api/safedog/perritos")
@CrossOrigin(origins="*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class PerritoController {
	
	private PerritoService perritoService;
	
	@Autowired
	public PerritoController(PerritoService perritoService) {
		this.perritoService= perritoService;
	}
	
	@GetMapping("/listado")
	public List<Perrito> getMappingAll() {
		return perritoService.getAll();
	}
	

	// Endpoint to get the last ID
   @GetMapping("/lastId")
   public ResponseEntity<Long> getLastId() {
       Long lastId = perritoService.getLastId();
       if (lastId == null) {
           return new ResponseEntity<>(HttpStatus.NO_CONTENT); // or HttpStatus.NOT_FOUND
       }
       return new ResponseEntity<>(lastId, HttpStatus.OK);
   }
	
	//Mapear método get by Id que apunte a un Id específico.
	@GetMapping("/listado/{idPerrito}")
	public Perrito getById(@PathVariable(name = "idPerrito") Long idPerrito) {
		return perritoService.getById(idPerrito);
		
	}
	
	
	//Mapear método post que reciba un nuevo objeto y que reciba el body del mismo.
	@PostMapping
	public Perrito newPerrito(@RequestBody Perrito  perrito) {
		return perritoService.createPerrito(perrito);
	}

	//Mapear método update Perrito utilizando Put. Necesitamos acceder al perrito mediante idPerrito(findById) y definir el nuevo valor
	@PutMapping("/perrito/{idPerrito}")
	public Perrito updatePerrito(@RequestBody Perrito perrito, @PathVariable(name="idPerrito") Long idPerrito) {
		return perritoService.updatePerrito(perrito, idPerrito);
	}
	
	@DeleteMapping("/delete/{idPerrito}")
		public void deletePerrito(@PathVariable(name = "idPerrito") Long idPerrito) {
			perritoService.deletePerrito(idPerrito);
		}
	
}
