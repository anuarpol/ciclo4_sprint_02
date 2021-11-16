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

import com.mintic.Sprint2_c4.Entity.Vuelos;
import com.mintic.Sprint2_c4.Service.VuelosIntSer;


@CrossOrigin(origins= "*")
@RestController
@RequestMapping("api/vuelos")
public class VuelosControll {
	
	@Autowired
	private VuelosIntSer service;
	
	@GetMapping
	public List<Vuelos> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Vuelos> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code= HttpStatus.CREATED)
	public Vuelos save(@RequestBody Vuelos vuelos) {
		return service.save(vuelos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Vuelos update(@PathVariable Long id, @RequestBody Vuelos vuelos) {
		Optional<Vuelos> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Vuelos vuelosUpdate = op.get();
			vuelosUpdate.setHoraSalida(vuelos.getHoraSalida());
			vuelosUpdate.setHoraLlegada(vuelos.getHoraLlegada());
			vuelosUpdate.setFechaSalida(vuelos.getFechaSalida());
			vuelosUpdate.setFechaLlegada(vuelos.getFechaLlegada());
			vuelosUpdate.setCantidadPasajeros(vuelos.getCantidadPasajeros());
			vuelosUpdate.setIdAeropuertosalida(vuelos.getIdAeropuertosalida());
			vuelosUpdate.setIdAeropuertollegada(vuelos.getIdAeropuertollegada());
			vuelosUpdate.setIdAvion(vuelos.getIdAvion());
			return service.save(vuelosUpdate);
		}
		
		return vuelos;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code= HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}



}
