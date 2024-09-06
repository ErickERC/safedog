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

import com.safedog.safedog.dto.ContactoDeEmergenciaDTO;
import com.safedog.safedog.model.ContactoDeEmergencia;
import com.safedog.safedog.service.ContactoDeEmergenciaService;

@RestController
@RequestMapping("/api/safedog/Contacto_Emergencia")
@CrossOrigin(origins="*", methods = {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class ContactoDeEmergenciaController {
	
	private ContactoDeEmergenciaService contactoDeEmergenciaService;
	
	@Autowired
	public ContactoDeEmergenciaController (ContactoDeEmergenciaService contactoDeEmergenciaService) {
		this.contactoDeEmergenciaService = contactoDeEmergenciaService;
	}
	
	@GetMapping("/listado")
	public List< ContactoDeEmergencia> getMappingAll(){
		return contactoDeEmergenciaService.getMappingAll();
	}
	
	@GetMapping("/listado/{idContactoEmergencia}")
    public ContactoDeEmergencia getById(@PathVariable(name = "idContactoEmergencia") Long idContactoEmergencia) {
        return contactoDeEmergenciaService.getById(idContactoEmergencia);
	}
	
	 // Endpoint to get the last ID
    @GetMapping("/lastId")
    public ResponseEntity<Long> getLastId() {
        Long lastId = contactoDeEmergenciaService.getLastId();
        if (lastId == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // or HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(lastId, HttpStatus.OK);
    }
	
	@PostMapping
	public ContactoDeEmergencia newContactoDeEmergencia(@RequestBody ContactoDeEmergencia contactoDeEmergencia) {
		return contactoDeEmergenciaService.createContactoDeEmergencia(contactoDeEmergencia);
	}
	
	//Mapear método update Duenio utilizando Put. Necesitamos acceder al duenio mediante idDuenio(findById) y definir el nuevo valor
		 @PutMapping("/contactoE/{idContactoE}")
		 public ContactoDeEmergencia updateContactoDeEmergencia(@RequestBody ContactoDeEmergenciaDTO contactoEDTO, @PathVariable(name="idContactoE") int idContactoEmergencia) {
			 ContactoDeEmergencia updatedContactoE = new ContactoDeEmergencia();
			 updatedContactoE.setIdContactoEmergencia(idContactoEmergencia);
			 updatedContactoE.setNombre(contactoEDTO.getNombre());
			 updatedContactoE.setTelefono(contactoEDTO.getTelefono());
			 updatedContactoE.setApellido(contactoEDTO.getApellido());
			 updatedContactoE.setCorreo(contactoEDTO.getCorreo());
		     return contactoDeEmergenciaService.updateContactoDeEmergencia(updatedContactoE, idContactoEmergencia);
		 }
			
			// Mapear método Delete que apunte a un Id específico. Para ello, debemos permitir que el Id sea variable en el endpoint (@PathVariable)
			@DeleteMapping("/contactoE/{id}")
			public void deleterUser(@PathVariable(name = "id") Long id) {
				contactoDeEmergenciaService.deleteContactoDeEmergencia(id);
			
			}
}
