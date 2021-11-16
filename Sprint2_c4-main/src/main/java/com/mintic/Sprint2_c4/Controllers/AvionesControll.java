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

import com.mintic.Sprint2_c4.Entity.Aviones;
import com.mintic.Sprint2_c4.Service.AvionesIntSer;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("api/aviones")
public class AvionesControll {
	
	@Autowired
	private AvionesIntSer service;
	
	@GetMapping
	public List<Aviones> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Aviones> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code= HttpStatus.CREATED)
	public Aviones save(@RequestBody Aviones aviones) {
		return service.save(aviones);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Aviones update(@PathVariable Long id, @RequestBody Aviones aviones) {
		Optional<Aviones> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Aviones avionesUpdate = op.get();
			avionesUpdate.setCodigo(aviones.getCodigo());
			avionesUpdate.setCantidadPasajeros(aviones.getCantidadPasajeros());
			avionesUpdate.setFabricante(aviones.getFabricante());
			return service.save(avionesUpdate);
		}
		
		return aviones;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code= HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}


}
