package com.safedog.safedog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safedog.safedog.exception.ContactoDeEmergenciaException;
import com.safedog.safedog.model.ContactoDeEmergencia;
import com.safedog.safedog.repository.ContactoDeEmergenciaRepository;

@Service
public class ContactoDeEmergenciaService {

	private ContactoDeEmergenciaRepository contactoDeEmergenciaRepository;
	
	@Autowired
	public ContactoDeEmergenciaService(ContactoDeEmergenciaRepository contactoDeEmergenciaRepository) {
		this.contactoDeEmergenciaRepository = contactoDeEmergenciaRepository;
	}
	
	public List<ContactoDeEmergencia> getMappingAll(){
		return contactoDeEmergenciaRepository.findAll();
	}
	
	//Método Post By Id 	
			public Long getLastId() {
				   return contactoDeEmergenciaRepository.findLastId();
			}
	//Metodo GET BY ID
	public ContactoDeEmergencia getById(Long idContactoEmergencia) {
		        return contactoDeEmergenciaRepository.findById(idContactoEmergencia)
		                .orElseThrow(() -> new ContactoDeEmergenciaException(idContactoEmergencia));
		    }
				
	public ContactoDeEmergencia createContactoDeEmergencia(ContactoDeEmergencia newContactoDeEmergencia) {
		return contactoDeEmergenciaRepository.save(newContactoDeEmergencia);
		}
	
	//Método para actualizar información de contactoDeEmergencia, permitiendo modificar todos lo campos (nombre, apellido, telefono, correo, contrasenia, direccion, urlFoto)
	public ContactoDeEmergencia updateContactoDeEmergencia( ContactoDeEmergencia contactoE, int idContactoEmergencia) {
	    return contactoDeEmergenciaRepository.findById((long)idContactoEmergencia)
	            .map(existingContactoE -> {
	            	existingContactoE.setNombre(contactoE.getNombre());
	            	existingContactoE.setApellido(contactoE.getApellido());
	            	existingContactoE.setTelefono(contactoE.getTelefono());
	            	existingContactoE.setCorreo(contactoE.getCorreo());
	                return contactoDeEmergenciaRepository.save(existingContactoE);
	            })
	            .orElseThrow(() -> new ContactoDeEmergenciaException((long) idContactoEmergencia));
	}
	// Método para eliminar un usuario mediante id con Exception
		public void deleteContactoDeEmergencia(Long id) {
			if (contactoDeEmergenciaRepository.existsById(id)) {
				contactoDeEmergenciaRepository.deleteById(id);
			} else {
				throw new ContactoDeEmergenciaException(id);
			}
		}
	
}
