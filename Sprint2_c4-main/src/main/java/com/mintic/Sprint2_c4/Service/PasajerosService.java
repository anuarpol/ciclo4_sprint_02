package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.Sprint2_c4.Entity.Pasajeros;
import com.mintic.Sprint2_c4.Repository.PasajerosRepo;

@Service
public class PasajerosService implements PasajerosIntSer{
	
	@Autowired
	private PasajerosRepo Repository;

	@Override
	public List<Pasajeros> all() {
		return this.Repository.findAll();
	}

	@Override
	public Optional<Pasajeros> findById(Long id) {
		return this.Repository.findById(id);
	}

	@Override
	public Pasajeros save(Pasajeros pasajeros) {
		return this.Repository.save(pasajeros);
	}

	@Override
	public void delete(Long id) {
		this.Repository.deleteById(id);
	}
}
