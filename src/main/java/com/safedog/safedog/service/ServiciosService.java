package com.safedog.safedog.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.safedog.safedog.model.Servicios;
import com.safedog.safedog.repository.ServicioRepository;


@Service
public class ServiciosService {

			private ServicioRepository serviciosRepository;
			
			@Autowired
			public ServiciosService (ServicioRepository ServiciosRepository) {
				this.serviciosRepository  = ServiciosRepository;
			}
			
			
		
			public List <Servicios> getAll(){
				return serviciosRepository.findAll();
			}



			public Servicios createServicio(Servicios servicios) {
				// TODO Auto-generated method stub
				return null;
			}
	


}
