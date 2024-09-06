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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.safedog.safedog.dto.DuenioDTO;
import com.safedog.safedog.exception.DuenioNotFoundException;
import com.safedog.safedog.model.ContactoDeEmergencia;
import com.safedog.safedog.model.Duenio;
import com.safedog.safedog.model.Perrito;
import com.safedog.safedog.service.DuenioService;

@RestController
@RequestMapping("/api/safedog/duenios")
@CrossOrigin(origins="*", methods = {RequestMethod.POST, RequestMethod.GET,RequestMethod.PUT} )
public class DuenioController {

private DuenioService duenioService;
	
	@Autowired
	public DuenioController(DuenioService duenioService) {
		this.duenioService= duenioService;
	}
	
	@GetMapping("/listado")
	public List<Duenio> getMappingAll() {
		return duenioService.getAll();
	}
	
	 // Endpoint to get the last ID
    @GetMapping("/lastId")
    public ResponseEntity<Long> getLastId() {
        Long lastId = duenioService.getLastId();
        if (lastId == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // or HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(lastId, HttpStatus.OK);
    }
	

	//Mapear método get by Id que apunte a un Id específico.
	@GetMapping("/listado/{idDuenio}")
	public Duenio getById(@PathVariable(name = "idDuenio") Long idDuenio) {
		return duenioService.getById(idDuenio);
		
	}
	
	
	@GetMapping("/duenio/correo")
		public ResponseEntity<Duenio> getByEmail(@RequestParam(name="correo")String correo){
			Duenio duenioByEmail = duenioService.getByEmail(correo);
			if(duenioByEmail == null) {
			     throw new DuenioNotFoundException(correo);
			}
			return new ResponseEntity<Duenio>(duenioByEmail, HttpStatus.OK);
			
		}

	//Mapear método post que reciba un nuevo objeto y que reciba el body del mismo.
	 @PostMapping
		public Duenio newDuenio (@RequestBody DuenioDTO duenioDTO) {
		 Perrito perrito = duenioService.getPerrito(duenioDTO.getPerrito());
		 ContactoDeEmergencia contactoE = duenioService.getContactoDeEmergencia(duenioDTO.getContactoDeEmergencia());
		 Duenio newDuenio = new Duenio();
		 newDuenio.setNombre(duenioDTO.getNombre());
		 newDuenio.setApellido(duenioDTO.getApellido());
		 newDuenio.setTelefono(duenioDTO.getTelefono());
		 newDuenio.setCorreo(duenioDTO.getCorreo());
		 newDuenio.setContrasenia(duenioDTO.getContrasenia());
		 newDuenio.setDireccion(duenioDTO.getDireccion());
		 newDuenio.setUrlFoto(duenioDTO.getUrlFoto());
		 newDuenio.setPerrito(perrito);
		 newDuenio.setContactoDeEmergencia(contactoE);
		 return duenioService.createDuenio(newDuenio);
		}
	
	//Mapear método update Duenio utilizando Put. Necesitamos acceder al duenio mediante idDuenio(findById) y definir el nuevo valor
	 @PutMapping("/duenio/{idDuenio}")
	 public Duenio updateDuenio(@RequestBody DuenioDTO duenioDTO, @PathVariable(name="idDuenio") int idDuenio) {
	     /*Perrito perrito = duenioService.getPerrito(duenioDTO.getPerrito());
	     ContactoDeEmergencia contactoE = duenioService.getContactoDeEmergencia(duenioDTO.getContactoDeEmergencia());*/
	     Duenio updatedDuenio = new Duenio();
	     updatedDuenio.setIdDuenio( idDuenio);
	     updatedDuenio.setNombre(duenioDTO.getNombre());
	     updatedDuenio.setApellido(duenioDTO.getApellido());
	     updatedDuenio.setTelefono(duenioDTO.getTelefono());
	     updatedDuenio.setCorreo(duenioDTO.getCorreo());
	     updatedDuenio.setContrasenia(duenioDTO.getContrasenia());
	     updatedDuenio.setDireccion(duenioDTO.getDireccion());
	     updatedDuenio.setUrlFoto(duenioDTO.getUrlFoto());
	     /*updatedDuenio.setPerrito(perrito);
	     updatedDuenio.setContactoDeEmergencia(contactoE);*/

	     return duenioService.updateDuenio(updatedDuenio, idDuenio);
	 }
	 
	//Mapear método Delete que apunte a un Id específico. Pra ello, debemos permitir que el Id sea variable
		//en endpoint (@PathVariable)
		@DeleteMapping("/duenio/{id}")
		public void deleteDuenio(@PathVariable(name = "id") Long id) {
			duenioService.deleteDuenio(id);
		}
}
