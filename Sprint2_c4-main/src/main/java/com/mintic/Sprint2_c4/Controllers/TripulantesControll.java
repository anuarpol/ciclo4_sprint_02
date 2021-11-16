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


import com.mintic.Sprint2_c4.Entity.Tripulantes;
import com.mintic.Sprint2_c4.Service.TripuIntSer;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("api/tripulantes")
public class TripulantesControll {
	
	@Autowired
	private TripuIntSer service;
	
	@GetMapping
	public List<Tripulantes> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Tripulantes> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code= HttpStatus.CREATED)
	public Tripulantes save(@RequestBody Tripulantes tripulantes) {
		return service.save(tripulantes);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Tripulantes update(@PathVariable Long id, @RequestBody Tripulantes tripulantes) {
		Optional<Tripulantes> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Tripulantes tripulantesUpdate = op.get();
			tripulantesUpdate.setFuncion(tripulantes.getFuncion());
			tripulantesUpdate.setIdPersona(tripulantes.getIdPersona());
			return service.save(tripulantesUpdate);
		}
		
		return tripulantes;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code= HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}


}
