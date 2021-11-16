package com.mintic.Sprint2_c4.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.mintic.Sprint2_c4.Entity.Pasajeros;
import com.mintic.Sprint2_c4.Service.PasajerosIntSer;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("api/pasajeros")
public class PasajerosControll {
	
	@Autowired
	private PasajerosIntSer service;
	
	@GetMapping
	public List<Pasajeros> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Pasajeros> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code= HttpStatus.CREATED)
	public Pasajeros save(@RequestBody Pasajeros pasajeros) {
		return service.save(pasajeros);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Pasajeros update(@PathVariable Long id, @RequestBody Pasajeros pasajeros) {
		Optional<Pasajeros> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Pasajeros pasajerosUpdate = op.get();
			pasajerosUpdate.setIdVuelo(pasajeros.getIdVuelo());
			pasajerosUpdate.setIdPersona(pasajeros.getIdPersona());
			return service.save(pasajerosUpdate);
		}
		
		return pasajeros;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code= HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
