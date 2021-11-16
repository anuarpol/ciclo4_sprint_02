package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.Sprint2_c4.Entity.Tripulantes_Aviones;
import com.mintic.Sprint2_c4.Repository.TripulanteAvionesRepo;

@Service
public class TripuAvionesService implements TripuAvionesIntSer {
	
	@Autowired
	private TripulanteAvionesRepo Repository;

	@Override
	public List<Tripulantes_Aviones> all() {
		return this.Repository.findAll();
	}

	@Override
	public Optional<Tripulantes_Aviones> findById(Long id) {
		return this.Repository.findById(id);
	}

	@Override
	public Tripulantes_Aviones save(Tripulantes_Aviones tripulantes_aviones) {
		return this.Repository.save(tripulantes_aviones);
	}

	@Override
	public void delete(Long id) {
		this.Repository.deleteById(id);
	}
}
