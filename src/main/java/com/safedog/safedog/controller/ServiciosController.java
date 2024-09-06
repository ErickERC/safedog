package com.safedog.safedog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.safedog.safedog.model.Servicios;
import com.safedog.safedog.service.ServiciosService;

@RestController
@RequestMapping("/api/safedog")
@CrossOrigin(origins="*", methods = {RequestMethod.POST, RequestMethod.GET})
public class ServiciosController {
private ServiciosService serviciosService;
	
	@Autowired
	public ServiciosController(ServiciosService ServiciosService) {
		this.serviciosService= ServiciosService;
	}
	
	@GetMapping("/servicios")
    public ResponseEntity<List<Servicios>> getAllServicios() {
        List<Servicios> servicios = serviciosService.getAll();
        return new ResponseEntity<>(servicios, HttpStatus.OK);
    }
	/*@GetMapping("/servicios")
	public List<Servicios> getMappingAll() {
		return ServiciosService.getAll();
	}*/
	
	/*@PostMapping
	public Servicios CreateServicio(@RequestBody Servicios Servicios) {
		return ServiciosService.createServicio(Servicios);
	}*/
	 @PostMapping("/servicios")
	    public ResponseEntity<Servicios> createServicio(@RequestBody Servicios servicio) {
	        try {
	            Servicios createdServicio = serviciosService.createServicio(servicio);
	            return new ResponseEntity<>(createdServicio, HttpStatus.CREATED);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	
	
}
