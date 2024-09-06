package com.safedog.safedog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safedog.safedog.exception.ContactoDeEmergenciaException;
import com.safedog.safedog.exception.IdDuenioNotFoundException;
import com.safedog.safedog.exception.PerritoNotFoundException;
import com.safedog.safedog.model.ContactoDeEmergencia;
import com.safedog.safedog.model.Duenio;
import com.safedog.safedog.model.Perrito;
import com.safedog.safedog.repository.ContactoDeEmergenciaRepository;
import com.safedog.safedog.repository.DuenioRepository;
import com.safedog.safedog.repository.PerritoRepository;

@Service
public class DuenioService {

	// Mando a llamar UserRepository
			private DuenioRepository dueniosRepository;
			
			@Autowired
		
			private ContactoDeEmergenciaRepository contactoDeEmergenciaRepository;
			
			@Autowired
			private PerritoRepository  perritoRepository;
			
			@Autowired
			public DuenioService (DuenioRepository dueniosRepository) {
				this.dueniosRepository  = dueniosRepository;
			}
			
	
			
		//Método para obtener todos los dueños
			public List <Duenio> getAll(){
				return dueniosRepository.findAll();
			}
			
		//Método Post 
			public Duenio newDuenio(Duenio newDuenio) {
				return dueniosRepository.save(newDuenio);
			}
			
		//Método para recuperar un duenio por Id (validar si existe)
			public Duenio getById(Long idDuenio) {
				return dueniosRepository.findById(idDuenio)
						.orElseThrow(()-> new IdDuenioNotFoundException(idDuenio));				
			}
			
		//Método Get By email
			public Duenio getByEmail(String correo){
			     return dueniosRepository.findByEmail(correo);
			}
			
		//Método Post By Id 	
		public Long getLastId() {
			   return dueniosRepository.findLastId();
		}
			
		//Método Post
			public Duenio createDuenio(Duenio duenio) {
				return dueniosRepository.save(duenio);
				}
			
		
			public Perrito getPerrito(Long id) {
				return perritoRepository.findById(id).orElseThrow(() -> new PerritoNotFoundException(id));
			}
			
			public ContactoDeEmergencia getContactoDeEmergencia(Long id) {
				return contactoDeEmergenciaRepository.findById(id).orElseThrow(() -> new ContactoDeEmergenciaException(id));
			}
			
			
		//Método para actualizar información de duenio, permitiendo modificar todos lo campos (nombre, apellido, telefono, correo, contrasenia, direccion, urlFoto)
			public Duenio updateDuenio(Duenio duenio, int idDuenio) {
			    return dueniosRepository.findById((long) idDuenio)
			            .map(existingDuenio -> {
			                existingDuenio.setNombre(duenio.getNombre());
			                existingDuenio.setApellido(duenio.getApellido());
			                existingDuenio.setTelefono(duenio.getTelefono());
			                existingDuenio.setCorreo(duenio.getCorreo());
			                existingDuenio.setContrasenia(duenio.getContrasenia());
			                existingDuenio.setDireccion(duenio.getDireccion());
			                existingDuenio.setUrlFoto(duenio.getUrlFoto());
			                /*existingDuenio.setPerrito(duenio.getPerrito());
			                existingDuenio.setContactoDeEmergencia(duenio.getContactoDeEmergencia());*/
			                return dueniosRepository.save(existingDuenio);
			            })
			            .orElseThrow(() -> new IdDuenioNotFoundException((long) idDuenio));
			}
			
			
		//Método Delete
		//Método para eliminar un duenio mediante un id 
			public void deleteDuenio(Long id) {
				if(dueniosRepository.existsById(id)) {
					dueniosRepository.deleteById(id);
				}else {
					throw new IdDuenioNotFoundException(id);
				}
			}
			
}

