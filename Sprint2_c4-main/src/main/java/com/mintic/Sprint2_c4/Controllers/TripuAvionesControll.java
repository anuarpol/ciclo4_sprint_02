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


import com.mintic.Sprint2_c4.Entity.Tripulantes_Aviones;
import com.mintic.Sprint2_c4.Service.TripuAvionesIntSer;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("api/tripulantes_aviones")
public class TripuAvionesControll {
	
	@Autowired
	private TripuAvionesIntSer service;
	
	@GetMapping
	public List<Tripulantes_Aviones> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Tripulantes_Aviones> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code= HttpStatus.CREATED)
	public Tripulantes_Aviones save(@RequestBody Tripulantes_Aviones tripulantes_aviones) {
		return service.save(tripulantes_aviones);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Tripulantes_Aviones update(@PathVariable Long id, @RequestBody Tripulantes_Aviones tripulantes_aviones) {
		Optional<Tripulantes_Aviones> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Tripulantes_Aviones tripulantes_avionesUpdate = op.get();
			tripulantes_avionesUpdate.setIdTripulante(tripulantes_aviones.getIdTripulante());
			tripulantes_avionesUpdate.setIdAvion(tripulantes_aviones.getIdAvion());
			return service.save(tripulantes_aviones);
		}
		
		return tripulantes_aviones;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code= HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
