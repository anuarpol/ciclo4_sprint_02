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


import com.mintic.Sprint2_c4.Entity.Personas;
import com.mintic.Sprint2_c4.Service.PersonasIntSer;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("api/personas")
public class PersonasControll {
	
	@Autowired
	private PersonasIntSer service;
	
	@GetMapping
	public List<Personas> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Personas> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code= HttpStatus.CREATED)
	public Personas save(@RequestBody Personas personas) {
		return service.save(personas);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Personas update(@PathVariable Long id, @RequestBody Personas personas) {
		Optional<Personas> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Personas personasUpdate = op.get();
			personasUpdate.setDocumento(personas.getDocumento());
			personasUpdate.setNombre(personas.getNombre());
			personasUpdate.setApellido(personas.getApellido());
			personasUpdate.setCorreo(personas.getCorreo());
			personasUpdate.setTelefono(personas.getTelefono());
			return service.save(personasUpdate);
		}
		
		return personas;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code= HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
